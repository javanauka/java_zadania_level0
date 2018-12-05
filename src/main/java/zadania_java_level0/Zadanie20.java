package zadania_java_level0;

//changes decimal numbers into binary
//todo
// :) as usual, obj

import java.util.Scanner;

public class Zadanie20 {

    final static int DIVIDER = 2;
    final static int ZERO = 0;
    final static int ONE = 1;
    final static int WORD_LENGTH = 32;
    final static int OUTPUT_SHOW_FORMAT = 4;

    public static void main(String[] args) {
        System.out.println("program zamienia wartości z kodu dzesiętnego na binarny");
        System.out.println("podaj liczbę całkowitą do zamiany");

        Scanner rd = new Scanner(System.in);
        int userNumber = rd.nextInt();
        rd.close();

        int[] binaryInterpretArray = new int[WORD_LENGTH];

        for (int i = 0; i < binaryInterpretArray.length; i++) {
            if (userNumber % DIVIDER == ZERO) {        //cheking if it divides completely, if yes, put 0 into binary array
                userNumber /= DIVIDER;
                binaryInterpretArray[i] = ZERO;
            } else {
                userNumber /= DIVIDER ;     //otherwise it must have rest 1 and we should put it into binary array
                binaryInterpretArray[i] = ONE;
            }

        }

        for (int i = binaryInterpretArray.length - ONE; i >= ZERO; i--) {
            if ((i + ONE) % OUTPUT_SHOW_FORMAT == ZERO) {     //formating output into groups of 4
                System.out.print(" ");
            }
            System.out.print(binaryInterpretArray[i]);
        }
        }
    }

