// Patrick McGuire 
// HW 06 Program 2: Run Factorial Java Program 

import java.util.Scanner; //imports a new Scanner 

//creates the class RunFactorial 
public class RunFactorial {
    //adds a main method
    public static void main(String [] args) {
      
    Scanner scan = new Scanner (System.in); //adds a new scanner
    System.out.println("Please enter an integer between 9 and 16"); //prompts user for an integer in a given range
    int userInteger = 0; //sets variable at 0
    boolean goodInt = false; //sets boolean value at false 
    while (goodInt == false) {  //specifies loop to continue whike boolean value remains false 
        if (!scan.hasNextInt()) { //returns true if user did not enter an int
            System.out.println("Invalid input! Enter again"); //tells user they need to enter an int
            scan.next(); 
            continue; //keeps while loop going 
            } //ends if statement 
        else { 
            userInteger = scan.nextInt(); //now sets variable to the users input
            if (userInteger > 8 && userInteger < 17) { //returns true if int between given range
                goodInt = true; // now sets boolean value to true
            } //ends if statement 
            else {
              System.out.println("Invalid input! Enter again"); //prompts user to enter int between given range  
            } //ends else statement 
            
        } //ends else statement    
    } //ends while statement 
    
        

    
    int factorial = 1; //sets starting factorial value 
    int i = 1; //sets starting product value 
    while (userInteger > i) { //loop runs until i equals the users integer 
        factorial = factorial*i; //calculates factorial at each value of i 
        i++; //adds one to i 
        
  } // ends while statement 
   
    
  System.out.println("Input accepted:"); 
  System.out.println(userInteger+"!="+factorial); 
  
    
        
  
    } //ends main method
} //ends class RunFactorial