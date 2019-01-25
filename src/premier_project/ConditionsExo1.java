package premier_project;

public class ConditionsExo1 {

	public static void main(String[] args) {

		int age = 18;
		if (age >= 18) {
			System.out.println("vous etes majeur ");
		} else {
			System.out.println("vous etes mineur ");
		}

		double note = 22;
		if (note > 15 && note <= 20) {
			System.out.println("TB ");
		}
		if (note > 12 && note <= 15) {
			System.out.println("AB ");
		}
		if (note > 10 && note <= 12) {
			System.out.println("Bien ");
		}
		if (note > 5 && note <= 10) {
			System.out.println("PMF ");
		}
		if (note >= 0 && note <= 5) {
			System.out.println("EN ");
		}
		if (note < 0 || note > 20) {
			System.out.println("note et pas coreccte ");
		}

	}
}
