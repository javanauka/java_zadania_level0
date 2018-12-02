package zadania_java_level0;

//checks if given number is a prime number
//todo
//do it in object way

import java.util.Scanner;

public class Zadanie17 {

    static final int MAX_DIVIDERS_COUNT = 2;

    public static void main(String[] args) {
        System.out.println("program sprawdza czy podana wartość jest liczbą pierwszą");
        System.out.println("podaj wartośc do sprawdzenia");

        Scanner rd = new Scanner(System.in);
        int userValue = rd.nextInt();
        rd.close();

        int howManyDividers = 0;  //helper variable, if thers more than 2 divider it is not prime number

        for (int i = 1; i <= userValue; i++) {
            if (userValue % i == 0) {  //if modulo gives 0 it must be divider
                howManyDividers++;
            }
        }

        if (howManyDividers > MAX_DIVIDERS_COUNT) {
            System.out.printf("wartość %d nie jest liczbą pierwszą (ma %d dzielników)", userValue, howManyDividers);
        } else {
            System.out.printf("wartość %d jest liczbą pierwszą", userValue);
        }
    }
}
