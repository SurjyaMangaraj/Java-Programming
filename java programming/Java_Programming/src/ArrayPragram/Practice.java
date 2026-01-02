package ArrayPragram;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d=Count(n);
		boolean res=Isamstrong(n,d);
		if(res)
			System.out.println("Amstrong Number");
		else
		System.out.println("Not Amstrong Number");
	
   
}
	public static int Count(int n) {
		int c=0;
		while(n!=0) {
			int d=n%10;
			c++;
			n=n/10;
		}
		return c;
	}
	public static boolean Isamstrong(int n,int c) {
		int temp=n;
		int am=0;
		while(n!=0) {
			int d=n%10;
			am=am+pow(d,c);
			n=n/10;
		}
		return temp==am;
	}
	static int pow(int d, int c) {
		int pow=1;
		for(int i=1;i<=c;i++) {
			pow=pow*d;
		}
		return pow;
	}
	
	}
	



