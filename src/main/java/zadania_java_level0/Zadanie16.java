package zadania_java_level0;

//shows dividers of given number
//todo
//do it in object way :) for now idk what more

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        System.out.println("program wyświetli dzielniki podanej wartości");
        System.out.println("podaj wartośc do oprawcowania dzielników");

        Scanner rd = new Scanner(System.in);
        int userValue = rd.nextInt();
        rd.close();

        System.out.println("dzielniki dla podanej wartości to: ");

        for (int i = 1; i <= userValue; i++) {
            if (userValue % i == 0) {  //if modulo gives 0 it must be divider
                System.out.print(i + " ");
            }
        }
    }
}
