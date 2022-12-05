package day07_IfSTatements;

public class NetIncome {
    public static void main(String[] args) {
        int salary = 90000; //PAY ATTENTION TO NUMBERS INCLUDED AND EXCLUDED
        double  taxRate = 0;
        boolean isMarried = true;


        if(salary >=130000){
            taxRate = 0.35;
        }
        if(salary >=100000 && salary <130000){//100-130(130 excluded) 129 doesnt include 129999 etc
            taxRate = 0.3;
        }
        if(salary >=80000 && salary <100000){
            taxRate = 0.25;
        }
        if(salary <80000){
            taxRate = 0.2;
        }
        if(isMarried){
            taxRate-=0.05;//tax is reduced by 5%
        }
        double netIncome = salary * (1-taxRate);//1=100% (100%-35%)*salary
        System.out.println(netIncome);
        //can also make through double totaTax=salary*taxrate and double netIncome= salary-totalTax


    }
}
