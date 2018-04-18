import java.util.*;

public class cf677A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int res = n;
		while(n-- > 0) if (sc.nextInt() > h) res++;
		System.out.println(res);
		
		sc.close();
	}
}