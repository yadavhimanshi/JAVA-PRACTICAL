/*  Ques:-12
            Write a program to show the difference between public and private access specifiers. The 
            program should also show that primitive data types are passed by value and objects are passed 
            by reference and to learn use of final keyword
    solution:-
*/
class ModifiedDistance {

    public int feet, inches;
    private int meters, centimeters;
    public final int kilo = 10;// final keyword

    ModifiedDistance(int f, int i) {
        meters = 15;
        centimeters = 25;
        this.feet = f;
        this.inches = i;
    }

    void display() {
        System.out.println("The value of feet is = " + feet);
        System.out.println("The value of inches is = " + inches);
        System.out.println("The value of meters is = " + meters);
        System.out.println("The value of centimeters is = " + centimeters);

    }

    void addDistance(ModifiedDistance d3) {
        // the value of kilo is = 10
        // because the final value can't be assigned
        d3.feet = d3.feet + kilo;
        d3.inches = d3.inches + kilo;

    }
}

public class PublicPrivate {

    public static void main(String args[]) {

        ModifiedDistance d1 = new ModifiedDistance(5, 10);
        ModifiedDistance d3 = new ModifiedDistance(10, 15);

        d1.display();
        // System.out.println("The value of meters is = "+d1.metrs);
        // metrs can't be accessed because of private access specifier
        // System.out.println("The value of centimeters is = "+d1.centimetrs);
        // centimeters can't be accessed because of private access specifier
        d1.addDistance(d3);
        d3.display();

    }
}