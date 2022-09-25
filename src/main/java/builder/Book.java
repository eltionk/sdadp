package builder;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private String isbn;
    private String publisher;

    private Book(String title, String author, String description, double price, String isbn, String publisher) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private String description;
        private double price;
        private String isbn;
        private String publisher;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book createBook () {
            Book book = new Book(this.title, this.author, this.description, this.price, this.isbn, this.publisher);
            return book;
        }
    }
}
