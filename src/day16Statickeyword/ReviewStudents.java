package day16Statickeyword;

public class ReviewStudents {

	String name;
	int year;
	int grade;
	static String id;
	static int counter=1000;
	
	public void setId() {
		counter++;
		id=" "+year+grade+counter;
	}
	public void setName() {
		counter++;
		id=" "+year+grade+counter;
	}
	public void set() {
		counter++;
		id=" "+year+grade+counter;
	}
	public ReviewStudents (String name,int year,int grade) {
		this.name=name;
		this.year=year;
		this.grade=grade;
		setId();
		
	}
} 
