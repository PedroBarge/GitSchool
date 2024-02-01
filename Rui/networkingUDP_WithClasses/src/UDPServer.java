import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPServer {
    public void start() {
        String msgDecode = "";
        System.out.println("Insert done to end");
        try {
            DatagramSocket datagramSocket = new DatagramSocket(6666);
            byte[] receiveBytesArray = new byte[1024];

            while (!msgDecode.contains("done")) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBytesArray, receiveBytesArray.length);
                datagramSocket.receive(receivePacket);
                var addressFromUser = receivePacket.getAddress();
                var portFromUser = receivePacket.getPort();

                msgDecode = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);

                System.out.print("User: " + msgDecode);
                System.out.println("IP:" + addressFromUser);
                System.out.println("Port: " + portFromUser);
                System.out.println();
                if (msgDecode.contains("mariachi")) {
                    String mariachiResponse = "AIAIAIAIAIAIAIAI\n";
                    byte[] responseToMariachi = mariachiResponse.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(responseToMariachi, responseToMariachi.length,
                            addressFromUser, portFromUser);
                    datagramSocket.send(sendPacket);
                }

                if (msgDecode.contains("done")) {
                    String existingTxt = "Press enter to leave...";
                    byte[] existingTxtInBytes = existingTxt.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(existingTxtInBytes,existingTxtInBytes.length,
                            addressFromUser,portFromUser);
                    datagramSocket.send(sendPacket);
                }
            }

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}