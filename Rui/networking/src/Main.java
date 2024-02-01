import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String msgDecode = "";
        try {
            DatagramSocket datagramSocket = new DatagramSocket(6666);
            byte[] receiveBytesArray = new byte[1024];

            System.out.println("Insert done to end");

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

                DatagramPacket sendPacket;

                if (msgDecode.contains("ola")) {
                    String mariachiResponse = "sup\n";
                    byte[] responseToMariachi = mariachiResponse.getBytes();
                    sendPacket = new DatagramPacket(responseToMariachi, responseToMariachi.length, addressFromUser, portFromUser);
                    datagramSocket.send(sendPacket);
                }
                if (msgDecode.contains("done")) {
                    String mariachiResponse = "Press enter to exit\n";
                    byte[] responseToMariachi = mariachiResponse.getBytes();
                    sendPacket = new DatagramPacket(responseToMariachi, responseToMariachi.length, addressFromUser, portFromUser);
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