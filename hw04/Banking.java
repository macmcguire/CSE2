//Patrick McGuire 
//Banking Java Program 
//Generates a random number that represents a users bank balance and displays that balance
//allows user to deposit or withdraw a positive number and adjusts balance accoridngly
//also allows user to re-view original balance 
import java.util.Scanner; //imports a new scanner 

//  adds a new class Banking 
public class Banking {
    //  adds the main method
    public static void main(String [] args) {
    Scanner myScanner; //declares a new instance of the class Scanner
    myScanner = new Scanner (System.in); // constructs a new Scanner and defines it's input source as STDIN
    int newDeposit, newWithdrawl; // defines two ints for later use
    int highestNumber = 5000; //defines an intger for the highest possible number
    int lowestNumber = 1000; //does the same for the lowest possible number
    int randomBalance = (int) (Math.random() * (highestNumber-lowestNumber)) + lowestNumber; //uses Math.random to generate a random number within the upper and lower bound
    System.out.println("Your starting balance: $" + randomBalance+" dollars"); //prints out the random number that was generated
    System.out.println("To deposit: enter 1. To withdraw: enter 2. To see your account statement: enter 3"); // prompts the user to choose whether to deposit, withdraw or view balance
    int firstResponse; //sets up an integer to hold the users response
    firstResponse = myScanner.nextInt();  // stores the response in the integer 
    String firstResponseString = ""; //defines a variable to hold the response as a string 
    switch (firstResponse) { // sets up the integer as the control variable 
        case 1: firstResponseString = "deposit"; //says that if firstResponse = 1, then firstResponseString should hold "deposit"
            System.out.println("How much do you want to deposit?"); //prompts user to enter deposit amount 
            newDeposit = myScanner.nextInt(); //defines integer to hold users response
                if (newDeposit > 0) { //checks if number entered is positive 
                    System.out.println("Your current balance is $"+(randomBalance + newDeposit)+" dollars"); //prints out the new balance after the deposit 
                } //ends if statement
                else  { //begins else statement that only activates if the if statement returns false
                    System.out.println("You did not enter a valid deposit amount"); //prints out if user didnt enter positive number 
                } //ends else statement
        break; // terminates the first case statement 
        case 2: firstResponseString = "withdraw"; //says that is firstResponse=2, then firstResponseString should hold "withdraw"
            System.out.println("How much do you want to withdraw?"); //asks user how much they want to withdraw
            newWithdrawl = myScanner.nextInt(); //defines integer to hold users response
            if (newWithdrawl > 0) { //checks if amount entered is a positive number 
               System.out.println("Your current balance is $"+(randomBalance - newWithdrawl)+" dollars");  //prints out the new balance after withdrawl amount is subtracted
            } // ends if statement   
            else { //begins else statement that only activates if the if statement returns false
                System.out.println("You did not enter a valid withdrawal amount"); //prints out if user didnt enter positive number
            }  //ends else statement  
        break; //terminates the second case statement 
        case 3: firstResponseString = "balance"; //says that if firstResponse=3, then firstResponseString should hold "balance"
            System.out.println("$"+randomBalance+" dollars"); //prints out the users current balance 
        break; //terminates the third case statement
    } // ends the switch statement 
    } //ends main method 
} //ends the class 