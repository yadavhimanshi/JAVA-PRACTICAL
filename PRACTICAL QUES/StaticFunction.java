/*  Ques 13:-
            Write a program to show the use of static functions and to pass variable length arguments in a function.
    solution:-
*/
class Calc {

    public int m, cm;
    static int total = 0;

    Calc(int f, int i) {

        this.m = f;
        this.cm = i;
    }

    void display() {
        System.out.println("Metre = " + m);
        System.out.println("Centimetre =  " + cm);

    }

    public static void addDistance() {

        total = total + 100;
        System.out.println("value of static total =   " + total);

    }

    public void varDistance(int... a) {
        System.out.println("Variable length arguments : ");

        for (int i : a) {
            System.out.println(i);
        }

    }
}

public class StaticFunction {
    public static void main(String args[]) {

        Calc d1 = new Calc(100, 200);
        d1.display();
        Calc.addDistance();
        Calc.addDistance();
        d1.varDistance(100, 200, 300, 400);

    }
}