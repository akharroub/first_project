package premier_project;

public class ConditionSwitchExo1 {

	public static void main(String[] args) {
		int mois = 12;
		switch (mois) {
		case 1:
			System.out.println("janvier");
			break;
		case 2:
			System.out.println("fevrier");
			break;
		case 3:
			System.out.println("mars");
			break;
		case 4:
			System.out.println("avril");
			break;
		case 5:
			System.out.println("mai");
			break;
		case 6:
			System.out.println("juin");
			break;
		case 7:
			System.out.println("juillet");
			break;
		case 8:
			System.out.println("aout");
			break;
		case 9:
			System.out.println("septembre");
			break;
		case 10:
			System.out.println("octobre");
			break;
		case 11:
			System.out.println("novembre");
			break;
		case 12:
			System.out.println("décembre");
			break;
		default:
			System.out.println("aucune valeur");
			break;
		}

		String monMois = "décembre";
		switch (monMois) {
		case "janvier":
			System.out.println("le mois de janvier est n° :1 ");
			break;
		case "fevrier":
			System.out.println("le mois de fevrier est n° :2 ");
			break;
		case "mars":
			System.out.println("le mois de mars est n° :3 ");
			break;
		case "avril":
			System.out.println("le mois de avril est n° :4 ");
			break;
		case "mai":
			System.out.println("le mois de mai est n° :5 ");
			break;
		case "juin":
			System.out.println("le mois de juin est n° :6 ");
			break;
		case "juillet":
			System.out.println("le mois de juillet est n° :7 ");
			break;
		case "aout":
			System.out.println("le mois de aout est n° :8 ");
			break;
		case "septembre":
			System.out.println("le mois de septembrer est n° :9 ");
			break;
		case "octobre":
			System.out.println("le mois de octobre est n° :10 ");
			break;
		case "novembre":
			System.out.println("le mois de novembre est n° :11 ");
			break;
		case "décembre":
			System.out.println("le mois de décembre est n° :12 ");
			break;

		default:
			System.out.println("ils n'existe pas");
			break;
		}

	}

}
