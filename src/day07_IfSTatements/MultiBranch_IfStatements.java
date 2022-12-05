package day07_IfSTatements;

public class MultiBranch_IfStatements {
    // can be nested to create an else if clause with several alternatives
    public static void main(String[] args) {
        /*goes from top to bottom. ONLY ONE BLOCK GETS EXECUTED (whichever condition is true and whichever came FIRST)

        WHEN THERE ARE THREE OR MORE POSSIBILITIES

        if(condition1) {
        statementA
        } else if(condition2){
        statementB
        } else if (condition3) {
        statementC
        } else {statementD}                             //multiple ELSE IF block can be given if needed

        Whichever comes first as TRUE gets executed, else are not then checked by the compiler
        StatementA : condition 1 is true
        StatementB: condition1 - false then condition2 is true and gets executed.
        StatementC: condition 1 and 2 are false, then condition3 is true and gets executed
        StatementD: all of the above conditions are false

        Meanwhile, IF & ELSE are used for TWO conditions only (not more, not less)
        Single IF is used for single conditions.
         */


    }
}
