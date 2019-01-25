package premier_project;

import java.util.Scanner;

public class ExoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String mail = "test@gmail.com";

		do {
			System.out.println("veuillez saisir une adesse gmail : ");
			mail = sc.nextLine();

		} while (!mail.endsWith("@gmail.com"));
		System.out.println("bravo!");
	}
}