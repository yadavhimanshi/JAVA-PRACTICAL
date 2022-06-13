/*  Ques 15:-
            Create a multi-file program where in one file a string message is taken as input from the user 
            and the function to display the message on the screen is given in another file (make use of 
            Scanner package in this program).  
    solution:-
*/

import MultiFile.MultiFilePackage;

public class MultiFileProgram {
    public static void main(String args[]) {

        MultiFilePackage p1 = new MultiFilePackage();
        p1.readString();
        System.out.println("The string you entered is: " + p1.str1);
    }
}