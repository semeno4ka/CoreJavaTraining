package day40_Collection_2;

public class IterableInterface {
    /*
  Iterable is not a data structure

    Collection extends Iterable
    -provides additional methods
    - allows the object to be iterated by using iterator
    - iterator is used for removing objects, since collection is dynamic
    - the object must have 'is-a' relationship with iterable

    IN ORDER TO USE ITERATOR:

    - we should call .ITERATOR() method of iterable
    - iterator provides the ready methods that can be used while traversing the collection:
        hasNext() (if true, has next, then we can take Next)
        next()  (if we can take next, then we can remove it)
        remove()

        Is applicable to ALL the Collection
        WHile loop is preffered with iterator

                                       Example of correct removal
                                        (removeIF appeared after java 8)
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,1,10));
        //<5
        Iterator<Integer> it= list2.iterator();// since its checking all the elements it's easier to assign it ot variable
        while(it.hasNext()){// as long as there is en element that can be iterated
           Integer each = it.next();// you get each of the element
            if(each<5){
                it.remove();// remove method of iterator, not remove method of collection
            }
        }
        System.out.println(list2);

     */
}
