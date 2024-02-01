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
        for (int i = 0; i < maxLines; i++) {
            for (int j = 0; j < maxLines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
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
                if (i == 0 || j == 0 || i == 5 || j == 5) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
            //---------------
        }
        System.out.println();
        System.out.println("Triângulo centro");
        for (int i = 0; i < 10; i++) {
            int count = 10;
            int count2 = 0;
            while (count > i) {
                System.out.print(" ");
                count--;
            }
            while (count2 < i) {
                System.out.print("X");
                count2++;
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("Triângulo centro");
        for (int i = 10; i > 0; i--) {
            int count = 10;
            int count2 = 0;
            while (count > i) {
                System.out.print(" ");
                count--;
            }
            while (count2 < i) {
                System.out.print("X");
                count2++;
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("Tabela multiplicação");
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Chess");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0) {
                    System.out.print("X ");
                } else System.out.print("O ");
            }
            System.out.println();
            for (int k = 0; k < 8; k++) {
                if (k % 2 - 1 != 0) {
                    System.out.print("O ");
                } else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Caixa X");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i == 0 || j == 0 || i == 10 || j == 10) {
                    System.out.print("X");
                } else if (i == j || i == 10 - j) {
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