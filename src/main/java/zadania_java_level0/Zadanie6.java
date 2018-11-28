package zadania_java_level0;

//prosty kalkulator
//todo
//przerobić na obiektowy, zrobić to na generykach, jak wykonac program bez switcha

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println("podaj pierwszą liczbę: ");
        Scanner rd = new Scanner(System.in);
        int firstDigit = rd.nextInt();

        String operation = "";

        do {
            if (!operation.equals("")) {
                System.out.println("wprowadziłeś niepoprawną operację.");   //it must be here, otherwise we must change the loop
            }

            System.out.println("podaj jeden z możliwych rodzajów operacji + / * -");
            rd = new Scanner(System.in);
            operation = rd.nextLine();
        }

        while (!operation.equals("+") && !operation.equals("*") && !operation.equals("-") && !operation.equals("/")); //cheking if operation is proper

        System.out.println("podaj  drugą liczbę.");
        int secondDigit = rd.nextInt();

        System.out.printf("wybrałeś operację %s oraz liczby %d oraz %d.\n", operation, firstDigit, secondDigit);

        if (operation.equals("/") && secondDigit == 0) { //checking dividing by 0, end if true to skipp while loop
            System.out.println("druga liczba to zero, ponieważ wybrałeś dzielenie operacja nie może zostać przeprowadzona a program zostaje zakonczony.");
            System.exit(0);
        }

        float result = 0;

        switch (operation) {
            case "+":
                result = firstDigit + secondDigit;
                break;
            case "*":
                result = firstDigit * secondDigit;
                break;
            case "/":
                result = (float) firstDigit / (float) secondDigit; //we must cast in case if result will be fraction
                break;
            case "-":
                result = firstDigit - secondDigit;
                break;
            default:
                System.out.println("nieprzewidzianasytuacja");
        }

        System.out.println("wynik wybranej operacji wynosi " + result);

    }
}