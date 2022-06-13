/*  Ques 11:-
            Write a program to show that during function overloading, if no matching argument is found, 
            then java will apply automatic type conversions(from lower to higher data type
    solution:-
*/
class Test {
	void FunOver(int a) {
		System.out.println("The value stored in int data type is : " + a);
	}

	void FunOver(float b) {
		System.out.println("The value stored in float data type is : " + b);
	}

	void FunOver(double c) {
		System.out.println("The value stored in double data type is : " + c);
	}
}

public class FunctionOverloading {
	public static void main(String[] args) {
		int a = 10;
		float b = 187.43f;
		double c = 623984.2562954;
		;

		Test s1 = new Test();
		s1.FunOver(a);
		s1.FunOver(b);
		s1.FunOver(c);
	}
}
