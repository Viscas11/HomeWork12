package HomeWork12;

public class Book {
    private String nameBook;

    private int publishYear;

    private Author author;

    public Book(String nameBook, int publishYear, Author author) {
        this.nameBook = nameBook;
        this.publishYear = publishYear;
        this.author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getPublishYear() {
        return this.publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getSpeshialMetodBook() {
        String speshialNameBook = " Название книги - " + this.nameBook;
        return speshialNameBook;
    }

    @Override
    public  boolean equals(Object name) {
        if (this == name) return true;
        if (name == null || getClass() !=
                name.getClass()) return false;
        Book tempBook = (Book) name;

        if (nameBook == tempBook.nameBook && name ==
                tempBook.nameBook) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = nameBook != null ? nameBook.hashCode() : 0;
        result = 11 * result;
        return result;
    }

    @Override
    public String toString() {
        return author.toString();
    }
}
