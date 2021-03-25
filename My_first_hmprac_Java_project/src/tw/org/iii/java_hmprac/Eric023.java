package tw.org.iii.java_hmprac;

import javax.swing.JFrame;

public class Eric023 extends JFrame{
	public static void main(String[] args) {
		Eric023();
	}
	
	Eric023() {
		super("標題黨");
		setVisible(true);
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		System.out.println("Done");
	}
}