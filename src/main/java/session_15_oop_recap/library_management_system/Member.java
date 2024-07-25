package session_15_oop_recap.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private static int idCounter = 1;
    private int id;
    private String name;
    private String address;
    private String contactInfo;
    private List<Book> borrowedBooks;

    public Member(int id, String name, String address, String contactInfo) {
        this.id = idCounter++;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }
}
