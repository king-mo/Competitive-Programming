import java.util.Scanner;

public class cf004A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println((a%2 == 0 && a > 2) ? "YES" : "NO");
	}
}