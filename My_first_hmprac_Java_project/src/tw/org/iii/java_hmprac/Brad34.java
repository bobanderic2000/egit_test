package tw.org.iii.java_hmprac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Brad34 extends JFrame implements ActionListener{
					// 問題1: 這邊實作ActionListener，實作的actionPerformed方法是直接寫在這個類別下才對嗎?
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int i;		// i = 0;
	
	public Brad34() {
		super("猜數字遊戲");

		setLayout(new BorderLayout());
		guess = new JButton("Guess");
		input = new JTextField();
		log = new JTextArea();
		
//		guess.addActionListener(this);
//		guess.addActionListener(new Brad341());
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doGuess();
			}
		// 問題2: guess下的actionPerformed方法，是guess自己定義、自己拿來用的? 跟此類別(Brad34)的實作方法(116-118)沒關係?
		});
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGame();
	}
	
	// 開新局
	private void initGame() {
		log.setText("");
		answer = createAnswer(4);
		i = 0;
		System.out.println(answer);
	}
	
	private void doGuess() {
		i++;
		String strInput = input.getText();
		// 檢查幾A幾B
		String result = checkAB(strInput);
		log.append(i + ": " + strInput + " => " + result + "\n");
		input.setText("");
		
		if (result.equals("4A0B")) {
			// WINNER
			JOptionPane.showMessageDialog(null, "WINNER");
			initGame();
		}else if (i == 3) {
			// Loser
			JOptionPane.showMessageDialog(null, "Loser: " + answer);
			initGame();
		}
	}
	
	private String checkAB(String g) {
		int a, b; a = b = 0;
		for (int i=0; i<answer.length(); i++) {
			char gc = g.charAt(i), ac = answer.charAt(i);
			if (gc == ac) {
				a++;
			}else if (answer.indexOf(gc) >= 0) {
				b++;
			}
		}
		return String.format("%dA%dB", a, b);
	}
	
	private String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<10; i++) { 
			poker[i] = i;
		}
		for (int i=poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<d; i++) sb.append(poker[i]);
			
		return sb.toString();
	}
	
	public static void main(String[] args) {
		new Brad34();
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Brad");
	}
	// 問題3: 這邊才是Brad34 class實做出來的部分?
	// 問題4: 這個註解掉，只有Brad34 class會跳錯，
}

//class Brad341 implements ActionListener {
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("III");
//	}
//} 