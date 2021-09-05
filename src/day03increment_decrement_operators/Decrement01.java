package day03increment_decrement_operators;

public class Decrement01 {

	public static void main(String[] args) {
		int weigth = 120;
		System.out.println("Before decrement:" + weigth);
		
		//How to decrease the value of a variable by subtraction
		//1. Way
		weigth = weigth - 20;
		System.out.println("After decrement:" + weigth);
		//2. Way
		weigth-=10;
		System.out.println("After 2nd decrement:" + weigth);
		//3. Way
		weigth--;
		System.out.println("After 3rd decrement:" + weigth);
		
		int population =24000;
		System.out.println("Before division:" + population);
		//How to decrease the value of a variable by division
		//1. Way
		population = population/2;
		System.out.println("After division:" + population);
		//2. Way
		population /= 3;
		System.out.println("After 2nd dividion:" + population);
		
		int aliSalary = 600;
		int veliSalary = 500;
		
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.
				//   Increase Veli's salary 100 dollars then decrease it by 20%.
				//   Then compare their salaries?
				
				//If you multiply int by double the result will be double
				aliSalary = (int)(aliSalary*0.80);
				aliSalary = aliSalary + 100;
				System.out.println("Ali Salary: " + aliSalary);
				
				veliSalary = veliSalary + 100;
				veliSalary = (int)(veliSalary*0.80);
				System.out.println("Veli Salary: " + veliSalary);
	}

}
