package premier_project;

import java.util.Scanner;

public class Factoreille {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un  nombre :");
		int nombre = sc.nextInt();
		int produit = Factorielle(nombre);
		System.out.println("Factorielle : " + produit);
	}

	public static int Factorielle(int nombre) {
		int produit = 1;

		for (int i = nombre; i > 0; i--) {
			produit = produit * i;
		}
		return produit;
	}
}
