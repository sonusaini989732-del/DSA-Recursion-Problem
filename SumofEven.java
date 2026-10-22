package Recurision;
import java.util.*;
public class SumofEven {
    static int SumofEven(int n){
         if(n==0){
        return 0;
    }
    if (n % 2 == 0) {
            return n + SumofEven(n - 1);
        } else {
            return SumofEven(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of even numbers = " + SumofEven(n));
    }
}
