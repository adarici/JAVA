package selfstudy01;

public class Car02 {
String make;
int price;

	public static void main(String[] args) {
		Car02 car = new Car02("Vw",2005);
		System.out.println(car.make);
		System.out.println(car.price);

	}
	public Car02 (String make, int price) {
		this.make=make;
		this.price=price;
		
	}

}
