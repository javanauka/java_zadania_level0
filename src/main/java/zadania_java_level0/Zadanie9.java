package zadania_java_level0;

//show power of two, below given number
//todo
//besides objet-abling it, nothing :/

import java.util.Scanner;

public class Zadanie9 {

    static final int TWO = 2;
    public static void main(String[] args) {

        System.out.println("podaj liczbe graniczna dla potegi cyfry dwa ");

        Scanner rd = new Scanner(System.in);
        int limit = rd.nextInt();

        int showPower = 1;
        int incrementation = 1;

        System.out.println("potegi cyfry dwa dopodanej granicy to kolejno: ");

        do {
            System.out.print(showPower + " ");
            showPower = (int) Math.pow(TWO , incrementation++); //idk why must cast??
        } while (showPower <= limit);

//checking with for loop
//        showPower = 1;
//        for (int i = 0; i < limit; i++) {
//            System.out.print(showPower + " ");
//            showPower = (int) Math.pow(TWO , i);
//            if (showPower > limit) {
//                break;
//            }
//        }
    }

}
