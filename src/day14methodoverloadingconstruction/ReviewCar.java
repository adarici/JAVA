package day14methodoverloadingconstruction;


public class ReviewCar {
	String make;
	int price;
	int year;
	String model;
	String color;
	static int soldCarCounter;

	public static void main(String[] args) {
		
		ReviewCar car01 = new ReviewCar( "VW",5000,2005,"Touran","Silver");
		System.out.println(car01.make );
		System.out.println(car01.price);
		System.out.println(car01.year);
		System.out.println(car01.model);
		System.out.println(car01.color );
		
		
		ReviewCar car02 = new ReviewCar("Seat",40000,2020,"ibiza", "Silver");
		System.out.println(car02.make );
		System.out.println(car02.price );
		System.out.println(car02.year);
		System.out.println(car02.model);
		

	}
	
	public ReviewCar (String make, int price, int year, String model, String color) {
		this.make=make;
		this.price=price;
		this.year=year;
		this.model=model;
		this.color=color;
		
		soldCarCounter++;
	}
	
	public ReviewCar (String make, int price,  String model, int year) {
		this.make=make;
		this.price=price;
		this.model=model;
		this.year=year;
		
		soldCarCounter++;
	}

}
