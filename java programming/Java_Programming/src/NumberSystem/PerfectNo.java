package NumberSystem;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Perfect Number or not.");
        int n=sc.nextInt();
        int sum=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println(n+" is Perfect Number.");
        }else{
            System.out.println(n+" is not Perfect Number.");
        }
    }
}
