//
//
//
//

import java.util.Scanner; //

public class Root {
    //
    public static void main(String [] args) {
        
    Scanner myScanner= new Scanner( System.in ); //
    System.out.println("Input a double"); //
    double myDouble=myScanner.nextDouble(); //
    double firstGuess=myDouble/3; //
    double secondGuess=(2*firstGuess*firstGuess*firstGuess+myDouble)/(3*firstGuess*firstGuess); //
    double thirdGuess=(2*secondGuess*secondGuess*secondGuess+myDouble)/(3*secondGuess*secondGuess); //
    double fourthGuess=(2*thirdGuess*thirdGuess*thirdGuess+myDouble)/(3*thirdGuess*thirdGuess); //
    double fifthGuess=(2*fourthGuess*fourthGuess*fourthGuess+myDouble)/(3*fourthGuess*fourthGuess); //
    double sixthGuess=(2*fifthGuess*fifthGuess*fifthGuess+myDouble)/(3*fifthGuess*fifthGuess); //
    double guessedDouble=(sixthGuess*sixthGuess*sixthGuess); //
    System.out.println("The cube root is "+sixthGuess+": "+sixthGuess+" * "+sixthGuess+" * "+sixthGuess+" = "+guessedDouble+" ");
    
    
    }
}