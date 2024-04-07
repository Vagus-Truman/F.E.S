import java.util.*;

public class Player2 {

    // CLASS FIELDS
    private static final int baseHealth = 100;
    public static int healthCountP2 = baseHealth;
    public static int cardCount = 5;
    public static int effectDuration = 3;
    public static boolean turnIsOver = false;
    public static boolean statusEffected = false;
    public static String inflictedStatus = "";

    private static final int MAJORMIN = 0;
    private static final int MAJORMAX = 13;
    private static final int MINORMIN = 1;
    private static final int MINORMAX = 4;
    private static int damageP2 = 0;

    // Getter for healthCount
    public static int getHealthCount() {
        return healthCountP2;
    }

    // Setter for healthCount
    public static void setHealthCount(int healthCount) {
        healthCountP2 = healthCount;
    }

    public static int getDamageP2() {
        return damageP2;
    }

    public static void setDamageP2(int damageP2) {
        Player2.damageP2 = damageP2;
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

        return cardInfoData;
    }

    public static void DamageDealt(double damageP1Case51) {
        healthCountP2 -= damageP1Case51;
    }

    // Method to deliver health to Player 2
    public static void HealthDelivered(int health) {
        healthCountP2 += health;
    }

    public static int cardMatchAndIndex(int majorArcana, int minorArcana) {
        String dataString = "(" + majorArcana + ", " + minorArcana + ")";
        int indexOfMatchingCondition = cardInfoAndEffect().indexOf(dataString);
        return indexOfMatchingCondition;
    }

    public Player2(int amountOfCards, int howMuchHP) {
        Player2.healthCountP2 = howMuchHP;

        if (Effect.isShocked) {
            // unable to move and takes 5 HP every turn for three turns
            statusEffected = true;
            inflictedStatus = "Shocked";

            for (int i = 0; i < effectDuration;) {
                if (Player2.turnIsOver) {
                    i++;
                }

                Player2.healthCountP2 -= 5;
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

                Player2.healthCountP2 -= 5;
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


                Player2.healthCountP2 -= 5;
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

    public static void indexAndAffectP2(int indexOfCombos) {
        int damageP2 = 0;
        double multiplier = 0.0;

        switch (indexOfCombos) {

            // Fool
            case 0:
                Player2.healthCountP2 = (int) (0.5 * Player2.baseHealth);
                break;
            case 1:
                Player1.healthCount -= (int) (0.5 * Player1.healthCount);
                break;
            case 2:
                damageP2 = Player2.healthCountP2;
                Player1.healthCount -= damageP2;
                break;
            case 3:
                damageP2 = (int) (0.5 * 100);
                Player1.healthCount -= damageP2;
                break;

            // Magician
            case 4:
                damageP2 = 20;
                Player1.healthCount -= damageP2;
                Player1.setStunned();
                break;
            case 5:
                damageP2 = 20;
                Player1.healthCount -= damageP2;
                Player1.setShocked();
                break;
            case 6:
                damageP2 = 20;
                Player1.healthCount -= damageP2;
                break;
            case 7:
                damageP2 = 20;
                Player1.healthCount -= damageP2;
                Player1.setBurned();
                break;

            // High Priestess
            case 8:
                int healingAmount = 10;
                Player2.healthCountP2 += healingAmount;
                break;
            case 9:
                damageP2 = 10;
                Player1.healthCount -= damageP2;
                break;
            case 10:
                damageP2 = 10;
                Player1.healthCount -= damageP2;
                Player1.setBurned();
                break;
            case 11:
                damageP2 = 10;
                Player1.healthCount -= damageP2;
                Player1.setStunned();
                break;

            // Empress
            case 12:
                int hpDelivered = 25;
                Player2.healthCountP2 += hpDelivered;
                break;
            case 13:
                damageP2 = 50;
                Player1.healthCount -= damageP2;
                break;

            case 14:
                damageP2 = 50;
                Player1.healthCount -= damageP2;
                Player1.setStunned();
                break;

            case 15:
                Player1.healthCount = Player2.healthCountP2;
                break;

            // Emperor
            case 16:
                int hpDeliveredCup = 25;
                Player2.healthCountP2 += hpDeliveredCup;
                break;
            case 17:
                damageP2 = 25;
                Player1.healthCount -= damageP2;
                break;

            case 18:
                damageP2 = 25;
                Player1.healthCount -= damageP2;
                Player2.setBurned();
                break;

            case 19:
                Player2.healthCountP2 += Player2.healthCountP2;
                break;

            // Heirophant
            case 20:
                multiplier = 1.5;
                int newHealth = (int) (Player2.healthCountP2 * multiplier);
                Player2.healthCountP2 = newHealth;
                break;
            case 21:
                multiplier = 1.5;
                damageP2 = (int) (Player2.healthCountP2 * multiplier);
                Player1.healthCount -= damageP2;
                break;

            case 22:
                multiplier = 1.5;
                damageP2 = (int) (Player2.healthCountP2 * multiplier);
                Player1.healthCount -= damageP2;
                Player1.setBurned();
                break;

            case 23:
                multiplier = 1.5;
                damageP2 = (int) (Player2.healthCountP2 * multiplier);
                Player1.healthCount -= damageP2;
                Player1.setShocked();
                break;

            // Lovers
            case 24:
                int healingAmountCup = 26;
                Player2.healthCountP2 += healingAmountCup;
                break;
            case 25:
                damageP2 = 39;
                Player1.healthCount -= damageP2;
                break;

            case 26:
                damageP2 = 39;
                Player1.healthCount -= damageP2;
                Player1.setStunned();
                break;

            case 27:
                Player2.healthCountP2 = baseHealth;
                break;

            // Chariot
            case 28:
                int healingAmountCups = 7;
                Player2.healthCountP2 += healingAmountCups;
                break;
            case 29:
                damageP2 = 7;
                Player1.healthCount -= damageP2;
                break;

            case 30:
                damageP2 = 39;
                Player1.healthCount -= damageP2;
                Player1.setStunned();
                break;

            case 31:
                Player2.healthCountP2 = baseHealth;
                break;

            // Strength
            case 32:
                int healingAmountStr = 26;
                Player2.healthCountP2 += healingAmountStr;
                break;
            case 33:
                damageP2 = 26;
                Player1.healthCount -= damageP2;
                break;
            case 34:
                damageP2 = 26;
                Player1.healthCount -= damageP2;
                break;
            case 35:
                damageP2 = 26;
                Player1.healthCount -= damageP2;
                Player1.setShocked();
                break;

            // Hermit
            case 36:
                int healingHermit = 50;
                Player2.healthCountP2 += healingHermit;
                break;

            case 37:
                damageP2 = 50;
                Player1.healthCount -= damageP2;
                break;

            case 38:
                damageP2 = 50;
                Player1.healthCount -= damageP2;
                Player1.setShocked();
                break;

            case 39:
                damageP2 = 50;
                Player1.healthCount -= damageP2;
                break;

            // Wheel Of Fortune
            case 40:
                multiplier = 1.5;
                damageP2 = (int) (Player2.healthCountP2 * multiplier);
                Player1.healthCount -= damageP2;
                break;
            case 41:
                multiplier = 2.0;
                damageP2 = (int) (Player2.healthCountP2 * multiplier);
                Player1.healthCount -= damageP2;
                break;
            case 42:
                multiplier = 1.5;
                damageP2 = (int) (Player2.healthCountP2 * multiplier);
                Player1.healthCount -= damageP2;
                Player1.setBurned();
                break;
            case 43:
                multiplier = 1.5;
                int healing = (int) (Player1.healthCount * multiplier);
                Player2.healthCountP2 += healing;
                break;

            // Justice
            case 44:
                double healingAmountJustice = Player2.healthCountP2 * 1.5; // Calculate 1.5 times current HP
                Player2.healthCountP2 += healingAmountJustice;
                break;
            case 45:
                damageP2 = (int) (Player2.healthCountP2 * 1.5); // Calculate 1.5 times current HP worth of damageP2
                Player1.healthCount -= damageP2;
                break;
            case 46:
                damageP2 = Player2.healthCountP2 * 2; // Calculate 2 times current HP worth of damageP2
                Player1.healthCount -= damageP2;
                Player2.setStunned();
                break;
            case 47:
                damageP2 = Player2.healthCountP2 * 2; // Calculate 2 times current HP worth of damageP2
                Player1.healthCount -= damageP2;
                Player2.setBurned();
                break;

            // Hanged Man
            case 48:
                double healingAmountHangM = Player2.healthCountP2 * 2; // Calculate 2 times current HP
                Player2.healthCountP2 += healingAmountHangM; // Deliver healing
                break;

            case 49:
                damageP2 = (int) (Player2.healthCountP2 * 1.5); // Calculate 1.5 times current HP worth of damageP2
                Player1.healthCount -= damageP2;
                Player2.setBurned();
                break;

            case 50:
                damageP2 = (int) (Player2.healthCountP2 * 1.5); // Calculate 1.5 times current HP worth of damageP2
                Player1.healthCount -= damageP2;
                Player2.setShocked();
                break;

            case 51:
                damageP2 = (int) (Player1.healthCount * 1.5); // Calculate 1.5 times current HP worth of damageP2
                Player2.setStunned();
                break;

            // Death
            case 52:
                int newHealthDeath = 99; // Set opponent's current health to 99
                Player2.healthCountP2 = newHealthDeath;
                break;

            case 53:
                int newOpponentHealth = (int) (Player2.healthCountP2 * 0.5); // Calculate half of player's current HP
                Player1.healthCount = newOpponentHealth;
                break;

            case 54:
                Player1.healthCount = 1;
                Player2.healthCountP2 = 1;
                break;

            case 55:
                int newHealthD = (int) (Player2.healthCountP2 * 0.5); // Calculate half of player's current HP
                Player1.healthCount = newHealthD;
                break;

        }
    }

    public String getPlayerInfo() {
        // Gather player information and return as a string
        String playerInfo = "Player 2 Information: Health Count - " + healthCountP2 + ", Inflicted Status - " + inflictedStatus;
        return playerInfo;
    }

    public static void main(String[] args) {

        List<String> storage = cardInfoAndEffect();

        for (String client : storage) {
            System.out.println(client);
        }

    }

}
