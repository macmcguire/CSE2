// Patrick McGuire
// Waves Java Program 
// Uses for, while and do-while loops to print out waves based on a number entered (1-30 inclusive)

import java.util.Scanner; //imports a new Scanner 

//creates the class Waves
public class waves {
    // adds the main method 
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in); //defines a new Scanner scan 
        System.out.println("Enter a integer between 1 and 30 inclusive");//prompts user to enter an int w/in the given range
        int userInteger=0;
        boolean goodInt = false; //sets boolean value at false 
        while (goodInt == false) {  //specifies loop to continue whike boolean value remains false 
            if (!scan.hasNextInt()) { //returns true if user did not enter an int
                System.out.println("Invalid input! Enter again"); //tells user they need to enter an int
                scan.next(); 
                continue; //keeps while loop going 
                    } //ends if statement 1 
            else { //else statement 1
            userInteger = scan.nextInt(); //now sets variable to the users input
            if (userInteger < 0 || userInteger > 30) { //returns true if int between given range
                System.out.println("Invalid input! Enter again"); //prompts user to enter int between given range  
                continue;
                } //ends if statement 2 
            else { //else statement 2
                 goodInt = true; // now sets boolean value to true  
            } //ends else statement 2 
            } //ends else statement 1
        int b, a, c=0; //creates ints for later use
        System.out.println("");
        System.out.println("FOR LOOP"); //starts of for loop section 
        for (a=1; a <= userInteger; a++){ //for statement 1
            if (a%2==0) { //if statement 1
                for (b=0; b<=a; b++) { //for statement 2
                    for (c=0; c<b; c++) { //for statement 3
                        System.out.print(a);
                        } //ends for statement 3
                    System.out.println("");
                    } //ends for statement 2  
            } //ends if statement 1
            else { //else statement 1
                //int d = a;
                for (b=a; b>=1; b--) { //for statement 4
                    for (c=0; c<b; c++) { //for statement 5
                        System.out.print(a);    
                    } //ends for statement 5
                    System.out.println("");
                }  //ends for statement 4  
            } //ends else statement 1
        }// ends for statement 1 
       System.out.println("");      
       System.out.println("WHILE LOOP:"); //start  of while loop section 
        a = 1;
        b = 0;
        c = 0;
        
       while (a<=userInteger) { //while statement 1
            if (a%2==0) { //if statement 1
                b = 0;
                while (b<=a) { //while statement 2
                    c = 0;
                    while (c<b) { //while statement 3
                        System.out.print(a);
                        c++; 
                        
                    }// ends while statement 3
                    System.out.println("");
                    b++;
                } //ends while statement 2
            } //ends if statement 1
            else { // else statement 1
                int d = a;
                b = 0;
                while (!(b==a)){ //while statement 4
                    c = a - b;
                    while (!(c==0)){ //while statement 5
                        System.out.print(a);
                        c--;
                    } //ends while statement 5
                
                    System.out.println("");
                    b++;
                } //ends while statement 4
            } //ends else statement 1
        
            a++;
            System.out.println(""); 
        } //while statement 1
        System.out.println("");
        System.out.println("DO-WHILE LOOP"); //starts do-while section
        a = 1;
        b = 0;
        c = 0;
        do { //do loop 1
            if (a%2==0){ //if statement 1
                b = 0;
                do { //do loop 2
                    c = 0;
                    do { // do loop 3
                        System.out.print(a);
                        c++;
                        
                    } //ends do loop 3
                        while (c<b);
                        System.out.println("");
                        b++;
                } //ends do loop 2
                    while (b <= a);
                
            } //ends if statement 1
            else { //else statement 1
                int d = a;
                b = 0;
                do { //do loop 4
                    c = a-b;
                    do { //do loop 5
                        System.out.print(a);
                        c--;
                    
                    }//ends do loop 5
                        while(!(c==0));
                        System.out.println("");
                        b++;
                        
                    } //ends do do loop 4
                        while (!(a==b));
                    
                
            } // ends else statement 1
            a++;
            
        } //ends do loop 1
            while (a<= userInteger);
        
              
                
  

} //ends boolean while statement 
} //ends main method
} //ends class Waves
