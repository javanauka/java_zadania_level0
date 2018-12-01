package zadania_java_level0;

//you must guess the number from range 1 - 100 that cpu choose

import java.util.Random;
import java.util.Scanner;

public class Zadanie12 {

    static final int PICK_LIMIT = 9;
    static final int PICK_MOVE = 1;

    public static void main(String[] args) {

        Random rand = new Random();
        int cpuPick = rand.nextInt(PICK_LIMIT) + PICK_MOVE;  // thi random picking from 0 to bound, min is 0 and max is 99, to get 1-100 you must muve border by 1

        System.out.println("zgadnij jaką liczbę wybrał komputer, zakres losowania 1 - 100");

        Scanner rd = new Scanner(System.in);
        int playerPick;

        do {
            System.out.println("podaj swoją propozycję ");
            playerPick = rd.nextInt();
            if (playerPick < cpuPick) {
                System.out.println("twoja propozycja jest mniejsza niż wylosowana liczba");
            } else if (playerPick > cpuPick) {
                System.out.println("twoja propozycja jest większa niż wylosowana liczba");
            }
        } while (playerPick != cpuPick);

        System.out.printf("udało się, wybrałeś %d a komputer wybrał właśnie %d", playerPick, cpuPick);

    }
}
