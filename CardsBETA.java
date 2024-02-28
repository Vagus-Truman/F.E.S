// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the cards are going to be based on the Arcana from the Tarot, only Major Arcana

public class Cards {

	// CLASS FIELDS

	public static String majorArcana(int value) {
		String majorArcana = "The Arcana is the means by which all is revealed";

		majorArcana = majorArcanaReadings(value);

		return majorArcana;
	}

	private static String majorArcanaReadings(int value) {
		String arcanaTitle = "";
		String arcanaMeaning = "The Arcana is the means by which all is revealed";
		String cupEffects = "";
		String swordEffects = "";
		String coinEffects = "";
		String wandEffects = "";

		if (value == 0) { // the fool
			arcanaTitle = "The Fool";
			arcanaMeaning = "To be born is to die, but it is also to live a mystery called life";
			cupEffects = "Player is refilled to 0.5 of total HP";
			swordEffects = "Opponent has 0.5 of current HP removed";
			coinEffects = "Player is to draw a card from the deck";
			wandEffects = "Opponent has 0.5 of total HP removed";

		} else if (value == 1) { // the magician
			arcanaTitle = "The Magician";
			arcanaMeaning = "Attaining one's dream requires a stern will and unfailing determination";
			cupEffects = "Deals psychic damage of 20 with stun";
			swordEffects = "Deals lightning damage of 20 with shocked";
			coinEffects = "Deals wind damage of 20";
			wandEffects = "Deals fire damage of 20 with burned";

		} else if (value == 2) { // the high priestess
			arcanaTitle = "The High Priestess";
			arcanaMeaning = "The silent voice within one's heart whispers the most profound wisdom";
			cupEffects = "Delivers healing of 10 HP";
			swordEffects = "Deals wind damage of 10";
			coinEffects = "Deals fire damage of 10 with burned";
			wandEffects = "Deals psychic damage of 10 with stunned";

		} else if (value == 3) { // the empress
			arcanaTitle = "The Empress";
			arcanaMeaning = "Celebrate life's grandeur. Its brilliance. Its magnificence";
			cupEffects = "Delivers HP of 25";
			swordEffects = "Deals damage of 50";
			coinEffects = "Deals psychic damage of 50 with stunned";
			wandEffects = "Player has two new cards added to their hand";

		} else if (value == 4) { // the emperor
			arcanaTitle = "The Emperor";
			arcanaMeaning = "Only courage in the face of doubt can lead one to the answer";
			cupEffects = "Delivers HP of 25";
			swordEffects = "Deals base damage of 25";
			coinEffects = "Deals base fire damage of 25 with burned";
			wandEffects = "Player has one new card added to their hand";

		} else if (value == 5) { // the heirophant
			arcanaTitle = "The Heirophant";
			arcanaMeaning = "It is indeed a precious gift to understand the forces that guide oneself";
			cupEffects = "Delivers HP of 1.5 times current HP";
			swordEffects = "Deals damage of 1.5 times current HP";
			coinEffects = "Deals fire damage of 1.5 times current HP with burned";
			wandEffects = "Deals electric damage of 1.5 times current HP with shocked";

		} else if (value == 6) { // the lovers
			arcanaTitle = "The Lovers";
			arcanaMeaning = "There is both joy and wonder in coming to understand another";
			cupEffects = "Delivers HP of 26";
			swordEffects = "Deals damage of 39";
			coinEffects = "Deals psychic damage of 39 with stunned";
			wandEffects = "Player has one new card added to their hand";

		} else if (value == 7) { // the chariot
			arcanaTitle = "The Chariot";
			arcanaMeaning = "One of life's greatest blessings is the freedom to pursue one's goals";
			cupEffects = "Delivers HP of 7";
			swordEffects = "Deals damage of 7";
			coinEffects = "Deals psychic damage of 39 with stunned";
			wandEffects = "Player has two new cards added to their hand";

		} else if (value == 8) { // strength
			arcanaTitle = "The Strength";
			arcanaMeaning = "Only with strength can one endure suffering and torment";
			cupEffects = "Delivers HP of 26";
			swordEffects = "Deals wind damage of 26";
			coinEffects = "Deals damage of 26";
			wandEffects = "Deals electric damage of 26 with shocked";

		} else if (value == 9) { // hermit
			arcanaTitle = "The Hermit";
			arcanaMeaning = "It requires great courage to look at oneself honestly, and forge one's own path";
			cupEffects = "Delivers HP of 50";
			swordEffects = "Deals damage of 50";
			coinEffects = "Deals electric damage of 50 with shocked";
			wandEffects = "Deals wind damage of 50";

		} else if (value == 10) { // wheel of fortune
			arcanaTitle = "The Wheel Of Fortune";
			arcanaMeaning = "Along time exist fate, the bearer of cruelty";
			cupEffects = "Delivers 1.5 times current HP";
			swordEffects = "Deals 2 times current HP worth of damage";
			coinEffects = "Deals 1.5 times current HP worth of fire damage with burned";
			wandEffects = "Player has two new cards added to their hand";

		} else if (value == 11) { // justice
			arcanaTitle = "The Justice";
			arcanaMeaning = "To find the one true path, one must seek guidance amidst uncertainty";
			cupEffects = "Delivers 1.5 times current HP";
			swordEffects = "Deals 1.5 times current HP worth of damage";
			coinEffects = "Deals 2 times current HP worth of psychic damage with stunned";
			wandEffects = "Deals 2 times current HP worth of fire damage with burned";

		} else if (value == 12) { // hanged man
			arcanaTitle = "The Hanged Man";
			arcanaMeaning = "In the face of disaster lies opportunity for renewal";
			cupEffects = "Delivers HP 2 times current HP";
			swordEffects = "Deals 1.5 times current HP worth of fire damage with burned";
			coinEffects = "Deals 1.5 times current HP worth of electric damage with shocked";
			wandEffects = "Deals 1.5 times current HP worth of psychic damage with stunned";

		} else if (value == 13) { // death
			arcanaTitle = "Death";
			arcanaMeaning = "Beyond the beaten path lies the absolute end, and a new horizon";
			cupEffects = "Sets current health to 99, regardless of position";
			swordEffects = "Sets enemy's HP to 0.5 of your current HP";
			coinEffects = "Draws cards from deck until limit is reached";
			wandEffects = "Sets current HP to 0.5 of current HP";

		}

		String[] dataCollection = {};
		dataCollection[0] = arcanaTitle;
		dataCollection[1] = arcanaMeaning;
		dataCollection[2] = cupEffects;
		dataCollection[3] = swordEffects;
		dataCollection[4] = coinEffects;
		dataCollection[5] = wandEffects;

		return String.format("The Arcana is the means by which all is revealed. " + arcanaTitle + " | " + arcanaMeaning
				+ "\n The Cups: " + cupEffects + "\n The Swords: " + swordEffects + "\n The Coins: " + coinEffects
				+ "\n The Wands: " + wandEffects);

	}
}
