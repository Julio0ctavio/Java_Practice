package Sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class WorkerSocket extends Thread {
	private Socket client;
	
	public WorkerSocket(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try(DataInputStream dis=new DataInputStream(client.getInputStream())){
			String message;
			do {
				message = dis.readUTF();
				System.out.printf("\n%s says: %s\n",client.getInetAddress().getHostName(),message);
			}while(!"out".equals(message));
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
}

public class ServerSocketMutiClient {
	public static void main(String[] args) throws IOException {
		try(ServerSocket ss = new ServerSocket(8015)){
			while(true) {
				System.out.println("Listening ...");
				Socket client = ss.accept();
				System.out.println("Client connected...");
				new WorkerSocket(client).start();
			}
		}
	}
}
