//Patrick McGuire
// HW08 Java Program 
// Uses multiple methods to guide user through a fantasy game 

import java.util.Scanner; // imports new scanner

public class HW8 {
    
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc"); //calls first getInput method - continues if user enters either C or c
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //calls first getInput method
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave(); //calls the cave method - prints out design of cave
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //calls the first getInput method
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //calls the first getInput method
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant(); //calls the giant method - prints out design of giant 
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD"); //please note I corrected the typo
        input = getInput(scan, "AaEe", 10); //calls second getInput method - continues if user gets 10, quits program if user doesnt enter required chars
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box(); //calls the box method - prints out design of box 
        input = getInput(scan); //calls the third getInput method - returns prize based on what int user entered
        System.out.println("Hero! Have a good day!");
    }
        public static String getInput(Scanner scan, String string) { //first getInput method
            
        string = scan.next(); //defines variable as taking it user input
        if (string.equals("C") || string.equals("c")) { //boolean returns true when string equals 'c' or 'C'
            return string; // passes value of string to main method
        }
        else {
            System.out.println("Yea right LOSER!");
            System.exit(0); //quits program if incorrect characters entered
            
        }
        return string; //ensures java that return statement will be reached regardless of outcome
            
        }
        
        public static String getInput(Scanner scan, String string, int trial) { //second getInput method
        int battle = 0; //defines int to track the number of hits on the giant 
        while (battle <= 10) { //loop runs until score is more than 10 
            string = scan.next(); //holds user response 
            if (string.equals("A") || string.equals("a")) {
                double attack = Math.random(); //sets double to be between 0 and .99
                attack = Math.round(attack); //rounds this number to either 0 or 1
                if (attack == 1) { //says that if number is 1 than user scores a hit on the giant 
                    System.out.println("Critical Hit!");
                    battle++;
                }
                else{
                    System.out.println("Gosh! How can you miss it!?"); 
                }
            }
            else if (string.equals("E") || string.equals("e")) {
                int escape = ((int) (Math.random()*(10)+1)); //generates random int between 1 and 0 and stores it in variable
                if (escape==10){ //if variable equals 10 than program acts as if user scored 10 hits 
                    System.out.println("You escaped!");
                    battle = 10;
                    
                }
                else {
                    System.out.println("You failed to escape!");
                }
            
            }
            else {
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0); //terminates program if correct characters not entered
            }
            if (battle == 10) { //calls main method if score equals 10 
            return string;
            }
            else { //prompts user to continue battle until conclusion is reached 
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                
            }            
       
            } //ends while loop
    
        return string; // ensures java that return statement will be reached regardless of outcome
        } //ends battle method
        
        public static String getInput(Scanner scan) { //third getInput method
            int response = scan.nextInt(); //takes response from user 
            String reward;
            switch (response) {
                case 1: reward = "It's three rusty screws!";
                        break;
                case 2: reward = "It's a signed Nickelback CD!";
                        break;
                case 3: reward = "It's the Directors cut of the Room!"; 
                        break;
                default: reward = "A Wrong Number! You get nothing! Better restart the game LOL";
            }
                System.out.println(reward); 
                
                return reward; //calls main method
        }
        
        public static void giant() { //giant method
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
        } //ends giant method
    
        public static void cave() { //cave method
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
        } //ends cave method
    
        public static void box(){ //box method
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
        } //ends box method


    
} //ends class HW08
