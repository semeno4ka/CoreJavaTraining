package day26_Statics;

public class Static_Members {
    public static void main(String[] args) {
        /*
        If method can be static it is better to make it static for efficiency.

        Belong to Class and can be called through class name.
        There is one copy of static shared for all objects of the class (opposite of instance)
        All objects of the class shares the came copy

        Static doesn't belong to the object, it belongs to Class and is shared among all Objects

        Static is applicable for the following:
        1. Variables
        2. Methods
        3. Blocks
        4. Class(nested Classes)

        Static Variables:
        -refer to common property of all objects(Like Company Name shared among all employees or a company of Production etc)
        -single copy shared among all objects
        -if any changes are made to static variables, all other instances will see the effect of changes
        -it gets memory once at the time of class loading

        Static Methods:
        - method that can be called through class name, without creating an object
        -objects can also call static methods
        -static methods only accept static members

        IF THE METHOD YOU ARE ABOUT TO CREATE USES INSTANCE VARIABLES OR INSTANCE METHODS, YOU SHOULD CREATE INSTANCE METHOD
        IF THE METHOD YOU ARE ABOUT TO CREATE DOES NOT USE ANY OF THE ABOVE, THE METHOD SHOULD BE STATIC

        Instance can share static variables and method, but static can't use instance

         */
    }
}
