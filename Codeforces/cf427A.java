import java.util.Scanner;

public class cf427A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int policeforce = 0;
		int res = 0;
		
		while(n-- > 0) {
			int x = sc.nextInt();
			if(x == -1) {
				if (policeforce == 0) {
					res++;
				} else {
					policeforce--;
				}
			} else {
				policeforce += x;
			}
		}
		
		System.out.println(res);
	}
}