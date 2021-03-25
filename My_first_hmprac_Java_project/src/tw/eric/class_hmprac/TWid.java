package tw.eric.class_hmprac;

public class TWid {
	// 屬性
	private String id;
	// ?為什麼屬性要用private
	
	// 建構式
	public TWid() {
		System.out.println("You just created a new ID.");
	}
	public TWid(int area, boolean isMale) {
		System.out.println("You gave some info created an ID successfully.");
	}
	
	public static String checkArea(String area) {
		if(area = "A") {
			System.out.println("台北市");
			break;
		}
		
	}
}
