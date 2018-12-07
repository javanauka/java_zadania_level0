package zadania_java_level0;

//create array of size n x n (n given by user, of boolean range, value true for cell if i+1 and j+1 are relatively prime (względnie pierwsze, nie wiem jak to jest po angielsku) numbers

import java.util.Scanner;

public class Zadanie22 {

    final static String CHAR_FOR_TRUE = "+";
    final static String CHAR_FOR_FALSE = ".";
    final static String TRUE = "true ";
    final static String FALSE = "false ";

    public static void main(String[] args) {
        System.out.println("program z podanego n tworzy tablicę n x n, wypełnioną wartościami z zakresu boolean," +
                "wartość komórki równa jest jeden dla a[i][j] gdy i+1 i j+1 są względnie pierwsze," +
                " czyli dla obu największym wspólnym dzielnikiem jest 1.");

        System.out.println("podaj wymiartablicy n x n");

        Scanner rd = new Scanner(System.in);
        int arraySize = rd.nextInt();
        rd.close();

        boolean[][] booleanArray = new boolean[arraySize][arraySize];

        for (int i = 0; i < booleanArray.length; i++) {     //creating array of boolean values
            for (int j = 0; j < booleanArray.length; j++) {
                booleanArray[i][j] = IsRelativelyPrime(FindDividers(i + 1), j + 1);
            }
        }

        System.out.println("tablica podstawowa wygląda tak:");
        PrintArray(booleanArray, CHAR_FOR_TRUE, CHAR_FOR_FALSE, 1);

        System.out.println("tablica z określonym formatowaniem wygląda tak:");
        PrintArray(booleanArray, CHAR_FOR_TRUE, CHAR_FOR_FALSE, 0);
    }

    public static int[] FindDividers(int numberToClculate) {    //method will find all possible dividers from 1 to numberToCalculate, inclusively
        int[] arrayOfDividers = new int[numberToClculate];
        int helperIndex = 0;        //not necessary but it was easier for me to check results
        for (int i = 1; i <= numberToClculate; i++) {
            if (numberToClculate % i == 0) {  //if modulo gives 0 it must be divider
                arrayOfDividers[helperIndex++] = i;
            }
        }
        return arrayOfDividers;
    }

    public static void PrintArray(boolean[][] array, String trueSign, String falseSign, int arrayTypeSwitch) {      //will show array with specifed sign or with true fale value
        if (arrayTypeSwitch == 1) {
            trueSign = TRUE;        //print with final signs
            falseSign = FALSE;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == true) {
                    System.out.print(trueSign);
                } else {
                    System.out.print(falseSign);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean IsRelativelyPrime(int[] arrayOfDividers, int numberToCheck) { //check if dividers for one number are unique  for it
        int commonDividersCounter = 0;
        for (int i = 0; i < arrayOfDividers.length; i++) {
            if (arrayOfDividers[i] > 0) {
                if (numberToCheck % arrayOfDividers[i] == 0) {
                    commonDividersCounter++;
                }
            }
        }
        if (commonDividersCounter > 1) {    //if it have more than one divider numbers aren't relatively prime
            return false;
        }
        return true;
    }
}


