package premier_project;

import java.util.Scanner;

public class ExoMcDO2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 : Big M");
		System.out.println("2 : Giant");
		System.out.println("3 : Cheese");
		System.out.println("4 : Menu Enfant");
		System.out.println("Veuillez choisir un nombre:");
		int menuChoisi = sc.nextInt();

		if (menuChoisi == 1) {
			System.out.println("Vous avez Choisi le menu Big M");
		} else if (menuChoisi == 2) {
			System.out.println("Vous avez choisi le menu Giant");
		} else if (menuChoisi == 3) {
			System.out.println("Vous avez Choisi le menu Cheese");
		} else if (menuChoisi == 4) {
			System.out.println("Vous avez choisi le menu enfant");
		} else {
			System.out.println("Ce menu n'existe pas");
		}
	}

}
