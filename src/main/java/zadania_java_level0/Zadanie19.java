package zadania_java_level0;

//creates array 5x5 with values from range -5 : 5, search min & max in every column, shows arrays
//todo
//swap, now its searching rows not columns
//store in array every position of min and max, not only the last one
import java.util.Random;

public class Zadanie19 {

    static final int ARRAY_SIZE = 5;
    static final int EMPTY_SIGN = 0;
    static final int MINIMAL = -6;
    static final int MAXIMAL = 6;

    public static void main(String[] args) {
        System.out.println("program tworzy macierz 5x5 wypełnioną wartościami z zakresu -5 : 5, znajduje minimum i maksimum w każdej kolumnie " +
                "i wyświetla macierz podstawową oraz wypełnioną minimami i maksimami");

        System.out.println("stworzono macierz podsatwową");
        int[][] baseArray = new int[ARRAY_SIZE][ARRAY_SIZE];
        int[][] analyzedArray = new int[ARRAY_SIZE][ARRAY_SIZE];

        Random generate = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {      //filling base array
            for (int j = 0; j < ARRAY_SIZE; j++) {
                baseArray[i][j] = generate.nextInt(11) - 5;
            }
        }

        for (int i = 0; i < ARRAY_SIZE; i++) {      //filling analyzed array with empty sign
            for (int j = 0; j < ARRAY_SIZE; j++) {
                analyzedArray[i][j] = EMPTY_SIGN;
            }
        }



        System.out.println("macierz bazowa wygląda tak:");  //parallel searching min and max

        int min = MAXIMAL;      //searched cant be higher than max
        int max = MINIMAL;      //searched cant be lower than min
        int indexK = MAXIMAL, indexO = MAXIMAL;   //variable that helps remember position of minimum
        int indexL = MINIMAL, indexM = MAXIMAL;   //variable that helps remember position of maximum

        for (int i = 0; i < ARRAY_SIZE; i++) {

            min = MAXIMAL;      //clearing values for next row
            max = MINIMAL;
            indexK = MAXIMAL;
            indexL = MINIMAL;

            for (int j = 0; j < ARRAY_SIZE; j++) {

                if (baseArray[i][j] <= min) {   //searching minimum
                    min = baseArray[i][j];
                    indexK = j;
                } else if (baseArray[i][j] >= max) {    //searching maximum
                    max = baseArray[i][j];
                    indexL = j;
                }

                if (baseArray[i][j] >= 0) {       //formatting display, just looks better this way
                    System.out.print(" " + baseArray[i][j] + " ");
                } else {
                    System.out.print(baseArray[i][j] + " ");
                }
            }
            analyzedArray[i][indexK] = min;     //put minimum and maximum into analyzed array
            analyzedArray[i][indexL] = max;
            System.out.println();
        }

        System.out.println("macierz zanalizowana wygląda tak:");

//        for (int i = 0; i < ARRAY_SIZE; i++) {
//            for (int j = 0; j < ARRAY_SIZE; j++) {
//
//                if (analyzedArray[i][j] >= 0) {       //formatting display, just looks better this way
//                    System.out.print(" " + analyzedArray[i][j] + " ");
//                } else {
//                    System.out.print(analyzedArray[i][j] + " ");
//                }
//            }
//        }
//
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {

                    System.out.print(analyzedArray[i][j] + " ");
                }
            System.out.println();
            }
        }
    }

