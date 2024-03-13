/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestSquareMatrix {
    public static void main(String[] args) {
        SquareMatrixInterface s1=new SquareMatrix(3);
        System.out.println("s1:\n"+s1);
        s1.storeValue(1,1,1);
        s1.storeValue(1,2,2);
        s1.storeValue(1,3,3);
        s1.storeValue(2,1,4);
        s1.storeValue(2,2,5);
        s1.storeValue(2,3,6);
        s1.storeValue(3,1,7);
        s1.storeValue(3,2,8);
        s1.storeValue(3,3,9);
        System.out.println("\nAFter storeValue,s1:\n"+s1);
        s1.makeEmpty(2);//if i put 2,the values of first 2 row and columns of s1 will all become 0
        System.out.println("\nAfter makeEmpty certain column and ,s1:\n"+s1);
        SquareMatrixInterface s2=new SquareMatrix(3);
        s2.storeValue(1,1,7);
        s2.storeValue(1,2,6);
        s2.storeValue(1,3,5);
        s2.storeValue(2,1,1);
        s2.storeValue(2,2,2);
        s2.storeValue(2,3,1);
        s2.storeValue(3,1,0);
        s2.storeValue(3,2,3);
        s2.storeValue(3,3,4);
        SquareMatrixInterface s3=new SquareMatrix(3);
        s3=s1.add(s2);
        System.out.println("\ns1 + s2:\n"+s3);
        SquareMatrixInterface s4=new SquareMatrix(3);
        s4.storeValue(1,1,7);
        s4.storeValue(1,2,6);
        s4.storeValue(1,3,5);
        s4.storeValue(2,1,1);
        s4.storeValue(2,2,2);
        s4.storeValue(2,3,1);
        s4.storeValue(3,1,0);
        s4.storeValue(3,2,3);
        s4.storeValue(3,3,4);
        s1.copy(s4);
        System.out.println("\nAFter s1 copy values of s4,s1:\n"+s1);
    }
}
