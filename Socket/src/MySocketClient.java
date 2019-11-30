import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * JavaLearning
 * MySocketClient
 * My first socket client
 *
 * @author Yixiong J
 * @version 2019/11/11 10:07
 */
public class MySocketClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",6666);
        OutputStream out = client.getOutputStream();
        System.out.println("Client is ready to send message");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        out.write(message.getBytes());
        System.out.println("Message sent");
        sc.close();
        out.close();
        client.close();
    }
}
