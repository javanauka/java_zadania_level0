package zadania_java_level0;

//create array of size n x n (n given by user, of boolean reange, vale 1 for cell if i+1 and j+1 are relatively prime (względnie pierwsze, nie wiem jak siętaczy) numbers

import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        System.out.println("program z podanego n tworzy tablicę n x n, wypełnioną wartościami z zakresu boolean," +
                "wartość komórki równa jest jeden dla a[i][j] gdy i+1 i j+1 są względnie pierwsze," +
                " czyli dla obu największym wspólnym dzielnikiem jest 1.");

        System.out.println("podaj wymiartablicy n x n");

        Scanner rd = new Scanner(System.in);
        int arraySize = rd.nextInt();
        rd.close();

        boolean[][] booleanArray = new boolean[arraySize][arraySize];
        int[] check;

        for (int i = 0; i < booleanArray.length; i++) {
            for (int j = 0; j < booleanArray.length; j++) {

                booleanArray[i][j] = IsRelativelyPrime(FindDividers(i+1), j+1);
                System.out.print((booleanArray[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println(IsAPrimeNumber(1));

        check = FindDividers(8);

        PrintArray(check);

    }


public static boolean IsAPrimeNumber(int arrayIndex) {

//    if (arrayIndex == 1) {
//        return false;       //1 is not a prime number
//    }

    int dividerCount = 0;       //will help counting dividers of the value to examin if it prime number
    for (int i = 2; i <= arrayIndex; i++) {
        if (arrayIndex % i == 0) {
            dividerCount++;
        }
    }
    if (dividerCount == 0 ) {
        return true;
    }
    return false;
}

public static int[] FindDividers(int numberToClculate) {
        int[] arrayOfDividers = new int[numberToClculate];
        int helperIndex = 0;
    for (int i = 1; i <= numberToClculate; i++) {
        if (numberToClculate % i == 0) {  //if modulo gives 0 it must be divider
            arrayOfDividers[helperIndex++] = i;
        }
    }
    return arrayOfDividers;
}

public static void PrintArray(int[] array) {
    for(int i = 0; i <array.length;i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}

public static boolean IsRelativelyPrime(int[] arrayOfDividers, int numberToCheck){
        int commonDividersCounter = 0;
        for(int i = 0; i < arrayOfDividers.length; i++){
            if (arrayOfDividers[i] > 0) {
                if (numberToCheck % arrayOfDividers[i] == 0) {
                    commonDividersCounter++;
                }
            }
        }
        if (commonDividersCounter > 1) {
            return false;
        }
        return true;
}

}


