import java.util.Scanner;

public class cf071A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String s;
		while(n-->0) {
			s = sc.nextLine();
			System.out.println((s.length() <= 10) ? s : "" + s.charAt(0) + (s.length()-2) + (s.charAt(s.length()-1)));
		}
	}
}
