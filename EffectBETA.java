
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the agreed upon effects are as listed: fire, electric, psychic, and wind
import java.util.List;

public class EffectBETA {
	private boolean isStunned = false;
	private boolean isBurning = false;
	private boolean isShocked = false;
	private double fireDamage;
	private double electricDamage;
	private double psychicDamage;
	private double windDamage;
	public EffectBETA() {
		// deafauly constructosrs
	}

	public EffectBETA(double fireDamage, double electricDamage, double psychicDamage, double windDamage) {
		this.fireDamage = fireDamage;
		this.electricDamage = electricDamage;
		this.psychicDamage = psychicDamage;
		this.windDamage= windDamage;
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

	// Method to reset damage values and effects
	public void reset() {
		this.fireDamage = 0;
		this.electricDamage = 0;
		this.psychicDamage = 0;
		this.windDamage= 0;
		this.isBurning = false;
		this.isShocked = false;
		this.isStunned = false;
	}

	public void psychicDamage(int damage) {
		// TODO Auto-generated method stub
		
	}

	public void setElectricDamage(double lightningDamage) {
		// TODO Auto-generated method stub
		
	}

	public void windDamage(int damage) {
		// TODO Auto-generated method stub
		
	}

	public void fireDamageHP(double fireDamageAmount) {
		// TODO Auto-generated method stub
		
	}

	public void fireDamageCoin(int damage) {
		// TODO Auto-generated method stub
		this.fireDamage= 20;
	}

	public void setFireDamage(int damagefire) {
		// TODO Auto-generated method stub
	 damagefire= 20;
	}
}
	
		
