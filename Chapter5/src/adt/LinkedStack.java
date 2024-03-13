/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author Tang Chun Xuan
 */
public class LinkedStack <T> implements StackInterface<T>{
    private Node topNode;

    public LinkedStack() {
        topNode=null;
    }

    @Override
    public String toString() {
        String str="";
        Node currentNode=topNode;
        while(currentNode!=null){
            str+=currentNode.data+"\n";
            currentNode=currentNode.next;
        }
        return str;
    }

    @Override
    public void push(T newEntry) {
        //1.create a new node with the givne value as the data
        Node newNode=new Node(newEntry);
        //2.link the new node to the top node
        newNode.next=topNode;
        //3.update topNode to point to the new Node
        topNode=newNode;
        
    }

    @Override
    public T pop() {
        T topElement=null;
        if(!isEmpty()){
            topElement=topNode.data;
            topNode=topNode.next;
        }
        return topElement;
    }

    @Override
    public T peek() {
        T topElement=null;
        if(!isEmpty()){
            topElement=topNode.data;
        }
        return topElement;
    }

    @Override
    public boolean isEmpty() {
        return topNode==null;
    }

    @Override
    public void clear() {
        //just assign topNode to null can success clear the linkedStack because when topNode no longer point
        //to topNode,the JVM will see the topNode in linkedStack as garbage and clean it,continued by no topNode
        //pointing to the topNode.next,the topNode.next will also same situation as topNode and get cleared
        topNode=null;
    }
    
    
    private class Node{
        T data;//use T as data type to represent generic data type
        Node next;//use Node itself as a data type for indicating next node

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
