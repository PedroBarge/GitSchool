import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.SplittableRandom;

public class Kindergarden2 {
    public static void main(String[] args) {
        System.out.println("Kindergarten Garden");
        //------------------------------------------------------------------//
        //var
        Scanner scnString = new Scanner(System.in);
        int i = 0;
        int numSeeds=0;
        int nSeeds=2;
        String value="a";
        //Arrays
        //String[][] cups = {{"V", "R", "C", "G", "V", "V", "R", "V", "C", "G", "G", "C", "C", "G", "V", "R", "G", "C", "V", "C", "G", "C", "G", "V"}, {"V", "R", "C", "C", "C", "G", "C", "R", "R", "G", "V", "C", "G", "C", "R", "V", "V", "C", "V", "G", "C", "G", "C", "V"}};
        String[][] cups = new String[2][24];
        String[] seed = new String[numSeeds];
        String[] classCH = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
        //------------------------------------------------------------------//
        System.out.println("Qual aluno quer procurar?");
        for (i = 0; i < classCH.length; i++) {
            if (i != 11) {
                System.out.print(classCH[i] + ", ");
            } else System.out.print(classCH[i] + ": ");
        }
        String nameSearch = scnString.next();
        int index = Arrays.asList(classCH).indexOf(nameSearch);
        System.out.print("Quantas sementes plantou? ");
        nSeeds = scnString.nextInt();
        //------------------------------------------------------------------//

        Random numSeedRand = new Random();

        System.out.print("Array das plantas;");
        for (i = 0; i < cups.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < cups[i].length; j++) {
                int seedRand = numSeedRand.nextInt(4);
                if (seedRand == 0) {
                    value = "G"; //Grass
                }
                if (seedRand == 1) {
                    value = "C"; //Clover
                }
                if (seedRand == 2) {
                    value = "R"; //Radishes
                }
                if (seedRand == 3) {
                    value = "V"; //Violets
                }
                cups[i][j] = value;
                System.out.print(cups[i][j]);
            }
        }
        System.out.println();
        //------------------------------------------------------------------//
        System.out.print("[window] [window] [window]");
        for (i = 0; i < cups.length; i++) {
            System.out.println();
            for (int j = nSeeds * index; j < nSeeds * index + nSeeds; j++) { //x2 porque esta por ordem alfabetica e o +2 pq são as plantas
                System.out.print(cups[i][j]);
            }
        }
    }
}