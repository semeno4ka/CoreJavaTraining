package day07_IfSTatements;

public class Weekdays2 {
    public static void main(String[] args) {
        int num= 1;
        String weekday= "";
        if(num==1){
            weekday = "Monday";
        }else if(num==2){
            weekday = "Tuesday";
        }else if(num==3){
            weekday="Wednesday";
        }else if(num==4){
            weekday="Thursday";
        }else if(num==5){
            weekday="Friday";
        } else if(num==6){
            weekday="Saturday";
        }else {
            weekday ="Sunday";
        }
        System.out.println(weekday);
    }
}
