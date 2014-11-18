
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
	
	private String[][][] array=new String[1][16][];
	public void bla(){
		
		array[0][0]=zero;
		array[0][1]=eins;
		array[0][2]=zwei;
		array[0][3]=drei;
		array[0][4]=vier;
		array[0][5]=fuenf;
		array[0][6]=sechs;
		array[0][7]=sieben;
		array[0][8]=acht;
		array[0][9]=neun;
		array[0][10]=punkt;
		array[0][11]=plus;
		array[0][12]=minus;
		array[0][13]=mal;
		array[0][14]=geteilt;
		array[0][15]=gleich;}
		
	
	
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
			int satz=0;
			for (int i=0;i<array[satz][0].length;i++){
				for (int j=0;j<str.length();j++){
					switch (str.charAt(j)){
					case '1':
						System.out.print(array[satz][1][i]);
						//System.out.print(eins[i]);
						break;
					case '2':
						System.out.print(array[satz][2][i]);
						//System.out.print(zwei[i]);
						break;
					case '3':
						System.out.print(array[satz][3][i]);
						//System.out.print(drei[i]);
						break;
					case '4':
						System.out.print(array[satz][4][i]);
						//System.out.print(vier[i]);
						break;
					case '5':
						System.out.print(array[satz][5][i]);
						//System.out.print(fuenf[i]);
						break;
					case '6':
						System.out.print(array[satz][6][i]);
						//System.out.print(sechs[i]);
						break;
					case '7':
						System.out.print(array[satz][7][i]);
						//System.out.print(sieben[i]);
						break;
					case '8':
						System.out.print(array[satz][8][i]);
						//System.out.print(acht[i]);
						break;
					case '9':
						System.out.print(array[satz][9][i]);
						//System.out.print(neun[i]);
						break;
					case '0':
						System.out.print(array[satz][0][i]);
						//System.out.print(zero[i]);
						break;
					case '.':
					case ',':
						System.out.print(array[satz][10][i]);
						//System.out.print(punkt[i]);
						break;
					case '+':
						System.out.print(array[satz][11][i]);
						//System.out.print(plus[i]);
						break;
					case '-':
						System.out.print(array[satz][12][i]);
						//System.out.print(minus[i]);
						break;
					case '*':
						System.out.print(array[satz][13][i]);
						//System.out.print(mal[i]);
						break;
					case '/':
						System.out.print(array[satz][14][i]);
						//System.out.print(geteilt[i]);
						break;
					case '=':
						System.out.print(array[satz][15][i]);
						//System.out.print(gleich[i]);
						break;
					}
				}
				System.out.println();
			}
		}
}
