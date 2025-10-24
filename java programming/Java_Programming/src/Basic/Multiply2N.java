package Basic;

import java.util.Scanner;

public class Multiply2N {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(j+"x"+n+"="+j*n);
            }
        }
    }
}
