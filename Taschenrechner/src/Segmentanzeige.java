
public class Segmentanzeige {
	boolean[] anzeige=new boolean[64];
	
	public void an (int seg){
		anzeige[seg]=true;
	}
	public void aus (int seg){
		anzeige[seg]=false;
	}
	public boolean isAn(int seg){		
		return anzeige[seg];
	}
	public void clearAll(){
		for (int i=0;i<anzeige.length;i++)
			anzeige[i]=false;
		
	}
}
