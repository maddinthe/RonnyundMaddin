

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		Rechner r = new Rechner();									// Anlegen des Objekts Rechner
		Scanner s = new Scanner(System.in);	                        // Anlegen des Objekts Scanner
		Display d = new Display();
		r.d=d;
		d.bla();
		//d.strAnzeigen("22/14*3=789");
		
		System.out.println("Woilkommen in Maddins rechner:");
		System.out.println("Welchen Zeichen-Satz möchten sie nutzen?");
		System.out.println("1 für Groß und 2 für Klein");
		d.setBuchstabenSatz(s.nextInt()-1);
		
		while (true) {												// Durchlaufe Schleife
			String eingabe = s.nextLine();							// Abfrage der nï¿½chsten Zeile in der Konsole und speichern in Eingabe
			if (eingabe.equalsIgnoreCase("ende")) {					// Wenn eingabe "ende" erfolgt wird die Schleife Abgebrochen (schreibweise egal)
				System.out.println("Ende");							// Ausgabe "Ende"
				break;
			}
			if (eingabe.contains("c")==false)
				d.eingabe(eingabe);
			for (int i = 0; i < eingabe.length(); i++) {			// Fï¿½r jedes Zeichen aus dem String eingabe, fï¿½hre rechner eingabe aus
				r.eingeben(eingabe.charAt(i));
			}
		}

	}

}
