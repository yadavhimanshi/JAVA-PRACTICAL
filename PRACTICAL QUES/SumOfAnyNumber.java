
/*  Ques 7:-
            To find the sum of any number of integers interactively, i.e., entering every number from the 
            keyboard, whereas the total number of integers is given as a command line argument    
    solution:-
*/
import java.util.Scanner;

public class SumOfAnyNumber {
    public static void main(String args[]) {
        int sum = 0;
        System.out.println("Enter the numbers to get thier sum :");
        System.out.println("NOTE: Press 0 and hit enter to stop entering the numbers and get the output");
        for (int i = 1; i > 0;) {
            i = new Scanner(System.in).nextInt();
            sum += i;
        }
        System.out.println("The sum of the numbers you entered is : " + sum + ".");

    }
}
