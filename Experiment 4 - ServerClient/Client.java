import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader input = new BufferedReader(
                     new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter output = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)) {

            System.out.println("Connected to server.");
            output.println("Hello Server");
            String response = input.readLine();
            System.out.println("Server says: " + response);
            System.out.println("Connection closed.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}