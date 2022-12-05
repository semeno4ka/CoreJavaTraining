package day08_ternary_switch;

public class Switch3 {
    public static void main(String[] args) {
        char grade = 'A';//TRY TO SOLVE USING SWITCH STATEMENT
        String result = "";
        switch (grade) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Not a valid grade";
                break;
        }
        System.out.println(result);
    }
}

        /*if(grade =='A'){
            result="Excellent";
        } else if(grade == 'B'){
            result ="Great job";
        } else if(grade =='C'){
            result = "Good";
        } else if(grade == 'D'){
            result= "Passed";
        } else{
            result= "Failed";
        }
        System.out.println(result);
    }*/
    //----------USE WITH THE SWITCH STATEMENT


