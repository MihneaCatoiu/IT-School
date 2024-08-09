package session_20_recap.practice.test.IT;

import session_13_abstraction.practice.data_information_system.PdfExportable;
import session_13_abstraction.practice.data_information_system.Report;

import java.util.List;

public class PdfReport extends Report implements PdfExportable {

    public PdfReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void exportToPdf() {
        //code goes here
    }

    @Override
    public void showPreview() {

    }
}