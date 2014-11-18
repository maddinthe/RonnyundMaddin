
public class Display {
	private String[] eins={	"        ",
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
	
	private String[] zwei={	"    ____     ",
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
	private String[] drei={	"   ____     ",
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
	private String[] vier={	"            ",
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
	private String[] fuenf={"   ____     ",
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
	private String[] sechs={"   ____     ",
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
	private String[] sieben={	"   ____     ",
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
	private String[] acht={	"   ____     ",
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
	private String[] neun={	"   ____     ",
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
	private String[] zero={	"   ____     ",
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
	private String[] punkt={"   ",
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
	private String[] plus={	"          ",
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
	private String[] minus={"          ",
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
	private String[] mal={	"       ",
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
	private String[] geteilt={	"      ",
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
	private String[] gleich={	"         ",
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
	
	
	public String ausgabe="";
	public void eingabe(String str){
		ausgabe+=str;
		strAnzeigen(ausgabe);
	}	
	public void anzeigen(String str){
			ausgabe+=str;
			for(int i=0;i<21;i++)
				System.out.println();
			strAnzeigen(ausgabe);
			ausgabe=str;
		}
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
