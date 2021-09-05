package workshopday05;

public class MothodReturn02 {

	public static void main(String[] args) {
		System.out.println( divideByFour(addByThree(multiplyByTo(4))));
		
	}
	public static double multiplyByTo(double a) {
	return a* 2;

}
	public static double addByThree(double a) {
		return a+3;
	}
	public static double divideByFour(double a) {
		return a/4;

}
}
