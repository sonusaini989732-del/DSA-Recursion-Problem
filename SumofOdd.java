package Recurision;
import java.util.*;
public class SumofOdd {
    static  int SumofOdd(int n){
         if(n==0){
        return 0;
    }
    if (n % 2 != 0) {
            return n + SumofOdd(n - 1);
        } else {
            return SumofOdd(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of even numbers = " + SumofOdd(n));
    }
    
}
