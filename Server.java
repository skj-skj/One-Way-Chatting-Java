import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Server {

	public static void main(String[] args) throws Exception {
		
		Scanner scanObj = new Scanner(System.in);
		//long startTime = System.nanoTime();
		ServerSocket sSocket = new ServerSocket(7777);
		Socket S = sSocket.accept();
		DataInputStream din = new DataInputStream(S.getInputStream());
		DataOutputStream dout = new DataOutputStream(S.getOutputStream());
		while(true) {
			
			String str = din.readUTF();
			System.out.println("Friend: "+str);
			
			System.out.println("You: ");
			str = scanObj.nextLine();
			dout.writeUTF(str);
			dout.flush();
		}

	}

}