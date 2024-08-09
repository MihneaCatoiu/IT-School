package session_20_recap.practice.test.IT;

import session_13_abstraction.practice.data_information_system.CsvExportable;
import session_13_abstraction.practice.data_information_system.Report;

import java.util.List;

public class CsvReport extends Report implements CsvExportable {

    public CsvReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void exportToCsv() {
        //code goes here
    }

    @Override
    public void showPreview() {

    }
}