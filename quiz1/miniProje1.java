
public class miniProje1 {

	public static void main(String[] args) {
		
		int sayi=61 ;
		boolean asalMı =true;
		
		if(sayi==1) {
			System.out.println("Sayi asal degildir!");
		}
		if(sayi<1) {
			System.out.println("gecersiz sayi girdiniz!");
		}
		
		for(int i=2;i<sayi;i++) {
			if(sayi%i == 0) {
				asalMı =false;
			}

		}
		
		if(asalMı) {
			System.out.println("Girdiginiz sayi asaldir!");
		}
		else {
			System.out.println("Girdiginiz sayi asal degildir!");
		}
		
	}

}
