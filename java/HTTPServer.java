import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class HTTPServer{
    public static void main(String[] args) throws Exception {
	final ServerSocket server = new ServerSocket(8080);
	System.out.println("Listening for 8080.");
	while (true){
	    final Socket client = server.accept();

	    // 1. Read HTTP request from the client socket
	    InputStreamReader isReader = new InputStreamReader(client.getInputStream());
	    BufferedReader bReader = new BufferedReader(isReader);
	    String line = bReader.readLine();
	    while (!line.isEmpty()) {
		System.out.println(line);
		line = bReader.readLine();
	    }

	    // 2. Prepare an HTTP response
	    // 3. Send HTTP response to the client
	    // 4. Close the socket

	}
    }
}
