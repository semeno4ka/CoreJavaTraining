package day26_Statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {//Students group HAS A Student a relationship between one class and another
    public String groupName;
    public int groupId;
    public ArrayList<Students> students; //can also be = new ArrayList<>(); Accepts Student Objects(name, age, gender, id)

    // creates StudentsGroup object by groupName and groupId
    public StudentsGroup(String groupName, int groupId) {// we don't include studentsList because we will have to pass all students then
        this.groupName = groupName;                //it creates Student objects as soon as you pass parameters
        this.groupId = groupId;
        students = new ArrayList<>();// size:0, so later it is adjusted to whatever number of students you create.
    }
                          // from class Students
    public void addStudent(Students student){// Takes one student object and adds it to the ArryaLIst of Students
        students.add(student);// to ArrayList students
    }

    public void addStudents(Students[] students){//we create an Array of students which will be added to ArrayList of students
        this.students.addAll(Arrays.asList(students)); // each student from THIS Array will be added to ArrayList
    }


    public void addStudent(String name, int age, char gender, int id){
        students.add(new Students(name, age,gender, id));
    }// takes name, age,gender and Id and creates students object by using given info, then adds object to ArrayList of students

    public void removeStudent(int id){
        students.removeIf(p-> p.id==id);//if id is String, use equals
    }// Takes the id and removes the object with matching id


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }


}
