/*  Ques 8:-
            Write a program that show working of different functions of String and StringBufferclasss like 
            setCharAt(, setLength(), append(), insert(), concat()and equals().
    solution:-
*/

public class Stringfunction {
    public static void main(String[] args) {
        StringBuffer strbuff = new StringBuffer("HIMANSHI");
        StringBuilder strbuild = new StringBuilder("HEY! THIS IS A STRING");
        // printing the original string
        System.out.println("The original String is : " + strbuild);
        // using .setCharAt
        strbuild.setCharAt(0, 'S');
        // printing the changed string
        System.out.println("After using setCharAt(0,'S') the string is : " + strbuild);
        ;
        // using .append
        strbuild.append(true);
        System.out.println("After using append() the string is : " + strbuild);
        // printing string length
        System.out.println(
                "The original length of the string is : " + strbuff.length() + ". And the string is : " + strbuff);
        // using .setLength
        strbuff.setLength(6);
        System.out.println("After using setLength(6) length the new length of the string is : " + strbuff.length()
                + ". And the string is : " + strbuff);
        // using .insert
        strbuff.insert(6, 'h');
        System.out.println("After using insert(6,'h') " + strbuff);
        String str1 = "HIMANSHI", test = "HIMANSHI";
        String str2 = " YADAV";
        System.out.println(str1.equals(test)); // returns true
        System.out.println(str1.equals(str2)); // returns false
        System.out.println(str1.concat(str2)); // returns combined strings

    }
}