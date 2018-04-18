import java.util.Scanner;

public class cf059A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // amount of lowercase letters
		String line = sc.nextLine();
		for (char ch : line.toCharArray()) {
			if (Character.isUpperCase(ch)) count++;
		}
		
		if (count <= line.length()-count) System.out.println(line.toLowerCase());
		else System.out.println(line.toUpperCase());
	}
}