package session_5_advanced_flow_control.practice.challenge;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int choice;

                while (true) {
                    System.out.println("Menu:");
                    System.out.println("1. Print \"Hello World\"");
                    System.out.println("2. Print the user's name");
                    System.out.println("3. Exit");
                    System.out.print("Enter your choice: ");

                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Hello World");
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.print("Enter your name: ");
                            String name = scanner.nextLine();
                            System.out.println("Your name is: " + name);
                            break;
                        case 3:
                            System.out.println("Exiting the program. Goodbye!");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                            break;
                    }

                }
            }
        }