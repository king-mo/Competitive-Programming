import java.util.Scanner;

public class cf709A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		
		int waste = 0;
		int content = 0;
		
		for (int i = 0; i< n; i++) {
			int a = sc.nextInt();
			
			if (a <= b) {
				content += a;
			} else {
				// throw into waste? Nope!
			}
			if (content > d) {
				content = 0;
				waste++;
			}
		}
		
		System.out.println(waste);
	}
}
