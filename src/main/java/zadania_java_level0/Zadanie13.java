package zadania_java_level0;

//will draw rectangle in console, user will give sign of fulfillment, size and starting point
//todo
//to objects, methods use will clear the code

import java.util.Scanner;

public class Zadanie13 {

    static final char EMPTY_SIGN = ' ';

    public static void main(String[] args) {
        System.out.println("program narysuje prostokąt, podasz jego wypełnienie, wielkość boków oraz punkt początkowy");
        System.out.println("podaj znak wypełnienia");

        Scanner rd = new Scanner(System.in);
        String rectangleSign = rd.nextLine();

        System.out.println("podaj kolejno długość i wysokość");
        int width = rd.nextInt();
        int height = rd.nextInt();

        System.out.println("podaj kolejno współrzędne x i y począku");
        int xCoord = rd.nextInt();
        int yCoord = rd.nextInt();

        for (int i = 0; i < yCoord; i++) {
            System.out.println();  //setting start point in y axis
        }

        for (int i = 0; i < height; i++) {      //start counting the rows of rectangular

            for (int space = 0; space < xCoord; space++) {       //setting correct place on x axis
                System.out.print(EMPTY_SIGN);
            }

            for (int j = 0; j < xCoord; j++) {      //drawing a line of rectangle
                System.out.print(rectangleSign);
            }

            System.out.println();       //go to next line of rectangle
        }
    }

}
