/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author Tang Chun Xuan
 */
public interface SetInterface<T> {
    //complete with the operations in the set ADT specification
    Iterator<T> getIterator();
    
    public boolean add(T newElement);
    public boolean remove(T anElement);
    void union(SetInterface anotherSet);
    public boolean checkSubset(SetInterface anotherset);
    SetInterface intersection(SetInterface anotherSet);
    public boolean isEmpty();
}
