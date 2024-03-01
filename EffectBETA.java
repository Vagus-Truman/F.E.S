
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the agreed upon effects are as listed: fire, electric, psychic, and wind
import java.util.List;

public class Effect {
	static boolean isStunned = false;
	static boolean isBurning = false;
	static boolean isShocked = false;
	private double fireDamage;
	private double electricDamage;
	
	public Effect() {
		// deafauly constructosrs
	}

	public Effect(double fireDamage, double electricDamage) {
		this.setFireDamage(fireDamage);
		this.setElectricDamage(electricDamage);
		// no effects applied in intial turn
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

	public double getFireDamage() {
		return fireDamage;
	}

	public void setFireDamage(double fireDamage) {
		this.fireDamage = fireDamage;
	}

	public boolean isShocked() {
		return isShocked;
	}

	public void setShocked(boolean shocked) {
		isShocked = shocked;
	}

	public double getElectricDamage() {
		return electricDamage;
	}

	public void setElectricDamage(double electricDamage) {
		this.electricDamage = electricDamage;
	}

	public boolean isStunned() {
		return isStunned;
	}

	public void setStunned(boolean stunned) {
		isStunned = stunned;
	}

	// Method to reset damage values and effects
	public void reset() {
		this.setFireDamage(0);
		this.setElectricDamage(0);
		this.isBurning = false;
		this.isShocked = false;
		this.isStunned = false;
	}
}
	
		
