package day24multithreadsyncencapsulation;

public class AccessModifier01 {
	public String name = "Ali Can";// -accessable from another class and package
	protected String address = "Miami Florida";//Inside same package different class can access. From different package only child class(extend) can access.
	String school = "FIU";//no access modifier means no default. Inside package different classes can access but different package you cannot access
	/*
	 If you want a class member not to visible from any other class use private access modifier
	 */
	private String profession = "Java Developer";  //only inside same package class can be access.. but out of class cannot access

}
