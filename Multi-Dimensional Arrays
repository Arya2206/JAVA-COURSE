//Write a class TransposeMatrix with a public method transposeMatrix that takes one parameter matrix1 of type int[][] which returns the transpose of the given matrix.

package q11105;
public class TransposeMatrix {

public int[][] transposeMatrix(int[][] matrix1) {
		if(matrix1 == null || matrix1.length == 0){
			return new int[0][0];
		}
	int rows = matrix1.length;
	int cols = matrix1[0].length;
		int [][] transpose = new int[cols][rows];
	for(int i=0;i<rows;i++){
		for(int j = 0; j<cols; j++){
			transpose[j][i] = matrix1[i][j];
		}
	}
	return transpose;
		
	}
}


//Write a class MultiplicationOfMatrix with a public method multiplication which returns the multiplication result of its arguments. if the first argument column size is not equal to the row size of the second argument, then the method should return null.

package q11106;


public class MultiplicationOfMatrix{
	public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
		
		if(matrix1[0].length != matrix2.length){
			return null;
		}
		int rows = matrix1.length;
		int cols = matrix2[0].length;
		int common = matrix1[0].length;
		int[][] result = new int[rows][cols];
		for(int i= 0; i<rows; i++){
			for(int j = 0;j<cols;j++){
				for(int k=0;k<common ;k++){
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}
}

//Write a class AdditionOfMatrix with a public method add which returns the sum of its arguments. If the two arguments are not matrices of the same size, then the method should return null.
package q11053;
public class AdditionOfMatrix {
	public int[][] add(int[][] matrix1, int[][] matrix2) {
		
		if(matrix1 == null || matrix2 == null){
			return null;
		}
		if(matrix1.length != matrix2.length){
			return null;
		}
		for(int i=0;i<matrix1.length;i++){
			if(matrix1[i].length != matrix2[i].length){
				return null;
			}
		}
		int[][] result = new int[matrix1.length][];
		for(int i=0;i<matrix1.length;i++){
			result[i] = new int[matrix1[i].length];
			for(int j = 0; j<matrix1[i].length;j++){
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}
}

//The class MultiDimArrayPrinter prints a multidimensional array of integers.

package q10947;
import java.util.*;
public class MultiDimArrayPrinter {
	public static void main(String[] args) {
		int[][] int2DArr = {
							{1},
							{2, 3},
							{4, 5, 6},
							{7, 8, 9, 10}
						};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int num = 1;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
