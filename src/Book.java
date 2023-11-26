public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publication_year;

    public Book(String i, String t, String a) {
        isbn = i;
        title = t;
        author = a;
    }

    public Book(String t) {
        title = t;
    }
    public Book(String i, String t, String a, int p) {
        isbn = i;
        title = t;
        author = a;
        publication_year = p;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

}
