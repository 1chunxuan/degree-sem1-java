/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.*;
import java.util.Iterator;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestArraySet {
    
    public static void main(String[] args) {
        SetInterface<Integer> setA=new ArraySet<>();
        System.out.println("add 10 in set A: "+setA.add(10));
        System.out.println("add 20 in set A: "+setA.add(20));
        System.out.println("add 30 in set A: "+setA.add(30));
        System.out.println("add 40 in set A: "+setA.add(40));
        System.out.println("add 50 in set A: "+setA.add(50));
        System.out.println("add 10 in set A: "+setA.add(10));
        System.out.println("add 30 in set A: "+setA.add(30));
        System.out.println("add 50 in set A: "+setA.add(50));
        System.out.println("\nset A: "+setA);
        
        int sum=0;
        Iterator<Integer> it=setA.getIterator();
        while(it.hasNext()){
            sum+=it.next();
        }
        System.out.println("Sum of all set A's elements : "+sum);
        System.out.println("\n\n");
        
        System.out.println("Remove 50: "+setA.remove(50));
        System.out.println("\nset A: "+setA);
        setA.remove(30);
        setA.remove(10);
        System.out.println("\nset A: "+setA);
        setA.remove(50);
        setA.remove(30);
        setA.remove(10);
        System.out.println(""+setA.remove(50));
        
        SetInterface<Integer> setB=new ArraySet<>();
        System.out.println("add 60 in set B: "+setB.add(60));
        System.out.println("add 70 in set B: "+setB.add(70));
        System.out.println("add 40 in set B: "+setB.add(40));
        setB.union(setA);
        System.out.println("\nAfter union with set A,set B: "+setB);
        
        SetInterface<Integer> setE=new ArraySet<>();
        System.out.println("add 10 in set E: "+setE.add(10));
        System.out.println("add 20 in set E: "+setE.add(20));
        System.out.println("add 30 in set E: "+setE.add(30));
        System.out.println("add 40 in set E: "+setE.add(40));
        System.out.println("add 50 in set E: "+setE.add(50));
        
        SetInterface<Integer> setF=new ArraySet<>();
        System.out.println("add 20 in set F: "+setF.add(20));
        System.out.println("add 35 in set F: "+setF.add(35));
        System.out.println("add 45 in set F: "+setF.add(45));
        System.out.println("add 50 in set F: "+setF.add(50));
        
        System.out.println(""+setE.checkSubset(setF));
        
        SetInterface<Integer> setG=new ArraySet<>();
        setG=setE.intersection(setF);
        System.out.println("Intersect between set E and set F: "+setG);
        
        
    }
}
