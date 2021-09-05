package workshopday02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*Ask user to their weight and height and type a 
		 * program with calculates mass index
		 Ask to user insert the gender : F/M
		* HINT : Body Mass Index = Weight (kg) / Square of height (m)
		Then give a message to user as following:
		
		If BMI is less than 18.5  and gender is female  "you are weak female"  
		/ If BMI is less than 18.5  and gender is male  "you are weak male"
		  
		If BMI is between 18.5 and 25 , your weight is ideal
		If BMI is between 25 and 30, you re fat
		If BMI is more than or equal to 30 and gender is female, 
		you are obese female  /If BMI is more than or equal to 30 
		and gender is male, you are obese male
		INPUT:
		Weight : 71
		Height : 1,72
		Gender : M
		*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your height");
		double height = scan.nextDouble();
		System.out.println("Enter your weight");
		double weight = scan.nextDouble();
		
		double bmi=weight/Math.pow(height, 2);
		
		if(bmi<18.5) {
			System.out.println(bmi+" you are weak");
		}else if(bmi>=18.5&&bmi<25){
			System.out.println(bmi+ " your weight is ideal");
			
			
		}else if (bmi>=25&&bmi<30) {
			System.out.println(bmi+ " you are fat");
		}else {
			System.out.println("You are obese");
		}	

	}

}
