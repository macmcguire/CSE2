//Patrick McGuire
//Array Inputs java program 

import java.util.Scanner; //

public class ArrayInputs {
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an int for the size of the array");
        final int userResponse = scan.nextInt();
        int [] userArray;
        userArray = new int[userResponse];
        System.out.println("Please enter a positive int");
        String input = getInput(scan, userResponse);
        
        
    }
        public static String getInput(Scanner scan, int a) {
            a = 0;
            int arrayNumber;
            while (a <= userResponse) {
                arrayNumber = scan.next();
                if (arrayNumber.hasNextInt()) {
                    if (arrayNumber > 0) {
                        a--;
                    }
                    else{
                        System.out.println("Sorry, you didnt enter a positive int");
                        }
                }
                else {
                    System.out.println("Sorry, you didnt enter a positive int");
                }
                return 
                
            }    
        }
        
        
        

} //ends public class ArrayInputs 