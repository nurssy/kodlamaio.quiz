
public class stringleÇalışmak2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
	    System.out.println(mesaj);

	
	    String yeniMesaj = mesaj.replace(' ','-');
	    System.out.println(yeniMesaj);
	    
	    System.out.println(mesaj.substring(2,5));// aralıktaki karakterleri alır

	    for (String kelime : mesaj.split(" ")){
	        System.out.println(kelime);
	    }

	    System.out.println(mesaj.toLowerCase()); //küçük harfe çeviriyor
	    
	    System.out.println(mesaj.toUpperCase());  // büyük harfe çevirir
	    
	    System.out.println(mesaj.trim());  // metnin başındaki ve sonundaki boşlukları siler.
	    
	}
	}

	


