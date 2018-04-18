import java.util.Scanner;

public class cf731A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.next();
		
		char current = 'a';
		int res = 0;
		
		for (char ch : line.toCharArray()) {
			res += Math.min(Math.abs(ch-current), Math.abs(26-Math.abs(ch-current)));
			current = ch;
		}
		
		System.out.println(res);
	}
}