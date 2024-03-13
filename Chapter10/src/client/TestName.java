/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import entity.Name;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestName {

    private static final int TABLE_SIZE = 11;

    private static int getHashIndex(Name name) {
        return name.hashCode() % TABLE_SIZE;
    }

    public static void main(String[] args) {
        Name n1 = new Name("ABE", "LINCOLN");
        Name n2 = new Name("BEA", "ARTHUR");
        System.out.println("\nName :" + n1);
        System.out.println("HashCode :" + n1.hashCode());
        System.out.println("HashIndex :" + getHashIndex(n1));

        System.out.println("\nName :" + n2);
        System.out.println("HashCode :" + n2.hashCode());
        System.out.println("HashIndex :" + getHashIndex(n2));
        
        int num=Integer.MAX_VALUE;
        System.out.println("\n\nMax Integer: "+num);
        num+=10;
        System.out.println("num+=10 :"+num);
        
        
    }

}
