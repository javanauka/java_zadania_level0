package zadania_java_level0;

import java.util.Scanner;

/*todo
 * przerobienie programu na obiektowy*/

public class Zadanie3 {
    public static void main(String[] args) {
        float weight, height, bmiFactor;
        Scanner rd = new Scanner(System.in);
        System.out.println("podaj wzrost w cm");
        height = rd.nextFloat();
        System.out.println("podaj wagę w kg");
        weight = rd.nextFloat();
        System.out.printf("twoja waga wynosi %f kg a wzrost %f cm. ", weight, height);
        bmiFactor = weight / (height * height / 10000);
        System.out.println("twoje bmi wynosi " + bmiFactor);
        if (bmiFactor < 18.5) {
            System.out.println("wg bmi masz niedowagę");
        } else if (bmiFactor > 24.9) {
            System.out.println("wg bmi masz nadwagę");
        } else {
            System.out.println("wg bmi masz poprawną wagę");
        }
    }
}
