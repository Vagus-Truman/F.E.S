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
		}

		return majorArcana;
	}

	private static String majorArcanaReadings(String card, int value) {
		String arcanaMeaning = "The Arcana is the means by which all is revealed";
		String cupEffects = "";
		String swordEffects = "";
		String coinEffects = "";
		String wandEffects = "";

		if (value == 0) { // the fool
			arcanaMeaning = "To be born is to die, but it is also to live a mystery called life";
			cupEffects = "If dice is 6 or below, player is refilled to 50% of total HP. If dice is 7, nothing happens. "
					+ "If dice is 8 and above, player is refilled to 100% of total HP";
			swordEffects = "If dice is 6 or below, opponent has 50% of current HP removed. If dice is 7, nothing happens. "
					+ "If dice is 8 and above, opponent has 50% of total HP removed";
			coinEffects = "If dice is 6 or below, player is to draw a card from the deck. If dice is 7, nothing happens. "
					+ "If dice is 8 and above, player is to draw from the deck until they reach the limit of cards (8)";
			wandEffects = "If dice is 6 or below, player's deals damage that takes 50% of enemy's current health. If dice is 7, nothing happens. "
					+ "If dice is 8 and above, player is deals 50 points of damage";

		} else if (value == 1) { // the magician
			arcanaMeaning = "Attaining one's dream requires a stern will and unfailing determination";
			cupEffects = "Deals base psychic damage of 20 based on number rolled. If 1, then base damage is dealt. If above 1, "
					+ "scaling affects damage. Anything above 7 deals stunned psychic damage to opponent. 13 ends scaling at dealing "
					+ "40 psychic damage and stunning";
			swordEffects = "Deals base lightning damage of 20 based on number rolled. If 1, then base damage is dealt. If above 1, "
					+ "scaling affects damage. Anything above 7 deals shocked status to opponent for three turns. 13 ends scaling at dealing "
					+ "40 lightning damage and shocked";
			coinEffects = "Deals base wind damage of 20 based on number rolled. If 1, then base damage is dealt. If above 1, "
					+ "scaling affects damage. 13 ends scaling at dealing 40 wind damage and shocked";
			wandEffects = "Deals base fire damage of 20 based on number rolled. If 1, then base damage is dealt. If above 1, "
					+ "scaling affects damage. Anything above 7 deals burned status damage to opponent for three turns . 13 ends scaling at dealing "
					+ "40 fire damage and burning";

		} else if (value == 2) { // the high priestess
			arcanaMeaning = "The silent voice within one's heart whispers the most profound wisdom";
			cupEffects = "Delivers base healing of 10 HP, and scales with number rolled. If 1, then only base healing is dealt. "
					+ "If dice is 7, both players get healed 25 HP. If dice is 13, then player is healed 50 HP";
			swordEffects = "Deals base wind damage of 10, and scales with number rolled. If dice is 13, it deals max of 40 wind damage";
			coinEffects = "Deals base fire damage of 10, and scales with number rolled. If dice is 13, it deals max of 40 fire damage "
					+ "and burns damage for three rounds";
			wandEffects = "Deals base psychic damage of 10, and scales with number rolled. If dice is 13, it deals max of 40 psychic damage "
					+ "and stunned psychic damage";

		} else if (value == 3) { // the empress
			arcanaMeaning = "Celebrate life's grandeur. Its brilliance. Its magnificence";
			cupEffects = "Delivers base HP of 50. Scales down with ascending dice value, with 13 delivering 0 HP";
			swordEffects = "Deals base damage of 50. Scales down with ascending dice value, with 13 dealing 0 damage";
			coinEffects = "Deals base wind damage of 50. Scales down with ascending dice value, with 13 dealing 0 damage";
			wandEffects = "If dice returns an odd number, player has two new cards added to their hand. If even, player has one new card added to their hand";

		} else if (value == 4) { // the emperor
			arcanaMeaning = "Only courage in the face of doubt can lead one to the answer";
			cupEffects = "Delivers base HP of 0. Scales down with ascending dice value, with 13 delivering 50 HP";
			swordEffects = "Deals base damage of 0. Scales down with ascending dice value, with 13 dealing 50 damage";
			coinEffects = "Deals base wind damage of 0. Scales down with ascending dice value, with 13 dealing 50 damage";
			wandEffects = "If dice returns an odd number, player has one new card added to their hand. If even, player has two new cards added to their hand";

		} else if (value == 5) { // the heirophant
			arcanaMeaning = "It is indeed a precious gift to understand the forces that guide oneself";
			cupEffects = "If dice is odd, nothing happens. If dice is even, HP of 5 times the value of the dice is delivered";
			swordEffects = "If dice is odd, nothing happens. If dice is even, damage of 5 times the value of the dice is delivered";
			coinEffects = "If dice is odd, nothing happens. If dice is even, fire damage of 5 times the value of the dice is delivered";
			wandEffects = "If dice is odd, nothing happens. If dice is even, wind of 5 times the value of the dice is delivered";

		} else if (value == 6) { // the lovers
			arcanaMeaning = "There is both joy and wonder in coming to understand another";
			cupEffects = "Delivers HP based on a value of dice being rolled, with 1 delivering 13, and 13 delivering 39";
			swordEffects = "Deals base damage of 0. Scales down with ascending dice value, with 13 dealing 75 damage";
			coinEffects = "Deals base psychic damage of 0. Scales down with ascending dice value, with 13 dealing 75 damage, and stunned status";
			wandEffects = "If dice returns an odd number, player has one new card added to their hand. If even, player has two new cards added to their hand";

		} else if (value == 7) { // the chariot
			arcanaMeaning = "One of life's greatest blessings is the freedom to pursue one's goals";
			cupEffects = "Delivers HP based on a value of dice being rolled, with 1 delivering 1, and 13 delivering 13";
			swordEffects = "Deals base damage of 0. Scales down with ascending dice value, with 13 dealing 13 damage";
			coinEffects = "Deals base psychic damage of 0. Scales down with ascending dice value, with 13 dealing 75 damage, and stunned status";
			wandEffects = "If dice returns an odd number, player has one new card added to their hand. If even, player has two new cards added to their hand";

		} else if (value == 8) { // strength
			arcanaMeaning = "Only with strength can one endure suffering and torment";
			cupEffects = "Delivers base HP in increments of 3, starting at 0. Max is 39 HP at 13";
			swordEffects = "Deals base fire damage in increments of 3, starting at 0. Max is 39 fire damage at 13. Even numbers deliver burned status";
			coinEffects = "Deals base damage in increments of 3, starting at 0. Max is 39 damage at 13";
			wandEffects = "Deals base electric damage in increments of 3, starting at 0. Max is 39 electric damage at 13. Even numbers deliver shocked status";

		} else if (value == 9) { // hermit
			arcanaMeaning = "It requires great courage to look at oneself honestly, and forge one's own path";
			cupEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, HP that is 50% of current health is delivered";
			swordEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, damage that is 50% of current health is dealt";
			coinEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, electric damage that is 50% of current health is dealt, shocked status delivered at 7";
			wandEffects = "If dice is 6 or less, nothing happens. If dice is 7 to 13, fire damage that is 50% of current health is dealt, stunned status delivered at 7";

		} else if (value == 10) { // wheel of fortune
			arcanaMeaning = "Along time exist fate, the bearer of cruelty";
			cupEffects = "Delivers HP based on a scale of 0 to 100, with 1 delivering 0, and 13 delivering 100";
			swordEffects = "Deals damage based on a scale of 0 to 100, with 1 dealing 0, and 13 dealing 100";
			coinEffects = "Deals electrical, fire, or psychic damage based on value. 1, 2, 3, 4 deals electrical damage ranging from 0 to 25 with "
					+ "4 dealing shocked status for three turns | 5, 6, 7, 8 deals fire damage ranging from 0 to 25 with 8 dealing burned status "
					+ "for three turns | 9, 10, 11, 12 deals psychic damage ranging from 0 to 25 with 12 dealing stunned status | 13 adds new card to hand";
			wandEffects = "If dice returns an odd number, player has one new card added to their hand. If even, player has two new cards added to their hand. If dice is 7, hand is filled until limit is reached";

		} else if (value == 11) { // justice
			arcanaMeaning = "To find the one true path, one must seek guidance amidst uncertainty";
			cupEffects = "If dice is 7 or less, HP that is 50% of current health is delivered. If dice is 8 to 13, nothing happens";
			swordEffects = "If dice is 7 or less, damage that is 50% of current health is dealt. If dice is 8 to 13, nothing happens";
			coinEffects = "If dice is 7 or less, psychic damage that is 50% of current health is dealt, stunned status delivered at 7. If dice is 8 to 13, nothing happens";
			wandEffects = "If dice is 7 or less, fire damage that is 50% of current health is dealt, burned status delivered at 7. If dice is 8 to 13, nothing happens";

		} else if (value == 12) { // hanged man
			arcanaMeaning = "In the face of disaster lies opportunity for renewal";
			cupEffects = "Delivers HP based on the current count of health, and multiplies it with the value of the dice rolled";
			swordEffects = "Deals fire damage based on the current count of health, and multiplies it with the value of the dice rolled. Odd numbers deal burned status";
			coinEffects = "Deals electric damage based on the current count of health, and multiplies it with the value of the dice rolled. Odd numbers deal shocked status";
			wandEffects = "Deals psychic damage based on the current count of health, and multiplies it with the value of the dice rolled. Odd numbers deal stunned status";

		} else if (value == 13) { // death
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
		dataCollection[0] = card;
		dataCollection[1] = arcanaMeaning;
		dataCollection[2] = cupEffects;
		dataCollection[3] = swordEffects;
		dataCollection[4] = coinEffects;
		dataCollection[5] = wandEffects;		

		return String.format("The Arcana is the means by which all is revealed. " + card + " | " + arcanaMeaning
				+ "\n The Cups: " + cupEffects + "\n The Swords: " + swordEffects + "\n The Coins: " + coinEffects
				+ "\n The Wands: " + wandEffects);

	}
}
