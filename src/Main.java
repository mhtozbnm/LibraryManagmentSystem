import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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


        }



    }
}