package zadania_java_level0;


import java.util.Scanner;

public class Zadanie4 {

    static final float PROG_PODATKOWY = 85528f;
    static final float TAX = 0.18f;
    static final float TAX2 = 0.32f;
    static final float TAX_TO_BASE = 14839.02f;


    public static void main(String[] args){

        float taxToPay;

        Scanner rd = new Scanner(System.in);
        System.out.println("Insert your salary");
        float income = rd.nextFloat();


        if(income < PROG_PODATKOWY){
            taxToPay = income*TAX-556.02f;
            System.out.println("Your tax is "+taxToPay);
        } else if (income > PROG_PODATKOWY){
            taxToPay = TAX_TO_BASE+TAX2*(income-PROG_PODATKOWY);
            System.out.println("Your tax is "+taxToPay);
        }
    }
}
