
public class SegmentAnst {
	Segmentanzeige seg=new Segmentanzeige();
	public Segmentanzeige getSeg() {
		return seg;
	}

	private int[][] ansteuer = {{1,5,7,3,6,4},{5,7},{1,5,2,6,3},{1,5,2,7,3},{4,5,2,7},{1,4,2,7,3},{1,4,2,7,3,6},{1,5,7},{1,2,3,4,5,6,7},{1,4,5,2,7,3}};
	
	public void anst(double AusgWert){
		AusgWert+=0.00000000001;
		String zahl=String.valueOf(AusgWert);
		
		if (zahl.contains("-")&zahl.contains("."))
			zahl=zahl.substring(0,10);
		else if (zahl.contains("-")||zahl.contains("."))
			zahl=zahl.substring(0,9);
		else zahl=zahl.substring(0,8);
		System.out.println(zahl);
		seg.clearAll();
		for (int i=0,j=0,l=0; i<zahl.length();i++){
			switch (zahl.charAt(i)){
			case '.':
			case '-':
				seg.an(j);
				break;
			default:
				l=Character.getNumericValue(zahl.charAt(i));
				for (int k=0;k<ansteuer[l].length;k++){
					seg.an(j+(ansteuer[l][k]));
				}
				j+=8;
				
			}
		}
		
	}
}
