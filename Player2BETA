
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player2 {

	// CLASS FIELDS
	static final int baseHealth = 100;
	private static final int startingCOunt = 5;
	private static final int handLimit = 8;
	public static int healthCount = baseHealth;
	public static int cardCount = startingCOunt;

	private static final int MAJORMIN = 0;
	private static final int MAJORMAX = 13;
	private static final int MINORMIN = 1;
	private static final int MINORMAX = 4;

	public static boolean turnIsOver = false;
	public static boolean statusEffected = false;
	public static String inflictedStatus = "";
	
	public static int playerCount(boolean turnOver) {

		int currentPlayer = 1;
		// if game start, start with player 1. if turn is done, switch players, and
		// again and again
		
		if (turnOver && currentPlayer == 1) {
			currentPlayer = 2;
		} else if (turnOver && currentPlayer == 2) {
			currentPlayer = 1;
		}

		return currentPlayer;
	}

	public static List<String> cardInfoAndEffect() {
		List<Integer> cardDataRef = new ArrayList<Integer>(2);
		List<String> cardDataCollection = new ArrayList<String>();

		for (int major = MAJORMIN; major <= MAJORMAX; major++) { // major arcana selection
			cardDataRef.add(0, major);
			for (int minor = MINORMIN; minor <= MINORMAX; minor++) { // minor arcana selection
				cardDataRef.add(1, minor);

				StringBuilder drawnCard = new StringBuilder(); // creates a string out of the given numbers
				for (int i = cardDataRef.size() - 1; i >= 0; i--) {
					int num = cardDataRef.get(i);
					drawnCard.append(num);
				}

				// assuming all goes well, the format of the card should be {mjArcn, mrArcn}
				String dataString = drawnCard.toString();
				cardDataCollection.add(dataString);

			}
		}

		return cardDataCollection;
	}

	public static int cardMatchAndIndex(int majorArcana, int minorArcana, List<String> code) {
		List<Integer> cardData = new ArrayList<Integer>(2);
		cardData.add(majorArcana);
		cardData.add(minorArcana);

		StringBuilder selectedCard = new StringBuilder();

		for (int i = cardData.size() - 1; i >= 0; i--) {
			int num = cardData.get(i);
			selectedCard.append(num);
		}

		String dataCard = selectedCard.toString();

		int indexOfMatchingCondition = code.indexOf(dataCard);
		return indexOfMatchingCondition;
	}
	
	public Player2(int amountOfCards, int howMuchHP) {
		this.cardCount = amountOfCards;
		this.healthCount = howMuchHP;

		if (Effect.isShocked) {
			// unable to move and takes 5 HP every turn for three turns
			statusEffected = true;
			inflictedStatus = "Shocked";
		}
		if (Effect.isBurning) {
			// every turn takes 5 HP for three turns
			statusEffected = true;
			inflictedStatus = "Burned";
		}
		if (Effect.isStunned) {
			// unable to move for three turns
			statusEffected = true;
			inflictedStatus = "Stunned";
		}

	}
	
	// counting cards
	public static int cardCounter(int startingCount, int handLimit) {

		int cardCount = startingCount;

		if (cardCount > handLimit) {
			cardCount = handLimit;
		}

		return cardCount;
	}

	// counting health
	public static int healthCounter(int baseHealth) {

		int currentHealth = baseHealth;

		return currentHealth;
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
		case 1:
			Player1.healthCount -= (int) (0.5 * Player1.healthCount);
			System.out.println("Player1 loses 0.5 of their current HP. Current HP: " + Player1.healthCount);
		case 2:

		case 3:
			damage = (int) (0.5 * Player1.baseHealth);
			Player1.healthCount -= damage;
			System.out.println("Player1 loses " + damage + " HP. Current HP: " + Player1.healthCount);

			// Magician
		case 4:
			damage = 20;
			System.out.println("Deals psychic damage of " + damage + " with stun to the Player1.");
			Player1.setStunned();
			System.out.println("Player1 is stunned.");
		case 5:
			damage = 20;
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals lightning damage of " + damage + " with shocked to the Player1.");
		case 6:
			damage = 20;
			Player1.healthCount -= damage;
		case 7:
			damage = 20;
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println("Deals fire damage of " + damage + " with burned to the Player1.");

			// High Priestess
		case 8:
			int healingAmount = 10;
			Player2.healthCount += healingAmount;
			System.out.println(
					"Delivers healing of " + healingAmount + " HP to the player. Current HP: " + Player2.healthCount);
		case 9:
			damage = 10;
			Player1.healthCount -= damage;
			System.out.println("Deals wind damage of " + damage + " to the Player1.");
		case 10:
			damage = 10;
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println("Deals fire damage of " + damage + " with burned to the Player1.");
		case 11:
			damage = 10;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out.println("Deals psychic damage of " + damage + " with stunned to the Player1.");

			// Empress
		case 12:
			int hpDelivered = 25;
			Player2.healthCount += hpDelivered;
			System.out.println("Delivers " + hpDelivered + " HP to the player. Current HP: " + Player2.healthCount);
		case 13:
			damage = 50;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);

		case 14:
			damage = 60;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out.println("Deals psychic damage of " + damage + " with stunned to the Player1.");

		case 15:
			int cardsAdded = 2;
			Player2.cardCount += cardsAdded;
			System.out.println("Player has " + cardsAdded + " new cards added to their hand. Current card count: "
					+ Player2.cardCount);

			// Emperor
		case 16:
			int hpDeliveredCup = 25;
			Player2.healthCount += hpDeliveredCup;
			System.out.println("Delivers " + hpDeliveredCup + " HP to the player. Current HP: " + Player2.healthCount);
		case 17:
			damage = 25;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals base damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);

		case 18:
			damage = 25;
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println("Deals base fire damage of " + damage + " with burned to the Player1.");

		case 19:
			int cardsAddedWand = 1;
			Player2.cardCount += cardsAddedWand;
			System.out.println("Player has " + cardsAddedWand + " new card added to their hand. Current card count: "
					+ Player2.cardCount);

			// Heirophant
		case 20:
			multiplier = 1.5;
			int newHealth = (int) (Player2.healthCount * multiplier);
			int healthIncrease = newHealth - Player2.healthCount;
			Player2.healthCount = newHealth;
			System.out.println(
					"Delivers healing of " + multiplier + " times current HP to the player. Current HP: "
							+ Player2.healthCount + ". HP increased by: " + healthIncrease);
		case 21:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			System.out.println("Deals damage of " + multiplier + " times current HP to the Player1. Current HP: "
					+ Player1.healthCount);

		case 22:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println(
					"Deals fire damage of " + multiplier + " times current HP with burned to the Player1.");

		case 23:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals electric damage of " + multiplier
					+ " times current HP with shocked to the Player1.");

			// Lovers
		case 24:
			int healingAmountCup = 26;
			Player2.healthCount += healingAmountCup;
			System.out.println(
					"Delivers healing of " + healingAmountCup + " HP to the player. Current HP: " + Player2.healthCount);
		case 25:
			damage = 39;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);

		case 26:
			damage = 39;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out
					.println("Deals psychic damage of " + damage + " with stunned to the Player1.");

		case 27:
			Player2.cardCount += 1;
			System.out.println("Player has " + 1 + " new card added to their hand. Current card count: "
					+ Player2.cardCount);

			// Chariot
		case 28:
			int healingAmountCups = 7;
			Player2.healthCount += healingAmountCups;
			System.out.println("Delivers healing of " + healingAmountCups + " HP to the player. Current HP: "
					+ Player2.healthCount);
		case 29:
			damage = 7;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);

		case 30:
			damage = 39;
			Player1.healthCount -= damage;
			Player1.setStunned();
			System.out.println("Deals psychic damage of " + damage + " with stunned to the Player1.");

		case 31:
			Player2.cardCount += 2;
			System.out.println("Player has " + 2
					+ " new cards added to their hand. Current card count: " + Player2.cardCount);

			// Strength
		case 32:
			int healingAmountStr = 26;
			Player2.healthCount += healingAmountStr;
			System.out.println(
					"Delivers healing of " + healingAmountStr + " HP to the player. Current HP: " + Player2.healthCount);
		case 33:
			damage = 26;
			Player1.healthCount -= damage;
			System.out.println("Deals wind damage of " + damage + " to the Player1.");
		case 34:
			damage = 26;
			Player1.healthCount -= damage;
			System.out
					.println("Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);
		case 35:
			damage = 26;
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals electric damage of " + damage + " with shocked to the Player1.");

			// Hermit
		case 36:
			int healingHermit = 50;
			Player2.healthCount += healingHermit;
			System.out.println(
					"Delivers healing of " + healingHermit + " HP to the player. Current HP: " + Player2.healthCount);

		case 37:
			damage = 50;
			Player1.healthCount -= damage;
			System.out.println(
					"Deals damage of " + damage + " to the Player1. Current HP: " + Player1.healthCount);

		case 38:
			damage = 50;
			Player1.healthCount -= damage;
			Player1.setShocked();
			System.out.println("Deals electric damage of " + damage + " with shocked to the Player1.");

		case 39:
			damage = 50;
			Player1.healthCount -= damage;
			System.out.println("Deals wind damage of " + damage + " to the Player1.");

			// Wheel Of Fortune
		case 40:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			System.out.println("Deals damage of " + multiplier
					+ " times current HP to the Player1. Current HP: " + Player1.healthCount);
		case 41:
			multiplier = 2.0;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			System.out.println("Deals damage of " + multiplier
					+ " times current HP to the Player1. Current HP: " + Player1.healthCount);
		case 42:
			multiplier = 1.5;
			damage = (int) (Player2.healthCount * multiplier);
			Player1.healthCount -= damage;
			Player1.setBurned();
			System.out.println(
					"Deals fire damage of " + multiplier + " times current HP with burned to the Player1.");
		case 43:
			Player2.cardCount += 2;
			System.out.println("Player has " + 2 + " new cards added to their hand. Current card count: "
					+ Player2.cardCount);

			// Justice
		case 44:
			double healingAmoutJustice = Player2.healthCount * 1.5; // Calculate 1.5 times current HP
			Player2.healthCount += healingAmoutJustice;
			System.out.println("Player gains " + healingAmoutJustice + " HP.");
		case 45:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			System.out.println("Opponent takes " + damage + " damage.");
		case 46:
			damage = Player2.healthCount * 2; // Calculate 2 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setStunned();
			System.out.println("Opponent takes " + damage + " psychic damage and is stunned.");
		case 47:
			damage = Player2.healthCount * 2; // Calculate 2 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setBurned();
			System.out.println("Opponent takes " + damage + " fire damage and is burned.");

			// Hanged Man
		case 48:
			double healingAmountHangM = Player2.healthCount * 2; // Calculate 2 times current HP
			Player2.healthCount += healingAmountHangM; // Deliver healing
			System.out.println("Player gains " + healingAmountHangM + " HP.");

		case 49:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setBurned();
			System.out.println("Opponent takes " + damage + " fire damage and is burned.");

		case 50:
			damage = (int) (Player2.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setShocked();
			System.out.println("Opponent takes " + damage + " electric damage and is shocked.");

		case 51:
			damage = (int) (Player1.healthCount * 1.5); // Calculate 1.5 times current HP worth of damage
			Player1.healthCount -= damage;
			Player2.setStunned();
			System.out.println("Opponent takes " + damage + " psychic damage and is stunned.");

			// Death
		case 52:
			int newHealthDeath = 99; // Set opponent's current health to 99
			Player1.healthCount = newHealthDeath;
			System.out.println("Opponent's health is set to " + newHealthDeath);

		case 53:
			int newOpponentHealth = (int) (Player2.healthCount * 0.5); // Calculate half of player's current HP
			Player1.healthCount = newOpponentHealth;
			System.out.println("Opponent's health is set to " + newOpponentHealth);

		case 54:
			Player2.cardCount += (handLimit - Player2.cardCount);
			System.out.println("Player has " + 1 + " new card added to their hand. Current card count: "
					+ Player2.cardCount);
			
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
