import java.util.Scanner;

/* Ques 1 :-
       To find the sum of any number of integers entered as command line arguments

*/

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the numbers to be added");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        System.out.println("The sum of all integers entered as command line arguments is " + (a + b) + ".");

    }
}
