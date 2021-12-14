public class BookApp {
    public static void main(String[] args) {
       Book book = Book.of("Sienkiewicz","Potop");
        System.out.println(book.author + " " + book.title);
    }
}