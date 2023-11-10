import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        int[] arrayN = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean verificar = false;
        boolean complete = false;
        Scanner stringScanner = new Scanner(System.in);
        int num1 = 0, num2;

        while (!complete) {
            System.out.println("Operador logicos:");
            System.out.println("Soma: +");
            System.out.println("Subtração: -");
            System.out.println("Multiplicação: *");
            System.out.println("Divisão: /");
            System.out.print("Opção: ");
            String ope = stringScanner.next();

            if (ope.equals("+") || ope.equals("-") || ope.equals("*") || ope.equals("/")) {
                System.out.println("Operador logico escolhido: " + ope);
                complete = true;
            } else {
                System.out.println("Operador invalido");
                continue;
            }

            System.out.println("Quais os numeros?");

            while (!verificar) {
                System.out.print("1º numero: ");
                num1 = stringScanner.nextInt();
                if (!stringScanner.hasNextInt()) {
                    System.out.println("Valor inválido.");
                    verificar = true;
                }
            }



            System.out.print("2º numero: ");
            /*if (!stringScanner.hasNextInt()) {
                System.out.println("Valor inválido.");
                continue;
            }*/
            num2 = stringScanner.nextInt();


       /* if (ope.equals("+")) {
            num(soma(num1,num2));
        }
        if (ope.equals("-")) {
            num(subtra(num1,num2));
        }
        if (ope.equals("/")) {
            if (num2 == 0) {
                System.out.println("O segundo numero não pode ser 0");
            } else {
                num(div(num1, num2));
            }
        }
        if (ope.equals("*")) {
            num(multi(num1,num2));
        }*/

            switch (ope) {
                case "+":
                    num(soma(num1, num2));
                    break;
                case "-":
                    num(subtra(num1, num2));
                    break;
                case "/":
                    if (num2 == 0 || num1 == 0) {
                        System.out.println("O segundo numero não pode ser 0");
                    } else {
                        num(div(num1, num2));
                    }
                    break;
                case "*":
                    num(multi(num1, num2));
                    break;
                default:
            }
            /*System.out.println("Quer voltar a usar a Calculadora?");
            System.out.print("[S]/[N] ");
            String resp = stringScanner.next();
            if (resp.equals("S") || resp.equals("s") {
            }else{
                break;
            }*/
        }
    }

    public static void num(int c) {
        System.out.print("Resultado: ");
        System.out.println(c);
    }

    public static int soma(int a, int b) {
        return (a + b);
    }

    public static int subtra(int a, int b) {
        return (a - b);
    }

    public static int multi(int a, int b) {
        return (a * b);
    }

    public static int div(int a, int b) {
        return (a / b);
    }
}