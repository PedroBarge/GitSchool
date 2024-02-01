public class Main {
    public static void main(String[] args) {
        testDish("Bob Dylan", "beef wellington"); // should print true
        testDish("Mick Jagger", "mushroom soup"); // should print false

        //The only rule is that the first and last letters of the dish must match the first and last letters of the musician's name.
    }

    //------------------------------------------------------------------
    public static void testDish(String musicianName, String dish) {
        // write your code here

        System.out.println("Nome musico: " + musicianName);
        System.out.println("Nome prato: " + dish);
        //System.out.println("Tamanho do nome: " + musicianName.length());
        //System.out.println("Tamanho do nome prato: " + dish.length());
        String musicName = musicianName.toLowerCase();
        //System.out.println(musicName);
        //------------------------------------------------------------------

        //NAMES:
        char primLetra = musicName.charAt(0);
        int lastWordL = musicName.length() - 1;
        char lastWord = musicName.charAt(lastWordL);
        //System.out.println(primLetra);
        //System.out.println(lastWord);

        //DISH
        char primWDish = dish.charAt(0);
        int lastDishL = dish.length() - 1;
        char lastWDish = dish.charAt(lastDishL);
        //System.out.println(primWDish);
        //System.out.println(lastWDish);

        //------------------------------------------------------------------
        boolean canB = (primLetra == primWDish && lastWord == lastWDish);
        System.out.println("Pode trazer um prato? "+canB);

        /*if (primLetra == primWDish && lastWord == lastWDish) {
            canB =true;
            System.out.println(canB);
        }else {
            System.out.println(canB);
        }*/

    }
}
