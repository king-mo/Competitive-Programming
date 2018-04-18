import java.util.Scanner;

public class cf281A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		String head = line.substring(0, 1);
		String tail = line.substring(1, line.length());
		
		head = head.toUpperCase();
		System.out.println(head + tail);
	}
}