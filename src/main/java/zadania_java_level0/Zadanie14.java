package zadania_java_level0;

//draw a tree with specified height

import java.util.Scanner;

public class Zadanie14 {

    static final char TREE_SIGN = '*';
    static final char EMPTY_SPACE = ' ';
    static  int TREE_LEVEL = 1;


    public static void main(String[] args) {
        System.out.println("program rysuje choinke przy zadanej wysokości");
        System.out.println("podaj wysokość drzewka");

        Scanner rd = new Scanner(System.in);
        int treeHeight = rd.nextInt();
        rd.close();

        int hlp = 0;

        for (int i = treeHeight; i > 1; i--) {
            hlp = i;
            do {
                System.out.print(EMPTY_SPACE);
            } while (hlp-- > 0);

            for(int j = TREE_LEVEL; j > 0; j--) {
                System.out.print(TREE_SIGN);
            }
            TREE_LEVEL += 2;
            System.out.println();
        }
    }
}
