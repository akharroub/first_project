package premier_project;

import java.util.Scanner;

public class LecteurClavier {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un mot :");
		String i = sc.nextLine();
		System.out.println("Vous avez saisi : " + i);

		int cpt = sc.nextInt();

	}

}
