import java.util.Scanner;

public class ConvertTime{
	public static void main(String[] args){
	final int timeMultiplier = 60;
	Scanner in = new Scanner(System.in);
	
	
	
	
	
	
	
	
	
	System.out.print("Insert seconds to be converted -->");
	int seconds = in.nextInt();

	int hours = seconds/3600;
	int minutes = seconds%3600/60;
	int secA = seconds % 60;
	
	
 
	System.out.printf("Time: %d hour(s) %d minute(s) %d second(s)",hours,minutes,secA);                                       
	}
}
