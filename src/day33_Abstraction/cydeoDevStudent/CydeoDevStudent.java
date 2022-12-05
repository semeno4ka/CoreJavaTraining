package day33_Abstraction.cydeoDevStudent;

import day32_FinalKeyword.final_keyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String proLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dob, String id, String batchName, int batchNumber) {
        super(name, gender, dob);
        if(getAge()<18){
            System.err.println("Invalid age "+getAge());
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }
    static{
        proLanguage="Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("Zero to hero") || batchName.equalsIgnoreCase("Alumni Dev")){
            this.batchName = batchName;
        } else{
            System.err.println("Invalid batch name "+ batchName );
            System.exit(1);
        }
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid batch number "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats "+ proLanguage+" for breakfast, lunch and dinner");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" drinks "+ proLanguage+" all day long");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sees only "+proLanguage+ " in the dreams");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dob=" + getDob() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
