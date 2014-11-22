

public class Rechner {
	private int status = 1;							// Initialisieren der Variablen
	private double zahl1 = 0;
	private double zahl2 = 0;
	private char oper = 0;
	private int nakom = 0;
	private int nakomZaehl=0;
	public Display d;

	public void reset() {							// Zur�cksetzten der Variablen
		status = 1;
		zahl1 = 0;
		zahl2 = 0;
		oper = 0;
		nakom = 0;
		nakomZaehl=0;
		d.ausgabe="";
	}

	public void eingeben(char eingabe) {												// Anlegen der Methode eingeben
		switch (status) {																// Pr�fe Status
		case 1:																			// Fall 1
			switch (eingabe) {
			case 'c':																	// Fall C im Fall 1
				this.reset();
				break;
			case '+':																	// Fall + im Fall 1
			case '*':																	// Fall * im Fall 1
			case '-':																	// Fall - im Fall 1
			case '/':																	// Fall / im Fall 1
				status = 3;																// Wechsle in Status 3
				oper = eingabe;				
				break;
			case ',':																	// Fall , im Fall 3
			case '.':																	// Fall . im Fall 3
				status = 2;																// Wechsle in Status 2
				break;
			case '=':
				d.anzeigen(String.valueOf(zahl1));
				//System.out.println(zahl1);												// Gebe Zahl 2 aus
				break;
			default:
				if (Character.isDigit(eingabe)) {										// Wenn eingegebenes Zeichen eine Zahl ist
					zahl1 = (zahl1 * 10) + Character.getNumericValue(eingabe);			// so multipliziere die Zahl1 mit 10 und wandle den 
					}																		// eingelesenen ASCII Wert in einen Integer um
			}
			break;
		case 2:																			// Fall 2
			switch (eingabe) {
			case 'c':																	// Fall C im Fall 2
				this.reset();
				break;
			case '+':																	// Fall + im Fall 2
			case '*':																	// Fall * im Fall 2
			case '-':																	// Fall - im Fall 2
			case '/':																	// Fall / im Fall 2
				zahl1 = this.komma(zahl1, nakom,nakomZaehl);			
				oper = eingabe;														
				status = 3;																// Wechsle in Zustand 3
				nakom=0;
				nakomZaehl=0;
				break;
			case '=':																	// Fall = im Fall 3
				zahl1 = this.komma(zahl1,nakom,nakomZaehl);
				d.anzeigen(String.valueOf(zahl1));
				//System.out.println(zahl1);												// multipliziere die Nachkommastelle mit 10 hoch - L�nge Nachkommastelle
				status = 5;																// wechsle in Zustand 5
				nakom = 0;																// Setzte Variable nakom auf 0 zur�ck
				nakomZaehl=0;
				break;
			default:
				if (Character.isDigit(eingabe)) {										// Wenn eingegebenes Zeichen eine Zahl ist	
					nakom = (nakom * 10) + Character.getNumericValue(eingabe);			// so multipliziere die Zahl nakom mit 10 und wandle den 
					nakomZaehl+=1;
				}																		// eingelesenen ASCII Wert in einen Integer um und speichere
			}																		 	// diesen in nakom
			break;
		case 3:																			// Fall 3
			switch (eingabe) {
			case 'c':																	// Fall C im Fall 3
				this.reset();															// hiermit wird die eigene Methode Reset ausgef�hrt
				break;
			case '+':																	// Fall + im Fall 3
			case '*':																	// Fall * im Fall 3
			case '-':																	// Fall - im Fall 3
			case '/':																	// Fall / im Fall 3
				
					zahl1 = this.rechnen(zahl1, zahl2, oper);							// hier wird das Rechnen mit Zahl 1 u Zahl2 u Operand  
					zahl2=0;															// mit der Methode rechnen benutzt, speichern des Ergebnisses in Zahl 1 
																						// Die Variable Zahl 2 wird auf 0 gesetzt
				oper = eingabe;															// Der Operand wird auf Variable eingabe gesetzt	
				break;
			case ',':																	// Fall "," im Fall 3
			case '.':																	// Fall "." im Fall 3
				status = 4;																// Wechsle in den Status 4
				break;
			case '=':
				zahl1 = this.rechnen(zahl1, zahl2, oper);								// hier wird das Rechnen mit Zahl 1 u Zahl2 u Operand
				d.anzeigen(String.valueOf(zahl1));
				//System.out.println(zahl1);												// mit der Methode rechnen benutzt 
				oper = 0;																// der Operand wird auf 0 gesetzt
				zahl2=0;
				status = 5;																// Wechsle in Status 5
				break;
			default:
				if (Character.isDigit(eingabe)) {										// Wenn eingegebenes Zeichen eine Zahl ist
					zahl2 = (zahl2 * 10) + Character.getNumericValue(eingabe);			// so multipliziere die Zahl2 mit 10 und wandle den
				}																		// eingelesenen ASCII Wert in einen Integer um und speichere
			}																			// das Ergebnis in Zahl2
			break;
		case 4:																			// Fall 4
			switch (eingabe) {
			case 'c':																	// Fall c im Fall 4
				this.reset();															// nutze "dieses reset"
				break;
			case '+':																	// Fall + im Fall 3
			case '*':																	// Fall * im Fall 3
			case '-':																	// Fall - im Fall 3
			case '/':																	// Fall / im Fall 3
				zahl2 = this.komma(zahl2, nakom,nakomZaehl);								
					zahl1 = this.rechnen(zahl1, zahl2, oper);							// hier wird das Rechnen mit Zahl 1 u Zahl2 u Operand
					zahl2=0;															// mit der Methode rechnen benutzt, Zahl 2 wird auf 0 gesetzt			
				status = 3;																// Wechsle in Zustand 3
				oper = eingabe;															// Der Operand wird auf Variable eingabe gesetzt
				nakom=0;																// nakom wird auf 0 gesetzt
				nakomZaehl=0;
				break;
			case '=':																	// Fall = im Zustand 3 
				zahl2 = this.komma(zahl2, nakom,nakomZaehl);
				zahl1 = this.rechnen(zahl1, zahl2, oper);								// Rechne mit Zahl 1, Zahl2 und Operand
				d.anzeigen(String.valueOf(zahl1));
				//System.out.println(zahl1);												// Ausgabe der Zahl 1
				status = 5;																// Wechsle in Zustand 5
				oper = 0;																// setze Operand auf 0
				nakom = 0;																// setze Nachkommastelle auf 0
				nakomZaehl=0;
				zahl2=0;
				break;
			default:
				if (Character.isDigit(eingabe)) {										// Wenn eingegebenes Zeichen eine Zahl ist
					nakom = (nakom * 10) + Character.getNumericValue(eingabe);			// so multipliziere die nakom mit 10 und wandle den
					nakomZaehl+=1;
				}																		// eingelesenen ASCII Wert in einen Integer um und speichere die Summe in nakom
			}
			break;
		case 5:																			// Fall 5
			switch (eingabe) {
			case 'c':																	// Fall c im Fall 5
				this.reset();															// ausf�hren der Methode "reset"
				break;
			case '+':																	// Fall + im Fall 1
			case '*':																	// Fall * im Fall 1
			case '-':																	// Fall - im Fall 1
			case '/':																	// Fall / im Fall 1
				status = 3;																// Wechsle in Status 3
				oper = eingabe;				
				break;
			case '=':																	// Fall "=" im Fall 5
				d.anzeigen(String.valueOf(zahl1));
				//System.out.println(zahl1);												// gib Zahl 1 aus
			default:
				if (Character.isDigit(eingabe)) {										// Wenn eingegebenes Zeichen eine Zahl ist
					zahl1 = Character.getNumericValue(eingabe);							// Umwandeln des eingelesenen ASCII Wertes in einen Integer 
					status = 1;															// und speichern in der Zahl1, wechsle in Zustand 1
				}

			}
			break;
		}
	}

	public double rechnen(double num1, double num2, char operand) {						// Anlegen der Methode rechnen, deklarieren von num1,num2 als double, operand als char
		double ergebnis = 0;															// ergebnis ist vom Typ double und wird auf 0 gesetzt
		switch (operand) {	
		case '+':																		// Fall "+"
			ergebnis = num1 + num2;														// Ergebnis ist gleich num1+num2
			break;	
		case '-':																		// Fall "-"
			ergebnis = num1 - num2;														// Ergebnis ist gleich num1-num2
			break;
		case '*':																		// Fall "*"
			ergebnis = num1 * num2;														// Ergebnis ist gleich num1*num2
			break;
		case '/':																		// Fall "/"
			ergebnis = num1 / num2;														// Ergebnis ist gleich num1/num2
			break;
		}

		return ergebnis;																// gib Ergebnis zur�ck
	}
	public double komma(double vorkomm,double nakomm,int zaehler){	
		for(int i=zaehler;i>0;i--) nakomm/=10;	
		return vorkomm+nakomm;}
}
