public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        UDPServer udpServer = new UDPServer();
        udpServer.start();
    }
}