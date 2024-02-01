public class Main {
    public static void main(String[] args) {
        String fruit = "Bananas";
        int lastFruit = fruit.length()-3;
        String subFruit = fruit.substring(lastFruit);
        System.out.println(subFruit.concat(fruit));
    }
}