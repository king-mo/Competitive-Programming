import java.util.Arrays;
import java.util.Scanner;

public class cf339A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char[] list = new char[(s.length()/2)+1];
		
		for (int i = 0; i < (s.length()/2)+1; i++) {
			list[i] = s.charAt(2*i);
		}
		
		Arrays.sort(list);
		
		String res = "";
		for(int i = 0; i < list.length; i++) {
			res += list[i] + "+";
		}
		res = res.substring(0,res.length()-1);
		System.out.println(res);
	}
}
