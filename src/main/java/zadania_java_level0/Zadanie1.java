package zadania_java_level0;

import java.util.Scanner;

/*
* propozycje rozbudowy programu:
* dac wybór co na co chce zamieniac
* przerobic program na obiektowy*/

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("program zamieniający stopnie celcjusza na farenheita");
        System.out.println("wprowadź stopnie celcjusza do zamiany:");
        int degrees = 0;
        Scanner rd = new Scanner(System.in);
        degrees = rd.nextInt();
        System.out.printf("podałeś %d stopni celcjusza do zamiany, wynik to %3.2f stopni farenheita", degrees, (9/5f * degrees) + 32);

}
