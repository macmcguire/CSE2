//Patrick McGuire 
//Which Number Java Program 
//Uses sequential questions to guess a number between 1 and 10 inclusive
//Accepts 'y' and 'Y' for "yes", 'n' and 'N' for "no". Does not accept any other input 
//Assumes user is telling the truth but informs user if asnwers aren't consistent 

import java.util.Scanner; //imports a new Scanner 
//
// defines a class WhichNumber
public class WhichNumber {
    //  adds the main method
    public static void main(String [] args) {
        
        Scanner myScanner; // declares an instance of the Scanner
        myScanner= new Scanner (System.in); // constructs a new Scanner and defines its input source as STDIN
        String userResponse, answerResponse; //defines strings to hold user responses
        System.out.println("Think of a number between 1 and 10, inclusive"); //prompts the user to think of a integer within a given range
        System.out.println("Is the number even?"); //asks the user if the number is even 
        userResponse=myScanner.nextLine(); // makes string hold the users reponse
        if (userResponse.equals("y") || userResponse.equals("Y")) { //returns true if the user says their number IS even 
            System.out.println("Is it divisible by 3?"); //asks user if number is divisible by 3; only executes if previous statement returned true
            userResponse=myScanner.nextLine(); // makes string hold the users reponse
            if (userResponse.equals("y") || userResponse.equals("Y")){ //returns true if the user says their number IS divisble by 3
                System.out.println("Is your answer 6?"); //asks the user if the number is 6; only executes if previous statement returned true 
                answerResponse=myScanner.nextLine(); // makes string hold the users reponse
                if(answerResponse.equals("n") || answerResponse.equals("N")){ //returns true if user said 6 was NOT their number 
                    System.out.println("That is not consistent"); //tells user this is not consistent; only executes if previous statement returned true 
                    } //ends above if statement 
                 else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //only executes if the above if statement returned false and user said 6 WAS their number 
                    System.out.println("YAY"); //prints out YAY; only executes if above statement returns true 
                } //ends above else if statement 
                else{ //only executes if user doesn't say yes or no when asked if their answer is 6
                    System.out.println("Sorry! Invalid input!"); //tells user they did not say yes or no 
                }// ends above else statement 
            }// ends if statement that executed when user said number WAS divisible by 3 
            
        
            else if (userResponse.equals("n") || userResponse.equals("N")){ //returns true if user said number is NOT divisible by 3
                System.out.println("Is it divisible by 4?"); //now asks user if number divisible by 4
                userResponse=myScanner.nextLine(); // makes string hold the users reponse
                    if (userResponse.equals("y") || userResponse.equals("Y")){ //returns true is user says their number IS divisible by 4
                        System.out.println("Is the number divided by 4 greater than one?"); //now asks user if number will be greater than 1 when divided by 4
                            if (userResponse.equals("y") || userResponse.equals("Y")){ //returns true is user says number WILL be greater than 1
                                System.out.println("Is your answer 8?"); //now asks user if number is 8
                                answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                                if(answerResponse.equals("n") || answerResponse.equals("N")){ //returns true if user says 8 is NOT their number
                                    System.out.println("That is not consistent"); //now tells user this is not consistent 
                                    } //ends above if statement 
                                else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says 8 IS their number
                                    System.out.println("YAY"); //now responds with "YAY"
                                } //ends above else-if statement
                                else{ //only executes if user doesent say yes or no when asked if their number is 8
                                    System.out.println("Sorry! Invalid input!"); //tells user they did not enter valid input
                                } //ends above else statement
                            } //ends if statement that executed when user said number WILL be greater than 1 when divided by 4  
                            else if (userResponse.equals("n") || userResponse.equals("N")){ //returns true if user says their number will NOT be greater than 1 when divided by 4
                                System.out.println("Is your answer 4?"); //now guesses if users number is 4
                                answerResponse=myScanner.nextLine(); // makes string hold the users reponse
                                if(answerResponse.equals("n") || answerResponse.equals("N")){ //returns true is user says 4 is NOT their answer
                                    System.out.println("That is not consistent"); //now tells user that is not consistent 
                                    } //ends above if statement 
                                else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says 4 IS their answer
                                    System.out.println("YAY"); //now responds with "YAY"
                                } //ends above else if statement 
                                else{ //only executes if user doesent say yes or no when asked if their number is 4
                                    System.out.println("Sorry! Invalid input!"); //tells user they did not enter valid input
                                } //ends above else statement 
                            } //ends else if statement that executes when user said number will NOT be greater than 1 when divided by 4   
                            else{ //only executed if user doesnt say yes or no when aksed if their number will be greater than 1 when divided by 4
                                System.out.println("Sorry! Invalid input!"); //tells user they did not enter a valid input
                            } //ends above else statement 
                        }//ends if statement that executed when user said number WAS divisible by 4 
                        
                    else if (userResponse.equals("n") || userResponse.equals("N")){ //returns true if user says their number is NOT divisible by 4
                        System.out.println("Is it divisble by 5?"); //now asks user if number is divisible by 5
                           if (userResponse.equals("y") || userResponse.equals("Y")){ //returns true if user says their number IS divisible by 5
                                System.out.println("Is your answer 10?"); //now guesses if the users number is 10 
                                answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                                    if(answerResponse.equals("n") || answerResponse.equals("N")){ //return true if user says their number is NOT 10
                                    System.out.println("That is not consistent"); //now tells user that is not consistent 
                                    } //ends above if statement 
                                    else if(answerResponse.equals("y") || answerResponse.equals("Y")){ // returns true if user says thier number IS 10
                                    System.out.println("YAY"); // now responds with "YAY"
                                    } //ends above else if statement 
                                    else{ //only executes if user doesnt say yes or no when asked if their number is 10
                                System.out.println("Sorry! Invalid input!"); //tells user they did not enter a valid input 
                                } //ends above else statement 
                           } //ends if statement that executed when user said their number WAS divisible by 5    
                            else if(userResponse.equals("n") || userResponse.equals("N")){ //returns true if user says numbr is NOT divisible by 5
                                System.out.println("Is your answer 2?"); // now guesses if users number is 2
                                answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                                    if(answerResponse.equals("n") || answerResponse.equals("N")){ //returns true if user says their number is NOT 2
                                    System.out.println("That is not consistent"); //now tells user that is not consistent 
                                    } //ends above if statement 
                                    else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says their number IS 2
                                    System.out.println("YAY"); // now responds with "YAY"
                                    } //ends above else if statement 
                                    else{ //only executes if user doesnt say yes or not when asked if their number is 2
                                    System.out.println("Sorry! Invalid input!"); //now tells user they did not enter a valid input 
                                    } //ends above else statement 
                                } //ends else if statement that executed when user said their number was NOT divisible by 5
                            else{ //only executes if user doesnt say yes or no when asked if their number is divisible by 5
                                System.out.println("Sorry! Invalid input!"); //now tells user they did not enter a valid input 
                            } //ends above else statement 
                        }//ends else if statement that executed when user said their number was NOT divisible by 4    
                
                    else{ //only executes when user doesnt say yes or not when asked if their number is divisible by 4
                        System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input
                    } //ends above else statement 
                } //ends else if statement that executed when user said their number was NOT divisible by 3    
             else{ //only executes when user doesnt say yes or not when asked if their number is divisible by 3
                        System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input
                    } //ends above else statement         
                } //ends if statement that executed when user said their number WAS even    
                
        else if(userResponse.equals("n") || userResponse.equals("N")){ //returns true if user says their number is NOT even 
            System.out.println("Is it divisible by 3?"); //now asks user if number is divisible by 3
            userResponse=myScanner.nextLine(); // makes string hold the users reponse about their number
            if(userResponse.equals("y") || userResponse.equals("Y")){ // returns true if user says number IS divisible by 3
                System.out.println("When divided by 3 is the result greater than 1"); //now asks user if the result is greater than 1 if the number is divided by 3
                userResponse=myScanner.nextLine(); // makes string hold the users reponse about their number
                    if (userResponse.equals("y") || userResponse.equals("Y")){ //returns true if user says number IS greater than 1 if divided by 3
                        System.out.println("Is your answer 9?"); //now guesses if the number is 9
                        answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                        if(answerResponse.equals("n") || answerResponse.equals("N")){ //returns true is user says their number is NOT 9
                            System.out.println("That is not consistent"); //now tells user that is not consistent 
                        } //ends above if statement 
                        else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says their number IS 9
                            System.out.println("YAY"); //now responds with "YAY"
                        } //ends above if else statement 
                        else{ //only executes if user doesnt say yes or no when asked if their number is 9
                            System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input   
                        } //ends above else statement 
                    } //ends if statement that executed when user said their number IS greater than 1 if divided by 3   
                    else if (userResponse.equals("n") || userResponse.equals("N")){ //returns true if user says number is NOT greater than 1 if divided by 3
                        System.out.println("Is your answer 3?"); //now guesses if the number is 3
                        answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                        if(answerResponse.equals("n") || answerResponse.equals("N")){ //returns true if user syas their number is NOT 3
                            System.out.println("That is not consistent"); //now tells user that is not consistent 
                        } //ends above if statement 
                        else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says their number IS 3
                            System.out.println("YAY"); //now responds with "YAY"
                        } //ends above else if statement 
                        else{ //only executes if user doesnt say yes or no when asked if their number is 3
                            System.out.println("Sorry! Invalid input!");
                        } //ends above else staement 
                    }//ends else if statement that executed when user number is NOT greater than 1 if divided by 3 
                     else{ //only executes if user doesnt say yes or no when asked if their number is greater than 1 if divided by 3
                            System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input   
                        } //ends above else statement 
                    }//ends if statement that executed when user said number WAS divisible by 3
            else if (userResponse.equals("n") || userResponse.equals("N")){ //returns true if user says number is NOT divisible by 3 
                System.out.println("Is it greater than 6?"); //now asks user if number is greater than 6
                userResponse=myScanner.nextLine(); // makes string hold the users reponse about their number
                    if (userResponse.equals("y") || userResponse.equals("Y")){ //returns true if user says their number IS greater than 6
                        System.out.println("Is your answer 7?"); // now guesses if the number is 7
                        answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                        if (answerResponse.equals("n") || answerResponse.equals("N")){ //returns true if user says their number is NOT 7
                            System.out.println("That is not consistent"); //now tells user that is not consistent 
                        } //ends above if statements
                        else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says their number IS 7
                            System.out.println("YAY"); //now responds with "YAY"
                        } //ends above else if statement 
                        else{ //only executes if user doesnt say yes or no when aksed if their number is 6
                            System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input 
                        } //ends above else statement 
                    } //ends if statement that executed when user said number IS greater than 6    
                
                
                    else if (userResponse.equals("n") || userResponse.equals("N")){ // returns true if user says their number is NOT greater than 6
                        System.out.println("Is it less than 3?"); //now asks user if number is less than 3
                        userResponse=myScanner.nextLine(); // makes string hold the users reponse about their number
                            if (userResponse.equals("y") || userResponse.equals("Y")){ //returns true if user says their number IS less than 3
                                System.out.println("Is your answer 1?"); //now guesses if their answer is 1
                                answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                                if (answerResponse.equals("n") || answerResponse.equals("N")){ //returns true if the user says their number is NOT 1
                                    System.out.println("That is not consistent"); // now tells user that is not consistent 
                                } //ends above if statement 
                                else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says their number IS 1
                                    System.out.println("YAY"); //now responds with "YAY"
                                } //ends above else if statement 
                                else{ //only executes if user doesnt say yes or no when asked if their number is 1
                                    System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input
                                } //ends above else statement 
                            } //ends if statement that executed when user said their number IS less than 3 
                    
                    
                            else if (userResponse.equals("n") || userResponse.equals("N")){ //returns true if user says their number is NOT less than 3
                                System.out.println("Is your answer 5?"); //now guesses if the number is 5 
                                answerResponse=myScanner.nextLine(); // makes string hold the users reponse about their answer
                                if (answerResponse.equals("n") || answerResponse.equals("N")){ //returns true if the user says their number is NOT 5
                                    System.out.println("That is not consistent"); // now tells user that is not consistent 
                                } //ends above if statement 
                                else if(answerResponse.equals("y") || answerResponse.equals("Y")){ //returns true if user says their number IS 5
                                    System.out.println("YAY"); //now responds with "YAY"
                                } //ends above else if statement 
                                else{ //only executes if user doesnt say yes or no when asked if their number is 5
                                    System.out.println("Sorry! Invalid input!"); //now tell user that is not a valid input  
                                } //ends the above else statement 
                            } //ends the else if statement that executed when user said their number is NOT less than 3
                            
                            else{ //only executes if user doesnt say yes or no when asked if their number is less than 3
                                System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input 
                            } //ends the above else statement      
                        } //ends the else if statement that executed when user said number was NOT greater than 6           
        
    
        
                    else{ //only executes if user doesnt say yes or no when asked if their number is greater than 6
                        System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input
                        }//ends the above else statement  
                }//ends the else if statement that executed when user said number was NOT divisible by 3    
                else{ //only executes if user doesnt say yes or no when asked if their number is divisible by 3
                    System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input
                        }//ends the above else statement 
                } //ends the else if statement that executed when the user said number was NOT even         
            else{//only executes if user doesnt say yes or no when asked if their number is even
                    System.out.println("Sorry! Invalid input!"); //now tells user that is not a valid input
                        }//ends the above else statement 

    } //ends the main method             
} //ends the class           

        
    