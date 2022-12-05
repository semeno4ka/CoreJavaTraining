package day09Switch_and_Scanner;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte num = input.nextByte();
        String month="";
        month=(num==1)?"Jan":(num==2)?"Feb":(num==3)?"Mar":(num==4)?"Apr":(num==5)?"May":(num==6)?"Jun"
                :(num==7)?"Jul":(num==8)?"Aug":(num==9)?"Sep":(num==10)?"Oct":(num==11)?"Nov":(num==12)?"Dec":"Not a valid month number";
        System.out.println(month);
        input.close();
    }
}
