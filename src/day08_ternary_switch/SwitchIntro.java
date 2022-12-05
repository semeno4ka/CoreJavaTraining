package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {
        //Can be integer, string. CANNOT BE LONG, DOUBLE, FLOAT, BOOLEAN
        //Compares the value with multiple values and executes based on the match
        // TO FIND CASE EXACTLY EQUAL
        //SWITCH is Faster than IF, yet can be applied to exact same value

        /*
        switch(expression){
        case constant1:
        statement;
        break:

        case constant2:
        statement;
        break;

        default:
        statement;
        break;}    //default and order of other cases doesnt matter. Can be placed anywhere. recommended though to use order
        */

        char grade='Q'; // Switch statement performs the task faster than multi-branch if statement
         String result="";
        if(grade=='A'){
            result="Excellent";
        }else if(grade=='B'){
            result="Great job";
        }else if(grade=='C'){
            result="Good";
        }else if(grade=='D'){
            result="Passed";
        }else{
            result="Failed";
        }
        System.out.println(result);
        System.out.println("_____________________");

        switch(grade){
            case 'A':// same case blocks cannot be executed. case value should be unique
                result="Excellent";
                break;//without the break it won't exit the switch, it will continue to check the rest of possibilities
            // and all the results will be printed out, they will be executed. LOGICAL ERROR
            case 'B':
                result="Great job"; //The ORDER OF THE BLOCKS DOES NOT MATTER
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;// can keep till the very and of possibilities and keep default for INVALID answers
            default:
                result="Invalid score";
                break;// break in the end is not required cause it all ends with {}, anyway it will exit automatically
        }
        System.out.println(result);
    }
}
