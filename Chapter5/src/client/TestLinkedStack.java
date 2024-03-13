/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.*;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestLinkedStack {
    public static void main(String[] args) {
        StackInterface<Integer> s=new LinkedStack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("\nStack contains:\n"+s);
        
        System.out.println("pop an element: "+s.pop());
        System.out.println("pop an element: "+s.pop());
        while(!s.isEmpty()){
            s.pop();
        }
        System.out.println("Stack is empty: "+s.isEmpty());
    }
}
