class PasswordGenerator {
    public static void main(String[] args) {
        generatePassword("Peter Gabriel"); // should print "G@br!el"
        generatePassword("Brian Adams"); // should print "@d@ms"
    }
//a computer program takes the musician's last name and replaces
// every 'a' with an '@', and every 'i' with an exclamation point.
    public static void generatePassword(String musicianName) {
        // write your code here
        //Check Name
        System.out.println("Nome musico: " + musicianName);
        //------------------------------------------------------------------
        String password;
        //Check the space to cut off the first name
        int indexOfSpace = musicianName.lastIndexOf(" ")+1;
        //System.out.println(indexOfSpace);
        String subString = musicianName.substring(indexOfSpace);
        //System.out.println(subString);//->Second Name
        //------------------------------------------------------------------
        password = subString.replace("a", "@");
        password = password.replace("A", "@");
        password = password.replace("i", "!");
        System.out.println(password);
    }
}