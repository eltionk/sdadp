package builder;

public class Client {
    public static void main(String[] args) {
        Book.BookBuilder builder = new Book.BookBuilder();
        builder.setTitle("Design Patterns")
                .setAuthor("GoF")
                .setPrice(100.0);
        Book Book = builder.createBook();

    }
}
