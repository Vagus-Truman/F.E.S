// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the cards are going to be based on the Arcana from the Tarot, only Major Arcana

public class Cards {

	// CLASS FIELDS
	public String majorArcana = "The Arcana is the means by which all is revealed";

	public Cards(int value) {
		this.majorArcana = majorArcanaReadings(value);
	}

	static String majorArcanaReadings(int value) {
		String arcanaTitle = "";
		String arcanaMeaning = "The Arcana is the means by which all is revealed";
		String cupEffects = "";
		String swordEffects = "";
		String coinEffects = "";
		String wandEffects = "";

		switch (value) {
		case 0:
			arcanaTitle = "The Fool Ø";
			arcanaMeaning = "To be born is to die, but it is also to live a mystery called life";
			cupEffects = "Player is refilled to 0.5 of total HP";
			swordEffects = "Opponent has 0.5 of current HP removed";
			coinEffects = "Opponent has same amount of HP as player removed";
			wandEffects = "Opponent has 0.5 of total HP removed";
			break;
			
		case 1: 
			arcanaTitle = "The Magician I";
			arcanaMeaning = "Attaining one's dream requires a stern will and unfailing determination";
			cupEffects = "Deals psychic damage of 10 with stun";
			swordEffects = "Deals lightning damage of 10 with shocked";
			coinEffects = "Deals wind damage of 10";
			wandEffects = "Deals fire damage of 10 with burned";
			break;
			
		case 2:
			arcanaTitle = "The High Priestess II";
			arcanaMeaning = "The silent voice within one's heart whispers the most profound wisdom";
			cupEffects = "Delivers healing of 10 HP";
			swordEffects = "Deals wind damage of 10";
			coinEffects = "Deals fire damage of 10 with burned";
			wandEffects = "Deals psychic damage of 10 with stunned";
			break;
			
		case 3: 
			arcanaTitle = "The Empress III";
			arcanaMeaning = "Celebrate life's grandeur. Its brilliance. Its magnificence";
			cupEffects = "Delivers HP of 25";
			swordEffects = "Deals damage of 25";
			coinEffects = "Deals psychic damage of 25 with stunned";
			wandEffects = "Opponent has same amount of HP as player";
			break;
			
		case 4:
			arcanaTitle = "The Emperor IV";
			arcanaMeaning = "Only courage in the face of doubt can lead one to the answer";
			cupEffects = "Delivers HP of 25";
			swordEffects = "Deals base damage of 15";
			coinEffects = "Deals base fire damage of 15 with burned";
			wandEffects = "Delivers HP equal to current HP";
			break;
			
		case 5:
			arcanaTitle = "The Heirophant V";
			arcanaMeaning = "It is indeed a precious gift to understand the forces that guide oneself";
			cupEffects = "Delivers HP of 1.5 times current HP";
			swordEffects = "Deals damage of 1.3 times current HP";
			coinEffects = "Deals fire damage of 1.3 times current HP with burned";
			wandEffects = "Deals electric damage of 1.3 times current HP with shocked";
			break;
			
		case 6:
			arcanaTitle = "The Lovers VI";
			arcanaMeaning = "There is both joy and wonder in coming to understand another";
			cupEffects = "Delivers HP of 26";
			swordEffects = "Deals damage of 19";
			coinEffects = "Deals psychic damage of 19 with stunned";
			wandEffects = "Fully heals player's HP";
			break;
			
		case 7:
			arcanaTitle = "The Chariot VII";
			arcanaMeaning = "One of life's greatest blessings is the freedom to pursue one's goals";
			cupEffects = "Delivers HP of 7";
			swordEffects = "Deals damage of 7";
			coinEffects = "Deals psychic damage of 19 with stunned";
			wandEffects = "Fully heals player's HP";
			break;
			
		case 8:
			arcanaTitle = "The Strength VIII";
			arcanaMeaning = "Only with strength can one endure suffering and torment";
			cupEffects = "Delivers HP of 26";
			swordEffects = "Deals wind damage of 16";
			coinEffects = "Deals damage of 16";
			wandEffects = "Deals electric damage of 16 with shocked";
			break;
			
		case 9:
			arcanaTitle = "The Hermit IX";
			arcanaMeaning = "It requires great courage to look at oneself honestly, and forge one's own path";
			cupEffects = "Delivers HP of 50";
			swordEffects = "Deals damage of 25";
			coinEffects = "Deals electric damage of 25 with shocked";
			wandEffects = "Deals wind damage of 25";
			break;
			
		case 10:
			arcanaTitle = "The Wheel Of Fortune X";
			arcanaMeaning = "Along time exist fate, the bearer of cruelty";
			cupEffects = "Delivers 1.3 times current HP";
			swordEffects = "Deals 1.2 times current HP worth of damage";
			coinEffects = "Deals 1.3 times current HP worth of fire damage with burned";
			wandEffects = "Delivers 1.3 times enemy's current HP";
			break;
			
		case 11:
			arcanaTitle = "Justice XI";
			arcanaMeaning = "To find the one true path, one must seek guidance amidst uncertainty";
			cupEffects = "Delivers 1.3 times current HP";
			swordEffects = "Deals 1.3 times current HP worth of damage";
			coinEffects = "Deals 1.3 times current HP worth of psychic damage with stunned";
			wandEffects = "Deals 1.3 times current HP worth of fire damage with burned";
			break;
			
		case 12:
			arcanaTitle = "The Hanged Man XII";
			arcanaMeaning = "In the face of disaster lies opportunity for renewal";
			cupEffects = "Delivers HP 1.2 times current HP";
			swordEffects = "Deals 1.3 times current HP worth of fire damage with burned";
			coinEffects = "Deals 1.3 times current HP worth of electric damage with shocked";
			wandEffects = "Deals 1.3 times current HP worth of psychic damage with stunned";
			break;
			
		case 13:
			arcanaTitle = "Death XII";
			arcanaMeaning = "Beyond the beaten path lies the absolute end, and a new horizon";
			cupEffects = "Sets current health to 99, regardless of position";
			swordEffects = "Sets enemy's HP to 0.5 of your current HP";
			coinEffects = "Sets both player's HP to 1";
			wandEffects = "Sets current HP to 0.5 of current HP";
			break;
		}

		return String.format("<html> > " + arcanaTitle + ""
				+ "<br/> >> " + arcanaMeaning
				+ "<br/> > Cups | " + cupEffects 
				+ "<br/> > Swords | " + swordEffects 
				+ "<br/> > Coins | " + coinEffects
				+ "<br/> > Wands | " + wandEffects 
				+ "<html>");

	}
}
