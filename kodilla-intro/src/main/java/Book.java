public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
            this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = new Book("Andzej Sapkowski", "Ostatnie Życzenie");
        return book;
    }
}