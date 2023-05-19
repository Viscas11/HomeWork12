package HomeWork12;

public class HomeWork12 {
    public static void main(String[] args) {
        Author sapkovski = new Author("Анджей", "Сапковский");
        Author tven = new Author("Марк", "Твен");
        Author sapkovskiJunior = new Author( "Макс", "Сапковский Младший");
        Author sapkovski2 = new Author("Анджей", "Сапковский");
        Book vedmak = new Book(" Ведьмак ",  1986, sapkovski);
        Book soyer = new Book(" Приключения Тома Сойера ", 1876, tven );

        vedmak.setPublishYear(1992);
        Author vedmakAuthor =  vedmak.getAuthor();
        Author soyerAuthor = soyer.getAuthor();

        printBook(vedmak);
        printBook(soyer);

        System.out.println(sapkovski.equals(vedmak));
        System.out.println(sapkovski.equals(soyer));
        System.out.println(sapkovski.equals(tven));
        System.out.println(sapkovski.equals(sapkovski2));
    }
    public static void printBook(Book book) {
        System.out.println(book.getPublishYear() + " " + book.getNameBook() + " "
        + book.getAuthor().getAuthorName() + " " + book.getAuthor().getAuthorLastName());
    }

}
