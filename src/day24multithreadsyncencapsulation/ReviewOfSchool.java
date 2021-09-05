package day24multithreadsyncencapsulation;

public class ReviewOfSchool {
	

	public static void main(String[] args) {
	ReviewOfStudent kid1 = new ReviewOfStudent();
System.out.println("First Name: "+kid1.getFirstName());
System.out.println("Last Name : "+kid1.getSurName());
System.out.println("Address   : "+kid1.getAddress());
System.out.println("Year      : "+kid1.getAge());
System.out.println("Pass Code : "+kid1.getPassCode());
System.out.println("==========");
ReviewOfStudent kid2 = new ReviewOfStudent();
kid2.setFirstName("Busra", "Darici", "FROHNHAUSEN", 9);
System.out.println("First Name: "+kid2.getFirstName());
System.out.println("Surame	  : "+kid2.getSurName());
System.out.println("Address	  : "+kid2.getAddress());
System.out.println("Age       : "+kid2.getAge());
System.out.println("==========");
ReviewOfStudent kid3 = new ReviewOfStudent();
kid3.setFirstName("Zeynep", "TOHUMCU", "Asslar", 5);
System.out.println("First Name: "+kid3.getFirstName());
System.out.println("Surame	  : "+kid3.getSurName());
System.out.println("Address	  : "+kid3.getAddress());
System.out.println("Age       : "+kid3.getAge());
System.out.println("==========");

ReviewOfStudent kid4 = new ReviewOfStudent();
kid4.setFirstName("Ali", "Tohumcu", "Aßlar", 3);
System.out.println("First Name: "+kid4.getFirstName());
System.out.println("Surame	  : "+kid4.getSurName());
System.out.println("Address	  : "+kid4.getAddress());
System.out.println("Age       : "+kid4.getAge());
System.out.println("==========");

	}

}
