package HomeWork12;

public class HomeWork12 {
    public static void main(String[] args) {
        Author sapkovski = new Author(" Анджей ", " Сапковский ");
        Author tven = new Author(" Марк ", " Твен ");
        Book vedmak = new Book(" Ведьмак ",  1986, sapkovski);
        Book soyer = new Book(" Приключения Тома Сойера ", 1876, tven );
        vedmak.setPublishYear(1992);
        Author vedmakAuthor =  vedmak.getAuthor();
        Author soyerAuthor = soyer.getAuthor();
        System.out.println(vedmak.getSpeshialMetodBook() + vedmak.getPublishYear() + vedmakAuthor.getAuthorName()
                + vedmakAuthor.getAuthorLastName());
        System.out.println(soyer.getSpeshialMetodBook() +  soyer.getPublishYear() + soyerAuthor.getAuthorName() + soyerAuthor.getAuthorLastName());
    }
}
