package day28_OOPIntro.Encapsulation.employee;

public class Employee {
    private double salary;// you can not make any conditions for data which is public
    private String name;
    private String jobTitle;
    private int age;

    // CAN WE GENERATE CONSTRUCTOR AS WELL? Yes, we will use getMethod to set the constructor


    public Employee(double salary, String name, String jobTitle, int age) {
     setName(name); // this way the method first checks required conditions and then set the data
     setAge(age);   // if you use THIS.name it sets the data without any conditions
     setSalary(salary);
     setJobTitle(jobTitle);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid jobTitle");
        }
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            System.err.println("Invalid age "+age);
        }
        this.age = age;
    }

    public String getName() {
        if(name==null){
            name= "Unknown";
            //return Unknown, Sout "Unknown" all three are possible as return data
        }
        return name;
    }

    public void setName(String name) {
        if( name.isEmpty() || name.isBlank()){
            System.err.println("Employee name cannot be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { // should always be public in order to be used
        if(salary<0){
            System.err.println("Salary cannot be negative $"+salary);
            System.exit(1);
        }
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "salary=" + getSalary() +
                ", name='" + getName() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
