//Patrick McGuire
//Lab 07

import java.util.Scanner; //imports a new scanner 

public class Zigzag {
    
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        int nStars = 10;
        int sentinel = 0;
        int sentinel2 = 0;
        int sentinel3 = 0;
        String userResponse;
        String spaces = "";
        boolean check = true;
        boolean check2 = true;
        
      
        
        while (true) { //while loop 1
        System.out.println("Enter a number between 3 and 33 inclusive");
        boolean goodInt = false; //sets boolean value at false 
        while (goodInt == false) {  //specifies loop to continue whike boolean value remains false 
            if (!scan.hasNextInt()) { //returns true if user did not enter an int
                System.out.println("Invalid input! Enter again"); //tells user they need to enter an int
                scan.next(); 
                continue; //keeps while loop going 
                    } //ends if statement 1 
            else { //else statement 1
            nStars = scan.nextInt(); //now sets variable to the users input
            if (nStars <= 3 || nStars >= 33) { //returns true if int between given range
                System.out.println("Invalid input! Enter again"); //prompts user to enter int between given range  
                continue;
                } //ends if statement 2 
            else { //else statement 2
                 goodInt = true; // now sets boolean value to true
            }
            }
                
                
        
        while (sentinel!=nStars) { //while loop 4
            System.out.print("*");
            sentinel++;
            while (sentinel2!=nStars && sentinel == nStars){ //while loop 5
                System.out.println(spaces+"*");
                spaces += " ";
                sentinel2++;
                while (sentinel3!=nStars && sentinel2 == nStars){ //while loop 6
                System.out.print("*");
                sentinel3++;
                
                } //ends while loop 5   
                } //ends while loop 4
            } //ends while loop 3
        } //ends while loop 2
     
            System.out.println("Enter y or Y to go again");
            String answer = scan.next();
            
            if (answer.equals("y") || answer.equals("Y")) { //if statement 
                   sentinel = 0;
                   sentinel2 = 0;
                   sentinel3 = 0;
                   spaces= "";
            } //ends else statement 
            else {
                break;
            }
            
             } // ends while loop 1
       
        } //ends main method
} // ends class Zigzag

