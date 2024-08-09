package session_20_recap.practice.test.IT;

import java.util.List;

public abstract class Report {

    //common report properties
    protected String title;
    protected List<String> data;

    Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    //common report behavior
    public abstract void showPreview();

    public void displayMetadata() {
        System.out.println("Title: " + title);
    }
}