package session_9_arrays.challenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            studentList.add("Student " + (i + 1));
        }
        System.out.println("Students: ");
        for (String student : studentList) {
            System.out.println(student);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a student name: ");
        String studentName = scanner.nextLine();

        boolean remove = studentList.remove(studentName);
        if (remove) {
            System.out.println("Student " + studentName + " removed! ");
            System.out.println("Updated list: " + studentList);

        } else {
            System.out.println("Student " + studentName + " not here! ");
        }
    }
}