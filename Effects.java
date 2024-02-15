// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the agreed upon effects are as listed: fire, electric, psychic, and wind

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
}
