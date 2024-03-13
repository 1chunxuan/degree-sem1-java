/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.*;
import entity.Product;


/**
 *
 * @author Tang Chun Xuan
 */
public class TestSortedArrayList {
    public static void main(String[] args) {
        SortedListInterface <Product> pList=new SortedArrayList<>();
        //small alphabet is larger than big alphabet(the sorting is based on ascii code),so apple is behind Orange
        pList.add(new Product(4234,"Orange"));
        pList.add(new Product(8323,"apple"));
        pList.add(new Product(1233,"Durian"));
        pList.add(new Product(7878,"Kiwi"));
        pList.add(new Product(3285,"Pear"));
        System.out.println("\nproducts:\n"+pList);
    }
}
