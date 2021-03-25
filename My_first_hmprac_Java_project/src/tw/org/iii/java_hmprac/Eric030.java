package tw.org.iii.java_hmprac;

public class Eric030 {
	public static void main(String[] args) {
		Eric0301 obj1 = new Eric0301(1);
		Eric0302 obj2 = new Eric0302(3);
	}
}

class Eric0301 {
	Eric0301(int a){System.out.println("Eric0301(int)");}
}

class Eric0302 extends Eric0301 {
	Eric0302() {
		super(1);
		System.out.println("Eric0302()");
	}
	Eric0302(String b) {
		this(1);
		System.out.println("Eric0302(String)");
	}
	Eric0302(int a) {
		this();
		System.out.println("Eric0302(int)");
	}
}