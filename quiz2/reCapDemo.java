package Main;

public class reCapDemo {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc=dortIslem.Topla(5, 61);
		int sonuc1=dortIslem.Cikar(61, 42);
		float sonuc2=dortIslem.Bol(61, 13);
		
		System.out.println(sonuc);
		System.out.println(sonuc1);
		System.out.println(sonuc2);
	}

}
