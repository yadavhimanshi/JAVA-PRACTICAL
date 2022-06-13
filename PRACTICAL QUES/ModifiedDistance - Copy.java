/*  Ques 10:-
            10. Modify the “distance” class by creating constructor for assigning values (feet and inches) to the 
            distance object. Create another object and assign second object as reference variable to another 
            object reference variable. Further create a third object which is a clone of the first object

    solution:-
*/
class Dist {
    int feet;
    int inch;

    Dist(int f, int i) {
        // creating constructor
        feet = f;
        inch = i;
        System.out.println("Constructor");
    }

    void disp() {
        System.out.println("Feet: " + feet);
        System.out.println("Inch: " + inch);
    }

    Dist(Dist clone) {
        // copy constructor
        feet = clone.feet;
        inch = clone.inch;
        System.out.println("Clone Constructor");
    }
}

public class ModifiedDistance {
    public static void main(String[] args) {
        Dist d1 = new Dist(3, 5);
        Dist d2 = new Dist(d1);
        d1.disp();
        d2.disp();
    }
}