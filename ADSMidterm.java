import java.io.IOException;
import java.util.Scanner;

public class ADSMidterm {
	
	public static void main(String[]args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
	long startTime;
	long endTime;
	long elapsed;
	int val=0;
	int[] array1 = {1,2,3};
	int[] array2 = {1,2,3,4,5};
	int[] array3 = {1,2,4,5,6,7,8,9,3,2,4,5,6,7,4,3,5,6,4,3,1,4,5,7,8,8,8,76,44,234};
	int[] array4 = {1,2,4,5,6,7,8,9,3,2,4,5,6,7,4,3,5,6,4,3,1,4,5,7,8,8,8,76,44,234, 6,7,8,9,3,6,7,8,9,3};
	int[] array5 = {1,2,4,5,6,7,8,9,3,2,4,5,6,7,4,3,5,6,4,3,1,4,5,7,8,8,8,76,44,234,1,2,4,5,6,7,8,9,3,2,4,5,6,7,4,3,5,6,4,3,1,4,5,7,8,8,8,76,44,234};
    int i=0;
	int min;
	
	
	startTime = System.nanoTime();
	min = minVal(array1);
	endTime = System.nanoTime();
	elapsed = endTime - startTime;
	System.out.println("Minimum for array1 is: " + min + ". Found in " + elapsed + " seconds.");

	startTime = System.nanoTime();
	min = minVal(array2);
	endTime = System.nanoTime();
	elapsed = endTime - startTime;
	System.out.println("Minimum for array2 is: " + min + ". Found in " + elapsed + " seconds.");
	
	startTime = System.nanoTime();
	min = minVal(array3);
	endTime = System.nanoTime();
	elapsed = endTime - startTime;
	System.out.println("Minimum for array3 is: " + min + ". Found in " + elapsed + " seconds.");
	
	startTime = System.nanoTime();
	min = minVal(array4);
	endTime = System.nanoTime();
	elapsed = endTime - startTime;
	System.out.println("Minimum for array4 is: " + min + ". Found in " + elapsed + " seconds.");
	
	startTime = System.nanoTime();
	min = minVal(array5);
	endTime = System.nanoTime();
	elapsed = endTime - startTime;
	System.out.println("Minimum for array5 is: " + min + ". Found in " + elapsed + " seconds.");
}//end main
	
	public static int minVal(int[] array){
		int min;
		min=array[0];
		for(int i=1;i < array.length;i++){
			if(min>array[i]){
				min=array[i];
			}//end if
		}//end for
		return min;
	}//end min val
}//end class