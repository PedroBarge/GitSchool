public class Main {
    public static void main(String[] args) {
        String points = "XXXXXXXXXXX";
        int maxLines = 10;
        System.out.println("Pontos!");

        System.out.println("\nDo menor para o maior");
        for (int i = 10; i > 0; i--) {
            System.out.println(points.substring(i));
        }
        System.out.println("\nDo maior para o menor");
        for (int i = 1; i <= 10; i++) {
            System.out.println(points.substring(i));
        }
        System.out.println("\nPiramide");
        for (int i = 0; i < maxLines; i++) { // diz onde começa a base
            for (int j = 0; j < maxLines - i; j++) { //espaços
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) { //escrever o X
                System.out.print("X");
            }
            System.out.println();
        }


        System.out.println("\nPiramide (Invertido)");
        for (int i = maxLines; i >= 0; i--) {
            for (int j = 0; j < maxLines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
        //---------------
        System.out.println("Caixa");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0 || j == 0 || i == 5 || j == 5 ) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}