//Patrick McGuire 
//ToHex Java Program 
//Program accepts three integers representing Red Green and Blue and converts them to a hexadecimal

import java.util.Scanner; //imports a new Scanner 

// adds the class ToHex
public class ToHex {
    // adds the main method
    public static void main(String [] args) {
        
Scanner scan = new Scanner (System.in); //constructs a new Scanner 
int firstNum, secondNum, thirdNum; // creates three integer variables
System.out.println("Please enter three numbers representing RGB values"); //prompts user to enter three integers
if (scan.hasNextInt()) {
    firstNum = scan.nextInt(); // assigns the first number entered to an integer variable 
} //ends if statement
else {
    System.out.println("Sorry, your input must consist of integers"); // prints message in quotes to console
    return; //ends the program 
} //ends above else statement   
if (scan.hasNextInt()) {
    secondNum = scan.nextInt(); // assigns the second number entered to an integer variable 
} //ends above if statement     
else { 
    System.out.println("Sorry, your input must consist of integers"); // prints message in quotes to console
    return; //ends the program
} //ends above else statement  
if (scan.hasNextInt()) {
    thirdNum = scan.nextInt(); // assigns the third number entered to an integer variable 
} //ends if statement    
else {     
    System.out.println("Sorry, your input must consist of integers"); // prints message in quotes to console
    return; //ends the program
} //ends above else statement  
if (firstNum > 255 || firstNum < 0 || secondNum > 255 || secondNum < 0 || thirdNum > 255 || thirdNum < 0) 
// returns true if any of the numbers are greater than 255 or less than 0 
    System.out.println("Sorry you must enter values between 0-255"); // prints message in quotes to console 

int firstHex = firstNum/16; //defines an int to store the quotient of the first number divided by 16
int secondHex = firstNum%16; //defines an int to store the remained of the first number divided by 16
char firstHexChar, secondHexChar; //defines two values to hold character inputs 


switch (firstHex) { //this switch statement converts the decimaal value stored in firstHex to a hexadecimal  
    case 1: firstHexChar = '1';
    break;
    case 2: firstHexChar = '2';
    break;
    case 3: firstHexChar = '3';
    break;
    case 4: firstHexChar = '4';
    break;
    case 5: firstHexChar = '5';
    break;
    case 6: firstHexChar = '6';
    break;
    case 7: firstHexChar = '7';
    break;
    case 8: firstHexChar = '8';
    break;
    case 9: firstHexChar = '9';  
    break;
    case 10: firstHexChar = 'A';
    break;
    case 11: firstHexChar = 'B';
    break;
    case 12: firstHexChar = 'C';
    break;
    case 13: firstHexChar = 'D';
    break;
    case 14: firstHexChar = 'E';
    break;
    case 15: firstHexChar = 'F';
    break;
    default: firstHexChar = '0';
} // ends switch statement

String hexNumber = ""+firstHexChar; //creates string that stores hexadecimal

switch (secondHex) { //this switch statement converts the decimaal value stored in secondHex to a hexadecimal
    case 1: secondHexChar = '1';
    break;
    case 2: secondHexChar = '2';
    break;
    case 3: secondHexChar = '3';
    break;
    case 4: secondHexChar = '4';
    break;
    case 5: secondHexChar = '5';
    break;
    case 6: secondHexChar = '6';
    break;
    case 7: secondHexChar = '7';
    break;
    case 8: secondHexChar = '8';
    break;
    case 9: secondHexChar = '9';  
    break;
    case 10: secondHexChar = 'A';
    break;
    case 11: secondHexChar = 'B';
    break;
    case 12: secondHexChar = 'C';
    break;
    case 13: secondHexChar = 'D';
    break;
    case 14: secondHexChar = 'E';
    break;
    case 15: secondHexChar = 'F';
    break;
    default: secondHexChar = '0';
}// ends switch statement

hexNumber += secondHexChar; //appends the second hexidecimal character

int thirdHex = secondNum/16; //defines an int to store the quotient of the second number divided by 16
int fourthHex = secondNum%16; //defines an int to store the remained of the second number divided by 16
char thirdHexChar, fourthHexChar; //defines two values to hold character inputs 


switch (thirdHex) { //this switch statement converts the decimaal value stored in thirdHex to a hexadecimal
    case 1: thirdHexChar = '1';
    break;
    case 2: thirdHexChar = '2';
    break;
    case 3: thirdHexChar = '3';
    break;
    case 4: thirdHexChar = '4';
    break;
    case 5: thirdHexChar = '5';
    break;
    case 6: thirdHexChar = '6';
    break;
    case 7: thirdHexChar = '7';
    break;
    case 8: thirdHexChar = '8';
    break;
    case 9: thirdHexChar = '9';  
    break;
    case 10: thirdHexChar = 'A';
    break;
    case 11: thirdHexChar = 'B';
    break;
    case 12: thirdHexChar = 'C';
    break;
    case 13: thirdHexChar = 'D';
    break;
    case 14: thirdHexChar = 'E';
    break;
    case 15: thirdHexChar = 'F';
    break;
    default: thirdHexChar = '0';
} // ends switch statement 

hexNumber +=thirdHexChar; //appends the third hexidecimal character

switch (fourthHex) { //this switch statement converts the decimaal value stored in fourthHex to a hexadecimal
    case 1: fourthHexChar = '1';
    break;
    case 2: fourthHexChar = '2';
    break;
    case 3: fourthHexChar = '3';
    break;
    case 4: fourthHexChar = '4';
    break;
    case 5: fourthHexChar = '5';
    break;
    case 6: fourthHexChar = '6';
    break;
    case 7: fourthHexChar = '7';
    break;
    case 8: fourthHexChar = '8';
    break;
    case 9: fourthHexChar = '9';  
    break;
    case 10: fourthHexChar = 'A';
    break;
    case 11: fourthHexChar = 'B';
    break;
    case 12: fourthHexChar = 'C';
    break;
    case 13: fourthHexChar = 'D';
    break;
    case 14: fourthHexChar = 'E';
    break;
    case 15: fourthHexChar = 'F';
    break;
    default: fourthHexChar = '0';
}// ends switch statement

hexNumber +=fourthHexChar; //appends the fourth hexidecimal character


int fifthHex = thirdNum/16; //defines an int to store the quotient of the third number divided by 16
int sixthHex = thirdNum%16; //defines an int to store the remained of the third number divided by 16
char fifthHexChar, sixthHexChar; //defines two values to hold character inputs 


switch (fifthHex) { //this switch statement converts the decimaal value stored in fifthHex to a hexadecimal
    case 1: fifthHexChar = '1';
    break;
    case 2: fifthHexChar = '2';
    break;
    case 3: fifthHexChar = '3';
    break;
    case 4: fifthHexChar = '4';
    break;
    case 5: fifthHexChar = '5';
    break;
    case 6: fifthHexChar = '6';
    break;
    case 7: fifthHexChar = '7';
    break;
    case 8: fifthHexChar = '8';
    break;
    case 9: fifthHexChar = '9';  
    break;
    case 10: fifthHexChar = 'A';
    break;
    case 11: fifthHexChar = 'B';
    break;
    case 12: fifthHexChar = 'C';
    break;
    case 13: fifthHexChar = 'D';
    break;
    case 14: fifthHexChar = 'E';
    break;
    case 15: fifthHexChar = 'F';
    break;
    default: fifthHexChar = '0';
} // ends switch statement

hexNumber += fifthHexChar; //appends the fifth hexidecimal character

switch (sixthHex) { //this switch statement converts the decimaal value stored in sixthHex to a hexadecimal
    case 1: sixthHexChar = '1';
    break;
    case 2: sixthHexChar = '2';
    break;
    case 3: sixthHexChar = '3';
    break;
    case 4: sixthHexChar = '4';
    break;
    case 5: sixthHexChar = '5';
    break;
    case 6: sixthHexChar = '6';
    break;
    case 7: sixthHexChar = '7';
    break;
    case 8: sixthHexChar = '8';
    break;
    case 9: sixthHexChar = '9';  
    break;
    case 10: sixthHexChar = 'A';
    break;
    case 11: sixthHexChar = 'B';
    break;
    case 12: sixthHexChar = 'C';
    break;
    case 13: sixthHexChar = 'D';
    break;
    case 14: sixthHexChar = 'E';
    break;
    case 15: sixthHexChar = 'F';
    break;
    default: sixthHexChar = '0';
}// ends switch statement

hexNumber += sixthHexChar; //appends the final hexidecimal character
System.out.printf("The decimal numbers R:%d, G:%d, B:%d, is represented in hexadecimal as: %s", firstNum, secondNum, thirdNum, hexNumber); // prints out the statement to the console 

    } //ends main method 
    
} //ends class ToHex
