import java.util.ArrayList;

public class User {
    public String name;
    public int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age =age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
