package premier_project;

import java.util.Scanner;

public class ExoMcdo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menuChoisi = 0;
		do {
			System.out.println("1 : Big M");
			System.out.println("2 : Giant");
			System.out.println("3 : nuggets");
			System.out.println("4 : Menu Enfant");
			System.out.println("Veuillez choisir un nombre:");
			menuChoisi = sc.nextInt();
		} while (menuChoisi != 1 && menuChoisi != 2 && menuChoisi != 3 && menuChoisi != 4);

		if (menuChoisi == 1) {
			System.out.println("Vous avez Choisi le menu Big M");
		} else if (menuChoisi == 2) {
			System.out.println("Vous avez choisi le menu Giant");
		} else if (menuChoisi == 3) {
			System.out.println("Vous avez Choisi le menu Cheese");
		} else if (menuChoisi == 4) {
			System.out.println("Vous avez choisi le menu enfant");
		}

	}
}
