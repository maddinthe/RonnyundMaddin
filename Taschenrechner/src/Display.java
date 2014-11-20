public class Display {
	private int satz = 0;

	public void setBuchstabenSatz(int satz) {
		this.satz = satz;
	}

	private String[][][] array = {
			{
					{ "   ____     ", "  /    \\    ", " /\\____/\\   ",
							"|  |  |  |  ", "|  |  |  |  ", " \\/    \\/   ",
							" /\\    /\\   ", "|  |  |  |  ", "|  |__|  |  ",
							" \\/    \\/   ", "  \\____/    " },
					{ "        ", "        ", "   /\\   ", "  |  |  ",
							"  |  |  ", "   \\/   ", "   /\\   ", "  |  |  ",
							"  |  |  ", "   \\/   ", "        " },
					{ "    ____     ", "   /    \\    ", "   \\____/\\   ",
							"       |  |  ", "    ___|  |  ", "   /    \\/   ",
							"  /\\____/    ", " |  |        ", " |  |___     ",
							"  \\/    \\    ", "   \\____/    " },
					{ "   ____     ", "  /    \\    ", "  \\____/\\   ",
							"      |  |  ", "   ___|  |  ", "  /    \\/   ",
							"  \\____/\\   ", "      |  |  ", "   ___|  |  ",
							"  /    \\/   ", "  \\____/    " },
					{ "            ", "            ", " /\\    /\\   ",
							"|  |  |  |  ", "|  |__|  |  ", " \\/    \\/   ",
							"  \\____/\\   ", "      |  |  ", "      |  |  ",
							"       \\/   ", "            " },
					{ "   ____     ", "  /    \\    ", " /\\____/    ",
							"|  |        ", "|  |___     ", " \\/    \\    ",
							"  \\____/\\   ", "      |  |  ", "   ___|  |  ",
							"  /    \\/   ", "  \\____/    " },
					{ "   ____     ", "  /    \\    ", " /\\____/    ",
							"|  |        ", "|  |___     ", " \\/    \\    ",
							" /\\____/\\   ", "|  |  |  |  ", "|  |__|  |  ",
							" \\/    \\/   ", "  \\____/    " },
					{ "   ____     ", "  /    \\    ", "  \\____/\\   ",
							"      |  |  ", "      |  |  ", "       \\/   ",
							"       /\\   ", "      |  |  ", "      |  |  ",
							"       \\/   ", "            " },
					{ "   ____     ", "  /    \\    ", " /\\____/\\   ",
							"|  |  |  |  ", "|  |__|  |  ", " \\/    \\/   ",
							" /\\____/\\   ", "|  |  |  |  ", "|  |__|  |  ",
							" \\/    \\/   ", "  \\____/    " },
					{ "   ____     ", "  /    \\    ", " /\\____/\\   ",
							"|  |  |  |  ", "|  |__|  |  ", " \\/    \\/   ",
							"  \\____/\\   ", "      |  |  ", "   ___|  |  ",
							"  /    \\/   ", "  \\____/    " },
					{ "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ",
							"   ", "## ", "## " },
					{ "          ", "          ", "          ", "    #     ",
							"    #     ", " ######## ", "    #     ",
							"    #     ", "          ", "          ",
							"          " },
					{ "          ", "          ", "          ", "          ",
							"          ", " #######  ", "          ",
							"          ", "          ", "          ",
							"          " },
					{ "       ", "       ", "       ", " #   # ", "  # #  ",
							"   #   ", "  # #  ", " #   # ", "       ",
							"       ", "       " },
					{ "      ", "      ", "      ", "  ##  ", "  ##  ",
							"      ", "  ##  ", "  ##  ", "      ", "      ",
							"      " },
					{ "         ", "         ", "         ", "         ",
							" ####### ", "         ", " ####### ", "         ",
							"         ", "         ", "         " } },
			{ { " _  ", "| | ", "|_| " }, { "  ", "| ", "| " },
					{ " _  ", " _| ", "|_  " }, { " _  ", " _| ", " _| " },
					{ "    ", "|_| ", "  | " }, { " _  ", "|_  ", " _| ", },
					{ " _  ", "|_  ", "|_| ", }, { " _  ", "  | ", "  | ", },
					{ " _  ", "|_| ", "|_| ", }, { " _  ", "|_| ", " _| ", },
					{ "  ", "  ", "o " }, { "     ", " _|_ ", "  |  " },
					{ "    ", " __ ", "    " }, { "   ", " o ", "   " },
					{ "   ", " o ", " o " }, { "    ", "=== ", "=== " }

			} };
	public String ausgabe = "";

	public void eingabe(String str) {
		ausgabe += str;
		strAnzeigen(ausgabe);
	}

	public void anzeigen(String str) {
		ausgabe += str;
		for (int i = 0; i < 21; i++)
			System.out.println();
		strAnzeigen(ausgabe);
		ausgabe = str;
	}

	public void strAnzeigen(String str) {
		for (int i = 0; i < array[satz][0].length; i++) {
			for (int j = 0; j < str.length(); j++) {
				switch (str.charAt(j)) {
				case '1':
					System.out.print(array[satz][1][i]);
					break;
				case '2':
					System.out.print(array[satz][2][i]);
					break;
				case '3':
					System.out.print(array[satz][3][i]);
					break;
				case '4':
					System.out.print(array[satz][4][i]);
					break;
				case '5':
					System.out.print(array[satz][5][i]);
					break;
				case '6':
					System.out.print(array[satz][6][i]);
					break;
				case '7':
					System.out.print(array[satz][7][i]);
					break;
				case '8':
					System.out.print(array[satz][8][i]);
					break;
				case '9':
					System.out.print(array[satz][9][i]);
					break;
				case '0':
					System.out.print(array[satz][0][i]);
					break;
				case '.':
				case ',':
					System.out.print(array[satz][10][i]);
					break;
				case '+':
					System.out.print(array[satz][11][i]);
					break;
				case '-':
					System.out.print(array[satz][12][i]);
					break;
				case '*':
					System.out.print(array[satz][13][i]);
					break;
				case '/':
					System.out.print(array[satz][14][i]);
					break;
				case '=':
					System.out.print(array[satz][15][i]);
					break;
				}
			}
			System.out.println();
		}
	}
}
