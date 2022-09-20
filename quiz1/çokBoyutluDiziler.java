
public class çokBoyutluDiziler {

	public static void main(String[] args) {
		 String[][]yiyecek=new String[3][3];
			
		 yiyecek[0][0]="Erik";
		 yiyecek[0][1]="Kiraz";
		 yiyecek[0][2]="Muz";
		 yiyecek[1][0]="Zeytin";
		 yiyecek[1][1]="Peynir";
		 yiyecek[1][2]="Recel";
		 yiyecek[2][0]="Biber";
		 yiyecek[2][1]="Patlican";
		 yiyecek[2][2]="Kabak";
		    
		    for(int i=0;i<=2;i++) {
		    	System.out.println("----------------");
		        for(int j=0;j<=2;j++) {
		            System.out.println(yiyecek[i][j]);
		        }
		    }

	}

}
