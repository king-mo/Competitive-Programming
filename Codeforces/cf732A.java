import java.util.Scanner;

public class cf732A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int r = sc.nextInt();
		
		int res = 1;
		
		while (true) {
			if ((res * k)%10 == 0 || ((res * k)-r)%10 == 0) {
				break;
			} else {
				res++;
			}
		}
		System.out.println(res);
	}
}