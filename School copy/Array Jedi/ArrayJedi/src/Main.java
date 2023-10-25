public class Main {
    public static void main(String[] args) {
        System.out.println("Array Jedi");
        String[] name = {"Luke Skywalker", "Anakin Skywalker","Master Yoda","Manel Joaquim","Ahsoka"};

        for (String n: name) {
        //for (int i = 0; i < name.length; i++) {
            if (n.contains("Skywalker")) {
                System.out.println("May the force be with you");
                continue;
            }
            if (n.contains("Yoda")) {
                System.out.println("Grogu my son is not!");
                break;
            }
        }

    }
}