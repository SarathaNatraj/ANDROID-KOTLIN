
import java.util.Scanner;

public class TwoDimArray {
	public static void main(String[] args) {
		int[][] marks = new int[4][4];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < marks.length; i++) {
			System.out.println("Enter marks of student " + i);
			for (int j = 1; j < marks[i].length; j++) {
				System.out.println("Subject " + j);
				marks[i][j] = sc.nextInt();
			}
		}
		for (int i = 1; i < marks.length; i++) {
			System.out.println(" Student " + i);
			for (int j = 1; j < marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}

		int numbers[] = { 40, 50, 60, 70, 80 };
		// Enhanced loop
		for (int x : numbers) {
			System.out.println("Value is : " + x);
		}
	}

}
