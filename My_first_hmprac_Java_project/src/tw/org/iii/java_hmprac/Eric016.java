package tw.org.iii.java_hmprac;

public class Eric016 {

	public static void main(String[] args) {
		int[] dice = new int[6];
		int point;
		for (int i=0; i<1000000; i++) {
			point = (int)(Math.random()*6);
			dice[point]++;
		}
		for (point=0; point<dice.length; point++) {
			System.out.printf("%d點骰出%d次\n", point+1, dice[point]);
		}
		
	}

}
