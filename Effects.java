// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the agreed upon effects are as listed: fire, electric, psychic, and wind
import java.util.List;
public class Effect {
    private double multiplier = 1.0;
    private double nerf = 0.5;
    private boolean stunned = false;
    private boolean burning = false;
    private boolean shocked = false;
    private double fireDamage;
    private double electricDamage;
    private double psychicDamage;
    private double windDamage;

    public Effect() {
	    //deafauly constructosrs
    }
   
    public Effect(double fireDamage, double electricDamage, double psychicDamage, double windDamage) {
        this.fireDamage = fireDamage;
        this.electricDamage = electricDamage;
        this.psychicDamage = psychicDamage;
        this.windDamage = windDamage;
        //no effects applied in intial turn
        this.isBurning = false;
        this.isShocked = false;
        this.isStunned = false;
    }

    // Getters and setters for damage fields omitted for brevity

    // Getters and setters for effect fields
    public boolean isBurning() {
        return isBurning;
    }

    public void setBurning(boolean burning) {
        isBurning = burning;
    }

    public boolean isShocked() {
        return isShocked;
    }

    public void setShocked(boolean shocked) {
        isShocked = shocked;
    }

    public boolean isStunned() {
        return isStunned;
    }

    public void setStunned(boolean stunned) {
        isStunned = stunned;
    }
public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getNerf() {
        return nerf;
    }

    public void setNerf(double nerf) {
        this.nerf = nerf;
    }
    // Method to reset damage values and effects
    public void reset() {
        this.fireDamage = 0;
        this.electricDamage = 0;
        this.psychicDamage = 0;
        this.windDamage = 0;
        this.isBurning = false;
        this.isShocked = false;
        this.isStunned = false;
    }

public class TarotEffect {
    public void applyFoolEffect(int diceValue, Player player) {
        if (diceValue <= 6) {
            // If dice is 6 or below, refill player's HP to 50% of total HP
            player.refillHP(player.getTotalHP() * 0.5);
        } else if (diceValue >= 8) {
            // If dice is 8 or above, refill player's HP to 100% of total HP
            player.refillHP(player.getTotalHP());
        }
        // If dice is 7, nothing happens
    }
}
	public class swordEffects{
    public void applyFoolEffect(int diceValue, Player player) {
    if (diceValue <= 6) {
        opponent.healthCount -= currentHp / 2; // Removes 50% of current HP
    } else if (diceValue >= 8) {
        opponent.healthCount -= totalHp / 2; // Removes 50% of total HP
    }
}
}

public class CoinEffects {

public static void drawCard(Player player, List<Card> deck) {
    if (deck.isEmpty()) {
        System.out.println("The deck is empty.");
        return;
    }

    if (player.getCardCount() >= Player.handLimit) {
        System.out.println("Cannot draw more cards, hand limit reached.");
        return;
    }

    Card card = deck.remove(0);
    player.addCardToHand(card);
    System.out.println("Player drew a card from the deck: " + card);
}

private static void drawCardsUntilHandLimit(Player player, List<Card> deck) {
    while (player.getCardCount() < Player.handLimit && !deck.isEmpty()) {
        drawCard(player, deck);
    }
}
}
public void applyWandEffect(Player player, Player opponent) {
    int diceValue = rollDice(); // Roll the dice to get a random value
    
    // Determine the effect based on the dice value
    if (diceValue <= 6) {
        // If dice is 6 or below, player deals damage that takes 50% of enemy's current health
        int damage = opponent.healthCount / 2;
        opponent.healthCount -= damage;
        System.out.println("Player deals " + damage + " damage to the opponent.");
    } else if (diceValue == 7) {
        // If dice is 7, nothing happens
        System.out.println("Nothing happens.");
    } else {
        // If dice is 8 and above, player deals 50 points of damage
        int damage = 50;
        opponent.healthCount -= damage;
        System.out.println("Player deals " + damage + " damage to the opponent.");
    }
}

}
