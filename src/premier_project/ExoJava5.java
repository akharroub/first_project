package premier_project;

import java.util.Scanner;

public class ExoJava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int prix = 120;
		int prixChoisi = 0;
		do {
			System.out.println("Veuillez saisir un nombre :");
			prixChoisi = sc.nextInt();

			if (prixChoisi > prix) {
				System.out.println("perdu, c'est moins =( ");
			} else if (prixChoisi < prix) {
				System.out.println("perdu, c'est plus =(");
			} else {
				System.out.println("Gagné =)");
			}

			// } while (prixChoisi != prix);
		} while ((prixChoisi > prix) || (prixChoisi < prix));

	}

}
