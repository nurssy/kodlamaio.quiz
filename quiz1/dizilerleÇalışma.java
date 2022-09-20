
public class dizilerleÇalışma {

	public static void main(String[] args) {
	String ogrenci1="Nur";
	String ogrenci2 ="Sena";
	String ogrenci3 ="Nursena";
	
	
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("<----------------->");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Nur";
		ogrenciler[1]="Sena";
		ogrenciler[2]="Nursena";
		
		for(int i=0;i<ogrenciler.length;i++){
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
