
public class stringleÇalışmak1 {

	public static void main(String[] args) {
		String mesaj="Bugun hava cok guzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayisi: "+mesaj.length()); //eleman sayisi
		System.out.println("5.Eleman: "+mesaj.charAt(4));  //4.indeksteki eleman yani 5. elaman
		System.out.println("Yasasin!"); // sonuna ekleme
		System.out.println(mesaj.startsWith("B")); //ilk karrakteri doğrulama true ya da false
		System.out.println(mesaj.endsWith("."));  // son karakteri doğrulama true ya da false
		
		char[] karakterler=new char[5];
		mesaj.getChars(0,5,karakterler,0); // karakter yazdirma.
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a')); // girlen karakter baştan kaçıncı indexte
		System.out.println(mesaj.indexOf("av"));
		
		System.out.println(mesaj.lastIndexOf('a')); // girlen karakter sondan kaçıncı indexte 
		//aramaya sağdan başlar ama index için baştan kaçınıcı olduğu değerini döndürür.
	}

}
