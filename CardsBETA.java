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
			cupEffects = "Player is refilled to 50% of total HP";
			swordEffects = "Opponent has 50% of current HP removed";
			coinEffects = "Player is to draw a card from the deck";
			wandEffects = "Opponent has 50% of total HP removed";

		} else if (value == 1) { // the magician
			arcanaTitle = "The Magician";
			arcanaMeaning = "Attaining one's dream requires a stern will and unfailing determination";
			cupEffects = "Deals base psychic damage of 20 based on number rolled with psychic stun";
			swordEffects = "Deals base lightning damage of 20 based on number rolled with shocked";
			coinEffects = "Deals base wind damage of 20 based on number rolled";
			wandEffects = "Deals base fire damage of 20 based on number rolled with burned";

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
			cupEffects = "Delivers HP based on a value of dice being rolled, with 1 delivering 13, and 13 delivering 39";
			swordEffects = "Deals base damage of 0. Scales down with ascending dice value, with 13 dealing 75 damage";
			coinEffects = "Deals base psychic damage of 0. Scales down with ascending dice value, with 13 dealing 75 damage, and stunned status";
			wandEffects = "If dice returns an odd number, player has one new card added to their hand. If even, player has two new cards added to their hand";

		} else if (value == 7) { // the chariot
			arcanaTitle = "The Chariot";
			arcanaMeaning = "One of life's greatest blessings is the freedom to pursue one's goals";
			cupEffects = "Delivers HP based on a value of dice being rolled, with 1 delivering 1, and 13 delivering 13";
			swordEffects = "Deals base damage of 0. Scales down with ascending dice value, with 13 dealing 13 damage";
			coinEffects = "Deals base psychic damage of 0. Scales down with ascending dice value, with 13 dealing 75 damage, and stunned status";
			wandEffects = "If dice returns an odd number, player has one new card added to their hand. If even, player has two new cards added to their hand";

		} else if (value == 8) { // strength
			arcanaTitle = "The Strength";
			arcanaMeaning = "Only with strength can one endure suffering and torment";
			cupEffects = "Delivers base HP in increments of 3, starting at 0. Max is 39 HP at 13";
			swordEffects = "Deals base fire damage in increments of 3, starting at 0. Max is 39 fire damage at 13. Even numbers deliver burned status";
			coinEffects = "Deals base damage in increments of 3, starting at 0. Max is 39 damage at 13";
			wandEffects = "Deals base electric damage in increments of 3, starting at 0. Max is 39 electric damage at 13. Even numbers deliver shocked status";

		} else if (value == 9) { // hermit
			arcanaTitle = "The Hermit";
			arcanaMeaning = "It requires great courage to look at oneself honestly, and forge one's own path";
			cupEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, HP that is 50% of current health is delivered";
			swordEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, damage that is 50% of current health is dealt";
			coinEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, electric damage that is 50% of current health is dealt, shocked status delivered at 7";
			wandEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, fire damage that is 50% of current health is dealt, stunned status delivered at 7";

		} else if (value == 10) { // wheel of fortune
			arcanaTitle = "The Wheel Of Fortune";
			arcanaMeaning = "Along time exist fate, the bearer of cruelty";
			cupEffects = "Delivers HP based on a scale of 0 to 100, with 1 delivering 0, and 13 delivering 100";
			swordEffects = "Deals damage based on a scale of 0 to 100, with 1 dealing 0, and 13 dealing 100";
			coinEffects = "Deals electrical, fire, or psychic damage based on value. 1, 2, 3, 4 deals electrical damage ranging from 0 to 25 with "
					+ "4 dealing shocked status for three turns | 5, 6, 7, 8 deals fire damage ranging from 0 to 25 with 8 dealing burned status "
					+ "for three turns | 9, 10, 11, 12 deals psychic damage ranging from 0 to 25 with 12 dealing stunned status | 13 adds new card to hand";
			wandEffects = "If dice returns an odd number, player has one new card added to their hand. If even, player has two new cards added to their hand. If dice is 7, hand is filled until limit is reached";

		} else if (value == 11) { // justice
			arcanaTitle = "The Justice";
			arcanaMeaning = "To find the one true path, one must seek guidance amidst uncertainty";
			cupEffects = "If dice is 7 or less, HP that is 50% of current health is delivered. If dice is 8 to 13, nothing happens";
			swordEffects = "If dice is 7 or less, damage that is 50% of current health is dealt. If dice is 8 to 13, nothing happens";
			coinEffects = "If dice is 7 or less, psychic damage that is 50% of current health is dealt, stunned status delivered at 7. If dice is 8 to 13, nothing happens";
			wandEffects = "If dice is 7 or less, fire damage that is 50% of current health is dealt, burned status delivered at 7. If dice is 8 to 13, nothing happens";

		} else if (value == 12) { // hanged man
			arcanaTitle = "The Hanged Man";
			arcanaMeaning = "In the face of disaster lies opportunity for renewal";
			cupEffects = "Delivers HP based on the current count of health, and multiplies it with the value of the dice rolled";
			swordEffects = "Deals fire damage based on the current count of health, and multiplies it with the value of the dice rolled. Odd numbers deal burned status";
			coinEffects = "Deals electric damage based on the current count of health, and multiplies it with the value of the dice rolled. Odd numbers deal shocked status";
			wandEffects = "Deals psychic damage based on the current count of health, and multiplies it with the value of the dice rolled. Odd numbers deal stunned status";

		} else if (value == 13) { // death
			arcanaTitle = "Death";
			arcanaMeaning = "Beyond the beaten path lies the absolute end, and a new horizon";
			cupEffects = "If the dice is 13, sets the current health of the player to 99, regardless of previous position. "
					+ "Else, whatever number the dice produces is added onto current health";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's deals damage that takes 50% of enemy's current health. If dice is 7, nothing happens. "
					+ "If dice is 8 and above, player is deals 50 points of damage";

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
