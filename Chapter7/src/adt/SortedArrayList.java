package adt;

import java.util.Iterator;

/**
 * SortedArrayList.java A class that implements the ADT Sorted List using an
 * array. Note: Some methods are not implemented yet and are left as practical
 * exercises
 *
 * @author Frank M. Carrano
 * @version 2.0
 * @param <T>
 */
public class SortedArrayList<T extends Comparable<T>> implements SortedListInterface<T> {

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    public SortedArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public SortedArrayList(int initialCapacity) {
        numberOfEntries = 0;
        array = (T[]) new Comparable[initialCapacity];
    }

    public boolean add(T newEntry) {
        int i = 0;
        while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0) {
            i++;
        }
        makeRoom(i + 1);
        array[i] = newEntry;
        numberOfEntries++;
        return true;
    }

    //by chatgpt
    public boolean remove(T anEntry) {
//    int position = getPosition(anEntry);
//
//    if (position > 0) {
//        removeGap(position);
//        return true; // Entry found and removed
//    }
//
//    return false; // Entry not found
        T entry;
        boolean found = false;
        for (int index = 0; !found && (index < numberOfEntries); index++) {
            if (anEntry.equals(array[index])) {
                array[index]=array[index+1];
                found = true;
                
            }
        }
        numberOfEntries--;
        return found;
    }

    //by chatgpt
// Helper method to get the position of an entry using binary search
    private int getPosition(T anEntry) {
        int left = 0;
        int right = numberOfEntries - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = anEntry.compareTo(array[mid]);

            if (comparison == 0) {
                return mid; // Entry found at position mid
            } else if (comparison < 0) {
                right = mid - 1; // Search left half
            } else {
                left = mid + 1; // Search right half
            }
        }

        return -1; // Entry not found
    }

    public void clear() {
        numberOfEntries = 0;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        for (int index = 0; !found && (index < numberOfEntries); index++) {
            if (anEntry.equals(array[index])) {
                found = true;
            }
        }
        return found;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public String toString() {
        String outputStr = "";
        for (int index = 0; index < numberOfEntries; ++index) {
            outputStr += array[index] + "\n";
        }

        return outputStr;
    }

    private boolean isArrayFull() {
        return numberOfEntries == array.length;
    }

    private void doubleArray() {
        T[] oldList = array;
        int oldSize = oldList.length;

        array = (T[]) new Object[2 * oldSize];

        for (int index = 0; index < oldSize; index++) {
            array[index] = oldList[index];
        }
    }

    private void makeRoom(int newPosition) {
        int newIndex = newPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = lastIndex; index >= newIndex; index--) {
            array[index + 1] = array[index];
        }
    }

    private void removeGap(int givenPosition) {
        int removedIndex = givenPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            array[index] = array[index + 1];
        }
    }

    @Override
    public Iterator<T> getIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
