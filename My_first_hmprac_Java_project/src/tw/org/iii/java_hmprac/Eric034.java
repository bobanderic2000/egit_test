package tw.org.iii.java_hmprac;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Eric034 extends JFrame{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private JPanel top; 
	
	public Eric034(){	
		super("猜數字遊戲");
		setLayout(new BorderLayout());
		guess = new JButton();
		input = new JTextField();
		log = new JTextArea();
		
		top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Eric034();
	}

}
