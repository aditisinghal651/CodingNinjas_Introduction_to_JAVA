package IntroductionToJava.Arrays;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        arraySum(arrayInput());
    }

    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Test Cases:");
        int t = sc.nextInt();
        int[] arr = new int[0];

        for (int i = 1; i <= t; i++) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            System.out.println("Enter array elements: ");
            arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
        }
        return arr;
    }

    private static void arraySum(int[] arr) {
        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum = sum + arr[i];
//        }
        // enhanced for loop
        for(int number : arr){
            sum += number;
        }
        System.out.println(sum);
    }
}
