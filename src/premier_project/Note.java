package premier_project;

public class Note {

	public static void main(String[] args) {

		double noteJava = 10;
		double noteSql = 16;
		double noteHtml = 11.2;
		double noteJavascript = 5.5;

		int coefJava = 5;
		int coefSql = 2;
		int coefHtml = 1;
		int coefJavascript = 3;

		double moyenne = recupMoyenne(noteJava, noteSql, noteHtml, noteJavascript, coefJava, coefSql, coefHtml,
				coefJavascript);
		System.out.println("la moyenne : " + moyenne);

		if (moyenne >= 8 && moyenne < 10) {
			System.out.println("ra");
		} else if (moyenne >= 10 && moyenne <= 12) {
			System.out.println("bien");
		} else if (moyenne > 12 && moyenne <= 15) {
			System.out.println("ab");
		} else if (moyenne >= 15) {
			System.out.println("tb");
		} else {
			System.out.println("A l'année prochaine");
		}
		if (moyenne < 10 && noteJava >= 10) {
			System.out.println("conseil de classe");
		}
		if ((moyenne >= 8 && moyenne < 10) && (noteJava > 15 || noteSql > 15 || noteHtml > 15 || noteJavascript > 15)) {
			System.out.println("Il passe");
		}
		// boolean noteEntre8Et10 = (moyenne >= 8 && moyenne < 10);
		// boolean uneDesNotesEstSupA15 = (noteJava > 15 || noteHtml > 15 || noteSql >
		// 15 || noteJavascript > 15);
		// if (noteEntre8Et10 && uneDesNotesEstSupA15) {
		// System.out.println("Il passe");
		// }
		if ((moyenne >= 17) && (noteJava >= 15 || noteSql >= 15 || noteHtml >= 15 || noteJavascript >= 15)) {
			System.out.println("félicitations");
		}

	}

	public static double recupMoyenne(double noteJava, double noteSql, double noteHtml, double noteJavascript,
			int coefJava, int coefSql, int coefHtml, int coefJavascript) {
		int sommeCoef = coefJava + coefSql + coefHtml + coefJavascript;
		double resultaJava = noteJava * coefJava;
		double resultaSql = noteSql * coefSql;
		double resultaHtml = noteHtml * coefHtml;
		double resultaJavascript = noteJavascript * coefJavascript;
		double sommeresulta = resultaJava + resultaSql + resultaHtml + resultaJavascript;
		double moyenne = sommeresulta / sommeCoef;
		return moyenne;

	}

}
