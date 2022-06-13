
/*  Ques 18:-
            Write a program “DivideByZero” that takes two numbers a and b as input, computes a/b, and 
            invokes Arithmetic Exception to generate a message when the denominator is zero
    solution:-
*/
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.print("Enter the Value of a : ");
        int a = val.nextInt();
        System.out.print("Enter the Value of b : ");
        ;
        int b = val.nextInt();
        int c;
        val.close();
        try {
            c = a / b;
            System.out.print("The Value of " + a + " / " + b + " = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}