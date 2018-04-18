import java.util.Scanner;

public class cf266A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		
		char current = s.charAt(0);
		int res = 0;
		
		for(int i = 1; i < n; i++) {
			char ch = s.charAt(i);
			if (ch == current) res++;
			current = ch;
		}
		
		System.out.println(res);
	}
}
