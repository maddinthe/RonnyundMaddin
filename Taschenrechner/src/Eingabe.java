

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		Rechner r = new Rechner();									// Anlegen des Objekts Rechner
		Scanner s = new Scanner(System.in);	                        // Anlegen des Objekts Scanner
		Display d = new Display();
		r.d=d;		
		System.out.println("Wilkommen in Maddins rechner:");
		System.out.println("Welchen Zeichen-Satz moechten sie nutzen?");
		System.out.println("1 fuer Gross und 2 fuer Klein");
		d.setBuchstabenSatz(s.nextInt()-1);
		
		while (true) {												// Durchlaufe Schleife
			String eingabe = s.nextLine();							// Abfrage der naechsten Zeile in der Konsole und speichern in Eingabe
			if (eingabe.equalsIgnoreCase("ende")) {					// Wenn eingabe "ende" erfolgt wird die Schleife Abgebrochen (schreibweise egal)
				System.out.println("Ende");							// Ausgabe "Ende"
				break;
			}
			if (eingabe.contains("c")==false)
				d.eingabe(eingabe);
			for (int i = 0; i < eingabe.length(); i++) {			// Fuer jedes Zeichen aus dem String eingabe, fuehre rechner eingabe aus
				r.eingeben(eingabe.charAt(i));
			}
		}

	}

}
