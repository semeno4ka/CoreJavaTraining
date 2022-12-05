package day08_ternary_switch;

public class Switch4 {
    public static void main(String[] args) {
        int num=1;
        String mon="";
        switch(num){
            case 1:
                mon="Jan";
                break;
            case 2:
                mon="Feb";
                break;
            case 3:
                mon="Mar";
                break;
            case 4:
                mon="Apr";
                break;
            case 5:
                mon="May";
                break;
            case 6 :
                mon="Jun";
                break;
            case 7:
                mon="Jul";
                break;
            case 8:
                mon="Aug";
                break;
            case 9:
                mon="Sep";
                break;
            case 10:
                mon="Oct";
                break;
            case 11:
                mon="Nov";
                break;
            case 12:
                mon="Dec";
                break;
            default:
                mon="Invalid month number";
        }
        System.out.println(mon);
    }
}
