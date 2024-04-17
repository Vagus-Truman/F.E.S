import java.util.Random;
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results

public class Dice {

	public static int rollDiceSuit() {
		Random rand = new Random();
		int result = rand.nextInt(4) + 1;
		return result; // Returns a random number between 1 and 4
	}
	
	public static int rollCard() {
		Random rand = new Random();
		int result = rand.nextInt(14);
		return result; // Returns a random number between 0 and 13
	}
}
