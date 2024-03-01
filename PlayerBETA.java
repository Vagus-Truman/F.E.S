
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class PlayerBETA {
	
	 private EffectBETA effect;

	    public PlayerBETA() {
	        // Initialize the effect instance
	        this.effect = new EffectBETA();
	    }

	    // Getters and setters for the effect field
	    public EffectBETA getEffect() {
	        return effect;
	    }

	    public void setEffect(EffectBETA effect) {
	        this.effect = effect;
	    }
	
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

		PlayerBETA opponent = null;
		EffectBETA opponentEffect = opponent.getEffect();
		 PlayerBETA player = null;
		EffectBETA playerEffect = player.getEffect();
		switch (indexOfCombos) {

		// Fool
		case 0:
		player.healthCount = (int)(0.5 * PlayerBETA.baseHealth);
		System.out.println("Player's health is refilled to " + player.healthCount);
		
		case 1:
		opponent.healthCount -= (int)(0.5 * opponent.healthCount);
		System.out.println("Opponent loses 0.5 of their current HP. Current HP: " + opponent.healthCount);
		case 2:
		
		case 3:
		int hpToRemove = (int)(0.5 * PlayerBETA.baseHealth);
		opponent.healthCount -= hpToRemove;
		System.out.println("Opponent loses " + hpToRemove + " HP. Current HP: " + opponent.healthCount);

			// Magician
		case 4:
			int damage = 20;
            opponentEffect.psychicDamage(damage);
            opponentEffect.setStunned(true);
            System.out.println("Deals psychic damage of " + damage + " with stun to the opponent.");
            System.out.println("Opponent is stunned.");
            break;
		case 5:
		double lightningDamage = 20;
		opponentEffect.setElectricDamage(lightningDamage);
		opponentEffect.setShocked(true);
		System.out.println("Deals lightning damage of " + lightningDamage + " with shocked to the opponent.");
		case 6:
		int winddamage= 20;
		 opponentEffect.windDamage(winddamage);
		case 7:
		int damagefire = 20;
		opponentEffect.setFireDamage(damagefire);
		opponentEffect.setBurning(true);
		System.out.println("Deals fire damage of " + damagefire + " with burned to the opponent.");

			// High Priestess
		case 8:
		int healingAmount = 10;
		player.healthCount += healingAmount;
		System.out.println("Delivers healing of " + healingAmount + " HP to the player. Current HP: " + player.healthCount);
		case 9:
		int windDamageAmount = 10;
		opponentEffect.windDamage(windDamageAmount);
		System.out.println("Deals wind damage of " + windDamageAmount + " to the opponent.");
		case 10:
		double fireDamageAmount = 10;
		opponentEffect.fireDamageHP(fireDamageAmount);
		opponentEffect.setBurning(true);
		System.out.println("Deals fire damage of " + fireDamageAmount + " with burned to the opponent.");
		case 11:
		int psychicDamageAmount = 10;
		opponentEffect.psychicDamage(psychicDamageAmount);
		opponentEffect.setStunned(true);
		System.out.println("Deals psychic damage of " + psychicDamageAmount + " with stunned to the opponent.");
		

			// Empress
		case 12:
		int hpDelivered = 25;
		player.healthCount += hpDelivered;
		System.out.println("Delivers " + hpDelivered + " HP to the player. Current HP: " + player.healthCount);
		case 13:
		int damageAmount = 50;
		opponent.healthCount -= damageAmount;
		System.out.println("Deals damage of " + damageAmount + " to the opponent. Current HP: " + opponent.healthCount);
	   
		case 14:
		int psychicDamageAmountCoin = 50;
		opponentEffect.psychicDamage(psychicDamageAmountCoin);
		opponentEffect.setStunned(true);
		System.out.println("Deals psychic damage of " + psychicDamageAmountCoin + " with stunned to the opponent.");
	  
		case 15:
		int cardsAdded = 2;
		player.cardCount += cardsAdded;
		System.out.println("Player has " + cardsAdded + " new cards added to their hand. Current card count: " + player.cardCount);

			// Emperor
		case 16:
		int hpDeliveredCup = 25;
		player.healthCount += hpDeliveredCup;
		System.out.println("Delivers " + hpDeliveredCup + " HP to the player. Current HP: " + player.healthCount);
		case 17:
		int baseDamage = 25;
    opponent.healthCount -= baseDamage;
    System.out.println("Deals base damage of " + baseDamage + " to the opponent. Current HP: " + opponent.healthCount);
  
		case 18:
		int baseFireDamage = 25;
		opponentEffect.setFireDamage(baseFireDamage);
		opponentEffect.setBurning(true);
		System.out.println("Deals base fire damage of " + baseFireDamage + " with burned to the opponent.");
	 
		case 19:
		int cardsAddedWand = 1;
		player.cardCount += cardsAddedWand;
		System.out.println("Player has " + cardsAddedWand + " new card added to their hand. Current card count: " + player.cardCount);

			// Heirophant
		case 20:
		double healingMultiplier = 1.5;
		int newHealth = (int) (player.healthCount * healingMultiplier);
		int healthIncrease = newHealth - player.healthCount;
		player.healthCount = newHealth;
		System.out.println("Delivers healing of " + healingMultiplier + " times current HP to the player. Current HP: " + player.healthCount + ". HP increased by: " + healthIncrease);
		case 21:
		double damageMultiplier = 1.5;
		int damageDealt = (int) (player.healthCount * damageMultiplier);
		opponent.healthCount -= damageDealt;
		System.out.println("Deals damage of " + damageMultiplier + " times current HP to the opponent. Current HP: " + opponent.healthCount);
	 
		case 22:
		double damageMultiplierCoin = 1.5;
		int fireDamageDealt = (int) (player.healthCount * damageMultiplierCoin);
		opponentEffect.setFireDamage(fireDamageDealt);
		opponentEffect.setBurning(true);
		System.out.println("Deals fire damage of " + damageMultiplierCoin + " times current HP with burned to the opponent.");
	 
		case 23:
		double damageMultiplierWand = 1.5;
		int electricDamageDealt = (int) (player.healthCount * damageMultiplierWand);
		opponentEffect.setElectricDamage(electricDamageDealt);
		opponentEffect.setShocked(true);
		System.out.println("Deals electric damage of " + damageMultiplierWand + " times current HP with shocked to the opponent.");
	

			// Lovers
		case 24:
		int healingAmountCup = 26;
		player.healthCount += healingAmountCup;
		System.out.println("Delivers healing of " + healingAmountCup + " HP to the player. Current HP: " + player.healthCount);
		case 25:
		int damageAmountSword = 39;
		opponent.healthCount -= damageAmountSword;
		System.out.println("Deals damage of " + damageAmountSword + " to the opponent. Current HP: " + opponent.healthCount);
	   
		case 26:
		int psychicDamageAmountCoins = 39;
		opponentEffect.psychicDamage(psychicDamageAmountCoins);
		opponentEffect.setStunned(true);
		System.out.println("Deals psychic damage of " + psychicDamageAmountCoins + " with stunned to the opponent.");
	 
		case 27:
		int cardsAddedWands = 1;
		player.cardCount += cardsAddedWands;
		System.out.println("Player has " + cardsAddedWands + " new card added to their hand. Current card count: " + player.cardCount);

			// Chariot
		case 28:
		int healingAmountCups = 7;
    	player.healthCount += healingAmountCups;
   		 System.out.println("Delivers healing of " + healingAmountCups + " HP to the player. Current HP: " + player.healthCount);
		case 29:
		int damageAmountChariot = 7;
		opponent.healthCount -= damageAmountChariot;
		System.out.println("Deals damage of " + damageAmountChariot + " to the opponent. Current HP: " + opponent.healthCount);
	 
		case 30:
		int PsychicDamageChariot = 39;
		opponentEffect.psychicDamage(PsychicDamageChariot);
		opponentEffect.setStunned(true);
		System.out.println("Deals psychic damage of " + PsychicDamageChariot + " with stunned to the opponent.");

		case 31:
		int cardsAddedChariot = 2;
		player.cardCount += cardsAddedChariot;
		System.out.println("Player has " + cardsAddedChariot + " new cards added to their hand. Current card count: " + player.cardCount);
	  

			// Strength
		case 32:
		int healingAmountStr = 26;
		player.healthCount += healingAmountStr;
		System.out.println("Delivers healing of " + healingAmountStr + " HP to the player. Current HP: " + player.healthCount);
		case 33:
		int windDamageStr = 26;
		opponentEffect.windDamage(windDamageStr);
		System.out.println("Deals wind damage of " + windDamageStr + " to the opponent.");
		case 34:
		int damageStr = 26;
		opponent.healthCount -= damageStr;
		System.out.println("Deals damage of " + damageStr + " to the opponent. Current HP: " + opponent.healthCount);
		case 35:
		int electricDamage = 26;
		opponentEffect.setElectricDamage(electricDamage);
		opponentEffect.setShocked(true);
		System.out.println("Deals electric damage of " + electricDamage + " with shocked to the opponent.");
	 

			// Hermit
		case 36:
		int healingHermit = 50;
    player.healthCount += healingHermit;
    System.out.println("Delivers healing of " + healingHermit + " HP to the player. Current HP: " + player.healthCount);
 
		case 37:
		int damageHermit = 50;
		opponent.healthCount -= damageHermit;
		System.out.println("Deals damage of " + damageHermit + " to the opponent. Current HP: " + opponent.healthCount);
	 
		case 38:
		int electricHermit = 50;
		opponentEffect.setElectricDamage(electricHermit);
		opponentEffect.setShocked(true);
		System.out.println("Deals electric damage of " + electricHermit + " with shocked to the opponent.");
	 
		case 39:
		int windDamageHermit = 50;
		opponentEffect.windDamage(windDamageHermit);
		System.out.println("Deals wind damage of " + windDamageHermit + " to the opponent.");
	  

			// Wheel Of Fortune
		case 40:
		double damageMultiplierWOF = 1.5;
		int damageDealtWOF = (int) (player.healthCount * damageMultiplierWOF);
		opponent.healthCount -= damageDealtWOF;
		System.out.println("Deals damage of " + damageMultiplierWOF + " times current HP to the opponent. Current HP: " + opponent.healthCount);
		case 41:
		double damageMultiplierWOFS = 2.0;
		int damageDealtWOFS = (int) (player.healthCount * damageMultiplierWOFS);
		opponent.healthCount -= damageDealtWOFS;
		System.out.println("Deals damage of " + damageMultiplierWOFS + " times current HP to the opponent. Current HP: " + opponent.healthCount);
		case 42:
		double damageMultipliercoin = 1.5;
		int fireDamageDealtcoin = (int) (player.healthCount * damageMultipliercoin);
		opponentEffect.fireDamageCoin(fireDamageDealtcoin);
		opponentEffect.setBurning(true);
		System.out.println("Deals fire damage of " + damageMultipliercoin + " times current HP with burned to the opponent.");
	
		case 43:
		int cardsAddedWOF = 2;
		player.cardCount += cardsAddedWOF;
		System.out.println("Player has " + cardsAddedWOF + " new cards added to their hand. Current card count: " + player.cardCount);
	 
			
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
