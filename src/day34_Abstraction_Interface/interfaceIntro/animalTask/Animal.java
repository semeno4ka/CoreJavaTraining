package day34_Abstraction_Interface.interfaceIntro.animalTask;

public abstract class Animal {
    private String name, breed,size,color;
    private final char gender;
    private int age;

    public Animal(String name, String breed,char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        if(!(gender=='F'|| gender=='M')){
            System.err.println("Invalid gender "+gender);
            System.exit(1);
        }
        this.gender=gender;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
    public abstract void eat();
    public abstract void drink();
    public abstract void sleep();
}


