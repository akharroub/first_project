package premier_project;

public class Variables {

	public static void main(String[] args) {
		// <type_de_la_variable> <nom_de_la_variable> = <valeur>;

		// déclaration
		// <type_de_la_variable> <nom_de_la_variable>;

		// affectation
		// <nom_de_la_variable> = <valeur>;

		// déclaration
		String nom;
		// affectation
		nom = "akharroub";

		// déclaration + affectation
		String prenom = "mohamed";

		System.out.println(nom);
		System.out.println(prenom);

		// afficher : nom prenom
		System.out.println(nom + " " + prenom + ".");

		// String <nom_variabl> = <valeur>;
		nom = "jhon";

		System.out.println(nom);

		nom = "un autre nom";
		System.out.println(nom);

		short nombrePetit;
		// -32 768 -> 32 767
		nombrePetit = 12;
		// short nombretropPetitpournousleshumains
		System.out.println(nombrePetit);
		System.out.println(nombrePetit + 12);

		int nombreGrand = 145;
		// -2 147 483 648 -> 2 147 483 647
		System.out.println(nombreGrand * 12);

		nombreGrand = 125896;
		System.out.println(nombreGrand / 2);

		System.out.println(nombreGrand - 10000);

		long nombreTropGrand = 12457896;
		// -9 223 372 036 854 775 808 => 9 223 32 036 854 775 807
		System.out.println(nombreTropGrand * nombreTropGrand);

		long coordonneeSpace = 120_120_120_120l;
		System.out.println(coordonneeSpace);

		double tva = 20.0;
		System.out.println(tva * 20);

		float taxe = 33.5f;
		System.out.println(15 / taxe);

		int prix = 100;

		// afficher tva * prix = valeur
		// 20.0 * 100 = 2000.0

		System.out.println(tva + " * " + prix + " = " + (tva * prix));
		System.out.println(tva + " * " + prix + " = ");

		short longueur = 32000;
		short largeur = 1000;
		System.out.println("l * L = " + (longueur * largeur));
		System.out.println(longueur / largeur);
		System.out.println(longueur + largeur);

		System.out.println(longueur * tva);
		System.out.println(longueur * prix);

		int entier1 = 10;
		int entier2 = 3;
		double d1 = 3;
		System.out.println(entier1 / entier2);
		System.out.println(entier1 / d1);
		float f1 = 3f;
		System.out.println(entier1 / f1);

		// affectation
		int somme = 1;
		somme = 2;
		System.out.println(somme);
		somme = 12 + 10;
		System.out.println(somme);

		somme = somme + 10;
		System.out.println(somme);

		somme = somme - 5;
		System.out.println(somme);

		// char
		char c = 'f';
		System.out.println(c);

		boolean faux = false;
		boolean vrai = true;
		System.out.println(faux);

		boolean b = (somme >= 27);
		System.out.println(somme);
		System.out.println("la variable boolaen b = " + b);

	}

}
