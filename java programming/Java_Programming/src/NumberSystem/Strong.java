package NumberSystem;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number.");
        int n=sc.nextInt();
        int t=n;
        int tFact=0;
        while(n!=0){
            n=n%10;
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            n=t/10;
            tFact=tFact+fact;
            System.out.println(tFact);
        }
        if(tFact==t){
            System.out.println(t+" is a Strong Number");
        }else{
            System.out.println(t+" is not a Strong Number");
        }
    }
}
