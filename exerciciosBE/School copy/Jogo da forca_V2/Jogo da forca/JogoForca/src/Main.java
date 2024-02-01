import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //------------------------------------------------------------------//
        // VARIAVEIS:
        int attenpts = 6;
        Scanner inputScn = new Scanner(System.in);
        Random themeWord = new Random();
        boolean checkOption = false;
        int inputChoice = 0;
        int randomNumber = 0;
        char char1 = 0;

        String[] themeNature = {"Mountain", "Sea", "Dunes", "Water", "Rain", "Vulcano", "Fire", "Ocean", "Clouds", "Forest"};
        String[] themeCities = {"Porto", "Madrid", "Toulouse", "Berlin", "Moscow", "Lisbon", "Zurich", "Toronto", "Lima", "Brasilia"};
        String[] themeNames = {"Peter", "Paul", "David", "Gertrude", "Martha", "Alexander", "John", "Joana", "Anthony", "Jessica"};
        String[] themeObjects = {"Refrigerator", "Fork", "Spoon", "Glasses", "Phone", "Box", "Monitor", "Wallet", "Pants", "Computer"};
        char[] stringToChar = new char[0];
        String[] menu = {"1-Nature", "2-Cities", "3-Names", "4-Objects"};

        //------------------------------------------------------------------//
        System.out.println("\nHangMan");
        System.out.println("You have 4 themes: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        System.out.println("0-EXIT");
        //------------------------------------------------------------------//
        while (!checkOption) {
            System.out.print("Insert your choice: ");
            inputChoice = inputScn.nextInt();
            if (inputChoice == 0) {
                break;
            }
            if (inputChoice == 1 || inputChoice == 2 || inputChoice == 3 || inputChoice == 4) {
                checkOption = true;
            } else {
                System.out.println("Bitch do it rigth");
                continue;
            }
        }
        //------------------------------------------------------------------//
        switch (inputChoice) {
            case 1:
                randomNumber = themeWord.nextInt(themeNature.length);
                for (int i = 0; i < themeNature.length; i++) {
                    if (themeNature[i].equals(themeNature[randomNumber])) {
                        System.out.println(themeNature[randomNumber]);
                        String themeNatureStr = themeNature[randomNumber];
                        //stringToChar = themeNatureStr.toLowerCase().toCharArray();
                        System.out.println("The word has "+stringToChar.length+" letters");
                        System.out.print("Please insert one character at time: ");
                        //------------------------------------------------------------------//
                        String wordInput = inputScn.next();
                        char wordInputChar= wordInput.charAt(0);

                        for (int j = stringToChar.length; j > 0; j--) {
                            System.out.println(stringToChar[i]);
                        }
                    }
                }

                break;
            case 2:
                randomNumber = themeWord.nextInt(themeCities.length);
                for (int i = 0; i < themeCities.length; i++) {
                    if (themeCities[i].equals(themeCities[randomNumber])) {
                        System.out.println(themeCities[randomNumber]);
                        String themeCitiesStr = themeCities[randomNumber];
                        stringToChar = themeCitiesStr.toLowerCase().toCharArray();
                        System.out.println("The word has "+stringToChar.length+" letters");
                    }
                }

                break;
            case 3:
                randomNumber = themeWord.nextInt(themeNames.length);
                for (int i = 0; i < themeNames.length; i++) {
                    if (themeNames[i].equals(themeNames[randomNumber])) {
                        System.out.println(themeNames[randomNumber]);
                        String themeNamesStr = themeNames[randomNumber];
                        stringToChar = themeNamesStr.toLowerCase().toCharArray();
                        System.out.println("The word has "+stringToChar.length+" letters");
                    }
                }

                break;
            case 4:
                randomNumber = themeWord.nextInt(themeObjects.length);
                for (int i = 0; i < themeObjects.length; i++) {
                    if (themeObjects[i].equals(themeObjects[randomNumber])) {
                        System.out.println(themeObjects[randomNumber]);
                        String themeObjectsStr = themeObjects[randomNumber];
                        stringToChar = themeObjectsStr.toLowerCase().toCharArray();
                        System.out.println("The word has "+stringToChar.length+" letters");
                    }
                }

                break;
        }

    }
}