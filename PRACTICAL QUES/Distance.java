/*  Ques 9:-
            Write a program to create a “distance” class with methods where distance is computed in terms 
            of feet and inches, how to create objects of a class and to see the use of this pointer
    solution:-
*/

import java.util.Scanner;

class Dist {
    int feet, inches;

    void getDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void showDistance() {
        System.out.println("The length of feet is = " + feet);
        System.out.println("The length of inches is = " + inches);
    }
}

public class Distance {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the length of feet : ");
        int x = num.nextInt();
        System.out.print("Enter the length of inches : ");
        int y = num.nextInt();
        Dist obj = new Dist();
        obj.getDistance(x, y);
        num.close();
        obj.showDistance();

    }
}