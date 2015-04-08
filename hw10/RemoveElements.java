//Patrick McGuire 
//Homework 10 - Remove Elements java program 
//Uses methods to fill an array with random numbers then remove specified index and/or value from array

import java.util.Scanner; //imports scanner 

public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer= "";
	do{
  	    System.out.print("Random input 10 ints [0-9]");
  	    num = randomInput(num);
  	    String out = "The original array is:";
  	    out += listArray(num);
  	    System.out.println(out);
 
  	    System.out.print("Enter the index ");
  	    index = scan.nextInt();
  	    newArray1 = delete(num,index);
  	    String out1="The output array is ";
  	    out1+=listArray(newArray1);  
  	    System.out.println(out1);
 
        System.out.print("Enter the target value ");
  	    target = scan.nextInt();
  	    newArray2 = remove(num,target);
  	    String out2="The output array is ";
  	    out2+=listArray(newArray2);   
  	    System.out.println(out2);
  	 
  	    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	    answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
  
 public static int[] randomInput(int num[]) { //start of randomInput method
      for (int i=0; i < num.length; i++) {
        num[i] = (int) (Math.random() * 10); //assigns a random # b/t 0 and 9 to each value in array
        }
      return num;        
      } 
 
 public static int[] delete(int newNum[], int x) { //start of delete method
    int i = 0;
    int newLength = newNum.length - 1; //specifies new lenght of list 
    int num[] = new int[newLength]; //assigns this lenght to array 
   
    if (x < 0 || x > num.length) { //checks if index value is within range of array
        System.out.println("The index is not valid");
    
        return newNum;    //returns unaltered list    
    }

    for(int a = 0; a <= newLength.length; a++) { 
        if (a==x){ //checks to see if value is equal to index 
            continue; //if equal then not added to new array 
        }
        else{
            num[i] = newNum[a]; //if not equal then added to new array 
            i++;
        }
    }
         
     
 
     return num; //returns new array 
 }

 
    
 
 public static int[] remove(int newNum[], int y) { //start of remove method
      
     int a = 0;

		for (int i = 0; i < newNum.length; i++) {
			if (newNum[i] == y) {
				a++; //counts how many times the target number appears in array
			}
		}
		
		if (a == 0) {
			System.out.println("Element "+a+ " was not found"); 
			return newNum; //if number is not in array than returns unaltered array
		} else {
			System.out.println("Element "+a+ " has been found");
		}

		int num[] = new int[newNum.length - a]; //new length of list to take in account subtracted target value
		int b = 0;
		for (int i = 0; i < newNum.length; i++) {
			if (newNum[i] == y) {
				continue; //checks to see if number equals target and leaves it out of array 
			} else {
				num[b] = newNum[i];
				b++;
			}
		}

		return num; //returns new array 
     
 }
 
 public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	    if(j>0){
    	    out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
}
