package premier_project;

public class Tableau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };
		int a = 1;
		int p = 1;
		for (int i = 0; i < nombresPremiers.length; i++) {
			if ((nombresPremiers[i] + a) % 5 == 0) {
				p = p * nombresPremiers[i];

			}
		}

		System.out.println("la somme des nombres premiers est :" + p);

	}

}
