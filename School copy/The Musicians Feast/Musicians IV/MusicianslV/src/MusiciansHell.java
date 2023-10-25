import java.util.Random;
class MusiciansHell {

    public static void main(String[] args){
        String[] musicians = {"Steven Tyler", "Erykah Badu", "Mick Jagger", "Paul McCartney", "Brandon Flowers", "Alex Turner"};

        String musician = pickMusician(musicians); // should return the musician's name, or "No one will stay to help."
    }

    public static String pickMusician(String[] musicians) {
        // write your code here
        Random nRandom = new Random();
        int randomNumber = nRandom.nextInt(6) + 10;
        System.out.println(randomNumber);
        //------------------------------------------------------------------//


        String txt ="txt";
    return txt;
    }
}