// Assignment #: 5
//         Name: Luke Engel
//    StudentID: 1221908207
//      Lecture: MWF 11:15-12:05
//  Description: it establishes a fighter object. it decides weather it is ranged or not ranged. it has a compute power method. Lastly it takes everything and puts it into a string.
import java.text.DecimalFormat;

public class Fighter extends PlayerEntity {

	private double armor;
	private int maxAttack;
	private boolean isRanged;
	
	DecimalFormat df = new DecimalFormat("#%"); //percent format 


public Fighter(double health, String name, int stamina, int attack, boolean isRanged) { //constructor 
	
	super(health, name, stamina, attack);
	
	health = this.health;
	entityName = name;
	stamina = this.stamina;
	attack = this.attack;
	this.isRanged = isRanged;
	
if (isRanged == true){ //logic to set stats based on if the hero is ranged or not
	armor = .25;
	maxAttack = 125;
}
if (isRanged == false) {
	armor = .5;
	maxAttack = 100;
		
}
}



public void computeCombatPower() {  //computes power based on maxAttack and attack values 
	
	if (maxAttack <= attack) {
		combatPoints = (int) ((maxAttack + health) * (1 - armor));
	}
	else {
		combatPoints = (int) ((attack + health) * (1 - armor));
	}
}

 public String toString() { //puts everything in a string based on if its ranged or not
	 
	 
 
 String myString = null;
	if (this.isRanged == true) {
		 myString = "\nFighter Hero:\t\tRanged Type\n" 
				+ "Hero name:\t\t" + entityName + "\nCurrent Health:\t\t" + health + "\nStamina:\t\t" + stamina + "\nAttack Damage:\t\t" + attack + 
				"\nCurrent Combat Points:\t" + super.getCombatPoints() + "\nArmor:\t\t\t" + df.format(armor) + "\n";
		 
	}
	if(this.isRanged == false) {
		myString = "\nFighter Hero:\t\tMelee Type\n" 
				+ "Hero name:\t\t" + entityName + "\nCurrent Health:\t\t" + health + "\nStamina:\t\t" + stamina + "\nAttack Damage:\t\t" + attack + 
				"\nCurrent Combat Points:\t" + super.getCombatPoints() + "\nArmor:\t\t\t" + df.format(armor) + "\n";
		
	}
	return myString;
}
	

}












