package tw.org.iii.java_hmprac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TCPChat {
	protected ChatFrame chatFrame;
	
	private TCPChat() {
//		System.out.println("TCPChat()");
		chatFrame = new ChatFrame();
	}
	
	public static void main(String[] args) {
		System.out.println("TCPChat()");
		new TCPChat();
	}

}
