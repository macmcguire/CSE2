//Patrick McGuire 
//Homework 11
//CSELinear Java Program 

import java.util.Scanner; //imports Scanner class 


public class CSE2Linear{
    public static void main(String args []){
        Scanner scan = new Scanner(System.in); //constructs new Scanner 
        int [] userGrades = new int[15]; //defines array and sets the length to 15
        System.out.println("Enter 15 ints for final grades in CSE2");
        for (int i=0; i < userGrades.length; i++) {
            if (scan.hasNextInt()){ //checks if input is an int 
                int userInt = scan.nextInt();
                if (userInt >= 0 && userInt <= 100){ //checks if int is within given range
                    if (i > 0) {
                        if (userInt < userGrades[i-1]){ //checks if int is larger or equal to last int after first int has been given
                            System.out.println("Please enter an int greater or equal to the previous int");
                            i--;
                            scan.next();
                            continue;
                        }
                        else {
                            userGrades[i] = userInt; 
                        }
                    }
                    else {
                        userGrades[i] = userInt;
                        }
                    }
                    else{
                        System.out.println("Please enter an int between 0 and 100");
                        i--;
                        scan.next();
                        continue;
                    }
                }
                else {
                    System.out.println("Please enter an int");
                    i--;
                    scan.next();
                    continue;
                }
        }
    System.out.println("The grades, sorted, are: ");    
    displayGrades(userGrades); //calls the displayGrades method
    System.out.println("Enter a grade to search for ");
    int targetGrade = scan.nextInt();
    binarySearch(userGrades, targetGrade); //calls the binarySearch method
    scrambleGrades(userGrades); //calls the scrambleGrades method
    System.out.println("Scrambled: ");
    displayGrades(userGrades); //calls the displayGrades method again 
    System.out.println("Enter a grade to search for ");
    targetGrade = scan.nextInt();
    linearSearch(userGrades, targetGrade); //calls the linear search method 
    } //ends main method 
    public static void displayGrades(int userGrades[]) { //method that prints out the array 
        for(int i = 0; i<userGrades.length; i++){
            System.out.print(userGrades[i] + "  ");
        }
    }
    public static void binarySearch(int[] userGrades, int key){ //method that performs binary search to find target value
       int low = 0;
       int high = userGrades.length - 1;
       int iterations = 0;
       while (high >= low) {
            iterations++;
            int mid = (low + high)/2;
            if (key < userGrades[mid]){
                high = mid - 1;
                }
            else if (key == userGrades[mid]){
               System.out.println(key+ " was found with " +iterations+ " iterations"); 
               return;
            }
            else {
                low = mid + 1;
            }
            
       }
       System.out.println(key+ " was not found after " +iterations+ " iterations");
       return;
       
       
    } 
    public static int[] scrambleGrades(int [] userGrades){ //method that scrambles the array 
        int k;
        for (int i = userGrades.length -1; i > 0; i--){
            int j = (int) (Math.random()*(i+1));
            k = userGrades[i];
            userGrades[i] = userGrades[j];
            userGrades[j] = k;
            }
            return userGrades;
    }
    public static void linearSearch(int[] userGrades, int key){ //method that performs linear search through array 
        int iterations = 0;
        for (int i =0; i < userGrades.length-1; i++){
            iterations++;
            if (key==userGrades[i]){
                System.out.println(key+ " was found after " +iterations+ " iterations"); 
                return;
            }
        }
        System.out.println(key+ " was not found after 15 iterations");
    }
    
      
      
} //ends public class 