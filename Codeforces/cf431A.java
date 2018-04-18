import java.util.Scanner;

public class cf431A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();

		int res = 0;

		String line = sc.next();
		
		for (char ch : line.toCharArray()) {
			switch (ch) {
				case '1':
					res += a1;
					break;
				case '2':
					res += a2;
					break;
				case '3':
					res += a3;
					break;
				case '4':
					res += a4;
					break;
				default:
					break;
			}
		}
		System.out.println(res);
	}
}