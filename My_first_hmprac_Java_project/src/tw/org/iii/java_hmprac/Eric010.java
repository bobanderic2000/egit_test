package tw.org.iii.java_hmprac;

public class Eric010 {

	public static void main(String[] args) {
		int a = 4, b = 6;
		if (--a >= 4 || ++b <= 6) {
			System.out.println(String.format("OK, a=%d, b=%d", a, b));
		}else {
			System.out.println(String.format("XX, a=%d, b=%d", a, b));
		}
		// XX, a=3, b=7
		
		int c = 4, d = 6;
		if (c-- >= 4 || d++ <= 6) {
			System.out.println(String.format("OK, c=%d, d=%d", c, d));
		}else {
			System.out.println(String.format("XX, c=%d, d=%d", c, d));
		}
		// OK, c=3, d=7
		// 答案是d=6，因為前面c-->=4的結果為true，||式子就不會進行下一個計算了。
		
		int e = 4, f = 6;
		if (--e >= 4 && ++f <= 6) {
			System.out.println(String.format("OK, e=%d, f=%d", e, f));
		}else {
			System.out.println(String.format("XX, e=%d, f=%d", e, f));
		}
		// XX, e=3, f=7
		// 答案是f=6，因為前面--e>=4的結果為false，&&式子就不會進行下一個計算了。
		
		int g = 4, h = 6;
		if (g-- >= 4 && h++ <= 6) {
			System.out.println(String.format("OK, g=%d, h=%d", g, h));
		}else {
			System.out.println(String.format("XX, g=%d, h=%d", g, h));
		}
		// OK, g=3, h=7
	}

}
