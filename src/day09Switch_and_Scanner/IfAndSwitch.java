package day09Switch_and_Scanner;

public class IfAndSwitch {
    public static void main(String[] args) {

        int number=50;
        String result="";
        if(number==50 || number==75 || number==100){
            switch(number) {
                case 50:
                    result = ",,,,";break;
                case 75:
                    result = ",,,,,";break;
                default:
                    result = "...";break;
            }
        }else{
            result="Invalid";
        }
        System.out.println(result);
    }
}
