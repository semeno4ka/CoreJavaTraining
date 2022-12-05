package day30_Constructor.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person {

    private LocalDate electedDate;

    public President(String name, char gender, LocalDate dob, LocalDate electedDate) {
        super(name, gender, dob);
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }


    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName()+ " lies to people");
    }
}
