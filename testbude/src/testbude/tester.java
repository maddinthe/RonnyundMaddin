package testbude;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		Scanner s=new Scanner(System.in);
		tester t=new tester();
		System.out.println("Zahl 1 eingeben");
		int zahl1= s.nextInt();
		System.out.println("Zahl 2 eingeben");
		
		int zahl2=s.nextInt();
		System.out.println(t.komma(zahl1,zahl2));
		
	}
	public double komma(double vorkomm,double nakomm){
		double ergebnis;
		double rest=nakomm;
		while(true){
			rest/=10;
			nakomm/=10;
			if (rest<10){
				nakomm/=10;
				break;
			}
		}
		ergebnis=vorkomm+nakomm;		
		return ergebnis;
	}

}
