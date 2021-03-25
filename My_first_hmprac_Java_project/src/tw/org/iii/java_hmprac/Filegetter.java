package tw.org.iii.java_hmprac;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Filegetter {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
//			InputStream dis = new InputStream(socket.getInputStream());
			InputStream dis = socket.getInputStream();
			byte[] buf = dis.readAllBytes();
			
			FileOutputStream fout = 
					new FileOutputStream("tpadfolder/from_mac.jpg");
			int len=0;
			while ((len = dis.read(buf)) != -1) {
				fout.write(buf, 0, len);
				System.out.print(new String(buf, 0 , len));
			}
			fout.flush();
			fout.close();
			System.out.println("Got a guodon.");
			
			server.close();
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
