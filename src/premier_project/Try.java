package premier_project;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DEBUT");
		int nombre1 = 10;
		int nombre2 = 0;

		try {
			System.out.println(nombre1 / nombre2);
		} catch (Exception e) {
			System.out.println("booooooommmmmmm");
		} finally {
			System.out.println("Fin de l'exception");
		}

		System.out.println("FIN");

	}

}
