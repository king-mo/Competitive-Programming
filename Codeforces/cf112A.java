import java.util.Scanner;

public class cf112A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine().toLowerCase();
		String b = sc.nextLine().toLowerCase();
		
		int x;
		int diff = 0;
		boolean done = false;
		for (int i = 0; i < a.length() && !done; i++) {
			x = a.charAt(i) - b.charAt(i);
			if (x > 0) {
				System.out.println(1);
				done = true;
			}
			if (x < 0) {
				System.out.println(-1);
				done = true;
			}
		}
		if (!done) System.out.println(0);
	}
}