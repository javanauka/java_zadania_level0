package zadania_java_level0;

//prosty program do obliczania podatku


import java.util.Scanner;

public class Zadanie4 {

    static final float TAX1 = 0.18f;
    static final float TAX2 = 0.32F;
    static final float LEVEL1 = 85528f;
    static final float TAX2_BASE = 14839.02F;
    static final float DOWN_AMOUNT = 556.02f;


    public static void main(String[] args) {

        float income = 0, payTax = 0;

        System.out.println("podaj kwotę dochodu:");
        Scanner rd = new Scanner(System.in);
        income = rd.nextFloat();

        System.out.println("Twój dochód wynosi: " + income);

        if (income < LEVEL1 || income == LEVEL1) {
            payTax = income * TAX1 - DOWN_AMOUNT;
        } else if (income > LEVEL1) {
            payTax = TAX2_BASE + (income - LEVEL1) * TAX2;
        }

        System.out.println("Do zapłacenia masz " + payTax);

        rd.close();
    }
}
