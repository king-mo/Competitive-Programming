import java.util.Scanner;
import java.util.StringTokenizer;

public class cf799A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder out = new StringBuilder();
		StringTokenizer tk;
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();
		
		int g = (n + k - 1)/k;
		
		int o1 = 0, o2 = d;
		for (int i = 0; i < g; i++) {
			if (o1 <= o2) o1 += t;
			else o2 += t;
		}
		
		System.out.println((Math.max(o1, o2) < g*t) ? "YES" : "NO");
	}
}