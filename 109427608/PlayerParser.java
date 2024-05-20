// Assignment #: 5
//         Name: Luke Engel
//    StudentID: 1221908207
//      Lecture: MWF 11:15-12:05
//  Description: takes an input and splits it and parses it into different data types. Then it decides which object to put the data into.

public class PlayerParser {

public static PlayerEntity parseNewPlayer(String lineToParse) { //method that parses data and puts it into a object 
	
	String[] myArray = new String[6];
	
	myArray = lineToParse.split("/",6);
	
	String playerType = myArray[0]; //parses string and puts in its prooper data type 
	int health = Integer.parseInt(myArray[1]);
	String name = myArray[2];
	int stamina = Integer.parseInt(myArray[3]);
	int attack = Integer.parseInt(myArray[4]);
	String fighterType;
	double mana;
	
	if (playerType.equals("Mage") || playerType.equals("mage")) { //decideds if its a mage and assigns mana 
		mana = Double.parseDouble(myArray[5]);
		PlayerEntity mage1 = new Mage(health,name,stamina,attack,mana);
		
		return mage1;
	}

	if (playerType.equals("Fighter") || playerType.equals("fighter")) {	//decides if its a fighter and if its ranged then assigns the fighter object 
		fighterType = myArray[5];
		if(fighterType.equals("Range") || fighterType.equals("range")) {
			 fighterType = myArray[5];
			
			 PlayerEntity fighter1 = new Fighter(health,name,stamina,attack, true);
	
			 return fighter1;
		}
	}
	if (playerType.equals("Fighter") || playerType.equals("fighter")) {	// decides if its a fighter and then if its melee then puts it into a object
		fighterType = myArray[5];
		if(fighterType.equals("Melee") || fighterType.equals("melee")) {			
			 PlayerEntity fighter2 = new Fighter(health,name,stamina,attack, false);
	
			return fighter2;
		}
	}
	return null;
	
	
	
	 	
}
}


