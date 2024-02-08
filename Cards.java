// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the cards are going to be based on the Arcana from the Tarot, only Major Arcana

public class Cards {

	// CLASS FIELDS

	public static String majorArcana(int value) {
		String majorArcana = "The Arcana is the means by which all is revealed";

		if (value == 0) {
			majorArcana = majorArcanaReadings("Fool", value);
		} else if (value == 1) {
			majorArcana = majorArcanaReadings("Magician", value);
		} else if (value == 2) {
			majorArcana = majorArcanaReadings("High Priestess", value);
		} else if (value == 3) {
			majorArcana = majorArcanaReadings("Empress", value);
		} else if (value == 4) {
			majorArcana = majorArcanaReadings("Emperor", value);
		} else if (value == 5) {
			majorArcana = majorArcanaReadings("Heirophant", value);
		} else if (value == 6) {
			majorArcana = majorArcanaReadings("Lovers", value);
		} else if (value == 7) {
			majorArcana = majorArcanaReadings("Chariot", value);
		} else if (value == 8) {
			majorArcana = majorArcanaReadings("Strength", value);
		} else if (value == 9) {
			majorArcana = majorArcanaReadings("Hermit", value);
		} else if (value == 10) {
			majorArcana = majorArcanaReadings("Wheel of Fortune", value);
		} else if (value == 11) {
			majorArcana = majorArcanaReadings("Justice", value);
		} else if (value == 12) {
			majorArcana = majorArcanaReadings("Hanged Man", value);
		} else if (value == 13) {
			majorArcana = majorArcanaReadings("Death", value);
		} else if (value == 14) {
			majorArcana = majorArcanaReadings("Temperance", value);
		} else if (value == 15) {
			majorArcana = majorArcanaReadings("Devil", value);
		} else if (value == 16) {
			majorArcana = majorArcanaReadings("Tower", value);
		} else if (value == 17) {
			majorArcana = majorArcanaReadings("Star", value);
		} else if (value == 18) {
			majorArcana = majorArcanaReadings("Moon", value);
		} else if (value == 19) {
			majorArcana = majorArcanaReadings("Sun", value);
		} else if (value == 20) {
			majorArcana = majorArcanaReadings("Judgement", value);
		} else if (value == 21) {
			majorArcana = majorArcanaReadings("World", value);
		}

		return majorArcana;
	}

	private static String majorArcanaReadings(String card, int value) {
		String arcanaMeaning = "The Arcana is the means by which all is revealed";
		String cupEffects = "";
		String swordEffects = "";
		String coinEffects = "";
		String wandEffects = "";

		if (value == 0) {
			arcanaMeaning = "To be born is to die. To be born is to live a mystery of a life";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
			
		} else if (value == 1) {
			arcanaMeaning = "Attaining one's dream requires a stern will and unfailing determination";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 2) {
			arcanaMeaning = "The silent voice within one's heart whispers the most profound wisdom";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 3) {
			arcanaMeaning = "Celebrate life's grandeur. Its brilliance. Its magnificence";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 4) {
			arcanaMeaning = "Only courage in the face of doubt can lead one to the answer";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 5) {
			arcanaMeaning = "It is indeed a precious gift to understand the forces that guide oneself";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 6) {
			arcanaMeaning = "There is both joy and wonder in coming to understand another";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 7) {
			arcanaMeaning = "One of life's greatest blessings is the freedom to pursue one's goals";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 8) {
			arcanaMeaning = "Only with strength can one endure suffering and torment";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 9) {
			arcanaMeaning = "It requires great courage to look at oneself honestly, and forge one's own path";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 10) {
			arcanaMeaning = "Along time exist fate, the bearer of cruelty";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 11) {
			arcanaMeaning = "To find the one true path, one must seek guidance amidst uncertainty";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 12) {
			arcanaMeaning = "In the face of disaster lies opportunity for renewal";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 13) {
			arcanaMeaning = "Beyond the beaten path lies the absolute end, and a new horizon";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 14) {
			arcanaMeaning = "To change oneself is to nurture and grow little by little";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 15) {
			arcanaMeaning = "With one's freedom, they are free to succumb to their heart";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 16) {
			arcanaMeaning = "That which is known is not known forever";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 17) {
			arcanaMeaning = "Hope is not an illusion, but the ultimate guide";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 18) {
			arcanaMeaning = "It is only in the light of night that which is to come is seen";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 19) {
			arcanaMeaning = "It is only in the light of day that all is revealed";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 20) {
			arcanaMeaning = "One is one's greatest adjucator, and one's greatest executioner";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		} else if (value == 21) {
			arcanaMeaning = "One's story has come to an end. One's story is how one shall be remembered";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's next magic attack is 50% less effective. If dice set is 7, nothing happens. "
					+ "If dice is 8 and above, player is 50% more effective";
		}

		return String.format("The Arcana is the means by which all is revealed. " + card + " | " + arcanaMeaning + 
				"\n The Cups: " + cupEffects +
				"\n The Swords: " + swordEffects +
				"\n The Coins: " + coinEffects +
				"\n The Wands: " + wandEffects);

	}
}
