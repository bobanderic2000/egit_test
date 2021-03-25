package tw.org.iii.java_hmprac;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Filesender {

	public static void main(String[] args) {
		File source = new File("tpadfolder/puipui.jpg");
		try {
			FileInputStream fin =
					new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			
			Socket socket = 
					new Socket(InetAddress.getByName("127.0.0.1"), 7777);
			ObjectOutputStream dos = new ObjectOutputStream(
					socket.getOutputStream());	
			
			dos.write(buf);
			dos.flush();
			dos.close();
//			------------
			socket.close();
			fin.close();
			System.out.println("TCP works, puipuicar was sent.");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
