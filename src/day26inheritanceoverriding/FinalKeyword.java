package day26inheritanceoverriding;

public class FinalKeyword {
	/*
 	"final" keyword can be used for 
 	a)Variables: It means you have to initialize the variable
 	             It means you cannot update the value after initializing
    b)Methods: It means you cannot change the body of the method
    c) Class: final classes can not have child classes, 
    it means you can not extend final classes
    Note: final classes can be child classes but cannot be parent class
    i) All wrapper classes are final classes
    ii) All immutable are final classes, so String class is a final classes
*/

public final String name = "Ali Can";


public static void main(String[] args) {
	
	FinalKeyword obj = new FinalKeyword();
		
	}

}
