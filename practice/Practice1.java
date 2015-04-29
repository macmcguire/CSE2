import java.util.Scanner;
public class Practice1 {
 
 public static void main(String args []){
 String [] x = {"ba", "two", "paul", "one", "fifteen"};
 String [] y = range(x);
 for (int i = 0; i < y.length; i++){
  System.out.print(y[i] + " ");
 }
  }
 public static String [] range(String [] array){
  String [] newArray = new String [2];
  int minIndex = 0, maxIndex = array.length-1;
  int minimum = array[0].length();
  int maximum = array[array.length-1].length();
  for (int i =1; i < array.length; i++){
   if (array[i].length() < minimum){
    minimum = array[i].length();
    minIndex = i;
    newArray[0] = array[minIndex];
   }
    newArray[0] = array[minIndex];
   
  
  }
   for (int j =array.length-2; j > 0; j--){
    if(array[j].length() > maximum){
    maximum = array[j].length();
    maxIndex = j;
    newArray[1] = array[maxIndex];
   }
   newArray[1] = array[maxIndex];
  
  }
  
 return newArray;
 

}
}

