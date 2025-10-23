package Pattern;

import java.util.Scanner;

public class LeftTriangleStar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to print the left triangle star pattern");
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
		}
	}

}
