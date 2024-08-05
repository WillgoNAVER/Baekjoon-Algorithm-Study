
import java.util.Scanner;

public class Main {

	private static int[][] InitArr(int arr[][], int row, int column, Scanner sc){
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int arr1[][] = new int[row][column];
		int arr2[][] = new int[row][column];
		
		InitArr(arr1, row, column, sc);
		InitArr(arr2, row, column, sc);
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(arr1[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}