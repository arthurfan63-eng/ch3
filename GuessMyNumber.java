import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
	public static void main(String[] arg){
	Random random = new Random();
	int number = random.nextInt(100) + 1;
	System.out.println("guess me number matey to find da treasurrreeee, its from 1 to 100 arrrrr");
	Scanner in = new Scanner(System.in);
	int number2 = in.nextInt();
	System.out.printf("yerr number is %d while me number wuz %d", number2,number);
	System.out.println("  ");
	int number3 = number - number2;
	System.out.printf("yer off by a mere %d", number3);
	System.out.println("  ");

	if (number2 == number) {
	 System.out.println("garrrrrreat job mateyyyyyy we found the treasure!!!!");
	}
	if (number3 < 10) {
	 System.out.println("ARGHHH SO CLOSE");
	}
	if (number3 > 50) {
	 System.out.println("WALK THE PLANK!!!! TERRIBLE GUESS ARRRRRRR");
	}
}

}
