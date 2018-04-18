import java.util.Scanner;

public class cf003A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String start = sc.nextLine();
		String target = sc.nextLine();
		
		int toRight = -start.charAt(0)+target.charAt(0);
		int toUp = -start.charAt(1)+target.charAt(1);
		
		int dist = Math.max(Math.abs(toRight),Math.abs(toUp));
		System.out.println(dist);
		for (int i = 0; i < dist; i++) {
			String move = "";
			if (toRight > 0) {
				move += "R";
				toRight--;
			} else if (toRight < 0) {
				move += "L";
				toRight++;
			}
			if (toUp > 0) {
				move += "U";
				toUp--;
			} else if (toUp < 0) {
				move += "D";
				toUp++;
			}
			System.out.println(move);
		}
	}
}