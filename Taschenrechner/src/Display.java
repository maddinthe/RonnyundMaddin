
public class Display {
	String[] eins={	"        ",
					"        ",
					"   /\\   ",
					"  |  |  ",
					"  |  |  ",
					"   \\/   ",
					"   /\\   ",
					"  |  |  ",
					"  |  |  ",
					"   \\/   ",
					"        "};
	
	String[] zwei={	"    ____     ",
					"   /    \\    ",
					"   \\____/\\   ",
					"       |  |  ",
					"    ___|  |  ",
					"   /    \\/   ",
					"  /\\____/    ",
					" |  |        ",
					" |  |___     ",
					"  \\/    \\    ",
					"   \\____/    "};
	String[] drei={	"   ____     ",
					"  /    \\    ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/    "};
	String[] vier={	"            ",
					"            ",
					" /\\    /\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/\\   ",
					"      |  |  ",
					"      |  |  ",
					"       \\/   ",
					"            "};
	String[] fuenf={"   ____     ",
					"  /    \\    ",
					" /\\____/    ",
					"|  |        ",
					"|  |___     ",
					" \\/    \\    ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/    "};
	String[] sechs={"   ____     ",
					"  /    \\    ",
					" /\\____/    ",
					"|  |        ",
					"|  |___     ",
					" \\/    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/    "};
	String[] sieben={	"   ____     ",
						"  /    \\    ",
						"  \\____/\\   ",
						"      |  |  ",
						"      |  |  ",
						"       \\/   ",
						"       /\\   ",
						"      |  |  ",
						"      |  |  ",
						"       \\/   ",
						"            "};
	String[] acht={	"   ____     ",
					"  /    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/    "};
	String[] neun={	"   ____     ",
					"  /    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/    "};
	String[] zero={	"   ____     ",
					"  /    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |  |  |  ",
					" \\/    \\/   ",
					" /\\    /\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/    "};
	String[] punkt={"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"## ",
					"## "};
	String[] plus={	"          ",
					"          ",
					"          ",
					"    #     ",
					"    #     ",
					" ######## ",
					"    #     ",
					"    #     ",
					"          ",
					"          ",
					"          "};
	String[] minus={"          ",
					"          ",
					"          ",
					"          ",
					"          ",
					" #######  ",
					"          ",
					"          ",
					"          ",
					"          ",
					"          "};
	String[] mal={	"       ",
					"       ",
					"       ",
					" #   # ",
					"  # #  ",
					"   #   ",
					"  # #  ",
					" #   # ",
					"       ",
					"       ",
					"       "};
	String[] geteilt={	"      ",
						"      ",
						"      ",
						"  ##  ",
						"  ##  ",
						"      ",
						"  ##  ",
						"  ##  ",
						"      ",
						"      ",
						"      "};
	String[] gleich={	"         ",
						"         ",
						"         ",
						"         ",
						" ####### ",
						"         ",
						" ####### ",
						"         ",
						"         ",
						"         ",
						"         "};
	
		public void strAnzeigen(String str){
			for (int i=0;i<eins.length;i++){
				for (int j=0;j<str.length();j++){
					switch (str.charAt(j)){
					case '1':
						System.out.print(eins[i]);
						break;
					case '2':
						System.out.print(zwei[i]);
						break;
					case '3':
						System.out.print(drei[i]);
						break;
					case '4':
						System.out.print(vier[i]);
						break;
					case '5':
						System.out.print(fuenf[i]);
						break;
					case '6':
						System.out.print(sechs[i]);
						break;
					case '7':
						System.out.print(sieben[i]);
						break;
					case '8':
						System.out.print(acht[i]);
						break;
					case '9':
						System.out.print(neun[i]);
						break;
					case '0':
						System.out.print(zero[i]);
						break;
					case '.':
					case ',':
						System.out.print(punkt[i]);
						break;
					case '+':
						System.out.print(plus[i]);
						break;
					case '-':
						System.out.print(minus[i]);
						break;
					case '*':
						System.out.print(mal[i]);
						break;
					case '/':
						System.out.print(geteilt[i]);
						break;
					case '=':
						System.out.print(gleich[i]);
						break;
					}
				}
				System.out.println();
			}
		}
}
