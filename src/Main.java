import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library l = new Library();
        int o = -1;

        while (o != 100) {
            System.out.println("Choose an option:");
            System.out.println("0: see all books");

            System.out.println("1: add book");
            System.out.println("2: delete book");
            System.out.println("3: search book by title");

            System.out.println("4: add member");
            System.out.println("5: delete member");
            System.out.println("6: rent book to member");

            System.out.println("7: add employee");
            System.out.println("8: delete employee");

            System.out.println("100: exit");

            Scanner sc = new Scanner(System.in); // olusturucu fonksiyon
            o = sc.nextInt();
            sc.nextLine();

            if (o == 0) {
                for (int i = 0; i < l.books.size(); i++) {
                    System.out.println(l.books.get(i).getTitle()+","+l.books.get(i).getAuthor());
                }
            } else if (o == 1) {
                System.out.println("Enter isbn number:");
                String isbn = sc.nextLine();
                if (Book.is_isbn_correct(isbn) == true) {
                    System.out.println("Enter book title:");
                    String title = sc.nextLine();

                    System.out.println("Enter author name:");
                    String author = sc.nextLine();
                    Book book = new Book(isbn,title,author);

                    l.books.add(book);
                } else {
                    System.out.println("Isbn must consist of 5 digits");
                }
            } else if (o == 2) {
                System.out.println("Enter isbn number: ");
                String isbn = sc.nextLine();
                for (int i = 0; i <l.books.size(); i++) {
                    if (l.books.get(i).getIsbn().equals(isbn)) {
                        l.books.remove(i);
                    }
                }
            } else if (o == 3) {
                
            } else if (0 == 4) {
                
            }

        }



    }
}