# Collection-in-Java

## Collection

A Collection in Java is a framework that provides an architecture to store and manipulate a group of objects efficiently. It provides various interfaces and classes to work with different types of data structures like Lists, Sets, and Maps.

- Collection is like a container that holds multiple objects.
- It provides dynamic memory allocation, unlike arrays which have a fixed size.
- It allows easy addition, deletion, searching, and sorting of elements.

# List Interface in Java

The List interface in Java is part of the Collections Framework and is used to store ordered and indexed elements, allowing duplicates.

## Key Features of List

- Ordered Collection → Elements are stored in the order they are inserted.
- Allows Duplicates → Can have repeated elements.
- Index-based Access → Elements can be accessed using an index (list.get(index)).
- Supports Null Values → Can store null values.
- Dynamic Resizing → Unlike arrays, lists grow dynamically.

## Basic ArrayList Operation

    add(E e)	                Adds an element to the list

    add(int index, E e)	        Adds element at a specific index

    get(int index)	                Returns element at the given index

    remove(Object o)	        Removes first occurrence of given element

    remove(int index)	        Removes element at the specified index

    set(int index, E e)	        Replaces the element at the given index

    size()	                        Returns the number of elements in the list

    contains(Object o)	        Checks if the list contains the element

# LinkedList

    - LinkedList is a doubly linked list implementation in Java.
    - It allows fast insertions and deletions compared to ArrayList.
    - It implements List and Deque interfaces.

## Basic LinkedList Operation

    add(E e)	            Adds an element at the end of the list
    
    add(int index, E e)	    Inserts an element at the specified position
    
    addFirst(E e)	            Adds an element at the beginning of the list
    
    addLast(E e)	            Adds an element at the end of the list (same as add(E e))
    
    get(int index)	            Returns the element at the given index
    
    getFirst()	            Retrieves the first element
    
    getLast()	            Retrieves the last element
    
    remove(int index)	    Removes the element at the given index
    
    remove(Object o)	    Removes the first occurrence of the specified element
    
    removeFirst()	            Removes and returns the first element
    
    removeLast()	            Removes and returns the last element

    set(int index, E e)	    Replaces the element at the given index

    size()	                    Returns the number of elements in the list

    contains(Object o)	    Checks if the list contains the element
    
    clear()	                    Removes all elements from the list
    
    indexOf(Object o)	    Returns the index of the first occurrence of the specified element
    
    lastIndexOf(Object o)	    Returns the index of the last occurrence of the specified element
    
    peekFirst()	            Retrieves, but does not remove, the first element
    
    peekLast()	            Retrieves, but does not remove, the last element
    
    pollFirst()                 Retrieves and removes the first element, or returns null if empty
    
    pollLast()	            Retrieves and removes the last element, or returns null if empty

# Set
The Set interface in Java represents a collection of unique elements, meaning it does not allow duplicates. It is commonly used when you need to store a group of distinct elements.

 **Key Features of Set**
 - No duplicates allowed
 - Unordered (HashSet) or sorted (TreeSet) storage
 - Faster lookups compared to lists

## HashSet in Java 
HashSet is the most commonly used Set implementation in Java. It is fast because it uses a hash table for storing elements.

## Basic HashSet Operation

    - add(E e)	Adds an element to the set

    - remove(Object o)	Removes an element from the set

    - contains(Object o)	Checks if the set contains the element

    - size()	Returns the number of elements

    - isEmpty()	Checks if the set is empty

    - clear()	Removes all elements

    - iterator()	Returns an iterator for traversal
