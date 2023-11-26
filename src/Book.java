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
        if(is_isbn_correct(isbn) == true) this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() >= 3) this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length() >= 2) this.author = author;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public static boolean is_isbn_correct(String isbn) {
        if (isbn.length() == 5) {
            boolean hata = false;
            for (int i = 0; i<5; i++) {
                if(Character.isDigit(isbn.charAt(i)) == false) {
                    hata = true;
                }
            }
            if (hata == true) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

}
