package Sprint_4.Övning_11;

import Sprint_4.Övning_10.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class KnockKnockListener {

    public KnockKnockListener(){
        int port = 57588;
        try (ServerSocket serversocket = new ServerSocket(port)){
            while (true){
                Socket socket = serversocket.accept();
                KnockKnockServer server = new KnockKnockServer(socket);
                server.start();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        KnockKnockListener listener = new KnockKnockListener();
    }
}
