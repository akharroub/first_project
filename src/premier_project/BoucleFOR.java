package premier_project;

public class BoucleFOR {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Voici la ligne " + i);
		}
		for (int j = 0; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

	}
}