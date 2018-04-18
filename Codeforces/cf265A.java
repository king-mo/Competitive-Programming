import java.util.Scanner;

public class cf265A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int res = 1;
		
		for (char ch : s2.toCharArray()) {
			if (ch == s1.charAt(res-1)) {
				res++;
			}
		}
		
		System.out.println(res);
	}
}