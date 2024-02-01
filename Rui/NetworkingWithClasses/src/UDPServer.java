import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPServer {
    private static final int SERVER_PORT = 6666;
    private DatagramSocket datagramSocket;
    private boolean isRunning;

    public UDPServer() {
        try {
            datagramSocket = new DatagramSocket(SERVER_PORT);
            System.out.println("Port:" + SERVER_PORT);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void startServer() {
        isRunning = true;
        byte[] receiveBytesArray = new byte[1024];

        while (isRunning) {
            try {
                DatagramPacket receivePacket = new DatagramPacket(receiveBytesArray, receiveBytesArray.length);
                datagramSocket.receive(receivePacket);

                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);
                System.out.println("User:" + receivedMessage);
                processMessage(receivedMessage, receivePacket.getAddress(), receivePacket.getPort());

                if (receivedMessage.contains("done")) {
                    stopServer();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void processMessage(String message, java.net.InetAddress address, int port) throws IOException {
        if (message.contains("mariachi")) {
            String mariachiResponse = "AIAIAIAIAIAIAIAI";
            byte[] responseToMariachi = mariachiResponse.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(responseToMariachi, responseToMariachi.length, address, port);
            datagramSocket.send(sendPacket);
        }
    }

    public void stopServer() {
        isRunning = false;
        datagramSocket.close();
        System.out.println("Servidor UDP encerrado");
    }

    public static void main(String[] args) {
        UDPServer server = new UDPServer();
        server.startServer();
    }
}
