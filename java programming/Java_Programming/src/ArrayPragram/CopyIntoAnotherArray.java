package ArrayPragram;

import java.util.Scanner;

public class CopyIntoAnotherArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array.");
		int size=s.nextInt();
		int []arr1=new int[size];
		int []copy=new int[arr1.length];
		System.out.println("enter the"+size+"values");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++) {
			copy[i]=arr1[i];
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]);
		}
	}

}

