/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author Tang Chun Xuan
 */
public class MathUtil {

    public static void countUp(int n) {
        if (n > 1) {
            countUp(n - 1);
        }
        System.out.println(n);
    }

    //solve using recursive
    public static int rFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return rFib(n - 1) + rFib(n - 2);
        }
    }

    //solve using iteration
    public static int iFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int prevTwo = 1;
            int prevOne = 1;
            int current = 1;
            for (int i = 3; i <= n; i++) {
                current=prevOne+prevTwo;
                prevTwo=prevOne;
                prevOne=current;

            }
            return current;
        }
    }
    
    //solve using array
    private static int[] fibArr=new int[100];
    
    public static int aFib(int n){
        if(n==1||n==2)
            return 1;
        else if(fibArr[n]==0){
            fibArr[n]=aFib(n-1)+aFib(n-2);
        }
        return fibArr[n];
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; ++i) {
            System.out.printf("rfib(%d) = %d\n", i, rFib(i));
        }
        
        for (int i = 1; i <= 20; ++i) {
            System.out.printf("ifib(%d) = %d\n", i, iFib(i));
        }
        
        for (int i = 1; i <= 20; ++i) {
            System.out.printf("afib(%d) = %d\n", i, aFib(i));
        }
        countUp(3);
    }

//    public static void countUp(int n){
//        if(n==1){     
//            countUp(n-1);          
//        }
//        System.out.println(n);
//    }
}
