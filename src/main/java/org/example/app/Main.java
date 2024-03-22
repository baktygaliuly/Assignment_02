package org.example.app;

import org.example.app.pojo.Book;
import org.example.app.pojo.CD;
import org.example.app.pojo.Magazine;
import org.example.app.repo.ItemRepository;
import org.example.app.service.BookService;
import org.example.app.service.CDService;
import org.example.app.service.MagazineService;

import java.util.Scanner;

public class Main {
    static ItemRepository itemRepository = new ItemRepository();
    static BookService bookService = new BookService(itemRepository);
    static CDService cdService = new CDService(itemRepository);
    static MagazineService magazineService = new MagazineService(itemRepository);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadItems();
        System.out.println("|-------------------------------------------|");
        System.out.println("              Welcome to Library              ");
        System.out.println("|-------------------------------------------|");
        String response = "continue()";
        while (!response.equals("exit()")) {
            commands();
            System.out.println();
            response = scanner.next();
            switch (response) {
                case "add()": addItem();
                case "items()": displayItems();
            }
        }

    }

    public static void addItem() {
        System.out.println("\nType of item(Book, CD, Magazine): ");
        String type = scanner.next();
        switch (type) {
            case "Book": addBook(); break;
            case "CD": addCD(); break;
            case "Magazine": addMagazine(); break;
            default:
                System.out.println("Invalid type. Try again!");
                addItem();
        }
        displayItems();
    }

    public static void addMagazine() {
        System.out.println("Enter [issn, id, title, author, year, genre]: ");
        int issn = scanner.nextInt();
        String id = scanner.next();
        scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        String genre = scanner.nextLine();
        magazineService.createItem(new Magazine(issn, id, title, author, year, genre));
    }

    public static void addCD() {
        System.out.println("Enter [SID, id, title, author, year, genre]: ");
        int SID = scanner.nextInt();
        String id = scanner.next();
        scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        String genre = scanner.nextLine();
        cdService.createItem(new CD(SID, id, title, author, year, genre));
    }
    public static void addBook() {
        System.out.println("Enter [isbn, id, title, author, year, genre]: ");
        int isbn = scanner.nextInt();
        String id = scanner.next();
        scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine();
        String genre = scanner.nextLine();
        bookService.createItem(new Book(isbn, id, title, author, year, genre));
    }

    public static void displayItems() {
        System.out.println("\nItems: ");
        itemRepository.displayInfo();
    }

    public static void commands() {
        System.out.println("\nPrint: ");
//        System.out.println("'continue()' -> to do some stuff");
        System.out.println("'add()' -> to add some items");
        System.out.println("'items()' -> to see all catalog");
        System.out.println("'exit()' -> to eliminate the process");
    }

    public static void loadItems() {
//        Book[] books = {
//                new Book(978517, "545", "Elon Musk", "Walter Isaacson", 2023, "Biography"),
//                new Book(9780132, "841", "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2008, "Software Engineering")
//        };

//        CD[] cds = {
//                new CD(724819, "678", "Pride and Prejudice", "Jane Austen", 1813, "Romance"),
//                new CD(426841, "217", "The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction")
//        };

//        Magazine[] magazines = {
//                new Magazine(78901234, "007", "To Kill a Mockingbird", "Harper Lee", 1960, "Fiction")
//        };
        bookService.createItem(new Book(978517, "545", "Elon Musk", "Walter Isaacson", 2023, "Biography"));
        bookService.createItem(new Book(9780132, "841", "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2008, "Software Engineering"));
        cdService.createItem(new CD(724819, "678", "Pride and Prejudice", "Jane Austen", 1813, "Romance"));
        cdService.createItem(new CD(426841, "217", "The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction"));
        magazineService.createItem(new Magazine(78901234, "007", "To Kill a Mockingbird", "Harper Lee", 1960, "Fiction"));
    }
}













