// Assignment #: 5
//         Name: Luke Engel
//    StudentID: 1221908207
//      Lecture: MWF 11:15-12:05
//  Description: This class creates a constructor for the parent class playerEntity. It then has abstract methods for computing power. It has a method to get combat points. Lastly there is a method to put everything in a string.
public abstract class PlayerEntity {

	protected double health;
	
	protected String entityName;
	
	protected int stamina;
	
	protected int attack;
	
	protected int combatPoints;

	
	
	
public PlayerEntity(double health, String name, int stamina, int attack) { // constructor for playerEntity
	
	this.health = health;
	this.entityName = name;
	this.stamina = stamina;
	this.attack = attack;	
	combatPoints = 0;
}

public int getCombatPoints() { // gets the combat points 

	return combatPoints;
}

public abstract void computeCombatPower(); //method that is implemented in other classes 


public String toString() { //takes data and puts it all into a string 

String myString = "\nHero name:\t\t" + entityName + "\n\n"
		+ "Current health:\t\t" + health + "\n\n"
		+ "Stamina:\t\t" + stamina + "\n\n"
		+ "Attack Damage:\t\t" + attack + "\n\n"
		+ "Current Combat Points:\t" + combatPoints + "\n";

return myString;
}










}













