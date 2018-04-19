import java.util.Scanner;

public class cf770A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String res = "";
		while (n > 0) {
			for(int i = 0; i < k && n > 0; i++) {
				res += (char) ('a' +i);
				n--;
			}
		}
		
		System.out.println(res);
	}
}
