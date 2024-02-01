public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>("");
        System.out.println("Hello world!");

        list.add("tenho a 1 posição");
        list.add("tenho a 2 posição");
        list.add("tenho a 3 posição");
        list.addValue("Agora eu", 1);
        list.getIndex(2);
        list.deleteIndex(0);
    }
}