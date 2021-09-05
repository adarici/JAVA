package selfstudy01;

public class ProductConstructor {
	String make;
	int year;
	String model;
	int price;
	static int soldCounter=0;

	public static void main(String[] args) {
		ProductConstructor product=new ProductConstructor("Iphone",2020,"i12",700);
		System.out.println(product.make);
		System.out.println(product.year);
		System.out.println(product.model);
		System.out.println(product.price);
		System.out.println(soldCounter);
		
		ProductConstructor product01 = new ProductConstructor("Samsung",2020,600,"A21");
		System.out.println(product01.make);
		System.out.println(product01.year);
		System.out.println(product01.price);
		System.out.println(product01.model);
		System.out.println(soldCounter);
		
		ProductConstructor product02 = new ProductConstructor("Nokia", "A33",2020,500);
		System.out.println(product02.make);
		System.out.println(product02.model);
		System.out.println(product02.year);
		System.out.println(product02.price);
		System.out.println(soldCounter);
		
		ProductConstructor product03 = new ProductConstructor("LG","U75",650);
		System.out.println(product03.make);
		System.out.println(product03.model);
		System.out.println(product03.price);
		System.out.println(soldCounter);

	}
public ProductConstructor (String make,int year,String model,int price){
	this.make=make;
	this.year=year;
	this.model=model;
	this.price=price;
	soldCounter++;
	
}
	public ProductConstructor (String make, int year, int price, String model) {
		this.make=make;
		this.year=year;
		this.price=price;
		this.model=model;
		soldCounter++;
		
	}
	public ProductConstructor (String make, String model, int year, int price) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
		soldCounter++;
		}
		public ProductConstructor() {
			
			soldCounter++; 
		
	}
	public ProductConstructor (String make, String model, int price) {
		this ();
		this.make=make;
		this.model=model;
		this.price=price;
		
	}
	
}
