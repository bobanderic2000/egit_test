package tw.org.iii.java_hmprac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatFrameReceiver extends JFrame {
	public JTextArea log;
	public JTextField input;
	public JButton send;

	public ChatFrameReceiver() {
		super("聊天室");
		// 元件
		setLayout(new BorderLayout());
		log = new JTextArea();
		input = new JTextField();
		send = new JButton("Send!");
		// 排版
		JPanel btm = new JPanel(new BorderLayout());
		btm.add(input, BorderLayout.CENTER);
		btm.add(send, BorderLayout.EAST);
		this.add(btm, BorderLayout.SOUTH);
		this.add(log, BorderLayout.CENTER);
		log.setBackground(Color.GRAY);
		// 基本設定
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 600);
		try {
			// 連結socket，接io管子
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			InetAddress yourIp = socket.getInetAddress();
			BufferedReader bufReader = 
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			// 收訊息TCP
			String yourMsg;
			StringBuffer strBuf = new StringBuffer();
			while ((yourMsg = bufReader.readLine()) != null) {
				strBuf.append(yourIp + ": " + yourMsg);
				// 放進log
				log.append(yourIp + ": " + yourMsg);
			}
			bufReader.close();
			socket.close();
			server.close();  // ?server也有close()，那與Socket插在哪?
			
			// 測試strBuf本質，可否log出來
			System.out.println(strBuf);

		} catch (NullPointerException | IOException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		new ChatFrameReceiver();
		System.out.println("ChatFrameReceiver()");
	}

}
