

public class Reverse {
	private String text;


	public String reverseWordByWord(String text) {
		int strLength = text.length() - 1; 								// setzt die Variable Stringlaenge
		String reverse = "", temp = "";									// initialisiert reverse und temp als
																		// String

		for (int i = 0; i <= strLength; i++) { 							// laeuft so lange bis I dem Wert
																		// der Variable Stringlaenge
																		// entspricht
			if (text.charAt(i) != ' ') { 								// prueft ob kein Leerzeichen an
																		// Position I im String text
																		// gefunden wurde
				temp += text.charAt(i); 								// und fuegt dann den Char der position i
																		// hinten an den String temp an
			}
			if (text.charAt(i) == ' ') {								// prueft ob ein Leerzeichen an pos i im
																		// String text vorhanden ist
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse += temp.charAt(j);
					if (j == 0) {
						reverse += " "; 								// fuegt den string temp Zeichenweise,
																		// von hinten nach vorne, an den string
																		// reverse an und fuegt am Ende ein
																		// Leerzeichen ein
					}
				}
				temp = ""; 												// setzt temp wieder auf leer zurueck
			} else if (i == strLength) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse += temp.charAt(j);							// prueft ob i der stringlaenge
																		// entspricht und fuegt den
																		// string temp Zeichenweise, von
																		// hinten nach vorne, an den
																		// string reverse an
				}
				temp = ""; 												// setzt temp zurueck
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
