package day41_Maps.CollectionVsArrayReview;

public class Array_vs_Collection {
    /*
    ARRAY VS COLLECTION:

    ARRAY:
          1. size is fixed
          2. supports both primitive and non-primitive
          3. can be multidimensional
          4. is the fastest among all, but uses more memory, thus Collection is preferred.
             To perform changes, new Array has to be created
          5. elements are mutable, the size is not

    Collection:
          1. size is dynamic
          2. supports only non-primitive
          3. cannot be multidimensional
          4. has ready to use methods
          5. elements are mutable as well as the size

Summary:
1. List (I): Has Index Number, Allows Duplicate

				1.1 ArrayList: Array based class
							   Accessing/searching the elements are faster

				1.2 LinkedList: Node based class (doubly linked list)
								Insertion & deletion of elements are faster

				1.3 Vector: Same as ArrayList but synchronized
							Is Synchronized ==> Thread-safety

				1.3.1 Stack: Same as ArrayList but synchronized
							Last-In-First-Out (LIFO) ===> pop()


		2. Set (I): Does not have index number, Does not allow duplcaites

				2.1 HashSet (C): Order is random, aceespts null

				2.1.1 LinkedHashSet (C): Keeps the insertion order, accepts null

				2.2 TreeSet (C): keeps the sorted order, does not accept null

Queue (I): Does not have index number, Allow duplicates. FIFO

					poll(): returns & removes the first inserted object from the Queue

				3.1 PriorityQueue (C): order is random, does not accept null

				3.2 ArrayDequeue (C): keeps the insertion order, does not accept null

				3.3 LinkedList (C): keeps the insertion order, accepts null, Has index number

Collection of Pairs (key & value)
		 Supports non-primitives ONLY
		 Size is dynamic
		 Key MUST be unique, value can be duplicated


		1. HashMap (C): Random order
						Both key and value can be null


		2. LinkedHashMap (C): Insertion order
							  Both key and value can be null


		3. TreeMap (C): Sorted order
						Key can not be null, values can be null


		4. HashTable (C): Random order
						  Both key and value can NOT be null
						  Synchronized



     */
}
