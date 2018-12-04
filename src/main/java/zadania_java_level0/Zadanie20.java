package zadania_java_level0;

//changes decimal numbers into binary

import java.util.Scanner;

public class Zadanie20 {

    final static int DIVIDER = 2;

    public static void main(String[] args) {
        System.out.println("program zamienia wartości z kodu dzesiętnego na binarny");
        System.out.println("podaj liczbę całkowitą do zamiany");

        Scanner rd = new Scanner(System.in);
        int userNumber = rd.nextInt();
        rd.close();

        int[] binaryInterpretArray = new int[4];
//        for (int i = 0; i < binaryInterpretArray.length; i++) {
//            binaryInterpretArray[i] = 0;
//        }

        for (int i = 0; i < binaryInterpretArray.length; i++) {
            if (userNumber % DIVIDER == 0) {        //cheking if it divides completely, if yes, put 0 into binary array
                userNumber /= DIVIDER;
                binaryInterpretArray[i] = 0;
            } else {
                userNumber /= DIVIDER ;     //otherwise it must have rest 1 and we should put it into binary array
                binaryInterpretArray[i] = 1;
            }

        }

//        while (userNumber > 0) {
//            if (userNumber % DIVIDER == 0) {
//                userNumber /= DIVIDER;
//                System.out.print(" 0 ");
//            } else {
//                userNumber /= DIVIDER ;
//                System.out.print(" 1 ");
//            }


//            System.out.println(userNumber);

        for (int i = binaryInterpretArray.length - 1; i >= 0; i--) {
            System.out.print(binaryInterpretArray[i]);
        }
        }
    }

