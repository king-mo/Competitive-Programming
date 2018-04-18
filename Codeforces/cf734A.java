import java.util.Scanner;

public class cf734A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int k_a = 0;
		int k_d = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'A') k_a++;
			else k_d++;
		}
		if (k_a > k_d) System.out.println("Anton");
		if (k_a < k_d) System.out.println("Danik");
		if (k_a == k_d) System.out.println("Friendship");
		
		sc.close();
	}
}
