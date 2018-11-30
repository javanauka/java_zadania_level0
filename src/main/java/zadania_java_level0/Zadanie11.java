package zadania_java_level0;

//count the arithmetic mean of the sum of the smallest and biggest digit, given in a row. 0 stops checking
//todo
//make class from task 10 and use it here, also posible using clas or method from previous task where min and max was searched

import java.util.Scanner;

public class Zadanie11 {

    static final float STOP_COUNT = 0;

    public static void main(String[] args) {
        System.out.println("program wyświetli średnią arytmetyczną, sumy największej i najmniejszej wartosći.");
        System.out.println("program będzie sumował podane liczby póki użytkownik nie poda 0.\nWprowadź pierwszą wartość:");

        Scanner rd = new Scanner(System.in);
        float givenNumber = rd.nextFloat();
        if (givenNumber == STOP_COUNT) {
            System.out.println("zacząłeś od zera, nie ma czego zliczać, program zostanie zakończony");
            System.exit(0);
        }

        float biggestNumber = givenNumber, smalestNumber = givenNumber;

//        do {      //do loop isnt the best choice because when 0 is given it will assign it as smallest digit,
//            System.out.println("wprowadź kolejną wartość");
//            givenNumber = rd.nextFloat();
//            if (givenNumber < smalestNumber) {
//                smalestNumber = givenNumber;
//            } else if (givenNumber > smalestNumber){
//                biggestNumber = givenNumber;
//            }
//        } while (givenNumber != STOP_COUNT);

        while (givenNumber != STOP_COUNT) {
            System.out.println("wprowadź kolejną wartość");
            if (givenNumber <= smalestNumber) {
                smalestNumber = givenNumber;
            } else {
                biggestNumber = givenNumber;
            }
            givenNumber = rd.nextFloat();
        }

//        if (biggestNumber != STOP_COUNT && smalestNumber == STOP_COUNT || biggestNumber == STOP_COUNT && smalestNumber != STOP_COUNT) {  //trying to prevent situation when only one digit is given
        if (biggestNumber == smalestNumber ) {  //trying to prevent situation when only one digit is given
            System.out.println("wprowadziłeś tylko jedną wartość, program zostanie zakończony");
            System.exit(0);
        }

        float mean = (smalestNumber + biggestNumber) / 2;

        System.out.printf("najmniejsza podana wartość to %f a największa to %f, ich średnia wynosi %f", smalestNumber, biggestNumber, mean);
    }
}
