
/*  Ques 6:-
            To check if a number is prime or not, by taking the number as input from the keyboard 
    solution:-
*/
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.print("Enter the number you want to check :");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int divisor = 2;
        n.close();
        if (num == 0) {
            System.out.println("Please enter a valid number.");
        } else if (num == 1) {
            System.out.println("Please enter a valid number");
        } else if (num % divisor == 0) {
            System.out.println("The number you entered is not prime");
        } else if (num % divisor == 1) {
            System.out.println("The number you entered is prime");
        }
    }

}
