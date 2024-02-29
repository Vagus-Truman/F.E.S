import java.util.Random;
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results

public class Dice {

// tester
	public static int rollDiceSuit() {
		Random rand = new Random();
		return rand.nextInt(4) + 1; // Returns a random number between 1 and 4
	}

//tester (dont know if this works)
	public class TarotDice {
		// Simulate rolling a single six-sided dice
		public static int rollDice() {
			Random rand = new Random();
			return rand.nextInt(6) + 1; // Returns a random number between 1 and 6
		}

		// Simulate rolling multiple dice and summing up the result
		public static int rollMultipleDice(int numDice) {
			int sum = 0;
			for (int i = 0; i < numDice; i++) {
				sum += rollDice();
			}
			return sum;
		}

		// Roll dice to get a tarot card
		public static String rollForTarotCard() {
			int category = rollMultipleDice(1); // Roll 1 dice for category
			int value = rollMultipleDice(1); // Roll 1 dice for value
			return getTarotCard(category, value);
		}

		// Method to get tarot card based on category and value
		public static String getTarotCard(int category, int value) {
			// Implementation of getTarotCard method
			// It should return the tarot card based on the category and value
			// You can use your existing getTarotCard method here or modify it as needed
			return Dice.getTarotCard(category, value);
		}

		public class MinorArcanaDice {
			// Roll dice for the minor arcana card
			public static String rollForMinorArcanaCard() {
				int deck = Dice.rollMultipleDice(1); // Roll 1 dice for deck
				return getMinorArcanaCard(deck);
			}

			// Method to get minor arcana card based on deck and value
			public static String getMinorArcanaCard(int deck, int value) {
				// Implementation of getMinorArcanaCard method
				// It should return the minor arcana card based on the deck and value
				// You can use your existing minorArcana method here or modify it as neededd
				return Dice.minorArcana(deck, value);
			}
		}

	}

//end of tester dice...
	// CLASS FIELDS
	public static String getTarotCard(int category, int value) {
		// a string that represents the card
		String card = "";
		if (category == 1) { // cursed destiny
			card = minorArcana("Cups", value);
		} else if (category == 2) { // average destiny
			card = minorArcana("Wands", value);
		} else if (category == 3) { // villains destiny
			card = minorArcana("Coins", value);
		} else if (category == 4) {
			card = minorArcana("Swords", value);
		}
		return card;
	}

	// The parameter deck in the minorArcana method represents the suit or type of
	// deck to which the card belongs
	private static String minorArcana(String deck) {
		String cardName = deck;
		return String.format("=== %s of %s ===%n", cardName, deck);
	}
}
