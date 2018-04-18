import java.util.Scanner;

public class cf231A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = 0;
		
		int count;
		for (int i = 0; i < n; i++) {
			count = 0;
			count += sc.nextInt();
			count += sc.nextInt();
			count += sc.nextInt();
			if (count >= 2) res++;
		}
		
		System.out.println(res);
	}
}