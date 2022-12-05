package day25_Constructor;

public class ConstructorsIntro {
    public ConstructorsIntro() {          //return type NOT required, otherwise it is not a Constructor. same name as Class is mandatory
        System.out.println("Object is created  by default Constructor");
    }
    public ConstructorsIntro( int a) {          //return type NOT required, otherwise it is not a Constructor. same name as Class is mandatory
        System.out.println("Object is created  by using int argument constructor");
    }
    public void add(){// regular method example
        //static is optional, return type(void etc) is mandatory)
    }

    public static void main(String[] args) {
        /*
        Class is a blueprint for creating Objects. All objects come from Class.
        Class determines how an Object will behave(methods) and what the Object will contain(instance variables: called data members/fields)
        Objects is an instance of a class.
        Each object has its own memory allocation(thanks to instance variable)
        Class is a template, objects is real


        Constructor is a MUST method for every Class. Constructor is Only responsible for creating an Object in Java
        Person person1 = new Person(); [Person()]-Default Constructor/ No Argument Constructor(whenever we don't define it ourselves )
        Car car1 = new Car("Audi");    [Car("Audi")]- Parameterized Constructor

        We can use Constructor to initialize the object's instance variable
        The execution of Constructor always depends on the object(an object should be created first)
        Unlike Constructor, we had to call setInfo manually. Constructor goes by automatically when you place a parameter

        Constructor is a special method that matches the name of the class and has no return type nor a specifier:

        public class Car{                 public class Employee{
            public Car(){                       public Employee(int age) {
            }                                      }
        }                                    }

         */
        new ConstructorsIntro();// created by default
       ConstructorsIntro obj1 = new ConstructorsIntro(10);// Created manually
        /* constructor, if not defined prior, goes by default as the name of the Class
        In most cases you always should define it yourself
        If it is not defined, nothing will be printed (as if you never created setInfo)
        You can create as many constructors as you want
        new ConstructorsIntro(); is empty. That is why we should define
        it ourselves and group required code fragments that will define the object behavior and contains
        When Constructor created, you can set all the instance variable value at once new Car("Audi", 2007, "Red" etc)- Parameterized
        Constructor is Either defined or Parameterized. Can't be both. For that you create different constructors
        To have multiple constructors, you use method overloading
         */
        ConstructorsIntro obj2 = new ConstructorsIntro(10);
        ConstructorsIntro obj3 = new ConstructorsIntro(10);


    }
}
