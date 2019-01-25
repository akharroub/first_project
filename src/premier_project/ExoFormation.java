package premier_project;

public class ExoFormation {

	public static void main(String[] args) {

		String[] prenom = { "Miloud", "Agnès", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed",
				"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma" };

		// Afficher tous les prénoms
		for (int i = 0; i < prenom.length; i++) {
			System.out.println(prenom[i]);
		}
		System.out.println("------------------------------------------------------");
		// Afficher le message
		// Laurent existe dans la liste
		// si c'est le cas

		// 1. parcourir mon tableau
		// 2. si une des valeurs = 'laurent'
		// Afficher => Laurent existe dans la liste

		for (int i = 0; i < prenom.length; i++) {
			if (prenom[i].equals("Laurence")) {
				System.out.println("Laurence existe dans le tableau");
			}
		} // FIN boucle
		System.out.println("------------------------------------------------------");

		for (int i = 0; i < prenom.length; i++) {
			if (prenom[i].startsWith("L")) {
				System.out.println(prenom[i]);
			}
		} // FIN boucle
		System.out.println("------------------------------------------------------");

		for (int i = 0; i < prenom.length; i++) {
			if (prenom[i].endsWith("e")) {
				System.out.println(prenom[i]);
			}

		} // FIN boucle

		System.out.println("--------------------------------------------");

		for (int i = 0; i < prenom.length; i++) {
			if (!prenom[i].contains("a") && !prenom[i].contains("A")) {

				System.out.println(prenom[i]);
			}
		}
		System.out.println("--------------------------------------------");

		for (int i = 0; i < prenom.length; i++) {
			String nomM = prenom[i].toLowerCase();
			if (!nomM.contains("a")) {
				System.out.println(prenom[i]);
			}
		}

		System.out.println("--------------------------------------------");

		for (int i = 0; i < prenom.length; i++) {
			if (prenom[i].endsWith("e")) {
				System.out.println(prenom[i].substring(0, 3));

			}

		}

		System.out.println("--------------------------------------------");

		for (int i = 0; i < prenom.length; i++) {
			int tailleChaine = prenom[i].length();
			if (prenom[i].endsWith("e")) {
				System.out.println(prenom[i].substring(tailleChaine - 3));

			}

		}
		System.out.println("--------------------------------------------");

	}
}