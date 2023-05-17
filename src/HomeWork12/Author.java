package HomeWork12;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getAuthorName() {
        return this.name;
    }
    public String getAuthorLastName() {
        return this.lastName;
    }
}
