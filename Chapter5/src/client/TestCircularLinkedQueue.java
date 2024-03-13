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
public class TestCircularLinkedQueue {
    public static void main(String[] args) {
        QueueInterface<Integer> queue=new CircularLinkedQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("\nqueue elements :"+queue);
        
        int sum=0;
        Iterator<Integer> it=queue.getIterator();
        while(it.hasNext()){
            sum+=it.next();
        }
        System.out.println("sum of queue elements :"+sum);
        
        System.out.println("queue is empty ?"+queue.isEmpty());
        System.out.println("\nDequeue an element :"+queue.dequeue());
        System.out.println("queue elements:"+queue);
        System.out.println("\nDequeue an element :"+queue.dequeue());
        System.out.println("queue elements:"+queue);
        System.out.println("\nDequeue an element :"+queue.dequeue());
        System.out.println("queue elements:"+queue);
        System.out.println("\nDequeue an element :"+queue.dequeue());
        System.out.println("queue elements:"+queue);
        System.out.println("queue is empty ?"+queue.isEmpty());
        
        
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("\nqueue elements :"+queue);
        System.out.println("\ngetFront an element :"+queue.getFront());
        
        
    }
}
