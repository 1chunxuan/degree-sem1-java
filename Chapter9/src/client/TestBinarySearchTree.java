/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;
import adt.BinarySearchTree;
import java.util.Iterator;
/**
 *
 * @author Tang Chun Xuan
 */
public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer>bTree=new BinarySearchTree<>();
        bTree.add(50);
        bTree.add(30);
        bTree.add(80);
        bTree.add(70);
        bTree.add(10);
        bTree.add(40);
        bTree.add(60);
        bTree.add(90);
        bTree.add(20);
        System.out.println("Inorder traversal: ");
        Iterator<Integer>it=bTree.getInorderIterator();
        while(it.hasNext())
            System.out.println(it.next()+" ");
        System.out.println("");
        
        
        bTree.add(50);
        bTree.add(30);
        bTree.add(80);
        bTree.add(70);
        bTree.add(10);
        bTree.add(40);
        bTree.add(60);
        bTree.add(90);
        bTree.add(20);
        System.out.println("Preorder traversal: ");
        Iterator<Integer>it2=bTree.getPreorderIterator();
        while(it2.hasNext())
            System.out.println(it2.next()+" ");
        System.out.println("");
        
        
        
        bTree.add(50);
        bTree.add(30);
        bTree.add(80);
        bTree.add(70);
        bTree.add(10);
        bTree.add(40);
        bTree.add(60);
        bTree.add(90);
        bTree.add(20);
        System.out.println("Postorder traversal: ");
        Iterator<Integer>it3=bTree.getPostorderIterator();
        while(it3.hasNext())
            System.out.println(it3.next()+" ");
        System.out.println("");
        
        System.out.println("the min value:"+bTree.getSmallestValue());
    }
}
