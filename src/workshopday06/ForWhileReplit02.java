package workshopday06;

import java.util.Scanner;

public class ForWhileReplit02 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 integer then find GCD 
		 * (Greatest Common Divisor) and LCM (Least Common Multiple)
Input :
30 and 40
Expected OutPut:
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Please enter 2 integer");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int gcd=1;
		
		
		for(int i=1; i<a&&i<b;i++) {
		if(a%i==0 && b%i==0) {
			gcd=i;
		}
		
		}System.out.println(gcd);
		
		int lcm=1;
		for(int k=a*b; k>a && k>b; k--) {
			if(k%a==0 && k%b==0) {
				lcm=k;
			}
		}System.out.println(lcm);
		scan.close();
	}

}
