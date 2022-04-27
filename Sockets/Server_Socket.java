package Sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket {
	public static void main(String [] args) throws IOException {
		try (ServerSocket serv = new ServerSocket(8085)) {
			
			System.out.println("Listening ...");
			Socket client = serv.accept();
			System.out.printf("Client connected, session established. \n%s\n",client.getInetAddress().getHostName());
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String message;
			do {
				message = dis.readUTF();dis.readUTF();
				System.out.printf("\n%s says: %s\n",client.getInetAddress().getHostName(),message);
			} while(!"out".equals(message));
			System.out.println("Closing connection ...");
			
			dis.close();
			client.close();	
		}
	}
}
