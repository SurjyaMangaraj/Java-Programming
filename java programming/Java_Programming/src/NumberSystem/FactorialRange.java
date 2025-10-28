package NumberSystem;

import java.util.Scanner;

public class FactorialRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number.");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                fact=fact*j;
            }
            System.out.println(i+" factorial is "+fact);
            fact=1;
        }
    }
}
