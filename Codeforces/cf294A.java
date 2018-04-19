import java.util.Scanner;

public class cf294A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] lines = new int[n];
		for(int i = 0; i < n; i++) {
			lines[i] = sc.nextInt();
		}
		sc.nextLine();
		
		int m = sc.nextInt();
		
		int x,y;
		for(int i = 0; i < m; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt();
			
			if (x < n-1) {
				lines[x+1] += (lines[x]-y);
			}
			if (x > 0) {
				lines[x-1] += (y-1);
			}
			lines[x] = 0;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(lines[i]);
		}
	}
}
