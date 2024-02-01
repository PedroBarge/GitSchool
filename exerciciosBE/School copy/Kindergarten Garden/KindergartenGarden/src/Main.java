import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kindergarten Garden");
        //------------------------------------------------------------------//
        //var
        Scanner scnString = new Scanner(System.in);
        int i = 0;
        int nSeeds=2;
        //Arrays
        String[][] cups = {{"V", "R", "C", "G", "V", "V", "R", "V", "C", "G", "G", "C", "C", "G", "V", "R", "G", "C", "V", "C", "G", "C", "G", "V"}, {"V", "R", "C", "C", "C", "G", "C", "R", "R", "G", "V", "C", "G", "C", "R", "V", "V", "C", "V", "G", "C", "G", "C", "V"}};
        String[] classCH = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
        //------------------------------------------------------------------//
        System.out.println("Kindergarten Garden");
        System.out.println("Qual aluno quer procurar?");
        for (i = 0; i < classCH.length; i++) {
            if (i != 11) {
                System.out.print(classCH[i] + ", ");
            } else System.out.print(classCH[i] + ": ");
        }
        String nameSearch = scnString.next();
        int index = Arrays.asList(classCH).indexOf(nameSearch);

        System.out.println("Quantas sementes plantou?");
        nSeeds= scnString.nextInt();
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