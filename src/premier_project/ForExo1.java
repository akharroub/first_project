package premier_project;

public class ForExo1 {

	public static void main(String[] args) {

		for (int cpt = 1; cpt <= 100; cpt++) {
			if ((cpt % 3 == 0) && (cpt % 7 == 0)) {
				System.out.println(cpt);
			}

		}
	}

}
