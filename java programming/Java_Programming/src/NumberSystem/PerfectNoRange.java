package NumberSystem;

import java.util.Scanner;

public class PerfectNoRange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number.");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isPerfect(i)){
                System.out.println(i+" is perfect Number.");
            }
        }

    }

    public static Boolean isPerfect(int num){
        int sum=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            return true;
        }else {
            return false;
        }

    }
}
