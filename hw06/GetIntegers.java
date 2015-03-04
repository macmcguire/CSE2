//Patrick McGuire 
//Homework 6 Program 1: Get Integers Java Program
// Accepts 5 non-negative integers and returns their sum 

import java.util.Scanner; //import a new Scanner
// create the class GetIntegers
public class GetIntegers {
    // adds the main method 
    public static void main(String [] args) {
    Scanner scan = new Scanner(System.in); // creates a new Scanner and defines it's input as STDIN  
    System.out.println("Please input five non-negative integers"); //prompts user to enter 5 non-negative integers
    int userNumber, sum = 0, count; //defines 3 integers for later use 
    for (count = 0; count < 5; count++) { //starts count at 0, will repeat 5 times
        if (scan.hasNextInt()) { //returns true if the input was an integer
            userNumber = scan.nextInt(); //assigns the input int to a variable 
            if (userNumber > 0) { //returns true if int is positive 
            sum += userNumber; //adds the input int to the variable sum 5 times
            } //ends if statement 
            else{
                  System.out.println("Invalid input, enter again"); //tells user they must enter a positive #
            count--; //subtracts one from the count so to let computer know it didnt count as one of the 5
             } //ends else statement 
        } //ends original if statement 
        else{
            System.out.println("Invalid input, enter again"); //tells user they must enter an in 
            count--;
            scan.next();
            continue; //tells program to continue with the loop 
        } //ends else statement 
    } //ends for loop
        
    System.out.println("Sum:" +sum); //prints out the sum once 5 positive ints have been entered
        
        
    } //end main method    
} //end class GetIntegers 