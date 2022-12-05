package day08_ternary_switch;

public class SwitchTwo {

    public static void main(String[] args) {
        int n=7;
        String day = "";
        switch(n){ //Better to keep the order from smallest to largest, increasing order
            case 1: day="Mod"; break;// without the break all the statements keep being printed
            case 2: day="Tue";break;
            case 3: day="Wed";break;
            case 4: day="Thur";break;
            case 5: day="Fri";break;
            case 6: day="Sat";break;
            case 7: day="Sun";break;
            default: day="Invalid day number";break;
        }
        System.out.println(day);



    }
}
