import java.util.Scanner;

public class cf733A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int current = 0;
		
		String s = sc.nextLine();
		
		for(char ch : s.toCharArray()) {
			current++;
			max = Math.max(max, current);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y') {
				current = 0;
			}
		}
		current++;
		max = Math.max(max, current);
		
		System.out.println(max);
	}
}
