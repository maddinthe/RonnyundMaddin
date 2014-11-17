
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
	public void einsdrucken(){
		for (int i=0;i<eins.length;i++){
			System.out.print(eins[i]);
			System.out.print(zwei[i]);
			System.out.print(vier[i]);
			System.out.print(drei[i]);
			System.out.print(zwei[i]);
			System.out.println();
	}
		
		
		}public void strAnzeigen(String str){
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
					}
				}
				System.out.println();
			}
		}
}
