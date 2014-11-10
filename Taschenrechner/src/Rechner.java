

public class Rechner {
	private int status = 1;
	private double zahl1 = 0;
	private double zahl2 = 0;
	private char oper = 0;
	private int nakom = 0;


	public void reset() {
		status = 1;
		zahl1 = 0;
		zahl2 = 0;
		oper = 0;
		nakom = 0;
		
	}

	public void eingeben(char eingabe) {
		switch (status) {
		case 1:
			switch (eingabe) {
			case 'c':
				this.reset();
				break;
			case '+':
			case '*':
			case '-':
			case '/':
				status = 3;
				oper = eingabe;
				break;
			case ',':
			case '.':
				status = 2;
				break;
			case '=':
				System.out.println(zahl1);
				break;
			default:
				if (Character.isDigit(eingabe)) {
					zahl1 = (zahl1 * 10) + Character.getNumericValue(eingabe);
				}
			}
			break;
		case 2:
			switch (eingabe) {
			case 'c':
				this.reset();
				break;
			case '+':
			case '*':
			case '-':
			case '/':
				zahl1 += nakom
						* (Math.pow(10.0, -String.valueOf(nakom).length()));
				oper = eingabe;
				status = 3;
				break;
			case '=':
				zahl1 += nakom
						* (Math.pow(10.0, -String.valueOf(nakom).length()));
				System.out.println(zahl1);
				status = 5;
				nakom = 0;
				break;
			default:
				if (Character.isDigit(eingabe)) {
					nakom = (nakom * 10) + Character.getNumericValue(eingabe);
				}
			}
			break;
		case 3:
			switch (eingabe) {
			case 'c':
				this.reset();
				break;
			case '+':
			case '*':
			case '-':
			case '/':
				
					zahl1 = this.rechnen(zahl1, zahl2, oper);
					zahl2=0;
							
				oper = eingabe;
				break;
			case ',':
			case '.':
				status = 4;
				break;
			case '=':
				zahl1 = this.rechnen(zahl1, zahl2, oper);
				System.out.println(zahl1);
				oper = 0;
				status = 5;
				break;
			default:
				if (Character.isDigit(eingabe)) {
					zahl2 = (zahl2 * 10) + Character.getNumericValue(eingabe);
				}
			}
			break;
		case 4:
			switch (eingabe) {
			case 'c':
				this.reset();
				break;
			case '+':
			case '*':
			case '-':
			case '/':
				zahl2 += nakom
				* (Math.pow(10.0, -String.valueOf(nakom).length()));
				
					zahl1 = this.rechnen(zahl1, zahl2, oper);
					zahl2=0;
				
				
				status = 3;
				oper = eingabe;
				break;
			case '=':
				zahl2 += nakom
						* (Math.pow(10.0, -String.valueOf(nakom).length()));
				zahl1 = this.rechnen(zahl1, zahl2, oper);
				System.out.println(zahl1);
				status = 5;
				oper = 0;
				nakom = 0;
				break;
			default:
				if (Character.isDigit(eingabe)) {
					nakom = (nakom * 10) + Character.getNumericValue(eingabe);
				}
			}
			break;
		case 5:
			switch (eingabe) {
			case 'c':
				this.reset();
				break;
			case '=':
				System.out.println(zahl1);
			default:
				if (Character.isDigit(eingabe)) {
					zahl1 = Character.getNumericValue(eingabe);
					status = 1;
				}

			}
			break;
		}
	}

	public double rechnen(double num1, double num2, char operand) {
		double ergebnis = 0;
		switch (operand) {
		case '+':
			ergebnis = num1 + num2;
			break;
		case '-':
			ergebnis = num1 - num2;
			break;
		case '*':
			ergebnis = num1 * num2;
			break;
		case '/':
			ergebnis = num1 / num2;
			break;
		}

		return ergebnis;
	}
}
