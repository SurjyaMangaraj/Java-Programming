package Basic;

import java.util.Scanner;

public class SumOfPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number.");
        int n = sc.nextInt();
        int sum=0;
    for(int i=2;i<=n;i++){
        if(isPrime(i)) {
            System.out.print(i);
            sum = sum + i;
        }
    }
        System.out.println("The total sum of all Prime Number is "+sum);
    }

    public static Boolean isPrime(int num){
       if(num==1) return false;
       for(int i=2;i<num;i++){
           if(num%i==0){
               return false;
           }
       }
        return true;
    }
}


