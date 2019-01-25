package premier_project;

import java.util.Scanner;

public class ExoJava2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("siasire la note de java :");
		double java = sc.nextDouble();

		System.out.println("siasire la note de html :");
		double html = sc.nextDouble();

		System.out.println("siasire la note de javascript :");
		double javascript = sc.nextDouble();

		System.out.println("siasire la note de sql :");
		double sql = sc.nextDouble();

		double moyenne = ((java + html + javascript + sql) / 4);

		System.out.println("la moyenne et :" + moyenne);

	}

}
