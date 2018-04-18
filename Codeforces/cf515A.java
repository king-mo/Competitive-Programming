import java.util.Scanner;

public class cf515A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = Math.abs(a) + Math.abs(b);
		
		if (c >= x && (c-x) % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}