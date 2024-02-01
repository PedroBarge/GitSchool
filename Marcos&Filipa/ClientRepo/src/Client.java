import java.net.Socket;

public class Client implements Runnable{
    private final Socket socketFromUser;

    public Client(Socket socketFromServer) {
        this.socketFromUser = socketFromServer;
    }

    @Override
    public void run() {

    }
}
