//Patrick McGuire
//Homework 13 - FourDwin Java Program 
// Uses methods to create a ragged 4D array and then uses insertion sort and selection sort 
// to arrange the array in order from smallest to largest within the outer array and then in the inner
// arrays.
import java.util.Scanner;
public class FourDwin {
    public static void main(String args []){
    Scanner scan = new Scanner(System.in);
    boolean goodInts = false, goodMin = false; 
    int X = 0, Y = 0;
    while (goodInts == false){
        if (goodMin == false){
            System.out.println("Please enter the minimum value for the possible length of the three dimensions");
            if (scan.hasNextInt()){
                X = scan.nextInt();
                goodMin = true;
            }
            else{
                System.out.println("Please enter a valid int value for the min");
                scan.next();
                continue;
            }
        }
        else{
            System.out.println("Please enter the maximum value for the possible length of the three dimensions");
            if(scan.hasNextInt()){
                Y = scan.nextInt();
                if (Y > X){
                    goodInts = true;
                }
                else{
                    System.out.println("Please enter a max value greater than the min");
                    continue;
                }
            }
            else{
                System.out.println("Please enter a valid int value for the max");
                scan.next();
                continue;
            }
        }
    }
    //int d1Length = 0, d2Length = 0, d3Length = 0;
    
    double [][][][] userArray = new double [3][][][];
    for (int a = 0; a < userArray.length; a++){
         int d1Length = (int)(Math.random() * (Y-X)) + X;
         userArray[a] = new double[d1Length][][];
        for (int b = 0; b < userArray[a].length; b++){
            int d2Length = (int)(Math.random() * (Y-X)) + X;
            userArray[a][b] = new double[d2Length][];
            for (int c = 0; c < userArray[a][b].length; c++){
                int d3Length = (int)(Math.random() * (Y-X)) + X;
                userArray[a][b][c] = new double[d3Length];
                for (int d = 0; d < userArray[a][b][c].length; d++){
                   userArray[a][b][c][d] = (Math.random() * 31);
                    }
                
                }
            }
        }
    
    System.out.println("Original Array:");
    for (int a = 0; a < userArray.length; a++){
        System.out.println("{");
        for (int b = 0; b < userArray[a].length; b++){
            System.out.print("{");
            for(int c = 0; c < userArray[a][b].length; c++){
                System.out.print("{");
                for (int d = 0; d < userArray[a][b][c].length; d++){
                    System.out.print(userArray[a][b][c][d]  + ",");
                }
             System.out.print("}");   
            }
            System.out.println("}");
        }
       System.out.println("}");
    }
    //System.out.print("}");
    System.out.println(" ");
    sort4DArray(userArray);
    sort3DArray(userArray);
    System.out.println("Sorted Array: ");
    for (int a = 0; a < userArray.length; a++){
        System.out.print("{");
        for (int b = 0; b < userArray[a].length; b++){
            System.out.print("{");
            for(int c = 0; c < userArray[a][b].length; c++){
                System.out.print("{");
                for (int d = 0; d < userArray[a][b][c].length; d++){
                    System.out.print(userArray[a][b][c][d]  + ",");
                }
             System.out.print("}");   
            }
            System.out.print("}");
        }
       System.out.print("}");
    }
    System.out.println(" ");
    statArray(userArray);
    }
    public static void statArray(double [][][][] array){
    double sum = 0;
    int elements = 3 + array[0].length + array[0][0].length + array[0][0][0].length;
    for (int a = 0; a < array.length; a++){
        for (int b = 0; b < array[a].length; b++){
            for (int c = 0; c < array[a][b].length; c++){
                for (int d = 0; d < array[a][b][c].length; d++){
                   sum +=array[a][b][c][d];
                }
            }
        }
    }
    double mean = sum/elements;
    System.out.println("Sum: " +sum);
    System.out.println("Mean: " +mean);
    System.out.println("Elements: " +elements);
    }
    public static double[][][][] sort4DArray(double[][][][] array) {
 		for (int i = 1; i < array.length; i++) {
 
 			for (int j = i-1; j >= 0; j--) {
 				int count= 0;
 				double min3D = 30;
 				for (int a = 0; a < array[j].length; a++) {
 					for (int b = 0; b < array[j][a].length; b++) {
 						for (int c = 0; c < array[j][a][b].length; c++) {
 							count++;
 							if (array[j][a][b][c] < min3D) {
 								min3D = array[j][a][b][c];
 							}
 						}
 					}
 				}
 
 				int countToken = 0;
 				double min3DToken = 30;
 				for (int a = 0; a < array[j+1].length; a++) {
 					for (int b = 0; b < array[j+1][a].length; b++) {
 						for (int c = 0; c < array[j+1][a][b].length; c++) {
 							countToken++;
 							if (array[j+1][a][b][c] < min3D) {
 								min3DToken = array[j+1][a][b][c];
 							}
 						}
 					}
 				}
 
 				if (count > countToken) {
 					double[][][] temp = array[j+1];
 					array[j+1] = array[j];
 					array[j] = temp;
 				} 
 				else if(count == countToken) {
 					if (min3D > min3DToken) {
 						double[][][] temp = array[j+1];
 						array[j+1] = array[j];
 						array[j] = temp;
 					}
 				}
 			}
 		}
 		return array;
 	}
 
 	public static double[][][][] sort3DArray(double[][][][] array) {
 		for (int i = 0; i < array.length; i++) {
 			for (int j = 0; j < array[i].length - 1; j++) {
 				int arrayIndex = j;
 				for (int a = i + 1; a < array[i].length; a++) {
 
 					int count = 0;
					double min = 30;
 					for (int b = 0; b < array[i][a].length; b++) {
 						for (int c = 0; c < array[i][a][b].length; c++) {
 							count++;
							if (array[i][a][b][c] < min) {
								min = array[i][a][b][c];
							}
 						}
 					}
 					
 					int countToken = 0;
					double minToken = 30;
 					for (a = 0; a < array[i][arrayIndex].length; a++) {
 						for (int b = 0; b < array[i][arrayIndex][a].length; b++) {
 							countToken++;
							if (array[i][arrayIndex][a][b] < min) {
								min = array[i][arrayIndex][a][b];
							}
 						}
 					}
 					
 					if (count < countToken) {
 						arrayIndex = a;
					}				
					 else if(count == countToken){
						if (min < minToken) {
							arrayIndex = a;
					}
					}
 					
 				}
 				double[][] temp = array[i][arrayIndex];
 				array[i][arrayIndex] = array[i][j];
 				array[i][j] = temp;
 			}
 		
 	    
 	}
 		return array;
 	}
}
