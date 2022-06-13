/*  Ques 4:-
            To learn use of in case of a two dimensional array
    solution:-
*/

import java.util.*;

public class TwoDimensionalArrays {
    static ArrayList<int[]> l1 = new ArrayList<int[]>();
    static Scanner sc = new Scanner(System.in);

    public static void add() {
        System.out.print("Enter the total number of rows to be in the array : ");
        try {
            int r1 = sc.nextInt();
            if (r1 <= 0) {
                throw new Exception("Size of row cannot be negative or zero!");
            }
            int i = 1;
            while (r1 > 0) {
                System.out.print("Enter the number of columns for row number " + i + " : ");
                int c = sc.nextInt();
                int[] arr = new int[c];
                int p = 0;
                for (int i1 = 0; i1 < arr.length; i1++) {
                    System.out.print("Enter the value of first row at place " + i1 + " : ");
                    int g = sc.nextInt();
                    arr[p] = g;
                    p++;
                }
                l1.add(arr);
                r1--;
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }

    public static void print() {
        for (int[] h : l1) {
            System.out.println(Arrays.toString(h));
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the total number of rows to be in the array : ");
        try {
            int r = sc.nextInt();
            if (r <= 0) {
                throw new Exception("Size of row cannot be negative or zero!");
            }
            int i = 1;
            while (r > 0) {
                System.out.print("Enter the number of columns for row number " + i + " : ");
                int c = sc.nextInt();
                int[] arr = new int[c];
                int p = 0;
                for (int i1 = 0; i1 < arr.length; i1++) {
                    System.out.print("Enter the value of first row at place " + i1 + " : ");
                    int g = sc.nextInt();
                    arr[p] = g;
                    p++;
                }
                l1.add(arr);
                r--;
                i++;
            }
            print();
            add();
            print();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}