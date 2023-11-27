import java.awt.*;
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
                if (Book.is_isbn_correct(isbn)) {
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
                System.out.println("Enter isbn number: ");
                String isbn = sc.nextLine();
                l.searchBooksByISBN(isbn);
            } else if (o == 4) {
                System.out.println("Enter Tc:");
                String tc = sc.nextLine();
                if (Member.is_tc_correct(tc)) {
                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter surname:");
                    String surname = sc.nextLine();

                    Member m = new Member(tc,name,surname);
                    l.members.add(m);
                    System.out.println(l.members.get(0).getName());
                } else {
                    System.out.println("Tc number must consist of 11 digits and char");
                }
            } else if (o == 5) {
                System.out.println("Enter tc:");
                String tc = sc.nextLine();
                for (int i =1; i < l.members.size(); i++) {
                    if (l.members.get(i).getUserTc().equals(tc)) {
                        l.members.remove(i);
                        System.out.println(l.members.get(i).getUserTc() + " Tc numaları kullanıcı silindi");
                    } else {
                        System.out.println("Öyle bir kullancı bulunamadı");
                    }
                }
            } else if (o == 6) {
                
            } else if (o == 7) {
                System.out.println("Enter tc: ");
                String tc = sc.nextLine();
                if (Member.is_tc_correct(tc)) {
                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Entar surname:");
                    String surname = sc.nextLine();

                    System.out.println("Enter department:");
                    String d = sc.nextLine();

                    Employee e = new Employee(tc,name,surname,d);

                }
            } else if (o == 8) {
                System.out.println("Enter employee tc: ");
                String tc = sc.nextLine();
                for (int i = 0; i < l.employees.size(); i++){
                    if (l.employees.get(i).getUserTc().equals(tc)) {
                        l.employees.remove(i);
                        System.out.println(l.employees.get(i).getName() + l.employees.get(i).getSurname() + " çalışan silinde");
                    }

                }
            } else {
                System.out.println("Hatalı tıklama");
                break;
            }

        }



    }
}