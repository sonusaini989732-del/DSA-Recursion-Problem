package Recurision;
import java.util.*;
public class ReverseString {
   static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "sonu";
        System.out.println("Reverse String: " + reverse(s));
    }
}
