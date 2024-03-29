
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player1 {

	// CLASS FIELDS
	private static final int baseHealth = 100;
	public static int healthCount = baseHealth;
	public static int cardCount = 5;
	public static int effectDuration = 3;

	private static final int MAJORMIN = 0;
	private static final int MAJORMAX = 13;
	private static final int MINORMIN = 1;
	private static final int MINORMAX = 4;

	public static boolean turnIsOver = false;
	public static boolean statusEffected = false;
	public static String inflictedStatus = "";

	public static List<String> cardInfoAndEffect() {
		List<String> cardInfoData = new ArrayList<String>();
		
		for (int major = MAJORMIN; major <= MAJORMAX; major++) { // major arcana selection
			for (int minor = MINORMIN; minor <= MINORMAX; minor++) { // minor arcana selection
				
				// assuming all goes well, the format of the card should be {mjArcn, mrArcn}
				String dataString = "(" + major + ", " + minor + ")";
				cardInfoData.add(dataString);

			}
		}

		//System.out.println(cardInfoData);
		return cardInfoData;
	}

	public static int cardMatchAndIndex(int majorArcana, int minorArcana) {
		String dataString = "(" + majorArcana + ", " + minorArcana + ")";
		//System.out.println(dataString);
		
		int indexOfMatchingCondition = cardInfoAndEffect().indexOf(dataString);
		return indexOfMatchingCondition;
	}

	public Player1(int amountOfCards, int howMuchHP) {
		this.healthCount = howMuchHP;
		
		if (Effect.isShocked) {
			// unable to move and takes 5 HP every turn for three turns
			statusEffected = true;
			inflictedStatus = "Shocked";
			
			for (int i = 0; i < effectDuration;) {
				if(Player1.turnIsOver) {
					i++;
				}
				
				Player1.healthCount -= 5;
				statusEffected = false;
			}
			
		}
		if (Effect.isBurning) {
			// every turn takes 5 HP for three turns
			statusEffected = true;
			inflictedStatus = "Burned";
			
			for (int i = 0; i < effectDuration;) {
				if(Player1.turnIsOver) {
					i++;
				}
				
				Player1.healthCount -= 5;
				statusEffected = false;
			}
		}
		if (Effect.isStunned) {
			// unable to move for three turns
			statusEffected = true;
			inflictedStatus = "Stunned";
			
			for (int i = 0; i < effectDuration;) {
				if(Player1.turnIsOver) {
					i++;
				}
				
				
				Player1.healthCount -= 5;
				statusEffected = false;
			}
		}
	}
	
	// considering effects
	public static void setStunned() {
		Effect.isStunned = true;
	}
	
	public static void setShocked() {
		Effect.isShocked = true;
	}
	
	public static void setBurned() {
		Effect.isBurning = true;
	}
		
	public static void indexAndAffect(int indexOfCombos) {
		int damage = 0;
		double multiplier = 0.0;
		
		switch (indexOfCombos) {

		// Fool
		case 0:
			Player1.healthCount = (int) (0.5 * Player1.baseHealth);
			break;
		case 1:
			Player2.healthCount -= (int) (0.5 * Player2.healthCount);
			break;
		case 2:
			damage = Player1.healthCount;
			Player2.healthCount -= damage;
			break;
		case 3:
			damage = (int) (0.5 * 100);
			Player2.healthCount -= damage;
			break;

			// Magician
		case 4:
			damage = 20;
			Player2.setStunned();
			break;
		case 5:
			damage = 20;
			Player2.healthCount -= damage;
			Player2.setShocked();
			break;
		case 6:
			damage = 20;
			Player2.healthCount -= damage;
			break;
		case 7:
			damage = 20;
			Player2.healthCount -= damage;
			Player2.setBurned();
			break;

			// High Priestess
		case 8:
			int healingAmount = 10;
			Player1.healthCount += healingAmount;
			break;
		case 9:
			damage = 10;
			Player2.healthCount -= damage;
			break;
		case 10:
			damage = 10;
			Player2.healthCount -= damage;
			Player2.setBurned();
			break;
		case 11:
			damage = 10;
			Player2.healthCount -= damage;
			Player2.setStunned();
			break;

			// Empress
		case 12:
			int hpDelivered = 25;
			Player1.healthCount += hpDelivered;
			break;
		case 13:
			damage = 50;
			Player2.healthCount -= damage;
			break;

		case 14:
			damage = 60;
			Player2.healthCount -= damage;
			Player2.setStunned();
			break;

		case 15:
			Player2.healthCount = Player1.healthCount;
			break;

			// Emperor
		case 16:
			int hpDeliveredCup = 25;
			Player1.healthCount += hpDeliveredCup;
			break;
		case 17:
			damage = 25;
			Player2.healthCount -= damage;
			break;

		case 18:
			damage = 25;
			Player2.healthCount -= damage;
			break;

		case 19:
			Player1.healthCount += Player1.healthCount;
			break;

			// Heirophant
		case 20:
			multiplier = 1.5;
			int newHealth = (int) (Player1.healthCount * multiplier);
			int healthIncrease = newHealth - Player1.healthCount;
			Player1.healthCount = newHealth;
			break;
		case 21:
			multiplier = 1.5;
			damage = (int) (Player1.healthCount * multiplier);
			Player2.healthCount -= damage;
			break;

		case 22:
			multiplier = 1.5;
			damage = (int) (Player1.healthCount * multiplier);
			Player2.healthCount -= damage;
			Player2.setBurned();
			break;

		case 23:
			multiplier = 1.5;
			damage = (int) (Player1.healthCount * multiplier);
			Player2.healthCount -= damage;
			Player2.setShocked();
			break;

			// Lovers
		case 24:
			int healingAmountCup = 26;
			Player1.healthCount += healingAmountCup;
			break;
		case 25:
			damage = 39;
			Player2.healthCount -= damage;
			break;

		case 26:
			damage = 39;
			Player2.healthCount -= damage;
			Player2.setStunned();
			break;

		case 27:
			Player1.healthCount = baseHealth;
			break;

			// Chariot
		case 28:
			int healingAmountCups = 7;
			Player2.healthCount += healingAmountCups;
			break;
		case 29:
			damage = 7;
			Player2.healthCount -= damage;
			break;

		case 30:
			damage = 39;
			Player2.healthCount -= damage;
			Player2.setStunned();
			break;

		case 31:
			Player1.healthCount = baseHealth;
			break;

			// Strength
		case 32:
			int healingAmountStr = 26;
			Player1.healthCount += healingAmountStr;
			break;
		case 33:
			damage = 26;
			Player2.healthCount -= damage;
			break;
		case 34:
			damage = 26;
			Player2.healthCount -= damage;
			break;
		case 35:
			damage = 26;
			Player2.healthCount -= damage;
			Player2.setShocked();
			break;

			// Hermit
		case 36:
			int healingHermit = 50;
			Player1.healthCount += healingHermit;
			break;

		case 37:
			damage = 50;
			Player2.healthCount -= damage;
			break;

		case 38:
			damage = 50;
			Player2.healthCount -= damage;
			break;

		case 39:
			damage = 50;
			Player2.healthCount -= damage;
			break;

			// Wheel Of Fortune
		case 40:
			multiplier = 1.5;
			int healthAdd = (int) (Player1.healthCount * multiplier);
			Player1.healthCount += healthAdd;
			break;
			
		case 41:
			multiplier = 2.0;
			damage = (int) (Player1.healthCount * multiplier);
			Player2.healthCount -= damage;
			break;
		case 42:
			multiplier = 1.5;
			damage = (int) (Player1.healthCount * multiplier);
			Player2.healthCount -= damage;
			Player2.setBurned();
			break;
		case 43:
			multiplier = 1.5;
			int healing = (int) (Player2.healthCount * multiplier);
			Player1.healthCount += healing;
			break;

			// Justice
		case 44:
			double healingAmoutJustice = Player1.healthCount * 1.5; // Calculate 1.5 times current HP
			Player1.healthCount += healingAmoutJustice;
			break;
		case 45:
			damage = (int) (Player1.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player2.healthCount -= damage;
			break;
		case 46:
			damage = Player1.healthCount * 2; // Calculate 2 times current HP worth of damage
			Player2.healthCount -= damage;
			Player2.setStunned();
			break;
		case 47:
			damage = Player1.healthCount * 2; // Calculate 2 times current HP worth of damage
			Player2.healthCount -= damage;
			Player2.setBurned();
			break;

			// Hanged Man
		case 48:
			double healingAmountHangM = Player1.healthCount * 2; // Calculate 2 times current HP
			Player1.healthCount += healingAmountHangM; // Deliver healing
			break;

		case 49:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player2.healthCount -= damage;
			Player2.setBurned();
			break;

		case 50:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player2.healthCount -= damage;
			Player2.setShocked();
			break;

		case 51:
			damage = (int) (Player1.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player2.healthCount -= damage;
			Player2.setStunned();
			break;

			// Death
		case 52:
			int newHealthDeath = 99; // Set opponent's current health to 99
			Player1.healthCount = newHealthDeath;
			break;

		case 53:
			int newOpponentHealth = (int) (Player1.healthCount * 0.5); // Calculate half of player's current HP
			Player2.healthCount = newOpponentHealth;
			break;

		case 54:
			Player1.healthCount = 1;
			Player2.healthCount = 1;
			break;
			
		case 55:
			int newHealthD = (int) (Player1.healthCount * 0.5); // Calculate half of player's current HP
			Player2.healthCount = newHealthD;
			break;

		}
	}

	public static void main(String[] args) {

		List<String> storage = cardInfoAndEffect();

		for (String client : storage) {
			System.out.println(client);
		}

	}

}
