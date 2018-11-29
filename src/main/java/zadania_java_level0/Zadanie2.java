package zadania_java_level0;

import java.util.Scanner;

/*todo
 *wykorzystać dowolną kolekcje, wyszukać w niej wartości za pomocą np for
 * prócz wartości podać także która to była w kolejności
 * przerobić program na obiektowy/ */

public class Zadanie2 {
    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 0, thirdNumber = 0, min, max;
        System.out.println("podaj pierwszą liczbę całkowitą");
        Scanner rd = new Scanner(System.in);
        firstNumber = rd.nextInt();
        System.out.println("podaj drugą liczbę całkowitą");
        secondNumber = rd.nextInt();
        System.out.println("podaj trzecią liczbę całkowitą");
        thirdNumber = rd.nextInt();
        rd.close();
        System.out.printf("wprowadziłeś %d %d %d \n", firstNumber, secondNumber, thirdNumber);
        min = firstNumber;
        max = firstNumber;

        if (secondNumber < min) {
            min = secondNumber;
        }
        if (thirdNumber < min) {
            min = thirdNumber;
        }
        if (secondNumber > max) {
            max = secondNumber;
        }
        if (thirdNumber > max) {
            max = thirdNumber;
        }
        System.out.println("największa z podanych cyfr to " + max + " a najmniejsza to " + min);
    }
}
