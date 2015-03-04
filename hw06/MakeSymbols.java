// Patrick McGuire 
// Homework 06 Program 3: Make Symbols Java Program
// Generates random number than prints out corresponding number of symbols

//adds class MakeSymbols
public class MakeSymbols { 
    // adds main method
    public static void main(String [] args) {
    int randomNumber = (int) (Math.random()*100); //generates random number between 1 and 100
    if (randomNumber%2==0){ //returns true if the number is even
        do {
            System.out.print("*"); //prints out the * symbol
            randomNumber--; //subtracts 1 from the number
        } while (randomNumber > 0); //keeps loop going until the number equals zero 
    } //ends if statement     
    else{ //does the same process but for negative numbers 
        do {
            System.out.print("&");
            randomNumber--;
        }while (randomNumber > 0);
    }// ends else statement     
        
            
   
        
    } //ends main method 
} //ends class 