import java.util.Scanner;

public class ConvertTime{
	public static void main(String[] args){
	final int timeMultiplier = 60;
	Scanner in = new Scanner(System.in);
	System.out.print("Insert seconds to be converted -->");
	int seconds = in.nextInt();
	System.out.print("Insert minutes to be converted -->");
	int minutes = in.nextInt();
	System.out.print("Insert hours to be converted -->");
	int hours = in.nextInt();

	int answer = ((hours * timeMultiplier)+ minutes * 60) + seconds;
	System.out.printf("the time you have inputed translates to %d seconds!!!",answer);                                       
	}
}
