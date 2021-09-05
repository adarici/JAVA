package selfstudyreplit;

public class Form4A {

	public static void main(String[] args) {
		
		Mwanafunzi wanafunzi1 = new Mwanafunzi();
		System.out.println("Name: "+wanafunzi1.getName());
		
		Mwanafunzi address1 = new Mwanafunzi();
		System.out.println("Adresse: "+address1.getAddress());
		
		Mwanafunzi note1 = new Mwanafunzi();
		System.out.println("Note: "+note1.getNote());
		
		Mwanafunzi year1 = new Mwanafunzi();
		System.out.println("Year: "+year1.getYear());
		Mwanafunzi isSuccessful=new Mwanafunzi();
		System.out.println("Successful: "+isSuccessful.isSuccessful());
		
		System.out.println("==========");
		
		// 2. Way
		Mwanafunzi wanafunzi2= new Mwanafunzi("M. Fatih",2018,93,"",true );
		
		System.out.println("Mpya Wanafunzi Jina: "+wanafunzi2.getName());
		System.out.println("Mpya Wanafunzi Address: "+wanafunzi2.getAddress());
		System.out.println("Mpya Wanafunzi Note: "+wanafunzi2.getNote());
		System.out.println("Mpya Wanafunzi Mwaka: "+wanafunzi2.getYear());
	
		System.out.println("Mpya Wanafunzi Successful: "+wanafunzi2.isSuccessful());
	
	}

}
