package Main;

public class Product {
	
	public Product(int id,String name,String description,double price,int stockAmount) {
		System.out.println("Yapici blok calisti");
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount =stockAmount;
		
	}
	
	private int _id;
	String _name;
	String _description;
	double _price;
	int _stockAmount;
	private String _kod;
	
	//id okur 
	public int getId() {
		return _id;
	}
	//yazar
	public void setId(int id) {
		//this.id=id;
		_id=id;
	}

	public String getKod() {
		return this._name.substring(0, 1)+ _id;
	}
	public void setKod(String kod) {
		_kod=kod;
	}


	
	
}
