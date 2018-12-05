package zadania_java_level0;

//create array of size n x n (n given by user, of boolean reange, vale 1 for cell if i+1 and j+1 are relatively prime (względnie pierwsze, nie wiem jak siętaczy) numbers

import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        System.out.println("program z podanego n tworzy tablicę n x n, wypełnioną wartościami z zakresu boolean," +
                "wartość komórki jeden dla a[i][j] gdy i+1 i j+1 są pierwsze.");

        System.out.println("podaj wymiartablicy n x n");

        Scanner rd = new Scanner(System.in);
        int arraySize = rd.nextInt();
        rd.close();

        boolean[][] booleanArray = new boolean[arraySize][arraySize];

        for (int i = 0; i < booleanArray.length; i++) {
            for (int j = 0; j < booleanArray.length; j++) {

                System.out.print((booleanArray[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println(IsAPrimeNumber(1));
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
//wprowadzenie zman w zadaniu
//a to dodałem po pullu
public static int[] FindDividers(int numberToClculate) {
        
}
}

//co sie stanie jak tu cos wpisze i bede pullowac
