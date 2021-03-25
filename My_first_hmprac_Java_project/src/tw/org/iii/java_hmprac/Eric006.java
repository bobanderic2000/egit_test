package tw.org.iii.java_hmprac;

public class Eric006 {

	public static void main(String[] args) {
		float f1 = 10;
//		float f2 = 20.0; // 這樣會噴錯，因為10.0是double，也就不能自動轉float
		float f2 = 30.0f;  // 10.0原為double，加f成為format形式以自動轉型
		double d1 = 40;
		double d2 = 50.0;
		double d3 = f1;
		double d4 = f2;
		
		float a = (float)d1;
		System.out.println(a);
	}

}
