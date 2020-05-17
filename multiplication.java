import java.util.Scanner;
public class mul {
	public static void main(String [] args) {
		Scanner d = new Scanner(System.in);
		System.out.print("Enter first number :");
		float a = d.nextFloat();
		System.out.print("Enter second number :");
		float b = d.nextFloat();
		float c;
		c= a*b;
		System.out.print("multiplication = "+ c);
	}

}