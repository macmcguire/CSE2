//Patrick McGuire 
//Lab 11

import java.util.Scanner;
public class Arrays {
    public static void main(String args []){
        int[] arrayOne = new int[50];
        int[] arrayTwo = new int[50];
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = (int)(Math.random()*100);
            }
      
        int min = arrayOne[0];
        for (int i = 1; i < arrayOne.length; i++){
            if (arrayOne[i] < min) {
                min = arrayOne[i];
            }
        }
        System.out.println("The minimum of array 1 is " + min);
        int max = arrayOne[49];
        for (int j = 1; j < arrayOne.length; j++) {
            if (arrayOne[j] > max) {
                max = arrayOne[j];
            }
        }
        
        System.out.println("The maximum of array 1 is " + max);
        
        arrayTwo[0] = (int)(Math.random()*100);
        for (int i = 1; i < arrayOne.length; i++) {
            arrayTwo[i] = (int)(Math.random()*100) + arrayTwo[i-1];
            }
        
        min = arrayTwo[0];
        for (int i = 1; i < arrayTwo.length; i++){
            if (arrayTwo[i] < min) {
                min = arrayTwo[i];
            }
        }
       
        System.out.println("The minimum of array 2 is " + min);
        
        max = arrayTwo[49];
        for (int j = 1; j < arrayTwo.length; j++) {
            if (arrayTwo[j] > max) {
                max = arrayTwo[j];
            }
        }
        System.out.println("The maximum of array 2 is " + max);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int greater or equal to zero");
        int userInt = scan.nextInt();
        if (userInt < 0){
            System.exit(0);
            }
        int low = 0;
        int high = arrayTwo.length -1;
       
        while (high >= low){
            int mid = (high+low)/2;
            if (userInt < arrayTwo[mid]){
                high = mid -1;
                
            }
            else if (userInt == arrayTwo[mid]){
                System.out.println(userInt + " was found in the list! ");
                System.exit(0);
                }
            else {
                low = mid + 1;
                
            }
            
        }
        System.out.println(userInt + " was not found in the list");
        for(int i = 0; i < arrayTwo.length; i++){
            if (arrayTwo[i] > userInt && arrayTwo[i-1] < userInt){
                System.out.println("The number above the key was " +arrayTwo[i]);
                System.out.println("The number below the key was " +arrayTwo[i-1]);
            }
        }
    
        
    }
  
    
} //ends public class 