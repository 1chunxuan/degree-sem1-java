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
public class ArraySet<T> implements SetInterface<T>{
    private T[] array;
    private int numberOfEntries;
    private final static int DEFAULT_CAPACITY=100;
    
    public ArraySet() {
        numberOfEntries=0;
        array=(T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public String toString() {
        String str="{";
        for (int i = 0; i < numberOfEntries; i++) {
            str+=array[i]+", ";
            
        }
        str+="\b\b}";
        return str;
    }

    private int indexOf(T anElement){
        for (int i = 0; i < numberOfEntries; i++) {
            if(array[i].equals(anElement)){
                return i;//anElement exists in the set
            }
        }
        return -1;//anElement does not exist in the set
    }
    
    @Override
    public boolean add(T newElement) {
        int index=indexOf(newElement);
        if(index==-1){//enElement does not exist in the set
            array[numberOfEntries++]=newElement;
            return true;
        }
        return false;//already exists,cannot add
    }

    @Override
    public boolean remove(T anElement) {
        int index=indexOf(anElement);
        if(index!=-1){//anElement exists in the set
            numberOfEntries--;
            for (int i = index; i < numberOfEntries; i++) {
                array[i]=array[i+1];
                
            }
            return true;
        }
        return false;
    }

    @Override
    public void union(SetInterface anotherSet) {
        ArraySet<T> givenSet=(ArraySet<T>)anotherSet;
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
            add(givenSet.array[i]);
        }
    }

    @Override
    public boolean checkSubset(SetInterface anotherset) {
        //1.create a result set
        ArraySet<T> resultSet=new ArraySet<>();
        ArraySet<T> givenSet=(ArraySet<T>)anotherset;
        
        //2.for each element in the given set
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
        //get the current element in the givenSet
            T currentElement=givenSet.array[i];
            //2.1  if the element is in the set
            int index=this.indexOf(currentElement);
            if(index!=-1){
                return true;       
            }
        
        }
        //3.return the result set
        return false;
    }

    @Override
    public SetInterface intersection(SetInterface anotherSet) {
        //1.create a result set
        ArraySet<T> resultSet=new ArraySet<>();
        ArraySet<T> givenSet=(ArraySet<T>)anotherSet;
        
        //2.for each element in the given set
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
        //get the current element in the givenSet
            T currentElement=givenSet.array[i];
            //2.1  if the element is in the set
            int index=this.indexOf(currentElement);
            if(index!=-1){
                //   //2.1.1   add the element to the result set
                resultSet.add(currentElement);             
            }
        
        }
        //3.return the result set
        return resultSet;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries==0;
    }

    @Override
    public Iterator<T> getIterator() {
        return new SetIterator();
    }
    
    private class SetIterator implements Iterator<T>{
        int currentIndex=0;

        @Override
        public boolean hasNext() {
            return currentIndex < numberOfEntries;
        }

        @Override
        public T next() {
            T currentElement=null;
            
            if(hasNext()){
                currentElement=array[currentIndex++];
            }
            return currentElement;
        }
    }
    
}
