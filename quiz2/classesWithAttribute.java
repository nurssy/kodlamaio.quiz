package Main;

public class classesWithAttribute {

	public static void main(String[] args) {
		Product product = new Product(1," Laptop","Lenovo",16000,2);
		
		//Product product = new Product();
		//product._name="Laptop";
		//product.setId(1);
		//product._description="Lenovo";
		//product._price=16.000;
		//product._stockAmount=4;
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		

	}

}
