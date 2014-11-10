

public class Reverse {
	private String text;


	public String reverseWordByWord(String text) {
		int strLength = text.length() - 1; 								// setzt die Variable Stringlänge
		String reverse = "", temp = "";									// initialisiert reverse und temp als
																		// String

		for (int i = 0; i <= strLength; i++) { 							// läuft so lange bis I dem Wert
																		// der Variable Stringlänge
																		// entspricht
			if (text.charAt(i) != ' ') { 								// prüft ob kein Leerzeichen an
																		// Position I im String text
																		// gefunden wurde
				temp += text.charAt(i); 								// und fügt dann den Char der position i
																		// hinten an den String temp an
			}
			if (text.charAt(i) == ' ') {								// prüft ob ein Leerzeichen an pos i im
																		// String text vorhanden ist
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse += temp.charAt(j);
					if (j == 0) {
						reverse += " "; 								// fügt den string temp Zeichenweise,
																		// von hinten nach vorne, an den string
																		// reverse an und fügt am Ende ein
																		// Leerzeichen ein
					}
				}
				temp = ""; 												// setzt temp wieder auf leer zurück
			} else if (i == strLength) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse += temp.charAt(j);							// prüft ob i der stringlänge
																		// entspricht und fügt den
																		// string temp Zeichenweise, von
																		// hinten nach vorne, an den
																		// string reverse an
				}
				temp = ""; 												// setzt temp zurück
			}
		}

		return reverse;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
