package Basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to Check weather it is even or odd.");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is the Even Number.");
        }else{
            System.out.println(n+" is the Odd Number.");
        }
    }
}

//            ----Output----
//        Enter number to Check.
//        2
//        2 is the Even Number.
