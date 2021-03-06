//Patrick McGuire
//Lab 08: Factorial Java Program 
//

import java.util.Scanner; //imports a new scanner 

public class Factorial { //creates the class Factorial 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); //defines a new Scanner 
        System.out.println("Please enter an integer"); //prompts user to enter an int
        int userInt = scan.nextInt(); //defines variable to hold the users int
        int sum = 0; //sets sum to start at 0
        for(int i = 1; i <= userInt; i++){ //increments i by 1 until i equals userInt
            sum += factorial(i); // calls the factorial method
        }
        print(sum); //calls the print method 
  }
    public static int factorial(int key){ 
        int factorialNumber = 1; //sets int to 1 to be used in factorial calculation 
        for (int i = 1; i <= key; i++){ //increments 1 by 1 until i equals the user int
            factorialNumber *= i; //generates factorial values by sequentially increasing the multiplicative value 
        }
        System.out.println(factorialNumber); //prints out each factorial number generated by the above process 
        return factorialNumber;
    }
    public static void print(int finalValue){
        System.out.println("The super factorial is equal to " + finalValue);
    }
}
