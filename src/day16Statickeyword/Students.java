package day16Statickeyword;

public class Students {
	String name;
	static String id;
	int grade;
	int year;
	static int counter = 1000;
	// When we make a variable static, any changes will be visible, 
	// will effect the objects for the following operations
	public void setId() {
		counter++;
		id = ""+year+grade+counter;
		
		
	}
	public void setName() {
		counter++;
		id = ""+year+grade+counter;
		}
	
	public void setClass() {
		counter++;
		id = ""+year+grade+counter;
		}
	
	public Students(String name, int grade, int year) {

		this.name = name;
		this.grade = grade;
		this.year = year;
		setId();
		
	}
	
}
 
