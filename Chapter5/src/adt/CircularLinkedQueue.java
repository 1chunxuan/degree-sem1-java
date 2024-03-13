/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author Tang Chun Xuan
 */
public class CircularLinkedQueue<T> implements QueueInterface<T> {

    private Node lastNode;

    public CircularLinkedQueue() {
        lastNode = null;
    }

    @Override
    public Iterator<T> getIterator() {
        return new LinkedIterator();
    }

    @Override
    public String toString() {
        String str = "";
        if (!isEmpty()) {
            Node currentNode = lastNode.next;
            do {
                str += currentNode.data + " ";
                currentNode = currentNode.next;
            } while (currentNode != lastNode.next);
        }
        return str;
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);
        if (!isEmpty()) {
            //if directly lastNode.next=newnOde,no one pointing firstNode and all nodes cleared
            //so first use newNode.next=lastNode.next
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        } else {
            newNode.next = newNode;
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T frontElement = null;
        if (!isEmpty()) {
            frontElement = lastNode.next.data;
            if (lastNode.next == lastNode) {//only 1 node in the queue
                clear();
            }else{//more than 1 node
                lastNode.next=lastNode.next.next;
            }
        }
        return frontElement;
    }

    @Override
    public T getFront() {
        T frontElement = null;
        if (!isEmpty()) {
            frontElement = lastNode.next.data;
            
            
        }
        return frontElement;
    }

    @Override
    public boolean isEmpty() {
        return lastNode == null;
    }

    @Override
    public void clear() {
        lastNode = lastNode.next = null;
    }

    private class LinkedIterator implements Iterator<T>{
        Node currentNode=null;

        public LinkedIterator() {
            if(!isEmpty()){
                currentNode=lastNode.next;
            }
        }

        @Override
        public boolean hasNext() {
            return currentNode!=null;
        }

        @Override
        public T next() {
            T currentElement=null;
            if(hasNext()){
                currentElement=currentNode.data;
                if(currentNode==lastNode){//already processed last node
                    currentNode=null;
                }else{//have not processed last node
                    currentNode=currentNode.next;
                }
            }
            return currentElement;
        }
        
        
    }
    
    private class Node {

        T data;
        Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
}
