import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            try (Socket socket = serverSocket.accept();
                 BufferedReader input = new BufferedReader(
                         new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                 PrintWriter output = new PrintWriter(
                         new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)) {

                System.out.println("Client connected.");
                String message = input.readLine();
                System.out.println("Client says: " + message);
                output.println("Hello Client");
            }

            System.out.println("Connection closed.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}