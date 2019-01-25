package premier_project;

import java.util.Scanner;

public class ExoJava3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("saisir la longueur :");
		float largeuer = sc.nextFloat();

		System.out.println("saisir la largeur :");
		float langeur = sc.nextFloat();

		float rectangle = largeuer * langeur;
		System.out.println(" L'aire du rectangle est :" + rectangle);
	}

}
