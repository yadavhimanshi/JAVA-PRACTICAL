
/*  Ques 20:-
            Write a program to create your own exception types to handle situation specific to your 
            application (Hint: Define a subclass of Exception which itself is a subclass of Throwable).
    solution:-
 */
import java.util.Scanner;

public class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }

}

class Demo {
    static void find(int arr[], int item) throws MyException {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i])
                flag = true;
        }
        if (!flag) {
            throw new MyException("Item Not Found"); // calling constructor of user-defined exception class
        } else {
            System.out.println("Item Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number to find :");
        int a = sc.nextInt();
        sc.close();
        try {
            find(new int[] { 12, 25, 45, 67, 34, 45, 6, 7, 98, 23 }, a);
        } catch (MyException i) {
            System.out.println(i);
        }
    }

    public String getPriority() {
        return null;
    }

    public void setPriority(int i) {
    }
}
