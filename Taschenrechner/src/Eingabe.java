

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		Rechner r = new Rechner();									// Anlegen des Objekts Rechner
		Scanner s = new Scanner(System.in);	                        // Anlegen des Objekts Scanner
		Display d = new Display();
		r.d=d;
		//d.strAnzeigen("22/14*3=789");
		
		while (true) {												// Durchlaufe Schleife
			String eingabe = s.nextLine();							// Abfrage der n�chsten Zeile in der Konsole und speichern in Eingabe
			if (eingabe.equalsIgnoreCase("ende")) {					// Wenn eingabe "ende" erfolgt wird die Schleife Abgebrochen (schreibweise egal)
				System.out.println("Ende");							// Ausgabe "Ende"
				break;
			}
			for (int i = 0; i < eingabe.length(); i++) {			// F�r jedes Zeichen aus dem String eingabe, f�hre rechner eingabe aus
				r.eingeben(eingabe.charAt(i));
			}
		}

	}

}
