
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player {

	// CLASS FIELDS
	private static final int baseHealth = 100;
	private static final int handLimit = 8;
	private static final int startingCOunt = 5;
	public int healthCount = baseHealth;
	public int cardCount = startingCOunt;

	private static final int MAJORMIN = 0;
	private static final int MAJORMAX = 13;
	private static final int MINORMIN = 1;
	private static final int MINORMAX = 4;

	public static int playerCount() {

		int currentPlayer = 0;
		// if game start, start with player 1. if turn is done, switch players, and
		// again and again

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

	public static void indexAndAffect(int indexOfCombos) {

		switch (indexOfCombos) {

		// Fool
		case 0:
			// cups
		case 1:
			// swords
		case 2:
			// coins
		case 3:
			// wands

			// Magician
		case 4:
			// cups
		case 5:
			// swords
		case 6:
			// coins
		case 7:
			// wands

			// High Priestess
		case 8:
			// cups
		case 9:
			// swords
		case 10:
			// coins
		case 11:
			// wands

			// Empress
		case 12:
			// cups
		case 13:
			// swords
		case 14:
			// coins
		case 15:
			// wands

			// Emperor
		case 16:
			// cups
		case 17:
			// swords
		case 18:
			// coins
		case 19:
			// wands

			// Heirophant
		case 20:
			// cups
		case 21:
			// swords
		case 22:
			// coins
		case 23:
			// wands

			// Lovers
		case 24:
			// cups
		case 25:
			// swords
		case 26:
			// coins
		case 27:
			// wands

			// Chariot
		case 28:
			// cups
		case 29:
			// swords
		case 30:
			// coins
		case 31:
			// wands

			// Strength
		case 32:
			// cups
		case 33:
			// swords
		case 34:
			// coins
		case 35:
			// wands

			// Hermit
		case 36:
			// cups
		case 37:
			// swords
		case 38:
			// coins
		case 39:
			// wands

			// Wheel Of Fortune
		case 40:
			// cups
		case 41:
			// swords
		case 42:
			// coins
		case 43:
			// wands
			
			// Justice
		case 44:
			// cups
		case 45:
			// swords
		case 46:
			// coins
		case 47:
			// wands
			
			// Hanged Man
		case 48:
			// cups
		case 49:
			// swords
		case 50:
			// coins
		case 51:
			// wands
			
			// Death
		case 52:
			// cups
		case 53:
			// swords
		case 54:
			// coins
		case 55:
			// wands

		}
	}

	public static int cardCounter(int startingCount, int handLimit) {

		int cardCount = startingCount;

		if (cardCount > handLimit) {
			cardCount = handLimit;
		}

		return cardCount;
	}

	public static int healthCounter(int baseHealth) {

		int currentHealth = baseHealth;

		return currentHealth;
	}

	public static void main(String[] args) {

		List<String> storage = cardInfoAndEffect();

		for (String client : storage) {
			System.out.println(client);
		}

	}

}
