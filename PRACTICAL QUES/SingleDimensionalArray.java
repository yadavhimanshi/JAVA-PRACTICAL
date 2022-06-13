/*  Ques 3:-
            To learn use of single dimensional array by defining the array dynamically.
    solution:-
*/

import java.util.Scanner;

class DynamicSingleDimensionArray {
    int size;
    int[] arr;
    Scanner sc = new Scanner(System.in);

    public DynamicSingleDimensionArray(int s) {
        size = s;
    }

    public void valuesPassinginArray() {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of array at position " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    public void addingElement() {
        System.out.print("How much more elements do you want to add to the array? : ");
        int n = sc.nextInt();
        try {
            if (n <= 0) {
                throw new Exception("Number of elements must be greater than zero!");
            }
            int h1 = size;
            size += n;
            int[] arr1 = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            for (int i1 = h1; i1 < size; i1++) {
                System.out.print("Enter the value to be at the " + i1 + " position of added elements ");
                arr1[i1] = sc.nextInt();
            }

            arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = arr1[i];
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("The value at position " + i + " of the array is : " + arr[i]);
        }
    }

}

public class SingleDimensionalArray {
    public static void main(String[] args) {

        DynamicSingleDimensionArray obj1 = new DynamicSingleDimensionArray(5);
        obj1.valuesPassinginArray();
        obj1.addingElement();
        obj1.print();

    }
}