import java.util.*;

public class cf236A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		Set<Character> set = new HashSet<Character>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		if (set.size() % 2 == 0) System.out.println("CHAT WITH HER!");
		else System.out.println("IGNORE HIM!");
	}
}