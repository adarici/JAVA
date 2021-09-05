package workshopday05;

public class Method01 {

	public static void main(String[] args) {
		String str="Ali";
		name();
		name();
		name(str);
		add(2,3);
		
	}
	public static void name() {
		System.out.println("Hello");
		System.out.println("Hor are you");
	}
	public static void name(String str) {
		System.out.println("Hello "+ str);
		System.out.println(str);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}

}
