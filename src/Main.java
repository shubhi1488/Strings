import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    // Main driver method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str= sc.nextLine();


        // For string 1
        System.out.print("String 1 :");

        if (isPalindrome(str))
            System.out.print("It is a pallindrome");
        else
            System.out.print("It is not a pallindrome");

    }
}
