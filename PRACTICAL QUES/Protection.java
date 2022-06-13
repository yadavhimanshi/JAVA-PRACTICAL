
/*  ques 17:-
            Write a program that creates illustrates different levels of protection in classes/subclasses 
            belonging to same package or different packages 
    solution:-
 */
// package protection;

public class Protection {

    private int x = 20;
    public int y = 30;
    protected int z = 10; // Can be used by subclasses.

    int getX() {
        return x;
    }

    public static void main(String[] args) {
        adidas ad = new adidas();
        ad.display();
    }

}

class adidas extends Protection {
    public void display() {
        System.out.println("The value of x is " + getX());
        // Showing how the public member variable y is accessed in the class
        System.out.println("The value of y is " + y);
        // Showing how the protected member variable x is accessed in the class
        System.out.println("The value of z is " + z);

    }
}