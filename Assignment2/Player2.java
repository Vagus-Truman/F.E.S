
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player2 {

	// CLASS FIELDS
	private static final int BASE_HP = 100;
	public static int healthCount;
	
	public static int cardCount = 5;
	public static int effectDuration = 3;
	public static String effectFromCards;

	private static final int MAJORMIN = 0;
	private static final int MAJORMAX = 13;
	private static final int MINORMIN = 1;
	private static final int MINORMAX = 4;

	public static boolean turnIsOver = false;
	public static boolean statusEffected = false;
	public static String inflictedStatus = "";

	public static List<String> cardInfoAndEffect() {
		List<String> cardInfoData = new ArrayList<String>();

		for (int major = MAJORMIN; major <= MAJORMAX; major++) { // major arcana selection
			for (int minor = MINORMIN; minor <= MINORMAX; minor++) { // minor arcana selection

				// assuming all goes well, the format of the card should be {mjArcn, mrArcn}
				String dataString = "(" + major + ", " + minor + ")";
				cardInfoData.add(dataString);

			}
		}

		// System.out.println(cardInfoData);
		return cardInfoData;
	}

	public Player2() {
		if (Effect.isShocked) {
			// unable to move and takes 5 HP every turn for three turns
			statusEffected = true;
			inflictedStatus = "Shocked";

			for (int i = 0; i < effectDuration;) {
				if (Player2.turnIsOver) {
					i++;
				}

				Player2.healthCount -= 5;
				statusEffected = false;
			}

		}
		if (Effect.isBurning) {
			// every turn takes 5 HP for three turns
			statusEffected = true;
			inflictedStatus = "Burned";

			for (int i = 0; i < effectDuration;) {
				if (Player2.turnIsOver) {
					i++;
				}

				Player2.healthCount -= 5;
				statusEffected = false;
			}
		}
		if (Effect.isStunned) {
			// unable to move for three turns
			statusEffected = true;
			inflictedStatus = "Stunned";

			for (int i = 0; i < effectDuration;) {
				if (Player2.turnIsOver) {
					i++;
				}

				Player2.healthCount -= 5;
				statusEffected = false;
			}
		}
	}

	// health control
	public static void healthController (int healOrDamage, boolean hurtIfTrue) {
		if (hurtIfTrue) {
			Player2.setHealthCount(Player2.getHealthCount() - healOrDamage);
		} else {
			Player2.setHealthCount(Player2.getHealthCount() + healOrDamage);
		}
	}
	
	public static void healthRegulator (int healthCount) {
		if (healthCount <= 0) {
			Player2.setHealthCount(0);
		} else if (healthCount >= 100) {
			Player2.setHealthCount(100);
		}
	}

	// considering effects
	public static int getHealthCount() {
		return healthCount;
	}

	public static void setHealthCount(int healthCount) {
		Player2.healthCount = healthCount;
	}

	
	public static void setStunned() {
		Effect.isStunned = true;
	}

	public static void setShocked() {
		Effect.isShocked = true;
	}

	public static void setBurned() {
		Effect.isBurning = true;
	}

	public static void indexAndAffect(int indexMajor, int indexMinor) {
		switch (indexMajor) {
		
		case :
			switch(indexMinor) {
			
			} break;
		
		// Fool
		case :
			switch(indexMinor) {
			
			} break;
		
		case 0:
			effectFromCards = "Player is refilled to 0.5 of total HP";
			healthController((int) (0.5 * Player2.BASE_HP), false);
			break;
		case 1:
			effectFromCards = "Opponent has 0.5 of current HP removed";
			Player1.healthController((int) (0.5 * Player2.getHealthCount()), true);
			break;
		case 2:
			effectFromCards = "Opponent has same amount of HP as player removed";
			Player1.healthController(Player2.getHealthCount(), true);
			break;
		case 3:
			effectFromCards = "Opponent has 0.5 of total HP removed";
			Player1.healthController(50, true);
			break;

		// Magician
		case :
			switch(indexMinor) {
			
			} break;
		
		case 4:
			effectFromCards = "Deals psychic damage of 20 with stun";
			Player1.healthController(20, true);
			Player1.setStunned();
			break;
		case 5:
			effectFromCards = "Deals lightning damage of 20 with shocked";
			Player1.healthController(20, true);
			Player1.setShocked();
			break;
		case 6:
			effectFromCards = "Deals wind damage of 20";
			Player1.healthController(20, true);
			break;
		case 7:
			effectFromCards = "Deals fire damage of 20 with burned";
			Player1.healthController(20, true);
			Player1.setBurned();
			break;

		// High Priestess
		case :
			switch(indexMinor) {
			
			} break;
		
		case 8:
			effectFromCards = "Delivers healing of 10 HP";
			healthController(10, false);
			break;
		case 9:
			effectFromCards = "Deals wind damage of 10";
			Player1.healthController(10, true);
			break;
		case 10:
			effectFromCards = "Deals fire damage of 10 with burned";
			Player1.healthController(10, true);
			Player1.setBurned();
			break;
		case 11:
			effectFromCards = "Deals psychic damage of 10 with stunned";
			Player1.healthController(10, true);
			Player1.setStunned();
			break;

		// Empress
		case :
			switch(indexMinor) {
			
			} break;
		
		case 12:
			effectFromCards = "Delivers HP of 25";
			healthController(25, false);
			break;
		case 13:
			effectFromCards = "Deals damage of 50";
			Player1.healthController(50, true);
			break;

		case 14:
			effectFromCards = "Deals psychic damage of 50 with stunned";
			Player1.healthController(60, true);
			Player1.setStunned();
			break;

		case 15:
			effectFromCards = "Opponent has same amount of HP as player";
			Player1.setHealthCount(Player2.getHealthCount());
			break;

		// Emperor
		case :
			switch(indexMinor) {
			
			} break;
		
		case 16:
			effectFromCards = "Delivers HP of 25";
			healthController(25, false);
			break;
		case 17:
			effectFromCards = "Deals base damage of 25";
			Player1.healthController(25, true);
			break;

		case 18:
			effectFromCards = "Deals base fire damage of 25 with burned";
			Player1.healthController(25, true);
			Player1.setBurned();
			break;

		case 19:
			effectFromCards = "Delivers HP equal to current HP";
			healthController(Player2.getHealthCount(), false);
			break;

		// Heirophant
		case :
			switch(indexMinor) {
			
			} break;
		
		case 20:
			effectFromCards = "Delivers HP of 1.5 times current HP";
			healthController((int) (Player2.getHealthCount() * 1.5), false);
			break;
		case 21:
			effectFromCards = "Deals damage of 1.5 times current HP";
			Player1.healthController((int) (Player2.getHealthCount() * 1.5), true);
			break;

		case 22:
			effectFromCards = "Deals fire damage of 1.5 times current HP with burned";
			Player1.healthController((int) (Player2.getHealthCount() * 1.5), true);
			Player1.setBurned();
			break;

		case 23:
			effectFromCards = "Deals electric damage of 1.5 times current HP with shocked";
			Player1.healthController((int) (Player2.getHealthCount() * 1.5), true);
			Player1.setShocked();
			break;

		// Lovers
		case :
			switch(indexMinor) {
			
			} break;
		
		case 24:
			effectFromCards = "Delivers HP of 26";
			healthController(26, false);
			break;
		case 25:
			effectFromCards = "Deals damage of 39";
			Player1.healthController(39, true);
			break;

		case 26:
			effectFromCards = "Deals psychic damage of 39 with stunned";
			Player1.healthController(39, true);
			Player1.setStunned();
			break;

		case 27:
			effectFromCards = "Fully heals player's HP";
			Player2.setHealthCount(BASE_HP);
			break;

		// Chariot
		case :
			switch(indexMinor) {
			
			} break;
		
		case 28:
			effectFromCards = "Delivers HP of 7";
			healthController(7, false);
			break;
		case 29:
			effectFromCards = "Deals damage of 7";
			Player1.healthController(7, true);
			break;

		case 30:
			effectFromCards = "Deals psychic damage of 39 with stunned";
			Player1.healthController(39, true);
			Player1.setStunned();
			break;

		case 31:
			effectFromCards = "Fully heals player's HP";
			Player2.setHealthCount(BASE_HP);
			break;

		// Strength
		case :
			switch(indexMinor) {
			
			} break;
		
		case 32:
			effectFromCards = "Delivers HP of 26";
			healthController(26, false);
			break;
		case 33:
			effectFromCards = "Deals wind damage of 26";
			Player1.healthController(26, true);
			break;
		case 34:
			effectFromCards = "Deals damage of 26";
			Player1.healthController(26, true);
			break;
		case 35:
			effectFromCards = "Deals electric damage of 26 with shocked";
			Player1.healthController(26, true);
			Player1.setShocked();
			break;

		// Hermit
		case :
			switch(indexMinor) {
			
			} break;
		
		case 36:
			effectFromCards = "Delivers HP of 50";
			healthController(50, false);
			break;

		case 37:
			effectFromCards = "Deals damage of 50";
			Player1.healthController(50, true);
			break;

		case 38:
			effectFromCards = "Deals electric damage of 50 with shocked";
			Player1.healthController(50, true);
			Player1.setShocked();
			break;

		case 39:
			effectFromCards = "Deals wind damage of 50";
			Player1.healthController(50, true);
			break;

		// Wheel Of Fortune
		case :
			switch(indexMinor) {
			
			} break;
		
		case 40:
			effectFromCards = "Delivers 1.5 times current HP";
			healthController((int)(Player2.getHealthCount() * 1.5), false);
			break;

		case 41:
			effectFromCards = "Deals 2 times current HP worth of damage";
			Player1.healthController((Player2.getHealthCount() * 2), true);
			break;
		case 42:
			effectFromCards = "Deals 1.5 times current HP worth of fire damage with burned";
			Player1.healthController((int)(Player2.getHealthCount() * 1.5), true);
			Player1.setBurned();
			break;
		case 43:
			effectFromCards = "Delivers 1.5 times enemy's current HP";
			healthController((int)(Player1.getHealthCount() * 1.5), false);
			break;

		// Justice
		case :
			switch(indexMinor) {
			
			} break;
		
		case 44:
			effectFromCards = "Delivers 1.5 times current HP";
			healthController((int)(Player2.getHealthCount() * 1.5), false);
			break;
		case 45:
			effectFromCards = "Deals 1.5 times current HP worth of damage";
			Player1.healthController((int)(Player2.getHealthCount() * 1.5), true);
			break;
		case 46:
			effectFromCards = "Deals 2 times current HP worth of psychic damage with stunned";
			Player1.healthController((Player2.getHealthCount() * 2), true);
			Player1.setStunned();
			break;
		case 47:
			effectFromCards = "Deals 2 times current HP worth of fire damage with burned";
			Player1.healthController((Player2.getHealthCount() * 2), true);
			Player1.setBurned();
			break;

		// Hanged Man
		case :
			switch(indexMinor) {
			
			} break;
		
		case 48:
			effectFromCards = "Delivers HP 2 times current HP";
			healthController((Player2.getHealthCount() * 2), false);
			break;

		case 49:
			effectFromCards = "Deals 1.5 times current HP worth of fire damage with burned";
			Player1.healthController((int)(Player2.getHealthCount() * 1.5), true);
			Player1.setBurned();
			break;

		case 50:
			effectFromCards = "Deals 1.5 times current HP worth of electric damage with shocked";
			Player1.healthController((int)(Player2.getHealthCount() * 1.5), true);
			Player1.setShocked();
			break;

		case 51:
			effectFromCards = "Deals 1.5 times current HP worth of psychic damage with stunned";
			Player1.healthController((int)(Player2.getHealthCount() * 1.5), true);
			Player1.setStunned();
			break;

		// Death
		case 13:
			switch(indexMinor) {
			case 1:
				effectFromCards = "Sets current health to 99";
				Player2.setHealthCount(99);
				break;
			case 2:
				effectFromCards = "Sets enemy's HP to 0.5 of your current HP";
				Player1.setHealthCount((int)(Player2.getHealthCount() * 0.5));
				break;
			case 3:
				effectFromCards = "Sets both player's HP to 1";
				Player1.setHealthCount(1);
				Player2.setHealthCount(1);
				break;
			case 4:
				effectFromCards = "Sets current HP to 0.5 of current HP";
				Player2.setHealthCount((int) (Player2.getHealthCount() * 0.5));
				break;
			} break;
		
		}
		
		System.out.println(effectFromCards);
	}

	public static void main(String[] args) {

		List<String> storage = cardInfoAndEffect();

		for (String client : storage) {
			System.out.println(client);
		}

	}

}
