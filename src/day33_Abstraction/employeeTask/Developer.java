package day33_Abstraction.employeeTask;

public class Developer extends Employee {

    private String proLang;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String proLang) {
        super(name, age, gender, id, jobTitle, salary);
       setProLang(proLang);
    }

    public String getProLang() {
        return proLang;
    }

    public void setProLang(String proLang) {
        this.proLang = proLang;
    }

    public void work(){
        System.out.println(getName()+ " is coding with "+proLang);
    }

    @Override
    public String toString() {
       return super.toString().replace("}","")+
               ", proLand = "+proLang+"}";
    }
}
