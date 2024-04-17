
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player1 {

	// CLASS FIELDS
	private static final int BASE_HP = 100;
	private static int healthCount = BASE_HP;

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

	public Player1() {
		if (Effect.isShocked) {
			// unable to move and takes 5 HP every turn for three turns
			statusEffected = true;
			inflictedStatus = "Shocked";

			for (int i = 0; i < effectDuration;) {
				if (Player1.turnIsOver) {
					i++;
				}

				Player1.healthCount -= 5;
				statusEffected = false;
			}

		}
		if (Effect.isBurning) {
			// every turn takes 5 HP for three turns
			statusEffected = true;
			inflictedStatus = "Burned";

			for (int i = 0; i < effectDuration;) {
				if (Player1.turnIsOver) {
					i++;
				}

				Player1.healthCount -= 5;
				statusEffected = false;
			}
		}
		if (Effect.isStunned) {
			// unable to move for three turns
			statusEffected = true;
			inflictedStatus = "Stunned";

			for (int i = 0; i < effectDuration;) {
				if (Player1.turnIsOver) {
					i++;
				}

				Player1.healthCount -= 5;
				statusEffected = false;
			}
		}
	}

	// health control
	public static void healthController(int healOrDamage, boolean hurtIfTrue) {
		if (hurtIfTrue) {
			Player1.setHealthCount(Player1.getHealthCount() - healOrDamage);
		} else {
			Player1.setHealthCount(Player1.getHealthCount() + healOrDamage);
		}
	}
	
	public static void healthRegulator (int healthCount) {
		if (healthCount <= 0) {
			Player1.setHealthCount(0);
		} else if (healthCount >= 100) {
			Player1.setHealthCount(100);
		}
	}

	// considering effects
	public static int getHealthCount() {
		return healthCount;
	}

	public static void setHealthCount(int healthCount) {
		Player1.healthCount = healthCount;
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

		// Fool
		case 0:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Player is refilled to 0.5 of total HP";
				healthController((int) (0.5 * Player1.BASE_HP), false);
				break;
			case 2:
				effectFromCards = "Opponent has 0.5 of current HP removed";
				Player2.healthController((int) (0.5 * Player2.getHealthCount()), true);
				break;
			case 3:
				effectFromCards = "Opponent has same amount of HP as player removed";
				Player2.healthController(Player1.getHealthCount(), true);
				break;
			case 4:
				effectFromCards = "Opponent has 0.5 of total HP removed";
				Player2.healthController(50, true);
				break;
			} break;

		// Magician
		case 1:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Deals psychic damage of 10 with stun";
				Player2.healthController(10, true);
				Player2.setStunned();
				break;
			case 2:
				effectFromCards = "Deals lightning damage of 10 with shocked";
			Player2.healthController(10, true);
			Player2.setShocked();
			break;
			case 3:
				effectFromCards = "Deals wind damage of 10";
			Player2.healthController(10, true);
			break;
			case 4:
				effectFromCards = "Deals fire damage of 10 with burned";
			Player2.healthController(10, true);
			Player2.setBurned();
			break;
			} break;
		

		// High Priestess
		case 2:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Deals fire damage of 7 with burned";
			Player2.healthController(7, true);
			Player2.setBurned();
			break;
			case 2:
				effectFromCards = "Deals psychic damage of 7 with stunned";
			Player2.healthController(7, true);
			Player2.setStunned();
			break;
			case 3:
				effectFromCards = "Deals fire damage of 10 with burned";
				Player2.healthController(10, true);
				Player2.setBurned();
				break;
			case 4:
				effectFromCards = "Deals psychic damage of 10 with stunned";
				Player2.healthController(10, true);
				Player2.setStunned();
				break;
			} break;

		// Empress
		case 3:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP of 25";
				healthController(25, false);
				break;
			case 2:
				effectFromCards = "Deals damage of 15";
				Player2.healthController(15, true);
				break;
			case 3:
				effectFromCards = "Deals psychic damage of 30 with stunned";
				Player2.healthController(30, true);
				Player2.setStunned();
				break;
			case 4:
				effectFromCards = "Opponent has same amount of HP as player";
				Player2.setHealthCount(Player1.getHealthCount());
				break;
			} break;
		

		// Emperor
		case 4:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP of 25";
				healthController(25, false);
				break;
			case 2:
				effectFromCards = "Deals base damage of 15";
				Player2.healthController(15, true);
				break;
			case 3:
				effectFromCards = "Deals base fire damage of 15 with burned";
				Player2.healthController(15, true);
				Player2.setBurned();
				break;
			case 4:
				effectFromCards = "Delivers HP equal to current HP";
				healthController(Player1.getHealthCount(), false);
				break;
			} break;

		// Heirophant
		case 5:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP of 1.5 times current HP";
				healthController((int) (Player1.getHealthCount() * 1.5), false);
				break;
			case 2:
				effectFromCards = "Deals damage of 0.7 times current HP";
				Player2.healthController((int) (Player1.getHealthCount() * 0.7), true);
				break;
			case 3:
				effectFromCards = "Deals fire damage of 0.7 times current HP with burned";
				Player2.healthController((int) (Player1.getHealthCount() * 0.7), true);
				Player2.setBurned();
				break;
			case 4:
				effectFromCards = "Deals electric damage of 0.7 times current HP with shocked";
				Player2.healthController((int) (Player1.getHealthCount() *0.7), true);
				Player2.setShocked();
				break;
			} break;

		// Lovers
		case 6:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP of 26";
				healthController(26, false);
				break;
			case 2:
				effectFromCards = "Deals damage of 19";
				Player2.healthController(19, true);
				break;
			case 3:
				effectFromCards = "Deals psychic damage of 19 with stunned";
				Player2.healthController(19, true);
				Player2.setStunned();
				break;
			case 4:
				effectFromCards = "Fully heals player's HP";
				Player1.setHealthCount(BASE_HP);
				break;
			} break;

		// Chariot
		case 7:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP of 7";
				healthController(7, false);
				break;
			case 2:
				effectFromCards = "Deals damage of 7";
				Player2.healthController(7, true);
				break;
			case 3:
				effectFromCards = "Deals psychic damage of 19 with stunned";
				Player2.healthController(19, true);
				Player2.setStunned();
				break;
			case 4:
				effectFromCards = "Fully heals player's HP";
				Player1.setHealthCount(BASE_HP);
				break;
			} break;

		// Strength
		case 8:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP of 26";
				healthController(26, false);
				break;
			case 2:
				effectFromCards = "Deals wind damage of 16";
				Player2.healthController(16, true);
				break;
			case 3:
				effectFromCards = "Deals damage of 16";
				Player2.healthController(16, true);
				break;
			case 4:
				effectFromCards = "Deals electric damage of 16 with shocked";
				Player2.healthController(16, true);
				Player2.setShocked();
				break;
			} break;

		// Hermit
		case 9:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP of 50";
				healthController(50, false);
				break;
			case 2:
				effectFromCards = "Deals damage of 25";
				Player2.healthController(25, true);
				break;
			case 3:
				effectFromCards = "Deals electric damage of 25 with shocked";
				Player2.healthController(25, true);
				Player2.setShocked();
				break;
			case 4:
				effectFromCards = "Deals wind damage of 25";
				Player2.healthController(25, true);
				break;
			} break;
			
		// Wheel Of Fortune
		case 10:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers 1.5 times current HP";
				healthController((int)(Player1.getHealthCount() * 1.5), false);
				break;
			case 2:
				effectFromCards = "Deals 1.2 times current HP worth of damage";
				Player2.healthController((int)(Player1.getHealthCount() * 1.2), true);
				break;
			case 3:
				effectFromCards = "Deals 1.3 times current HP worth of fire damage with burned";
				Player2.healthController((int)(Player1.getHealthCount() * 1.3), true);
				Player2.setBurned();
				break;
			case 4:
				effectFromCards = "Delivers 1.5 times enemy's current HP";
				healthController((int)(Player2.getHealthCount() * 1.5), false);
				break;
			} break;

		// Justice
		case 11:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers 1.5 times current HP";
				healthController((int)(Player1.getHealthCount() * 1.5), false);
				break;
			case 2:
				effectFromCards = "Deals 1.3 times current HP worth of damage";
				Player2.healthController((int)(Player1.getHealthCount() * 1.3), true);
				break;
			case 3:
				effectFromCards = "Deals 1.2 times current HP worth of psychic damage with stunned";
				Player2.healthController((int)(Player1.getHealthCount() * 1.2), true);
				break;
			case 4:
				effectFromCards = "Deals 1.2 times current HP worth of fire damage with burned";
				Player2.healthController((int)(Player1.getHealthCount() * 1.2), true);
				Player2.setBurned();
				break;
			} break;

		// Hanged Man
		case 12:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Delivers HP 2 times current HP";
				healthController((Player1.getHealthCount() * 2), false);
				break;

			case 2:
				effectFromCards = "Deals 1.3 times current HP worth of fire damage with burned";
				Player2.healthController((int)(Player1.getHealthCount() * 1.3), true);
				Player2.setBurned();
				break;

			case 3:
				effectFromCards = "Deals 1.3 times current HP worth of electric damage with shocked";
				Player2.healthController((int)(Player1.getHealthCount() * 1.3), true);
				Player2.setShocked();
				break;

			case 4:
				effectFromCards = "Deals 1.3 times current HP worth of psychic damage with stunned";
				Player2.healthController((int)(Player1.getHealthCount() * 1.3), true);
				Player2.setStunned();
				break;
			} break;
			
		// Death
		case 13:
			switch (indexMinor) {
			case 1:
				effectFromCards = "Sets current health to 99";
				Player1.setHealthCount(99);
				break;
			case 2:
				effectFromCards = "Sets enemy's HP to 0.5 of your current HP";
				Player2.setHealthCount((int)(Player1.getHealthCount() * 0.5));
				break;
			case 3:
				effectFromCards = "Sets both player's HP to 1";
				Player1.setHealthCount(1);
				Player2.setHealthCount(1);
				break;
			case 4:
				effectFromCards = "Sets current HP to 0.5 of current HP";
				Player1.setHealthCount((int) (Player1.getHealthCount() * 0.5));
				break;
			} break;
		}
		
		System.out.println("Player 1:" + effectFromCards);
	}

	public static void main(String[] args) {

		List<String> storage = cardInfoAndEffect();

		for (String client : storage) {
			System.out.println(client);
		}

	}

}
