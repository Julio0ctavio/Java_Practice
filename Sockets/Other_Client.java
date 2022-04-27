package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Other_Client {
	
	public static String readMessage() throws IOException {
		System.out.println("\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		try(Socket socket = new Socket("localhost", 8015)) {
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			String message;
			do {
				message = readMessage();
				dos.writeUTF(message);
			}while(!"out".equals(message));		
		}
	}
}
