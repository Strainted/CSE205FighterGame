import java.text.DecimalFormat;
public class Mage extends PlayerEntity {

DecimalFormat df = new DecimalFormat("#%");

private double mana;

public Mage(double health, String name, int stamina, int attack, double mana) {
	
	super(health, name, stamina, attack);
	
	health = this.health;
	entityName = name;
	stamina = this.stamina;
	attack = this.attack;
	this.mana = mana;
}



public void computeCombatPower() {
	combatPoints = (int) ((attack + health) * (1 + mana));
}

public String toString() {
	

	String myString = "\nMage Hero:\n" + "Hero name:\t\t" + entityName + "\n" + "Current Health:\t\t" + health + "\n" 
	+ "Stamina:\t\t" + stamina + "\n" + "Attack Damage:\t\t" + attack + "\n" + "Current Combat Points:\t" + super.getCombatPoints() + "\n" + "Mana:\t\t\t" + df.format(mana) + "\n";
			
	return myString;
}




}


//               Mage/100/Tolfdir/125/150/.25 			Fighter/150/Vilkas/90/130/Melee

	
	
	
	

