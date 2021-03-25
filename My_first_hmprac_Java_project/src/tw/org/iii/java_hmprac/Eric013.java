package tw.org.iii.java_hmprac;

public class Eric013 {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		
		for (int a=0; a<10; a++) {
			for (int b=1; b<=10; b++) {
				int c= a*10+b;
				boolean isPrime = true;
				for (int d=2; d<c; d++) {
					if (c % d == 0) {
						isPrime = false;
					}
				}
				System.out.print(c + (isPrime?"*":" ") + " ");
			}
			System.out.println("");
		}
		long endtime = System.currentTimeMillis();
		
		System.out.printf("Time started from: %d\n", starttime);
		System.out.print(String.format("    "
				+ " ended at: %d\n", endtime));
		System.out.println("Cost time: " + (endtime - starttime));
	}

}
