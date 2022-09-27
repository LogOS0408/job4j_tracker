package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookFirst = new Book("\"Jungle Book\"", 300);
        Book bookSecond = new Book("\"Hive\"", 700);
        Book bookThird = new Book("\"Chapaev and the void\"", 450);
        Book bookCleanCode = new Book("\"Clean code\"", 3);
        Book[] books = new Book[4];
        books[0] = bookFirst;
        books[1] = bookSecond;
        books[2] = bookThird;
        books[3] = bookCleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("The book "
                    + book.getNameOfBook()
                    + " contains "
                    + book.getNumberOfPages()
                    + " pages.");
        }
        System.out.println("Swapping the books " + "\"Jungle Book\"" + " and \"Clean code\"");
        books[3] = bookFirst;
        books[0] = bookCleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("The book "
                    + book.getNameOfBook()
                    + " contains "
                    + book.getNumberOfPages()
                    + " pages.");
        }
        System.out.println("Book search \"Clean code\".");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getNameOfBook().equals("\"Clean code\"")) {
                System.out.println("The book " + book.getNameOfBook() + " is founded.");
            }
        }
    }
}