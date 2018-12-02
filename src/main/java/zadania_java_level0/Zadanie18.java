package zadania_java_level0;

//automatically makes an array of 20 digits from range 1 - 10 and counts occurrences of every digit

import java.util.Random;

public class Zadanie18 {

    static final int BASE_ARRAY_LENGTH = 20;
    static final int COUTING_ARRAY_LENGTH = 10;     //length of arra that counts occurrences
    static final int RANDOM_RANGE_MOVE = 1;     //length of arra that counts occurrences

    public static void main(String[] args) {
        System.out.println("program tworzy macierz 20 wartości z zakresu 1 -> 10 i zlicza ich wystąpienia");

        int[] baseArray = new int[BASE_ARRAY_LENGTH];
        int[] countingArray = new int[COUTING_ARRAY_LENGTH];

        Random generate = new Random();

        for (int i = 0; i < BASE_ARRAY_LENGTH; i++) {
            baseArray[i] = generate.nextInt(COUTING_ARRAY_LENGTH) + RANDOM_RANGE_MOVE; //random.nextInt(x) gives random from range 0 (inclusive) x (exclusive)
        }

        System.out.println("wygenerowana została macierz podstawowa");
        for (int i = 0; i < baseArray.length; i++) {
            System.out.print(baseArray[i] + " ");
        }

        for (int i = 0; i < COUTING_ARRAY_LENGTH; i++) {
            countingArray[i] = i + RANDOM_RANGE_MOVE;  //i need values from 1 - 10
        }

        System.out.println("wygenerowana została macierz zliczająca");
        for (int i = 0; i < COUTING_ARRAY_LENGTH; i++) {
            System.out.print(countingArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < BASE_ARRAY_LENGTH; i++) {
            countingArray[baseArray[i]-1] += 1;
//            System.out.print(baseArray[i] + " ");
        }
//
        System.out.println("w macierzy podtawowej było:");
        for (int i = 0; i < COUTING_ARRAY_LENGTH; i++) {
            System.out.print((i + 1) + " " + countingArray[i] + " razy, ");
            countingArray[i] = i + RANDOM_RANGE_MOVE;  //i need values from 1 - 10
        }
    }
}

