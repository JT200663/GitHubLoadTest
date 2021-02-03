
package calculator;

import java.math.*;

public class utility {
    
    private static int x =10;
    
    public static int add(int a, int b){
        return a+b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int divide(int a, int b){
       return a/b; 
    }
    public static int powerOf(int a, int b){
        return (int) Math.pow(a,b);
    }
}
