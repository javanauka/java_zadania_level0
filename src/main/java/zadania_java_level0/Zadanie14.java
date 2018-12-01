package zadania_java_level0;

//draw a tree with specified height
//todo
//according Piotr "zrobić to na jednej pętli"
//in every level, program draws only one more sign than all levels, so max condition for all signs is 2*x-1 in row
//must figure out when it should draw sign: if (i < (treeLevel-hlp) && i > (treeLevel+hlp) sout  :) idk now how :)

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

        for (int i = treeHeight; i > 0; i--) {  //must draw treeHeight leves of tree

            hlp = i;        //variable that holds free space

            while (hlp-- > 1) {     //draw free space before sign
                System.out.print(EMPTY_SPACE);
            }

            for(int j = TREE_LEVEL; j > 0; j--) {
                System.out.print(TREE_SIGN);
            }

            TREE_LEVEL += 2;
            System.out.println();

        }
    }
}
