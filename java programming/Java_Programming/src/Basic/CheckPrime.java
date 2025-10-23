package Basic;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number.");
        int n = sc.nextInt();
        int i;
        for( i=2;i<n;i++){
            Boolean isPrime=true;
            if(n%i==0)
                System.out.println("Not a Prime Number.");
            break;

        }
            System.out.println("Prime Number.");
    }
}
