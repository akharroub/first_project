package premier_project;

import java.util.Scanner;

public class ExoCalcul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre 1: ");
		// lecture clavier et affectationd e la valeur à la variable nombre1
		int nombre1 = sc.nextInt();

		System.out.println("Veuillez choisir l'opération: ");
		// lecture clavier et affectation de la valeur à la variable operation
		String operation = sc.next();

		System.out.println("Veuillez saisir un nombre 2: ");
		int nombre2 = sc.nextInt();
		// lecture clavier et affectationd e la valeur à la variable nombre

		int resultat = 0;
		if (operation.equals("+")) {
			resultat = addition(nombre1, nombre2);
		} else if (operation.equals("-")) {
			resultat = soustraction(nombre1, nombre2);
		} else if (operation.equals("*")) {
			resultat = multiplucation(nombre1, nombre2);
		} else if (operation.equals("/")) {
			resultat = division(nombre1, nombre2);
		}

		System.out.println("résultat: " + nombre1 + " " + operation + " " + nombre2 + " = " + resultat);
	}

	public static int addition(int nombre1, int nombre2) {
		int resultat = nombre1 + nombre2;
		return resultat;
	}

	public static int soustraction(int nombre1, int nombre2) {
		int resultat = nombre1 - nombre2;
		return resultat;
	}

	public static int multiplucation(int nombre1, int nombre2) {
		int resultat = nombre1 * nombre2;
		return resultat;
	}

	public static int division(int nombre1, int nombre2) {
		int resultat = nombre1 / nombre2;
		return resultat;
	}

}
