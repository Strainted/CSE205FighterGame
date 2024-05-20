// Assignment #: 5
//         Name: Your name
//    StudentID: Your id
//      Lecture: Your lecture time (for instance, MWF 10:10am)
//  Description:

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5 {
 
    public static void main(String[] args){
        char input;
        String line;
        String inputInfo;

        // ArrayList used to store the hero objects
        ArrayList<PlayerEntity> playerList = new ArrayList<>();

        try{
            System.out.println("Welcome to the battle stats simulator!");
            printMenu();

            // create a BufferedREader object to read input from a keyboard
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader stdin = new BufferedReader(isr);

            do{
                System.out.println("\nWhat action would you like to perform?");
                line = stdin.readLine().trim();
                input = line.charAt(0);
                input = Character.toUpperCase(input);
                if(line.length() == 1){
                    switch (input){
                        case 'A': // add hero to the guild
                            System.out.println("Please enter your hero stats:");
                            inputInfo = stdin.readLine().trim();
                            /*************************************************************************************************
                            **  ADD code here to create a hero object (child of PlayerEntity) and add it to the player list **
                            **************************************************************************************************/
                            playerList.add(PlayerParser.parseNewPlayer(inputInfo)); //creates hero objects and adds to arraylist 
                            break;

                        case 'C': // calculate combat points
                        	int i;                     //iterates through all hero objects and finds the combat power of them all
                        	for(i = 0; i < playerList.size(); i++) {
                        		  playerList.get(i).computeCombatPower();
                        	}
                            /**************************************************************************
                            **  ADD code here to compute the combat power for all heroes in the list **
                            ***************************************************************************/
                            System.out.println("Combat points computed");
                            break;

                        case 'D': // how many heroes have combat points equal to or larger than a user-defined value
                            System.out.print("Please enter a minimum combat points you want to calculate:\n");
                            inputInfo = stdin.readLine().trim();
                            int min = Integer.parseInt(inputInfo);
                            int count = 0; //iterates through all the hero objects and finds how many obejcts have a combat power greater than the number you input.
                            for (i = 0; i < playerList.size(); i++) {
                            	if (playerList.get(i).getCombatPoints() >=  min) {
                            		count++;
                            	}
                            }
                            /********************************************************************************************************
                            **  ADD code here to count how many heroes in the list have combat points equal to or larger than input**
                            *********************************************************************************************************/
                            System.out.println("The number of heroes with " + min
                                    + " combat points or more is: " + count);
                            break;

                        case 'L': // list heroes
                        	int j;		//this method decides if the list is empty and if it isn't it will print the values of the hero. 
                        	for (j = 0; j < playerList.size(); j++) {
                        		
                        		if (playerList.isEmpty() == true) {
                        			System.out.print(" No heroes in guild yet.\n");
                        		}
                        		else {
                        			System.out.print(playerList.get(j).toString());
                        		}
                    
                            /***********************************************************
                            **  ADD code here to print all heroes in the list 
                            **  If the list is empty print "No heroes in guild yet.\n"
                            ************************************************************/
                        	}
                            break;
                        
                        case 'Q':
                            break;

                        case '?':
                            printMenu();
                            break;

                        default:
                            System.out.print("Unknown action\n");
                            break;
                    }
                }
                else
                    System.out.println("Unknown action");

            }while (input != 'Q');
            System.out.println("Thanks for playing!");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }


    public static void printMenu(){
        System.out.print("Choice\t\tAction\n" +
                "------\t\t------\n" +
                "A\t\tAdd Hero\n" +
                "C\t\tCompute Combat Points\n" +
                "D\t\tCount Heroes with Minimum Combat Points\n" +
                "L\t\tList Heroes\n" +
                "Q\t\tQuit\n" +
                "?\t\tDisplay Help\n\n");
    }
}

