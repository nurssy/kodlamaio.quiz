
public class miniProje3 {

	public static void main(String[] args) {
		int sayi=9;
		int toplam =0;

		for(int i=1;i<sayi;i++) {
			if(sayi % i == 0) {
				toplam = toplam + sayi;
			}
		}
		
		if(toplam == sayi) {
			System.out.println("Girdiginiz sayi mukemmel sayidir!");
		}
		else {
			System.out.println("Girdiginiz sayi mukemmel sayi degildir!");
		}
		
		}
		
	}