package day17;

public class Dog {

        /*
        public- access modifier; class-keyword ; Dog - class name
        Methods - actions  of the objects. Instance methods don't have static keyword, just public void methodName()
        Class determines what the objects WILL have.
        Think of Class as of a Teacher - represents the class, students - objects withing the class.
        Each student has predetermined variables, which specify info we need, have unique value and unique memory location
        Classes  exist for the objects(in order to uses it more efficient)

        Variables are declared inside the Class and can be used outside any method/blocks
        Each object will have it's separate copy of variables created in the Class
        */

      public String name;  //instance variable (can be used as many times as needed for different value, separate copy will be created for each)
      public String breed;
      public String size;
      public String color;
      public int age;
      public char gender;

    //METHOD to set value to each object

    public void setInfo(String name, String breed, char gender, int age, String size, String color ){
        this.name = name; //this helps compiler to use the name from Dog class, and not similar variable from other local class where it is used
        //calls the instance variable
        this.breed=breed;
        this.size=size;
        this.color=color;
        this.age=age;
        this.gender=gender;
    }

    // so that each object has its own method, we do not provide STATIC modifier. Method is FOR ALL OBJECTS
       public void eat(){ // no need for return value, that is why void
           System.out.println(name+ " is eating");// every time you call it, it will display the name of the dog which is eating
       }
//static - fixed, just one
       public void drink(){// you can pass a parameter to specify what exactly is it drinking
           System.out.println(name+ " is drinking water");// water can be placed as a parameter
       }

      /*TO_STRING METHOD should be specified for each class file. Name can't be changed
    public String toString(){
           return  "Dog Name: "+name + ", Dog Gender: "+gender+ ", Dog Breed: ";     //the output that you will every time you print the object
    } you decide which information you want to be contained in the output*/

  // if you rightclick and press "GENERATE" you will have a toString option;(uncheck Override for now)


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}'; //while holding command, you can uncheck boxes you don't need(when generating to String)
    }



}
