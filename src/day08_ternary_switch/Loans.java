package day08_ternary_switch;

import org.w3c.dom.ls.LSOutput;

public class Loans {
    public static void main(String[] args) {
        int salary= 60000;
        int score = 600;
        String eligible="";
        eligible=(salary>=60000 && score>=650)?"Eligible":"Not Eligible";

        System.out.println(eligible);
    }
}
/*
Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */