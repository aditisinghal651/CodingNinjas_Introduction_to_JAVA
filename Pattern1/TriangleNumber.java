package IntroductionToJava.Pattern1;

import java.util.Scanner;

public class TriangleNumber {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        triangularNum(n);
    }

    private static void triangularNum(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
