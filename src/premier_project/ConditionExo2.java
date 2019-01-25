package premier_project;

public class ConditionExo2 {

	public static void main(String[] args) {

		double prix = 120;
		double prixChoisi = 120;

		if (prixChoisi < prix) {
			System.out.println("bravoooo ");
		} else if (prixChoisi > prix) {
			System.out.println("c'est moins ");
		} else {
			System.out.println("c'est plus ");
		}

		int age = 18;
		if (age >= 18) {
			System.out.println("vous etes majeur ");
		} else {
			System.out.println("vous etes mineur ");
		}

	}

}
