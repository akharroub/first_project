package premier_project;

import java.util.Scanner;

public class ExoJava4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float max = Float.MIN_VALUE;

		System.out.println("Veuillez choisir un nombre 1");
		float nombre1 = sc.nextFloat();

		if (nombre1 > max) {
			max = nombre1;
		}
		System.out.println("Veuillez choisir un nombre 2");
		float nombre2 = sc.nextFloat();

		if (nombre2 > max) {
			max = nombre2;
		}
		System.out.println("Veuillez choisir un nombre 3");
		float nombre3 = sc.nextFloat();

		if (nombre3 > max) {
			max = nombre3;
		}
		System.out.println("le chiffer le plus grand est :" + max);
	}

}
