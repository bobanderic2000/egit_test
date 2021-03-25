package tw.org.iii.java_hmprac;

public class Eric009 {

	public static void main(String[] args) {
		int year = (int)(Math.random()*99999);
		System.out.println("It's " + year + " year.");
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("閏年");
				}else {
					System.out.println("不是閏年");
				}
			}else {
				System.out.println("閏年");
			}
		}else {
			System.out.println("不是閏年");
		}
		
		留著沒寫完;// 一行寫法
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
			// 29
		}else {
			//28
		}
	}

}
