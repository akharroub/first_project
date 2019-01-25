package premier_project;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExoJava6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int prix = ThreadLocalRandom.current().nextInt(0, 100);
		System.out.println(prix);
		int prixChoisi = 0;

		do {
			System.out.print("Veuillez saisir un nombre");
			prixChoisi = sc.nextInt();

			if (prixChoisi > prix) {
				System.out.println("perdu, c'est moins");
			} else if (prixChoisi < prix) {
				System.out.println("perdu, c'est plus");
			} else {
				System.out.println("Gagné!!");
			}
		} while (prixChoisi != prix);
		System.out.println("FIN");
	}

}
