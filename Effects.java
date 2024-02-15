// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the agreed upon effects are as listed: fire, electric, psychic, and wind

public class Effect {
    private double multiplier = 1.0;
    private double nerf = 0.5;
    private boolean stunned = false;
    private boolean burning = false;
    private boolean shocked = false;

    public Effect() {
	    //deafauly constructosrs
    }
    public Effect(double multiplier, double nerf, boolean stunned, boolean burning, boolean shocked) {
        this.multiplier = multiplier;
        this.nerf = nerf;
        this.stunned = stunned;
        this.burning = burning;
        this.shocked = shocked;
    }

    // Getters and setters
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

    public boolean isStunned() {
        return stunned;
    }

    public void setStunned(boolean stunned) {
        this.stunned = stunned;
    }

    public boolean isBurning() {
        return burning;
    }

    public void setBurning(boolean burning) {
        this.burning = burning;
    }

    public boolean isShocked() {
        return shocked;
    }

    public void setShocked(boolean shocked) {
        this.shocked = shocked;
    }

    // Method to reset effects
    public void resetEffects() {
        this.multiplier = 1.0;
        this.nerf = 0.5;
        this.stunned = false;
        this.burning = false;
        this.shocked = false;
    }
}
