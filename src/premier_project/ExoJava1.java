package premier_project;

import java.util.Scanner;

public class ExoJava1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("saisir un nombre min :");

		int min = sc.nextInt();

		System.out.println("saisir un nombre max :");

		int max = sc.nextInt();

		while (min <= max) {
			if (min % 2 != 0) {
				System.out.println(min);
			}
			min++;
		}
	}

}
