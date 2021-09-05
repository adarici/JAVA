package selfstudyreplit;

public class Mwanafunzi {
	
	private String name = " Busra Nur";
	private int note = 79;
	private int year = 2020;
	private String address = "Frohnhausen";
	private boolean isSuccessful = true;

	public Mwanafunzi(String name, int note, int year, String address, boolean isSuccessful) {
		this.name = name;
		this.note = note;
		this.year = year;
		this.address = address;
		this.isSuccessful = isSuccessful;
	}
	public Mwanafunzi() {
	}
		public String getName() {
			return name;
				
	}
		public String getAddress() {
			return address;
				
	}
		public int getNote() {
			return note;
				
	}
		public  int getYear() {
			return year;
				
	}
		public boolean isSuccessful() {
			
			return isSuccessful;
				
	}
		public String setName(String name) {
			return name;		
	}
		public int setNote(int note) {
			return note;		
	}
		public int setYear(int year) {
			return year;		
	}
		public boolean setName(boolean isSuccessful) {
			return isSuccessful;		
	}
		

}
