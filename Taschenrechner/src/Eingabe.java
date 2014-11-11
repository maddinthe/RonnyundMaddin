

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		Rechner r = new Rechner();									// Anlegen des Objekts Rechner
		Scanner s = new Scanner(System.in);							// Anlegen des Objekts Scanner
		for (; true;) {												// Durchlaufe Schleife
			String eingabe = s.nextLine();
			if (eingabe.equalsIgnoreCase("ende")) {
				System.out.println("ende");
				break;
			}
			for (int i = 0; i < eingabe.length(); i++) {			
				r.eingeben(eingabe.charAt(i));
			}
		}

	}

}
