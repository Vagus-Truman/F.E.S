
// it should be stated now that the board game will be based on a simple card combat system using dice to determine results
// the agreed upon effects are as listed: fire, electric, psychic, and wind
import java.util.List;

@SuppressWarnings("unused")
public class Effect {
	public static boolean isStunned = false;
	public static boolean isBurning = false;
	public static boolean isShocked = false;
	
	public Effect() {
		// deafauly constructosrs
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
	@SuppressWarnings("static-access")
	public void reset() {
		this.isBurning = false;
		this.isShocked = false;
		this.isStunned = false;
	}
}
	
		
