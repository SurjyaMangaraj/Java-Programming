package Basic;

import java.util.Scanner;

public class Sum1toN {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n.");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The total sum is "+sum);
    }
}

//            ----Output----
//            Enter the value of n.
//            10
//            The total sum is 55
