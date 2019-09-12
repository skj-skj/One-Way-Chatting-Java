import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client1 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanObj = new Scanner(System.in);
		//long startTime = System.nanoTime();
		Socket S = new Socket("localhost",7777);
		DataOutputStream dout = new DataOutputStream(S.getOutputStream());
		DataInputStream din = new DataInputStream(S.getInputStream());
		while(true) {
			
			System.out.println("You: ");
			String str = scanObj.nextLine();
			dout.writeUTF(str);
			
			str = din.readUTF();
			System.out.println("Friend:"+str);
			dout.flush();
			
		}

	}

}
