package zadania_java_level0;

//takes int from user, counts sum of its digits, gives average ratio of mean of sum of even and odd digits
//todo
//do it in object way :) for now idk what more

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        System.out.println("program zlicza sume liczb wartości podanej od urzytkownika");
        System.out.println("następnie podaje stosunek średniej arytmetycznej sum wartości parzystych i nieparzystych");
        System.out.println("podaj wartość do zliczenia");

        Scanner rd = new Scanner(System.in);
        int userValue = rd.nextInt();
        rd.close();

        int sumOfAll = 0, howManyOdd = 0, howManyEven = 0;
        float averageRatio = 0, sumOfOdd = 0, sumOfEven = 0;  //i choose sum to be float, otherwise i must cast while counting averageRatio

        for (int i = 1; i <= userValue; i++) {
            sumOfAll += i;
            if (i % 2 == 0) {  //if modulo gives 0 it must be even
                sumOfEven += i;
                howManyEven++;
            } else {        //else it must be odd
                sumOfOdd += i;
                howManyOdd++;
            }
        }

        averageRatio = (sumOfEven / howManyEven) / (sumOfOdd / howManyOdd);

        System.out.printf("dla wartości %d suma cyfr i liczb wynosi %d, suma parzystych to %f (było ich %d) a nieparzystych to %f (było ich %d)\n", userValue, sumOfAll,
                sumOfEven, howManyEven, sumOfOdd, howManyOdd);
        System.out.printf("natomiast stosunek sredniej parzystych (%.2f) do nieprzystych (%.2f) wynosi %f", (float) sumOfEven / howManyEven, (float) sumOfOdd / howManyOdd, averageRatio);
    }
}
