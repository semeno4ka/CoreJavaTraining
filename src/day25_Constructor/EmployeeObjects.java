package day25_Constructor;

import java.time.LocalDate;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Kate", 27, 'F', "Java Developer", 127000, LocalDate.of(2023, 3, 3));
        Employee e2 = new Employee("Fil", 30, 'M', "Java Developer", 137000, LocalDate.of(2022, 7, 2));
        Employee e3 = new Employee("Olivia", 22, 'F', "Software Developer", 157000, LocalDate.of(2024, 12, 30));

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }
}
