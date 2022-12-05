package day28_OOPIntro.Encapsulation.student;

public class Student {
    private int age;
    private String name;
    // FOR INSTANCE variables it is better to keep access PRIVATE


    public String getName() {
        if(name ==null){
            System.out.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit=false;
        for (char each : name.toCharArray()) { // We check every Character
            if(Character.isDigit(each)){
                hasDigit=true;
                break;
            }
        }

        if(hasDigit){
            System.out.println("Invalid name "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge(){// have to create a getter method in order to read the data outside the class
        if(age==0){
            System.out.println("Age has not been set");
            System.exit(1);
        }
        return  age;
    }

    public void setAge(int age){ // return type is void because we do not return anything, we update
       if(age<1 || age>99){               // we are supposed to provide the information we update (same data type)
           System.out.println("Invalid age"+age); // you can set requirements and conditions within this method
           System.exit(1);// 1- error occured;  0-exit with no error
       }
        this.age=age;

    }


}
