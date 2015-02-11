//Patrick McGuire 
// FourDigits Java Program
// This program asks for a double and returns the first four digits
// after the decimal point
//
//  first compile the program 
//      javac FourDigits.java
//  then run the program 
//      java FourDigits//

import java.util.Scanner; // imports the scanner utility

//  define a class
public class FourDigits {
//  add main method 
    public static void main(String [] args) {
    
        Scanner myScanner = new Scanner( System.in ); // define a new scanner
        System.out.println("Enter a double"); // prompts user to enter a double
        double myDouble = myScanner.nextDouble(); // assigns the double that was enetered to variable myDouble
        int firstEdit=(int) myDouble; // casts myDouble as an int
        int secondEdit= (int) (firstEdit)*(10000); // multiplies it by 1000
        double thirdEdit= (myDouble)*(10000.0); // multiplies original double by 1000
        int fourthEdit= (int) (thirdEdit-secondEdit);  // subtracts int from double and casts as int
        System.out.println("The four digits are "+fourthEdit+" "); // prints out the last four digits of the statement
    
      }
}