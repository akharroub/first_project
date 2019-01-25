package premier_project;

import java.util.Scanner;

public class BoucleFor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longueur = sc.nextInt();
		int largeur = sc.nextInt();

		int total = longueur * largeur;
		for (int i = 1; i <= total; i++) {
			System.out.print(" * ");

			if (i % longueur == 0) {
				System.out.println();
			}
		}
		System.out.println("FIN");
	}

}
