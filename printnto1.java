package Recurision;
import java.util.*;
public class printnto1 {
    static void printnto1(int n){
       if(n==6){
            return;
        }
        printnto1(n+1);
        System.out.println(n);
 }
 public static void main(String[] args) {
    int n=1;
   printnto1(n);
 }
}
