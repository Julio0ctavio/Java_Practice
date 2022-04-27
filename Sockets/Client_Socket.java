package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_Socket {
	public static void main(String[] args) throws UnknownHostException, IOException {
		try(Socket socket = new Socket("localhost", 8085)) {
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Local Client ready to launch!");
			dos.writeUTF("out");
		}
	}
}
