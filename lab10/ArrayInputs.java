//Patrick McGuire
//Array Inputs java program 

import java.util.Scanner; //

public class ArrayInputs {
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an int for the size of the array");
        final int userResponse = scan.nextInt();
        int[] userArray = new int[userResponse];
        
        makeArray(userArray);
        System.out.println("the array is: ");
        displayArray(userArray);
        
        
    }
    public static int[] makeArray(int [] userArray){
    int a = 0;
    Scanner scan = new Scanner(System.in);
    while (a < userArray.length){
        System.out.println("Please enter a positive int");
        if (scan.hasNextInt()){
            int userInput = scan.nextInt();
            if (userInput > 0){
                userArray[a] = userInput;
                a++;
            }
            else {
            System.out.println("You did not enter a positive int");
            continue;
            }
        }
        else{
            System.out.println("You did not enter an int");
            
            scan.next();
            continue;
            
        }
    }
    return userArray;
}

    public static void displayArray(int [] userArray){
        for (int i = 0; i < userArray.length; i++){
            System.out.println(userArray[i]);
        }
    }
}
        
        

 //ends public class ArrayInputs 