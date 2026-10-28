/**
*@author Anindita Roy
*CIS 36B
**/
import java.util.Scanner;

public class Matrix {

//Define scalarMult here
/**
*Multiplies all values in matrix by scalat and stores the result in result. 
*
*@param scalar scalar value to multiply by
*@param matrix original N x N matrix
@return result - a 2D array representing the matrix after scalar multiplication
**/
   public static int[][] scalarMult(int scalar, int[][] matrix){
      int i; 
      int j; 
      int len = matrix.length;
      int[][] result = new int[len][len];
      for(i = 0; i < matrix.length; i++){
         for(j = 0; j < matrix[i].length; j++){
            result[i][j] = matrix[i][j] * scalar;         
            }
         }
         return result;
      }


//Define printMatrix here
/**
*Prints a 2D matrix with spaces between numbers, one row per line. 
*@param matrix the matrix to print 
*
**/
   public static void printMatrix(int[][] result){
      int i;
      int j;
      for(i = 0; i < result.length; i++){
         for(j = 0; j < result[i].length; j++){
            if(j > 0){
               System.out.print(" ");               
               }
               System.out.print(result[i][j]);            
            }
            System.out.println(" ");
         }
      
      }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int len = scnr.nextInt();
      int scalar = scnr.nextInt();

      //declare your two 2D arrays here
      int[][] originalNumber = new int[len][len];
      int[][] multipliedNumber = new int[len][len];

      //read in the values to the first 2D array
      int i;
      int j;
      
      for(i = 0; i < len; i++){
         for(j = 0; j < len; j++){
            originalNumber[i][j] = scnr. nextInt();
            
            }
         }

      //call your methods here
      multipliedNumber = scalarMult(scalar, originalNumber);
      printMatrix(multipliedNumber);

   }
}
