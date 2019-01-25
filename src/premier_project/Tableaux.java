package premier_project;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nombresPremiers = { 2, 3, 5, 7, 11 };
		System.out.println(nombresPremiers.length); // 5

		for (int i = 0; i < nombresPremiers.length; i++) {
			System.out.println("A l'indice " + i + " : " + nombresPremiers[i]);
		}

		String[] parking = { "porsh", "Audi", "Merco", "BMW", "GOLF" };
		for (int i = 0; i < parking.length; i++) {
			System.out.println("le nom de la voiture est :" + parking[i]);
		}
	}

}
