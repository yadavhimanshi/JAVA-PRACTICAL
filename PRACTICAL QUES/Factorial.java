
/*  Ques 2:-
        To find the factorial of a given number
    solution:-
*/
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int i, Factorial = 1;
        // taking the input for the factorial
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        // calculate the factorial
        for (i = 1; i <= a; i++) {
            Factorial = Factorial * i;
        }
        // print the factorial
        System.out.println("The factorial of the number entered is : " + Factorial);
    }
}
