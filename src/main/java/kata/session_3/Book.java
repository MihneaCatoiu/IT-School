package kata.session_3;

import java.time.LocalDate;
import java.util.UUID;

public class Book {

    private UUID id;
    private String title;
    private String author;
    private int pageNumbers;
    private LocalDate publishingDate;
    private int quantity;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
