package session_5_advanced_flow_control.practice.challenge;

import java.util.Scanner;

public class Challenge2 {

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int month = scanner.nextInt();
        scanner.close();

        switch (month) {
            case JANUARY:
                System.out.println("January");
                break;
            case FEBRUARY:
                System.out.println("February");
                break;
            case MARCH:
                System.out.println("March");
                break;
            case APRIL:
                System.out.println("April");
                break;
            case MAY:
                System.out.println("May");
                break;
            case JUNE:
                System.out.println("June");
                break;
            case JULY:
                System.out.println("July");
                break;
            case AUGUST:
                System.out.println("August");
                break;
            case SEPTEMBER:
                System.out.println("September");
                break;
            case OCTOBER:
                System.out.println("October");
                break;
            case NOVEMBER:
                System.out.println("November");
                break;
            case DECEMBER:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month.");

        }


    }
}
