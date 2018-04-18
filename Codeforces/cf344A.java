import java.util.Scanner;

public class cf344A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = 0;
		
		int current = 0;
		while(n-- > 0) {
			int a = sc.nextInt();
			if (a != current) {
				res++;
			}
			current = a;
		}
		
		System.out.println(res);
	}
}