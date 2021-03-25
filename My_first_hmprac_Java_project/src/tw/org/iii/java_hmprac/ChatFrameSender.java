package tw.org.iii.java_hmprac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatFrameSender extends JFrame implements ActionListener {
	public JTextArea log;
	public JTextField input;
	public JButton send;

	public ChatFrameSender() {
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
			// 監聽器
			send.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sendmsg();
				}
			});
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

	protected void sendmsg() {
		try {
			String myMsg = input.getText();
			log.append("Me: " + myMsg + "\n");
			input.setText("");
			// 連結socket，接io管子
			Socket socket = 
					new Socket(InetAddress.getByName("127.0.0.1"), 7777);
			BufferedWriter writer = 
					new BufferedWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			// 傳訊息TCP
			writer.write(myMsg);
			writer.flush();
			writer.close();
			socket.close();
			System.out.println("Message Sent.");
		} catch (NullPointerException | IOException e) {
			System.out.println(e);
		}
	}

//	protected void SendByTCP(){}

	public static void main(String[] args) {
		new ChatFrame();
		System.out.println("ChatFrame()");
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
	}

}
