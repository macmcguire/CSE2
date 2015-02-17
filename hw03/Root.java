//Patrick McGuire 
// Root Java Program
// This program asks for a double and iterates until it guesses its square root 
//
//  first compile the program 
//      javac Root.java
//  then run the program 
//      java Root//
//
//
//

import java.util.Scanner; //imports the scanner utility

//  define a class
public class Root {
//  add the main method 
    public static void main(String [] args) {
        
    Scanner myScanner= new Scanner( System.in ); // defines a new Scanner
    System.out.println("Input a double"); // prompts user to input a double
    double myDouble=myScanner.nextDouble(); // defines myDouble as the double that was entered
    double firstGuess=myDouble/3; // divideds double by 3 to guess cubed root 
    double secondGuess=(2*firstGuess*firstGuess*firstGuess+myDouble)/(3*firstGuess*firstGuess); // attempts to guess the cubed root using (2*guess^3)/(3*guess^2)
    double thirdGuess=(2*secondGuess*secondGuess*secondGuess+myDouble)/(3*secondGuess*secondGuess); // replaces "guess" with previous guess
    double fourthGuess=(2*thirdGuess*thirdGuess*thirdGuess+myDouble)/(3*thirdGuess*thirdGuess); // again replaces guess with previous guess
    double fifthGuess=(2*fourthGuess*fourthGuess*fourthGuess+myDouble)/(3*fourthGuess*fourthGuess); // repeats previous step 
    double sixthGuess=(2*fifthGuess*fifthGuess*fifthGuess+myDouble)/(3*fifthGuess*fifthGuess); // repeats
    double guessedDouble=(sixthGuess*sixthGuess*sixthGuess); // cubes the sixth guess 
    System.out.println("The cube root is "+sixthGuess+": "+sixthGuess+" * "+sixthGuess+" * "+sixthGuess+" = "+guessedDouble+" "); prints out the crude guess and illustrates it mathematically 
    
    
    }
}