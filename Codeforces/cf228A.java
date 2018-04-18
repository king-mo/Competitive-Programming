import java.util.Scanner;

public class cf228A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		
		int res = 0;
		
		if (s2 == s1) res++;
		if (s3 == s2 || s3 == s1) res++;
		if (s4 == s3 || s4 == s2 || s4 == s1) res++;
		
		System.out.println(res);
	}
}