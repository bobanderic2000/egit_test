package tw.org.iii.java_hmprac;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Eric005 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("a = ? ");
		int inta = Integer.parseInt(a);
		System.out.println("you just keyed in " + a);
		
		String b = JOptionPane.showInputDialog("b = ?");
		System.out.println("you just keyed in " + b);
		int intb = Integer.parseInt(b);
		
		int sum = inta + intb;
		
		JOptionPane.showInternalMessageDialog(null, a+"\n"+b+"\n"+a+"+"+b+"="+
		sum);
		System.exit(0);
	}

}
