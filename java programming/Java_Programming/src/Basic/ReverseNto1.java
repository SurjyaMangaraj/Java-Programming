package Basic;

import java.util.Scanner;

public class ReverseNto1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N.");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
