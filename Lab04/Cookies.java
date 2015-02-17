//Patrick McGuire
//Cookies Java Program
//

import java.util.Scanner; //

//  define a class Cookies
public class Cookies {
//  add main method    
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        int nPeople, nCookies;
        System.out.println("Enter the number of people");
        if (myScanner.hasNextInt()) {
             nPeople = myScanner.nextInt();   
        }
        else{
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                       //the program terminates
        }
        if (nPeople < 0) {
            System.out.println("You did not enter an int > 0");
            return;
        }
        
        System.out.println("Enter the number of cookies you are planning to buy");
        if (myScanner.hasNextInt()) {
            nCookies = myScanner.nextInt();   
        }
        else{
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                       //the program terminates
        }
        if (nCookies < 0) {
            System.out.println("You did not enter an int > 0");
            return;
        }
        
        System.out.println("How many do you want each person to get?");
        int numPerPerson = myScanner.nextInt();
        int cookiesForEveryone=nCookies-(nPeople*numPerPerson);
        if (numPerPerson%2==0){
           if(cookiesForEveryone >= 0){
               System.out.println("You have enough cookies for each person and the amount will divide evenly.");
           }
        }
        if (numPerPerson%2!=0){
            if(cookiesForEveryone >= 0){
                System.out.println("You have enough, but they will not divide evenly.");
            }
        }
        if (cookiesForEveryone < 0){
            System.out.println("You will not have enough cookies. You will need to buy at least "+Math.abs(cookiesForEveryone)+" more");
            
                     

        
        
        
    } // end of main method 
    
} // end of class

}
