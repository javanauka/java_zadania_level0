package zadania_java_level0;

//add given numbers until user will press 0
//todo
//count how many digits was given, object-abling it, nothing :/

import java.util.Scanner;

public class Zadanie10 {

    static final float STOP_COUNT = 0;

    public static void main(String[] args) {
        System.out.println("program będzie sumował podane liczby póki użytkownik nie poda 0.\nWprowadź pierwszą wartość:");

        Scanner rd = new Scanner(System.in);


        float givenNumber = rd.nextFloat();
        float sum = STOP_COUNT;    //if first given will be 0 than we got proper sum already

        while (givenNumber != STOP_COUNT) {
            System.out.println("wprowadź kolejną wartość");
            sum += givenNumber;
            givenNumber = rd.nextFloat();
        }

        System.out.println("suma wprowadzonych liczb wynosi " + sum);

//        do {
//            sum += givenNumber;
//            givenNumber = rd.nextFloat();
//            System.out.println("wprowadź kolejną wartość");
//        } while (givenNumber != 0f);
    }
}
