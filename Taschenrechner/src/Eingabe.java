

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		Rechner r = new Rechner();									// Anlegen des Objekts Rechner
		Scanner s = new Scanner(System.in);							// Anlegen des Objekts Scanner
		while (true) {												// Durchlaufe Schleife
			String eingabe = s.nextLine();							// Abfrage der nächsten Zeile in der Konsole und speichern in Eingabe
			if (eingabe.equalsIgnoreCase("ende")) {					// Wenn eingabe "ende" erfolgt wird die Schleife Abgebrochen (schreibweise egal)
				System.out.println("Ende");							// Ausgabe "Ende"
				break;
			}
			for (int i = 0; i < eingabe.length(); i++) {			// Für jedes Zeichen aus dem String eingabe, führe rechner eingabe aus
				r.eingeben(eingabe.charAt(i));
			}
		}

	}

}
