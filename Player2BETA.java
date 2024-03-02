
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player2 {

	// CLASS FIELDS
	static final int baseHealth = 100;
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
	
	public Player2(int amountOfCards, int howMuchHP) {
		this.cardCount = amountOfCards;
		this.healthCount = howMuchHP;
		
		// counting health
		if (healthCount > 100) {
			healthCount = 100;
		} 
		
		if (healthCount < 0) {
			healthCount = 0;
		}
		
		if (Effect.isShocked) {
			// unable to move and takes 5 HP every turn for three turns
			statusEffected = true;
			inflictedStatus = "Shocked";
			
			for (int i = 0; i < effectDuration;) {
				if(Player1.turnIsOver) {
					i++;
				}
				
				Player2.healthCount -= 5;
				statusEffected = false;
			}
			
		}
		if (Effect.isBurning) {
			// every turn takes 5 HP for three turns
			statusEffected = true;
			inflictedStatus = "Burned";
			
			for (int i = 0; i < effectDuration;) {
				if(Player2.turnIsOver) {
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
				if(Player2.turnIsOver) {
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
			Player2.healthCount = (int) (0.5 * Player2.baseHealth);
			System.out.println("Player's health is refilled to " + Player2.healthCount);
			break;
		case 1:
			Player1.healthCount -= (int) (0.5 * Player1.healthCount);
			System.out.println("Player1 loses 0.5 of their current HP. Current HP: " + Player1.healthCount);
			break;
		case 2:
			damage = Player1.healthCount;
			Player2.healthCount -= damage;
			System.out.println("Player2 loses the total amount of Player1's current HP");
			break;
		case 3:
			damage = (int) (0.5 * Player1.baseHealth);
			Player1.healthCount -= damage;
			System.out.println("Player1 loses " + damage + " HP. Current HP: " + Player1.healthCount);
			break;

			// Magician
		case 4:
			damage = 20;
			System.out.println("Deals psychic damage of " + damage + " with stun to the Player1.");
			Player1.setStunned();
			System.out.println("Player1 is stunned.");
			break;
		case 5:
			damage = 20;
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals lightning damage of " + damage + " with shocked to the Player1.");
			break;
		case 6:
			damage = 20;
			Player1.healthCount -= damage;
			break;
		case 7:
			damage = 20;
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println("Deals fire damage of " + damage + " with burned to the Player1.");
			break;

			// High Priestess
		case 8:
			int healingAmount = 10;
			Player2.healthCount += healingAmount;
			System.out.println(
					"Delivers healing of " + healingAmount + " HP to the player. Current HP: " + Player2.healthCount);
			break;
		case 9:
			damage = 10;
			Player1.healthCount -= damage;
			System.out.println("Deals wind damage of " + damage + " to the Player1.");
			break;
		case 10:
			damage = 10;
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println("Deals fire damage of " + damage + " with burned to the Player1.");
			break;
		case 11:
			damage = 10;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out.println("Deals psychic damage of " + damage + " with stunned to the Player1.");
			break;

			// Empress
		case 12:
			int hpDelivered = 25;
			Player2.healthCount += hpDelivered;
			System.out.println("Delivers " + hpDelivered + " HP to the player. Current HP: " + Player2.healthCount);
			break;
		case 13:
			damage = 50;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);
			break;

		case 14:
			damage = 60;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out.println("Deals psychic damage of " + damage + " with stunned to the Player1.");
			break;

		case 15:
			Player1.healthCount = Player2.healthCount;
			System.out.println("Player1's HP is equal to Player2's");
			break;

			// Emperor
		case 16:
			int hpDeliveredCup = 25;
			Player2.healthCount += hpDeliveredCup;
			System.out.println("Delivers " + hpDeliveredCup + " HP to the player. Current HP: " + Player2.healthCount);
			break;
		case 17:
			damage = 25;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals base damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);
			break;

		case 18:
			damage = 25;
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println("Deals base fire damage of " + damage + " with burned to the Player1.");
			break;

		case 19:
			Player2.healthCount += Player2.healthCount;
			System.out.println("Player has been healed an equal amount of their current health");
			break;

			// Heirophant
		case 20:
			multiplier = 1.5;
			int newHealth = (int) (Player2.healthCount * multiplier);
			int healthIncrease = newHealth - Player2.healthCount;
			Player2.healthCount = newHealth;
			System.out.println(
					"Delivers healing of " + multiplier + " times current HP to the player. Current HP: "
							+ Player2.healthCount + ". HP increased by: " + healthIncrease);
			break;
		case 21:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			System.out.println("Deals damage of " + multiplier + " times current HP to the Player1. Current HP: "
					+ Player1.healthCount);
			break;

		case 22:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println(
					"Deals fire damage of " + multiplier + " times current HP with burned to the Player1.");
			break;

		case 23:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals electric damage of " + multiplier
					+ " times current HP with shocked to the Player1.");
			break;

			// Lovers
		case 24:
			int healingAmountCup = 26;
			Player2.healthCount += healingAmountCup;
			System.out.println(
					"Delivers healing of " + healingAmountCup + " HP to the player. Current HP: " + Player2.healthCount);
			break;
		case 25:
			damage = 39;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);
			break;

		case 26:
			damage = 39;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out
					.println("Deals psychic damage of " + damage + " with stunned to the Player1.");
			break;

		case 27:
			Player2.healthCount = baseHealth;
			System.out.println("Player has been fully healed");
			break;

			// Chariot
		case 28:
			int healingAmountCups = 7;
			Player2.healthCount += healingAmountCups;
			System.out.println("Delivers healing of " + healingAmountCups + " HP to the player. Current HP: "
					+ Player2.healthCount);
			break;
		case 29:
			damage = 7;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);
			break;

		case 30:
			damage = 39;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out.println("Deals psychic damage of " + damage + " with stunned to the Player1.");
			break;

		case 31:
			Player2.healthCount = baseHealth;
			System.out.println("Player has been fully healed");
			break;

			// Strength
		case 32:
			int healingAmountStr = 26;
			Player2.healthCount += healingAmountStr;
			System.out.println(
					"Delivers healing of " + healingAmountStr + " HP to the player. Current HP: " + Player2.healthCount);
			break;
		case 33:
			damage = 26;
			Player1.healthCount -= damage;
			System.out.println("Deals wind damage of " + damage + " to the Player1.");
			break;
		case 34:
			damage = 26;
			Player1.healthCount -= damage;
			System.out
					.println("Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);
			break;
		case 35:
			damage = 26;
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals electric damage of " + damage + " with shocked to the Player1.");
			break;

			// Hermit
		case 36:
			int healingHermit = 50;
			Player2.healthCount += healingHermit;
			System.out.println(
					"Delivers healing of " + healingHermit + " HP to the player. Current HP: " + Player2.healthCount);
			break;

		case 37:
			damage = 50;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);
			break;

		case 38:
			damage = 50;
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals electric damage of " + damage + " with shocked to the Player1.");
			break;

		case 39:
			damage = 50;
			Player1.healthCount -= damage;
			System.out.println("Deals wind damage of " + damage + " to the Player1.");
			break;

			// Wheel Of Fortune
		case 40:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			System.out.println("Deals damage of " + multiplier
					+ " times current HP to the Player1. Current HP: " + Player1.healthCount);
			break;
		case 41:
			multiplier = 2.0;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			System.out.println("Deals damage of " + multiplier
					+ " times current HP to the Player1. Current HP: " + Player1.healthCount);
			break;
		case 42:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println(
					"Deals fire damage of " + multiplier + " times current HP with burned to the Player1");
			break;
		case 43:
			multiplier = 1.5;
			int healing = (int) (Player1.healthCount * multiplier);
			Player2.healthCount += healing;
			System.out.println("Delivers HP of " + multiplier + "times current HP of Player2 to Player1");
			break;

			// Justice
		case 44:
			double healingAmoutJustice = Player2.healthCount * 1.5; // Calculate 1.5 times current HP
			Player2.healthCount += healingAmoutJustice;
			System.out.println("Player gains " + healingAmoutJustice + " HP.");
			break;
		case 45:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			System.out.println("Opponent takes " + damage + " damage.");
			break;
		case 46:
			damage = Player2.healthCount * 2; // Calculate 2 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setStunned();
			System.out.println("Opponent takes " + damage + " psychic damage and is stunned.");
			break;
		case 47:
			damage = Player2.healthCount * 2; // Calculate 2 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setBurned();
			System.out.println("Opponent takes " + damage + " fire damage and is burned.");
			break;

			// Hanged Man
		case 48:
			double healingAmountHangM = Player2.healthCount * 2; // Calculate 2 times current HP
			Player2.healthCount += healingAmountHangM; // Deliver healing
			System.out.println("Player gains " + healingAmountHangM + " HP.");
			break;

		case 49:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setBurned();
			System.out.println("Opponent takes " + damage + " fire damage and is burned.");
			break;

		case 50:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setShocked();
			System.out.println("Opponent takes " + damage + " electric damage and is shocked.");
			break;

		case 51:
			damage = (int) (Player1.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setStunned();
			System.out.println("Opponent takes " + damage + " psychic damage and is stunned.");
			break;

			// Death
		case 52:
			int newHealthDeath = 99; // Set opponent's current health to 99
			Player1.healthCount = newHealthDeath;
			System.out.println("Opponent's health is set to " + newHealthDeath);
			break;

		case 53:
			int newOpponentHealth = (int) (Player2.healthCount * 0.5); // Calculate half of player's current HP
			Player1.healthCount = newOpponentHealth;
			System.out.println("Opponent's health is set to " + newOpponentHealth);
			break;

		case 54:
			Player1.healthCount = 1;
			Player2.healthCount = 1;
			System.out.println("Both players are at 1 HP");
			break;
			
		case 55:
			int newHealthD = (int) (Player2.healthCount * 0.5); // Calculate half of player's current HP
			Player1.healthCount = newHealthD;
			System.out.println("Player's health is set to " + newHealthD);
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
