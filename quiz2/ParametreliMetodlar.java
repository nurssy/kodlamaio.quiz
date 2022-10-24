package Main;

public class ParametreliMetodlar {

	public static void main(String[] args) {
		
		String mesaj ="Bugun hava cok guzel";
		String yeniMesaj=mesaj.substring(0,5);
		System.out.println(yeniMesaj);
		
		
		System.out.println(topla(7,4));
		
	}
	public static void ekle() {
	
	}
	public static int topla(int sayi1,int sayi2) {
		int toplam;
		toplam=sayi1+sayi2;
		return toplam;
	}
}
