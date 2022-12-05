package day31_Inheritance.methodOverriding.animalTask;

public class Lion extends Animal{

    public boolean isAfrican() {
        return isAfrican;
    }

    public void setAfrican(boolean african) {
        isAfrican = african;
    }

    private boolean isAfrican;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfrican) {
        super(name, breed, gender, age, size, color);
        setAfrican(isAfrican);
    }

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
        setAfrican(isAfrican);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" loves hunting for food it eats");
    }
    public void hunt(){
        System.out.println(getBreed()+" are the best in hunting");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", African Lion=" + isAfrican +
                '}';
    }
}
