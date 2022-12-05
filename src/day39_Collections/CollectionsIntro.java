package day39_Collections;

public class CollectionsIntro {
    /*
    Collection is a group of individual objects as a single entity
    Collection size is flexible,Array is fixed, but can be accessed through index numbers of each element, way faster)
    With Collection, whenever changes are made, they are made within the collection, while with Array you always end up created a new Array when  changes required
    Size is automatically adjusted
    Can hold different non-primitive data types(Objects only, or primitives Wrapped to Objects through wrapper class)
    Standard data structure, different build-in methods can be applied to dynamic size, that is why it is used more often

   Collection:
   List(ArrayList, LinkedList,Vector->Stack)       Queue(PriorityQueue)     Set (HashSet,LinkedHashSet)
                                                   Deque(ArrayDeque)
  Collection is considered as ROOT interface of collection framework
  Collection defines the most common methods applicable to collection objects

                                              LIST

    LIST INTERFACE:
    (ArrayList, LinkedList,Vector->Stack)
    The only child Interface that has Index Numbers, and methods such as get and set. All child classes have it
    - list has index number (all subclasses have everything list has)
    - insertion order preserved (the order depends on the order you inserted data in the beginning: if you put 5 then 0, it will stay this way forever)
    - allows duplicates withing the list(same elements). Not every interface of collection allows it
    - methods of collection are inherited
    - has its own unique methods, which are inherited by its subclasses

    1.ArrayList Class: (95% of usage compared to other child classes of List Interface)
    - implements List interface
    - Internally uses array!
    (Because it's an array of Array. That is why deleting elements is slower than in other classes, since in order to remove an element it has to create another array without the element, which slows down the speed)
    - retrieving the element is faster(get method, even though other classes have it, but since it uses Array, the get method by the use of Index number, works faster)
    - supports RANDOM ACCESS to elements(.get() method). It is faster than get method among other List subclasses
    (implicitly uses Array which makes it faster, since Array is the fastest)
    .get() is fastest

    2.LinkedList CLass
    - implements List interface
    - Internally uses doubly linked list(you can move next and previous at the same time).
     Doesn't have random access to elements
    (implicitly uses Node<> Node (is an element)-> has pointer to next and previous nodes. Starts from head to toe, from first to last all the time)
    - each value will have pointer to the next value
    - inserting and deleting elements is faster
    (retrieving data is slower, but deleting and inserting data is faster)
    add(), addAll(), remove(), removeAll(), removeIf(), retain(); => is faster

    3. Vector Class
    - implements the List interface
    - internally uses array
    - is Synchronized(thread-safe).One thread at a time.ALWAYS
    Since it is synchronized, the performance is slower even though array is used
    _ Vector is a synchronized version of an ArrayList
    - if multiple threads are trying to get access to Vector's objects, only one thread at a time will get this access. It makes the process slower, but safer

    [Process]
    - programs that are scheduled for executions in the CPU
    - An instance of a program running on a computer
    - a process has code, data, heap and segments
    (Activity monitor for Mac to check active processes)

    [Thread]
    - a subset of a process
    - a sequence of execution within the process
    - every single process at least have one thread
    - shares all the resources of process

    lots of threads are created within a process, depending on what the application is doing on thread is created for each step of process

    [Multi-threading]
    - two or more threads are being executed within the process

    To create multi-threading in Java:
      1. by using Thread Class
      2. by using Interface Runnable

      Java executed one thread from top to bottom, but you can create several threads, which will run different codes at the same time
      Thread can be used if it is not going to extend any other classes, interface can be implemented in this case

    Do not confuse with multitasking ( multiple processes running at the same time, not threads)

    [Synchronized]-(Thread safety)=> one thread at a time
    - process of controlling the access of multiple threads to any shared resources
    - only one thread can have access to resources at a time (Thread safety), the rest are waiting. The opposite of multi-threading


   4. Stack (has its own methods such as pop)
      - child of Vector
      - is synchronized since the child of Vector
      difference: has a unique performance order: LIFO- last-in, first out
      .pop() method the last added object will be the first removed

Summary:
Synchronized: multiple threads are being executed one thread at a time
			advantage: thread-safety
			disadvantage: slower
Process: execution instance of program application
Thread: A sequence of execution within a process
Multi-threading:
	Multiple thread objects are executed at the same time
Multitasking:
		two or more process are running


                                   SET

- child interface of Collection
- duplicates are not allowed (same objects cannot be accepted, the previously added element gets removed if same object added again)
- insertion order is not preserved
- does not have INDEX number


HASHSET: HAs the Highest Performance among all Set subclasses
- implements Set interface
- maintains the random order, no guarantee for the order
- null is accepted
- dups not allowed

LINKEDHASHSET:
- dups not allowed
- null is accepted
- Keeps the insertion order!!!!(useful fro removing dups from collection, just convert to LinkedHashSet)


TREESET:(does not directly implement Set interface, it implements it through SortedSet interface)
- no dups allowed
- keeps the sorted order(Ascending) since implements SortedSet
- does not accept null
______________________________________________________________

TO CONVERT ONE COLLECTION TYPE INTO ANOTHER YOU CAN USE A CONSTRUCTOR, because casting is not allowed

3. Queue (I)

    QUEUE (Least used data Structure). The only time you need it is when you have to delete Objects in FIFO order
    - child interface of Collection
    - allows duplicates
    - Insertion order not preserved, no INDEX NUMBERS
    - First-In, First-Out(FIFO) -.poll() returns and removes the 1 added object


PriorityQueue:
- implements Queue interface
- maintains random order
- does not accept NULL

Deque:
1. ArrayDeque:(Implicitly uses Array, but doesn't have access to Index), for internal use only
- implements The Deque Interface
- keeps insertion order
- does not accept NULL

2.LinkedList:
- Implements both List and Queue, hence has INDEX number
- accepts Null
- keep insertion order




     */
}
