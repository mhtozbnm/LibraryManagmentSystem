import java.util.Vector;

public class Library {
    Vector<Book> books = new Vector<>();
    Vector<Member> members = new Vector<>();
    Vector<Employee>  employees = new Vector<>();

    public Vector<Book> searchBooksByISBN(String ISBN) {
        Vector<Book> result = new Vector<>();

        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(ISBN)) {
                result.add(book);
            }
        }
        displayBooks(result);
        return result;

    }

    
    private void displayBooks(Vector<Book> books) {
        System.out.println("Found Books:");
        for (Book book : books) {
            System.out.println("Book name "+book.getTitle()+"\n"+ "Author name: " + book.getAuthor());
        }
    }


    

}
