
/*  ques 16:-
            Write a program to create a multilevel package and also creates a reusable class to generate 
            Fibonacci series, where the function to generate Fibonacii series is given in a different file 
            belonging to the same package.
    solution:-
*/
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int len;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length you want the string to be of : ");
        len = in.nextInt();
        in.close();
        int[] arr = new int[len];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < len; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.print("The Fibonacci Series is : ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
