package Recurision;
import java.util.*;
public class sum1ton {
static int sum1ton(int n){
    if(n==0){
        return 0;
    }
   return n + sum1ton(n - 1);
}

    public static void main(String[] args) {
        int n=5;
        int result = sum1ton(n);
        System.out.println(result);
        
    
}
}