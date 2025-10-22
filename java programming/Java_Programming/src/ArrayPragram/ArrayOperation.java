package ArrayPragram;

import java.util.Scanner;

public class ArrayOperation {
 public int[] arrayread(int size){
	 Scanner s=new Scanner(System.in);
	 int arr[]=new int[size];
	 System.out.println("enter the elements of array ");
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=s.nextInt();
	 }
	 System.out.println("Thanks for using this Array ");
	 return arr ;
 }
 public void displayarray(int []arr) {
	 System.out.println("The array elements are");
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	 } 
}
 }

