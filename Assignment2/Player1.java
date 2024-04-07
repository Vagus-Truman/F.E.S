
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
import java.util.*;

public class Player1 {

	// CLASS FIELDS
	private static final int baseHealth = 100;
	public static int healthCount = baseHealth;
	public static int cardCount = 5;
	public static int effectDuration = 3;

	private static final int MAJORMIN = 0;
	private static final int MAJORMAX = 13;
	private static final int MINORMIN = 1;
	private static final int MINORMAX = 4;

	public static boolean turnIsOver = false;
	public static boolean statusEffected = false;
	public static String inflictedStatus = "";
	// Getter and setter methods for healthCount
    public static int getHealthCount() {
        return healthCount;
    }

    public static void setHealthCount(int healthCount) {
        healthCount = healthCount;
    }
 
    
	public static List<String> cardInfoAndEffect() {
		List<String> cardInfoData = new ArrayList<String>();
		
		for (int major = MAJORMIN; major <= MAJORMAX; major++) { // major arcana selection
			for (int minor = MINORMIN; minor <= MINORMAX; minor++) { // minor arcana selection
				
				// assuming all goes well, the format of the card should be {mjArcn, mrArcn}
				String dataString = "(" + major + ", " + minor + ")";
				cardInfoData.add(dataString);

			}
		}

		//System.out.println(cardInfoData);
		return cardInfoData;
	}
	 public static void DamageDealt(int damage) {
	        healthCount -= damage;
	    }

	    // Method to deliver health to Player 1
	    public static void HealthDelivered(double d) {
	        healthCount += d;
	    }


	public static int cardMatchAndIndex(int majorArcana, int minorArcana) {
		String dataString = "(" + majorArcana + ", " + minorArcana + ")";
		//System.out.println(dataString);
		
		int indexOfMatchingCondition = cardInfoAndEffect().indexOf(dataString);
		return indexOfMatchingCondition;
	}

	public Player1(int amountOfCards, int howMuchHP) {
		Player1.healthCount = howMuchHP;
		
		if (Effect.isShocked) {
			// unable to move and takes 5 HP every turn for three turns
			statusEffected = true;
			inflictedStatus = "Shocked";
			
			for (int i = 0; i < effectDuration;) {
				if(Player1.turnIsOver) {
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
				if(Player1.turnIsOver) {
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
				if(Player1.turnIsOver) {
					i++;
				}
				
				
				Player1.healthCount -= 5;
				statusEffected = false;
			}
		}
	}
	
	// considering effects
	public static void setStunned() {
		Effect.isStunned = true;
	}
	
	public static void setShocked() {
		Effect.isShocked = true;
	}
	
	public static void setBurned() {
		Effect.isBurning = true;
	}
		
	public static void indexAndAffect(int indexOfCombos) {
	    switch (indexOfCombos) {
	        case 0:
	            HealthDelivered((int) (0.5 * baseHealth));
	            break;
	        case 1:
	            Player2.DamageDealt((int) (0.5 * Player2.getHealthCount()));
	            break;
	        case 2:
	            int damageP1 = Player1.getHealthCount();
	            Player2.DamageDealt(damageP1);
	            break;
	        case 3:
	            int damageP1Case3 = (int) (0.5 * 100);
	            Player2.DamageDealt(damageP1Case3);
	            break;
	        case 4:
	            int damageP1Case4 = 20;
	            Player2.DamageDealt(damageP1Case4);
	            Player2.setStunned();
	            break;
	        case 5:
	            int damageP1Case5 = 20;
	            Player2.DamageDealt(damageP1Case5);
	            Player2.setShocked();
	            break;
	        case 6:
	            int damageP1Case6 = 20;
	            Player2.DamageDealt(damageP1Case6);
	            break;
	        case 7:
	            int damageP1Case7 = 20;
	            Player2.DamageDealt(damageP1Case7);
	            Player2.setBurned();
	            break;
	        case 8:
	            int healingAmountCase8 = 10;
	            Player1.HealthDelivered(healingAmountCase8);
	            break;
	        case 9:
	            int damageP1Case9 = 10;
	            Player2.DamageDealt(damageP1Case9);
	            break;
	        case 10:
	            int damageP1Case10 = 10;
	            Player2.DamageDealt(damageP1Case10);
	            Player2.setBurned();
	            break;
	        case 11:
	            int damageP1Case11 = 10;
	            Player2.DamageDealt(damageP1Case11);
	            Player2.setStunned();
	            break;
	        case 12:
	            int hpDeliveredCase12 = 25;
	            Player1.HealthDelivered(hpDeliveredCase12);
	            break;
	        case 13:
	            int damageP1Case13 = 50;
	            Player2.DamageDealt(damageP1Case13);
	            break;
	        case 14:
	            int damageP1Case14 = 60;
	            Player2.DamageDealt(damageP1Case14);
	            Player2.setStunned();
	            break;
	        case 15:
	            Player2.setHealthCount(Player1.getHealthCount());
	            break;
	        case 16:
	            int hpDeliveredCupCase16 = 25;
	            Player1.HealthDelivered(hpDeliveredCupCase16);
	            break;
	        case 17:
	            int damageP1Case17 = 25;
	            Player2.DamageDealt(damageP1Case17);
	            break;
	        case 18:
	            int damageP1Case18 = 25;
	            Player2.DamageDealt(damageP1Case18);
	            break;
	        case 19:
	            Player1.HealthDelivered(Player1.getHealthCount());
	            break;
	        case 20:
	            double multiplierCase20 = 1.5;
	            int newHealthCase20 = (int) (Player1.getHealthCount() * multiplierCase20);
	            Player1.HealthDelivered(newHealthCase20 - Player1.getHealthCount());
	            break;
	        case 21:
	            double multiplierCase21 = 1.5;
	            int damageP1Case21 = (int) (Player1.getHealthCount() * multiplierCase21);
	            Player2.DamageDealt(damageP1Case21);
	            break;
	        case 22:
	            double multiplierCase22 = 1.5;
	            int damageP1Case22 = (int) (Player1.getHealthCount() * multiplierCase22);
	            Player2.DamageDealt(damageP1Case22);
	            Player2.setBurned();
	            break;
	        case 23:
	            double multiplierCase23 = 1.5;
	            int damageP1Case23 = (int) (Player1.getHealthCount() * multiplierCase23);
	            Player2.DamageDealt(damageP1Case23);
	            Player2.setShocked();
	            break;
	        case 24:
	            int healingAmountCupCase24 = 26;
	            Player1.HealthDelivered(healingAmountCupCase24);
	            break;
	        case 25:
	            int damageP1Case25 = 39;
	            Player2.DamageDealt(damageP1Case25);
	            break;
	        case 26:
	            int damageP1Case26 = 39;
	            Player2.DamageDealt(damageP1Case26);
	            Player2.setStunned();
	            break;
	        case 27:
	            Player1.setHealthCount(baseHealth);
	            break;
	        case 28:
	            int healingAmountCupsCase28 = 7;
	            Player2.HealthDelivered(healingAmountCupsCase28);
	            break;
	        case 29:
	            int damageP1Case29 = 7;
	            Player2.DamageDealt(damageP1Case29);
	            break;
	        case 30:
	            int damageP1Case30 = 39;
	            Player2.DamageDealt(damageP1Case30);
	            Player2.setStunned();
	            break;
	        case 31:
	            Player1.setHealthCount(baseHealth);
	            break;
	        case 32:
	            int healingAmountStrCase32 = 26;
	            Player1.HealthDelivered(healingAmountStrCase32);
	            break;
	        case 33:
	            int damageP1Case33 = 26;
	            Player2.DamageDealt(damageP1Case33);
	            break;
	        case 34:
	            int damageP1Case34 = 26;
	            Player2.DamageDealt(damageP1Case34);
	            break;
	        case 35:
	            int damageP1Case35 = 26;
	            Player2.DamageDealt(damageP1Case35);
	            Player2.setShocked();
	            break;
	        case 36:
	            int healingHermitCase36 = 50;
	            Player1.HealthDelivered(healingHermitCase36);
	            break;
	        case 37:
	            int damageP1Case37 = 50;
	            Player2.DamageDealt(damageP1Case37);
	            break;
	        case 38:
	            int damageP1Case38 = 50;
	            Player2.DamageDealt(damageP1Case38);
	            break;
	        case 39:
	            int damageP1Case39 = 50;
	            Player2.DamageDealt(damageP1Case39);
	            break;
	        case 40:
	            double multiplierCase40 = 1.5;
	            int healthAddCase40 = (int) (Player1.getHealthCount() * multiplierCase40);
	            Player1.HealthDelivered(healthAddCase40 - Player1.getHealthCount());
	            break;
	        case 41:
	            double multiplierCase41 = 2.0;
	            int damageP1Case41 = (int) (Player1.getHealthCount() * multiplierCase41);
	            Player2.DamageDealt(damageP1Case41);
	            break;
	        case 42:
	            double multiplierCase42 = 1.5;
	            int damageP1Case42 = (int) (Player1.getHealthCount() * multiplierCase42);
	            Player2.DamageDealt(damageP1Case42);
	            Player2.setBurned();
	            break;
	        case 43:
	            double multiplierCase43 = 1.5;
	            int healingCase43 = (int) (Player2.getHealthCount() * multiplierCase43);
	            Player1.HealthDelivered(healingCase43 - Player1.getHealthCount());
	            break;
	        case 44:
	            double healingAmoutJustice = Player1.getHealthCount() * 1.5; // Calculate 1.5 times current HP
	            Player1.HealthDelivered(healingAmoutJustice - Player1.getHealthCount());
	            break;
	        case 45:
	            double damageP1Case45 = Player1.getHealthCount() * 1.5; // Calculate 1.5 times current HP worth of damage
	            Player2.DamageDealt(damageP1Case45);
	            break;
	        case 46:
	            double damageP1Case46 = Player1.getHealthCount() * 2; // Calculate 2 times current HP worth of damage
	            Player2.DamageDealt(damageP1Case46);
	            Player2.setStunned();
	            break;
	        case 47:
	            double damageP1Case47 = Player1.getHealthCount() * 2; // Calculate 2 times current HP worth of damage
	            Player2.DamageDealt(damageP1Case47);
	            Player2.setBurned();
	            break;
	        case 48:
	            double healingAmountHangMCase48 = Player1.getHealthCount() * 2; // Calculate 2 times current HP
	            Player1.HealthDelivered(healingAmountHangMCase48 - Player1.getHealthCount());
	            break;
	        case 49:
	            double damageP1Case49 = Player2.getHealthCount() * 1.5; // Calculate 1.5 times current HP worth of damage
	            Player2.DamageDealt(damageP1Case49);
	            Player2.setBurned();
	            break;
	        case 50:
	            double damageP1Case50 = Player2.getHealthCount() * 1.5; // Calculate 1.5 times current HP worth of damage
	            Player2.DamageDealt(damageP1Case50);
	            Player2.setShocked();
	            break;
	        case 51:
	            double damageP1Case51 = Player1.getHealthCount() * 1.5; // Calculate 1.5 times current HP worth of damage
	            Player2.DamageDealt(damageP1Case51);
	            Player2.setStunned();
	            break;
	        case 52:
	            int newHealthDeath = 99; // Set opponent's current health to 99
	            Player1.setHealthCount(newHealthDeath);
	            break;
	        case 53:
	            int newOpponentHealth = (int) (Player1.getHealthCount() * 0.5); // Calculate half of player's current HP
	            Player2.setHealthCount(newOpponentHealth);
	            break;
	        case 54:
	            Player1.setHealthCount(1);
	            Player2.setHealthCount(1);
	            break;
	        case 55:
	            int newHealthD = (int) (Player1.getHealthCount() * 0.5); // Calculate half of player's current HP
	            Player2.setHealthCount(newHealthD);
	            break;
	    }
	}

	public static void main(String[] args) {

		List<String> storage = cardInfoAndEffect();

		for (String client : storage) {
			System.out.println(client);
		}

	}

}
