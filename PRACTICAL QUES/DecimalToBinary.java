
/*  Ques 5:-
            To convert a decimal to binary number
    solution:-
*/
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        System.out.print("Enter the Decimal Number to convert to binary : ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        num.close();
        System.out.print("The converted Binary Number is : ");
        System.out.println(Integer.toBinaryString(a));
    }
}