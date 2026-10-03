import java.util.Arrays;
import java.util.Scanner;

class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
        } else {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b))
                System.out.println("Anagram");
            else
                System.out.println("Not an Anagram");
        }
    }
}