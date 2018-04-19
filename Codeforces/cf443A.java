import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cf443A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Character> set = new HashSet<Character>();
		
		String s = sc.nextLine();
		s = s.substring(1, s.length()-1);
		
		StringTokenizer st = new StringTokenizer(s, ", ");
		
		while(st.hasMoreTokens()) {
			set.add(st.nextToken().charAt(0));
		}
		
		System.out.println(set.size());
	}
}
