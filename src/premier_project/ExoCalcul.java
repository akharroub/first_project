package premier_project;

import java.util.Scanner;

public class ExoCalcul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultat = 0;
		System.out.println("veuiller saisir un nombre1 :");
		int nombre1 = sc.nextInt();

		System.out.println("veuille saisir l'opération : ");
		String operation = sc.next();

		System.out.println("veuiller saisir un nombre2 :");
		int nombre2 = sc.nextInt();
		switch (operation) {
		case "+":
			resultat = nombre1 + nombre2;
			break;

		case "-":
			resultat = nombre1 - nombre2;
			break;
		case "*":
			resultat = nombre1 * nombre2;
			break;
		case "/":
			resultat = nombre1 / nombre2;
			break;
		}
		System.out.println("resultat  est : " + resultat);
	}

}
