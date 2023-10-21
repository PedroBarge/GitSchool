public class Main {
    public static void main(String[] args) {
        String nome= "Pedro";
        print("Arroz");
        num(soma(1,2));
        num(subtra(4,3));
        num(multi(5,6));
        num(div(10,2));
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static void num (int c){
        System.out.println(c);
    }
    public static int soma (int a, int b){
        return (a+b);
    }
    public static int subtra (int a, int b){
        return (a-b);
    }
    public static int multi (int a, int b){
        return (a*b);
    }
    public static int div (int a, int b){
        return (a/b);
    }

}
