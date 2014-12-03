
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegmentAnst seganst=new SegmentAnst();
		Segmentanzeige seg=seganst.getSeg();
		seganst.anst(-12.34);
		for (int i=0;i<64;i++){
			System.out.print(seg.isAn(i));
			System.out.println(" Element"+ i);
		}
		
	}

}
