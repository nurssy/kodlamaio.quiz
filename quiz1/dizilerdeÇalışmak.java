
public class dizilerdeÇalışmak {

	public static void main(String[] args) {
		double[] myList = {6.1 , 7.3, 2.7 , 0.6};
		double total=0;
		double enBuyuk=myList[0];
		
		for(double number : myList) {
			System.out.println(number);
			total = total+number;
			
			if(number>enBuyuk) {
				enBuyuk=number;
			}
		}
		System.out.println("toplam:"+total);
		System.out.println("En buyuk:"+enBuyuk);
		
	}

}
