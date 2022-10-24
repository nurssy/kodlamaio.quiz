package Main;

public class VeriableArguments {

	public static void main(String[] args) {
		int toplama = topla(1,2,3,4);
		System.out.println(toplama);
	}
	public static int topla(int...sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam=toplam+sayi;
		}
		return toplam;
		
	}
}
