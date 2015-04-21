//Patrick McGuire 
//Homework 12
// Multiply Java Program 

import java.util.Scanner;

public class Multiply {

    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int matrix1Width = 0, matrix1Height= 0, matrix2Width = 0, matrix2Height = 0;
        boolean Matrix = false, Matrix1 = false, Matrix1w = false, Matrix2 = false, Matrix2w = false;
        System.out.println("Please enter the width and height for two matrixes");
        while (Matrix == false){ //returns true as long as both matrix values have not been properly entered 
        if (scan.hasNextInt()){
            if (Matrix1 == false) { //returns true as long as the first matrix values have not beeen properly enetered  
                if (Matrix1w == false) { //returns true as long as the width for the first matrix has not been properly entered 
                    matrix1Width = scan.nextInt();
                    if (matrix1Width > 0) {
                        Matrix1w = true;
                        continue;
                    }
                    else {
                    System.out.println("Please enter a positive int for width of matrix 1");
                    continue;
                    }
                }
                else {
                     matrix1Height = scan.nextInt();
                    if (matrix1Height > 0){
                        Matrix1 = true;
                    }
                    else{
                    System.out.println("Please enter a positive int for height of matrix 1"); //returns error message if user does not enter a positve int
                    continue;
                    }
                }
            }
            else {
                if (Matrix2w == false) {
                    matrix2Width = scan.nextInt();
                    if (matrix2Width > 0) {
                        Matrix2w=true;
                        continue;
                    }
                    else {
                        System.out.println("Please enter a positive int for width of matrix 2");
                        continue;
                    }
                }
                else {
                    matrix2Height = scan.nextInt();
                    if (matrix2Height > 0){
                        if (matrix2Height == matrix1Width){ //checks that the height of the second matrix is equal to the width of the first one 
                            Matrix2 = true;
                            Matrix = true; //if this check passes then both matrixes have proper height and width values 
                        }
                        else {
                        System.out.println("Please enter a height for matrix 2 that equals the width of matrix 1");
                        continue;
                        }
                    }
                    else{
                        System.out.println("Please enter a positive int for height of matrix 2");
                        continue;
                    }
                }
            }
            
        } 
        else {
            System.out.println("Please enter an integer"); //returns error message if user does not enter an int
            scan.next();
            continue;
        }
        }
        int [][] matrixArray1 = randomMatrix(matrix1Width, matrix1Height); //calls on the randomMatrix method
        int [][] matrixArray2 = randomMatrix(matrix2Width, matrix2Height);
        printMatrix(matrixArray1); //calls on the printMatrix method 
        printMatrix(matrixArray2);
        int[][] productMatrix = multiplyMatrix(matrixArray1, matrixArray2); //calls on the productMatrix method 
        printMatrix(productMatrix);
    }// ends main method 
    public static int [][] randomMatrix(int width, int height) { //start of randomMatrix method 
        int [][] matrixarray = new int [width][height];
        for (int row = 0; row < matrixarray.length; row++){ //fills array with random ints between given range
            for (int column = 0; column < matrixarray[row].length; column++){
                matrixarray[row][column] = (int)(Math.random() * 21) - 10;
            }
        }
        return matrixarray; //passes the new array back to the main method 
        
    } // ends randomMatrix method
    public static void printMatrix(int [][] matrixarray){ //start of printMatrix method 
        
        for (int row = 0; row < matrixarray.length; row++) { //prints out the array 
            for (int column = 0; column < matrixarray[row].length; column++){
                System.out.print(matrixarray[row][column] + " ");
            }
            System.out.println();
        }
    } //ends the printMatrix method 
    public static int [][] multiplyMatrix(int[][]firstMatrixArray, int[][]secondMatrixArray){ //start of multiplyMatrix method 
        int sum = 0;
        int [][] productMatrix = new int [firstMatrixArray.length][secondMatrixArray[0].length]; //creates new array to pass back to main method
        if (firstMatrixArray.length != secondMatrixArray[0].length){
            System.out.println("Invalid length and width");
            return productMatrix; //returns void (unchanged) if length and width did not match properly 
            }
        else {
            
        for (int a= 0; a < firstMatrixArray.length; a++){ 
            for (int b = 0; b < secondMatrixArray[0].length; b++){
                for (int c = 0; c < secondMatrixArray.length; c++){
                    sum = sum + firstMatrixArray[a][c]*secondMatrixArray[c][b]; //adds the products of each linear combination 
                }
                 productMatrix[a][b] = sum; //assigns the sum to a value on the new array 
                  sum = 0; //resets sum 
                
            }
           
               
            }
            return productMatrix; //passes back the new array to the main method 
        }
} //ends the multiplyMatrix method
} //ends public class Multiply 
