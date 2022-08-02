package Reltio;

public class BlueOptima {

	public static void main(String[] args) {
		System.out.println(isDivisible(19,9));

	}
	
	public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

}
