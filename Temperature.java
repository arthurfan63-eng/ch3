import java.util.Scanner;

public class Temperature{
	public static void main(String[] args){
	final Double celciusToFarenheit = 32.0;
	Scanner in = new Scanner(System.in);
	System.out.print("Insert Celcius to be converted -->");
	Double number = in.nextDouble();
	Double answer = (number * 1.8) + celciusToFarenheit;
	System.out.printf("%.1f C celsius to Farenheit is %.1f F", number, answer);                                       
	}
}

