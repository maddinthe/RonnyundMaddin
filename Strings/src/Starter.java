
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Reverse r = new Reverse(); // generiert das Objekt R aus der Klasse
									// Reverse

		ReverseSatzZeichen rs = new ReverseSatzZeichen();
		ReverseSZCase rsc = new ReverseSZCase();
		System.out.println("Bitte Satz eingeben:");
		Scanner scanner = new Scanner(System.in);
		r.setText(scanner.nextLine()); // ließt die nächste komplette
										// eingegebene Zeichenkette bis drücken
										// der Entertaste aus

		System.out.println(r.getText()+"\n");
		String reverse = r.reverseWordByWord(r.getText()); // ruft die
															// Umkehrmethode vom
															// objekt r der
															// Klasse Reverse
															// auf mit dem
															// inhalt von
															// r.getText
		System.out.println("gedreht ergibt:");
		System.out.println(reverse + "\n");

		String satzzeichen = (rs.reverse(r.getText()));
		System.out.println("mit Satzzeichen an richtiger stelle:");
		System.out.println(satzzeichen + "\n");

		String sZCase = (rsc.reverse(r.getText()));
		System.out.println("Mit richtigen Cases:");
		System.out.println(sZCase);
	}

}
