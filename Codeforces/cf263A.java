import java.util.Scanner;
public class cf263A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		for (int i = 0; i < 25; i++) {
			if(sc.nextInt() == 1) {
				System.out.println((Math.abs((count%5)-2) + Math.abs((count/5)-2)));
				break;
			}
			count++;
		}
	}
}