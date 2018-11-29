package zadania_java_level0;

//all odd numbers smaller than given base

//todo
//check why do while istn working, make it objectable, use any collection

import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {
        System.out.println("podaj liczbę bazową");

        Scanner rd = new Scanner(System.in);
        int baseNumber = rd.nextInt();

        int counter = 1;

        System.out.println("liczby nieparzyste mniejsze od bazowej to:");

//        do {
//            if (counter % 2 != 0) {
//                System.out.print(counter + ", ");
//                counter++;
//            } //else break;
//        } while (counter <= baseNumber);

        for (int i = 0; i <= baseNumber; i++) {
            if (i % 2 != 0) {                       //cheking if its odd, print if it is
                System.out.print(i + ", ");
            }
        }
    }
}

