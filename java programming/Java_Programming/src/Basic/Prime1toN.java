package Basic;

import java.util.Scanner;

public class Prime1toN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number.");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            Boolean isPrime=true;
            for(int j=2;j<=i;j++){
                if(i%j==0)
                    isPrime =false;
                break;
            }
            if(isPrime){
                System.out.print(i);
            }
        }
    }
}
