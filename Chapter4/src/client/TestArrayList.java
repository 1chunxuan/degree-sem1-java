/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.*;
import java.util.Scanner;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestArrayList {
    public static void main(String[] args) {
        ListInterface<Integer> aList=new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            System.out.println("***TRACE:Adding "+i*10);
            aList.add(i*10);
        }
        System.out.println("\naList:\n"+aList);
        
        ListInterface<Integer> bList=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("***TRACE:Adding "+i*10);
            bList.add(i,i*10);
        }
        System.out.println("\nbList:\n"+bList);
        
        //additional testing below
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter number to search");
        int age = myObj.nextInt();
        System.out.println(bList.contains(age));
        System.out.println("length of blist"+bList.getNumberOfEntries());
       
        System.out.println(bList.remove(age));
        System.out.println(bList);
        System.out.println("length of blist"+bList.getNumberOfEntries());
    }
}
