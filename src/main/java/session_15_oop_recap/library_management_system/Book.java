package session_15_oop_recap.library_management_system;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int numberOfCopies;

    public Book(String title, String author, String publisher, String isbn, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.numberOfCopies = numberOfCopies;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    public void addCopies(int number) {
        numberOfCopies += number;
    }
    public void removeCopies(int number) {
        numberOfCopies -= number;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + isbn);
        System.out.println("Number of copies: " + numberOfCopies);
    }
    public boolean isAvailable() {
        return numberOfCopies > 0;
    }
}
