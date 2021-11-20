/*Given two strings append them together(concatenation) and retrn the result.if the concatenation creates a double-char
then omit one of the chars.
sample :- s1=mark  s2=kate output - markate*/
 */
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class concatenation {
    public static String conCat(String st1, String st2)
    {
        if (st1.length() != 0 && st2.length() != 0
                && st1.charAt(st1.length() - 1) == st2.charAt(0))
            return st1 + st2.substring(1);
        return st1 + st2;
    }

    public static void main (String[] args)
    {
        String str1="mark";
        String str2="kate";

        System.out.println("The given strings are: "+str1+"  and  "+str2);
        System.out.println("The string after concatenation are: "+conCat(str1,str2));
    }
}
