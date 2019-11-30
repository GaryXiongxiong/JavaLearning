import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * JavaLearning
 * MySocketServer
 * My first socket server test
 *
 * @author Yixiong J
 * @version 2019/11/11 9:58
 */
public class MySocketServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Service Start, waiting for connection");
        ServerSocket ss = new ServerSocket(6666);
        Socket server = ss.accept();
        InputStream in = server.getInputStream();
        byte[] b = new byte[1024];
        int len = in.read(b);
        String message = new String(b,0,len);
        System.out.println("Message received");
        System.out.println(message);
        in.close();
        server.close();
    }
}
