package zadania_java_level0;

//sum of sequence from a to b, ab given by user

//todo
// now i dont have any sensible idea, objectable??

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {
        System.out.println("podaj pierwszą liczbę");

        Scanner rd = new Scanner(System.in);
        int firstNumber = rd.nextInt();
        int rememberFirstNumber = firstNumber;

        System.out.println("podaj drugą liczbę");

        int secondNumber = rd.nextInt();

        while (firstNumber >= secondNumber) {       //right order security
            System.out.println("druga liczba jest równa bądź mniejsza od pierwszej, podaj liczbę większą niż " + firstNumber);
            int helperNumber = rd.nextInt();
            secondNumber = helperNumber;
        }

        int sum = 0;

        while (firstNumber <= secondNumber) {   //acordint to the task, sum in while loop
            sum += firstNumber++;       //sum = sum + firstNumber; firstNumber++;
        }

        System.out.printf("w petli while suma od %d do %d wynosi %d.\n", rememberFirstNumber, secondNumber, sum);

        sum = 0;
        firstNumber = rememberFirstNumber;

        do {
            sum += firstNumber++;
        } while (firstNumber <= secondNumber);

        System.out.printf("w petli do while suma od %d do %d wynosi %d.\n", rememberFirstNumber, secondNumber, sum);

        sum = 0;

        for (int i = rememberFirstNumber; i <= secondNumber; i++) {
            sum += i;
        }

        System.out.printf("w petli for suma od %d do %d wynosi %d.\n", rememberFirstNumber, secondNumber, sum);

    }
}