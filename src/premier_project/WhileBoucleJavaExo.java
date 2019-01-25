package premier_project;

public class WhileBoucleJavaExo {

	public static void main(String[] args) {
		int cpt = 20;
		while (cpt >= 10) {
			System.out.println(cpt);
			cpt--;
		}

		int cpt1 = 1;
		while (cpt1 <= 10) {
			if (cpt1 == 5) {
				System.out.println("bravo c'est 5§§");
			} else if (cpt1 == 10) {
				System.out.println("bravo c'est 10§§");
			} else {
				System.out.println(cpt1);
			}

			cpt1++;
		}

		int cpt4 = 0;
		while (cpt4 <= 5) {
			System.out.println(cpt4 * 2);
			cpt4++;
		}

		int cpt5 = 0;

		while (cpt5 <= 10) {
			if (cpt5 == 0) {
				System.out.println(cpt5);
			} else if (cpt5 == 2) {
				System.out.println(cpt5);
			} else if (cpt5 == 4) {
				System.out.println(cpt5);
			} else if (cpt5 == 6) {
				System.out.println(cpt5);
			} else if (cpt5 == 8) {
				System.out.println(cpt5);
			} else if (cpt5 == 10) {
				System.out.println(cpt5);
			}
			cpt5++;
		}
		// modulo
		int compteur = 0;
		while (compteur <= 10) {
			if (compteur % 2 == 0) {
				System.out.println(compteur);
			}
			compteur++;
		}

		int compteur1 = 0;
		while (compteur1 <= 10) {
			if (compteur1 % 2 != 0) {
				System.out.println(compteur1);
			}
			compteur1++;
		}

	}
}