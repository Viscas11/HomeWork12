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
    @Override
    public  boolean equals(Object authorOutside) {
        if (this == authorOutside) return true;
        if (authorOutside == null || getClass() !=
                authorOutside.getClass()) return false;
        Author tempAuthor = (Author) authorOutside;

         if (lastName == tempAuthor.lastName && name == tempAuthor.name) return true;
         return false;
    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result;
        return result;
    }
    @Override
    public String toString() {
        return ", Имя " + this.name + ", Фамилия " + this.lastName;
    }
}
