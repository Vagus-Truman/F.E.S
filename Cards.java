// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the cards are going to be based on the Arcana from the Tarot, only Major Arcana

public class Cards {

	// CLASS FIELDS

	public static String majorArcana(int value) {
		String majorArcana = "";

		if (value == 0) {
			majorArcana = "Fool";
		} else if (value == 1) {
			majorArcana = "Magician";
		} else if (value == 2) {
			majorArcana = "High Priestess";
		} else if (value == 3) {
			majorArcana = "Empress";
		} else if (value == 4) {
			majorArcana = "Emperor";
		} else if (value == 5) {
			majorArcana = "Heirophant";
		} else if (value == 6) {
			majorArcana = "Lovers";
		} else if (value == 7) {
			majorArcana = "Chariot";
		} else if (value == 8) {
			majorArcana = "Strength";
		} else if (value == 9) {
			majorArcana = "Hermit";
		} else if (value == 10) {
			majorArcana = "Wheel of Fortune";
		} else if (value == 11) {
			majorArcana = "Justice";
		} else if (value == 12) {
			majorArcana = "Hanged Man";
		} else if (value == 13) {
			majorArcana = "Death";
		} else if (value == 14) {
			majorArcana = "Temperance";
		} else if (value == 15) {
			majorArcana = "Devil";
		} else if (value == 16) {
			majorArcana = "Tower";
		} else if (value == 17) {
			majorArcana = "Star";
		} else if (value == 18) {
			majorArcana = "Moon";
		} else if (value == 19) {
			majorArcana = "Sun";
		} else if (value == 20) {
			majorArcana = "Judgement";
		} else if (value == 21) {
			majorArcana = "World";
		}

		return majorArcana;
	}

	private static String majorArcanaReadings(int value) {
		String arcanaMeaning = "The Arcana is the means by which all is revealed";

		if (value == 0) {
			arcanaMeaning = "The symbol of innocence - the fool's journey to come will shape his character yet";
		} else if (value == 1) {
			arcanaMeaning = "Attaining one's dream requires a stern will and unfailing determination";
		} else if (value == 2) {
			arcanaMeaning = "The silent voice within one's heart whispers the most profound wisdom";
		} else if (value == 3) {
			arcanaMeaning = "Celebrate life's grandeur. Its brilliance. Its magnificence";
		} else if (value == 4) {
			arcanaMeaning = "Only courage in the face of doubt can lead one to the answer";
		} else if (value == 5) {
			arcanaMeaning = "It is indeed a precious gift to understand the forces that guide oneself";
		} else if (value == 6) {
			arcanaMeaning = "There is both joy and wonder in coming to understand another";
		} else if (value == 7) {
			arcanaMeaning = "One of life's greatest blessings is the freedom to pursue one's goals";
		} else if (value == 8) {
			arcanaMeaning = "Only with strength can one endure suffering and torment";
		} else if (value == 9) {
			arcanaMeaning = "It requires great courage to look at oneself honestly, and forge one's own path";
		} else if (value == 10) {
			arcanaMeaning = "Along time exist fate, the bearer of cruelty";
		} else if (value == 11) {
			arcanaMeaning = "To find the one true path, one must seek guidance amidst uncertainty";
		} else if (value == 12) {
			arcanaMeaning = "In the face of disaster lies opportunity for renewal";
		} else if (value == 13) {
			arcanaMeaning = "Beyond the beaten path lies the absolute end, and a new horizon";
		} else if (value == 14) {
			arcanaMeaning = "To change oneself is to nurture and grow little by little";
		} else if (value == 15) {
			arcanaMeaning = "With one's freedom, they are free to succumb to their heart";
		} else if (value == 16) {
			arcanaMeaning = "That which is known is not known forever";
		} else if (value == 17) {
			arcanaMeaning = "Hope is not an illusion, but the ultimate guide";
		} else if (value == 18) {
			arcanaMeaning = "It is only in the light of night that which is to come is seen";
		} else if (value == 19) {
			arcanaMeaning = "It is only in the light of day that all is revealed";
		} else if (value == 20) {
			arcanaMeaning = "One is one's greatest adjucator, and one's greatest executioner";
		} else if (value == 21) {
			arcanaMeaning = "One's story has come to an end. One's story is how one shall be remembered";
		}

		return String.format("The Arcana is the means by which all is revealed. ", arcanaMeaning);

	}
}