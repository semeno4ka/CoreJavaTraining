package day41_Maps.MapsIntro;

public class MapsIntro {
    /*
    A part of Collection framework, but has nothing to do with Collection interface
    A unique data structure different from Collection and Array.
    It is a Collection of Pairs

    Map is an Interface
    Map -> SortedMap-> TreeMap
        ->HashTable
        ->HashMap-> LinkedHashMAp

    Map - Collection of pairs Interface
          Supports Non-Primitives
          Size dynamic
          Key MUST be unique, otherwise the last one inserted will be saved

    Map is used for storing data. In custom objects we specify the behavior and specifications, it is not used for storing the data

    You can store a pair of data as a data structure.
    We do not to remember the value, but we need to know the key

    Key         Value
    gender  :    male
    age     :    32
    One Pair is One entry
    Using pairs helps us to use data more efficiently and improves readability

    Map - is a data structure based on the key and value
    Does not have 'IS A' relation with Collection
    Size can be increased and decreased - size dynamic
    Key CANNOT be duplicated


    java.util.*
    HASHMAP:
           - implements Map Interface
           - has random order
           - Accepts Null value as  Key and Value(Keep in mind that even key can be null, null key can be used once, since it should be unique)

    LINKEDHASHMAP:
           - child class of HashMap
           - keeps the insertion order
           - Accepts Null value as  Key and Value (Keep in mind that even key can be null, null key can be used once, since it should be unique)

    TREEMAP:
           - implements SortedMap Interface
           - maintains the sorted order (Ascending order)
           - Does not accept NULL as a KEY BUT accepts Null Value
           Sorts: compares the key, whichever the key has a SMALLER value by ASCII table, will be the 1st

    HASHTABLE:
           - Implements Map Interface
           - maintains Random order
           - DOES NOT accept null as a key or value
           - Synchronized(Thread-Safe)-> one thread at a time

     */
}
