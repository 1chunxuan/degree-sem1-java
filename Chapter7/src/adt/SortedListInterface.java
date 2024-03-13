package adt;

import java.util.Iterator;

/**
 * An interface for the ADT Sorted List. 
 *
 * @author Frank M. Carrano
 * @version 2.0
 */
public interface SortedListInterface<T extends Comparable<T>> {
    
    Iterator<T> getIterator();

  /**
   * Task: Adds a new entry to the sorted list in its proper order.
   *
   * @param newEntry the object to be added as a new entry
   * @return true if the addition is successful
   */
  public boolean add(T newEntry);

  /**
   * Task: Removes a specified entry from the sorted list.
   *
   * @param anEntry the object to be removed
   * @return true if anEntry was located and removed
   */
  public boolean remove(T anEntry);

  public boolean contains(T anEntry);

  public void clear();

  public int getNumberOfEntries();

  public boolean isEmpty();

} 
