package premier_project;

public class Condition {

	public static void main(String[] args) {
		// if (<conditions>){
		// <traitements>
		// }

		int note = 19;

		if (note > 10) {
			System.out.println("bravo, vous avez la moyenne");

		}

		if (note == 10) {
			System.out.println("vous avez 10");

		}
		if (note != 12) {
			System.out.println("la note et # de 12");

		}

		System.out.println("note");
		System.out.println("fin");

		// <
		// >
		// <=
		// >=
		// ==
		// !=

		int entier1 = 10;
		int entier2 = 3;
		double d1 = 3;
		System.out.println(entier1 / entier2);
		System.out.println(entier1 / d1);
		float f1 = 3f;
		System.out.println(entier1 / f1);

	}

}
