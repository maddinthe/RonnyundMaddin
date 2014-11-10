

import java.util.Scanner;

public class Eingabe {

	public static void main(String[] args) {
		Rechner r = new Rechner();
		Scanner s = new Scanner(System.in);
		for (; true;) {
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
