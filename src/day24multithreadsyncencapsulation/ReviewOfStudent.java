package day24multithreadsyncencapsulation;

public class ReviewOfStudent {

	private String firstName="Fatih";
	private String surName="DARICI";
	protected String address="Frohnhausen";
	private int age=13;
	protected String passCode="12345";
	
	public ReviewOfStudent(String firstName, String surName, String address, int age, String passCode) {
	
		this.firstName = firstName;
		this.surName = surName;
		this.address = address;
		this.age = age;
		this.passCode=passCode;
		
		
	}

	public ReviewOfStudent() {
	
	}

	public String getPassCode() {
		return passCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurName() {
		return surName;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName, String surName,String address,int age) {
		this.firstName = firstName;
		this.surName = surName;
		this.address = address;
		this.age = age;
	}
	
	
	
}
