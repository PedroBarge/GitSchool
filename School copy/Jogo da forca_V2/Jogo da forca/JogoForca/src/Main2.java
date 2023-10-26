import java.util.Scanner;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        //------------------------------------------------------------------//
        //Variaveis
        int attempts = 6;
        Scanner inputScn = new Scanner(System.in);
        Random themeWordRamdom = new Random();
        boolean checkOption = false;
        int inputChoice = 0;
        String wordFromArray = "";
        char[] wordFromArrayToChar = new char[0];
        char[] playerGuess;
        //------------------------------------------------------------------//
        // Arrays Temas ja com 10 palavras cada 1
        String[] themeNature = {"Mountain", "Sea", "Dunes", "Water", "Rain", "Vulcano", "Fire", "Ocean", "Clouds", "Forest"};
        String[] themeCities = {"Porto", "Madrid", "Toulouse", "Berlin", "Moscow", "Lisbon", "Zurich", "Toronto", "Lima", "Brasilia"};
        String[] themeNames = {"Peter", "Paul", "David", "Gertrude", "Martha", "Alexander", "John", "Joana", "Anthony", "Jessica"};
        String[] themeObjects = {"Refrigerator", "Fork", "Spoon", "Glasses", "Phone", "Box", "Monitor", "Wallet", "Pants", "Computer"};
        //------------------------------------------------------------------//
        //Array Menu
        String[] menu = {"1-Nature", "2-Cities", "3-Names", "4-Objects"};
        //------------------------------------------------------------------//
        //Print do menu de temas
        System.out.println("\nHangMan");
        System.out.println("You have 4 themes: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        System.out.println("0-EXIT");
        //------------------------------------------------------------------//
        // Verificar a opção inserida
        while (!checkOption) {
            System.out.print("Insert your choice: ");
            inputChoice = inputScn.nextInt();
            if (inputChoice == 0) {
                checkOption = true;
                break;
            } else if (inputChoice == 1 || inputChoice == 2 || inputChoice == 3 || inputChoice == 4) {
                checkOption = true;
            } else {
                System.out.println("Please enter a valid choice.");
                continue;
            }
        }
        //------------------------------------------------------------------//
        // Vai escolher uma palavra aleatoria do array tendo em conta o tema escolhido
        // ja a colocando para LOWER CASE
         switch (inputChoice) {
            case 1:
                wordFromArray = themeNature[themeWordRamdom.nextInt(themeNature.length)].toLowerCase();
                break;
            case 2:
                wordFromArray = themeCities[themeWordRamdom.nextInt(themeCities.length)].toLowerCase();
                break;
            case 3:
                wordFromArray = themeNames[themeWordRamdom.nextInt(themeNames.length)].toLowerCase();
                break;
            case 4:
                wordFromArray = themeObjects[themeWordRamdom.nextInt(themeObjects.length)].toLowerCase();
                break;
            default:
                if (inputChoice == 0) {
                    break;
                }
                break;
        }
        //------------------------------------------------------------------//
        // transforma a palavbra escolhida em um array de Chars
        wordFromArrayToChar = wordFromArray.toCharArray();
        playerGuess = new char[wordFromArray.length()];

        // para ter aqueles traços lá tipo _____
        for (int i = 0; i < playerGuess.length; i++) {
            playerGuess[i] = '_';
        }
        //------------------------------------------------------------------//
        //Vai verificar as tentaivas e reduzir sempre que errar
        //
        int attemptsLeft = attempts; //criei esta variavel para não perder o valor inicial (em caso de repetir programa)
        System.out.println("The word has " + wordFromArray.length() + " letters");

        while (attemptsLeft > 0) {
            System.out.println("Attempts: " + attemptsLeft);
            System.out.println("Guessed letters: " + new String(playerGuess));
            System.out.print("Please insert one character at time: ");
            char guess = inputScn.next().toLowerCase().charAt(0);

            boolean guessed = false;

            for (int i = 0; i < wordFromArray.length(); i++) {
                if (wordFromArrayToChar[i] == guess) {
                    playerGuess[i] = guess;
                    guessed = true;
                }
            }
            if (!guessed) {
                attemptsLeft--;
            }
            if (new String(playerGuess).equals(wordFromArray)) {
                System.out.println("\nThe word was: " + wordFromArray);
                break;
            }
        }
        if (attemptsLeft == 0) {
            System.out.println("You lost all your attemppts. The word was: " + wordFromArray);
        }

    }
}