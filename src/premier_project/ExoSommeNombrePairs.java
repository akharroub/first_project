package premier_project;

import java.util.Scanner;

public class ExoSommeNombrePairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez un premier nombre");
		int nombre1 = sc.nextInt();

		System.out.println("Entrez un second nombre");
		int nombre2 = sc.nextInt();

		int SommeDesPairsEntre2Nombres = sommeDesPairs(nombre1, nombre2);
		System.out.println("La somme des nombres pairs entre les deux est de:");
		System.out.println(SommeDesPairsEntre2Nombres);
	}

	public static int sommeDesPairs(int n1, int n2) {
		int somme = 0;
		if (n1 <= n2) {
			for (int i = n1; i <= n2; i++) {
				if (i % 2 == 0) {
					somme = somme + i;
				}
			}
		} else {
			for (int i = n2; i <= n1; i++) {
				if (i % 2 == 0) {
					somme = somme + i;
				}
			}
		}
		return somme;
	}

}
