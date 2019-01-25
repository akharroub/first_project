package premier_project;

import java.util.Scanner;

public class ExoRecherchTableau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] prenoms = { "Miloud", "Agnès", "Lionel", "Fabrice", 
					"Charles", "Yassine", "Arnaud", "Mohamed",
					"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma" };

			System.out.println("Veuillez saisir un  prénom svp:");

			String prenomRech = sc.nextLine();

			boolean existe = false;

			for (int i = 0; i < prenoms.length; i++) {
				if (prenoms[i].equals(prenomRech)) {
					existe = true;
				}
			}
			if (existe == true) {
				System.out.println(prenomRech + " existe dans la liste des prénoms");
			} else {
				System.out.println(prenomRech + " n'existe pas dans la liste des prénoms");
			}

		}
	}
}