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

    add(E e)	Adds an element to the list
    add(int index, E e)	Adds element at a specific index
    get(int index)	Returns element at the given index
    remove(Object o)	Removes first occurrence of given element
    remove(int index)	Removes element at the specified index
    set(int index, E e)	Replaces the element at the given index
    size()	Returns the number of elements in the list
    contains(Object o)	Checks if the list contains the element
