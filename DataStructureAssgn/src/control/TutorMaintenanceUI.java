/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import entity.*;

/**
 *
 * @author Tang Chun Xuan
 */
public class TutorMaintenanceUI {

    Scanner scanner = new Scanner(System.in);

    public int getMenuChoice() {
        int choice;
        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add new tutor");
            System.out.println("2. List all tutor");
            System.out.println("3. Remove a tutor");
            System.out.println("4. Filter tutor based on age");
            System.out.println("5. Amend tutor details");
            System.out.println("6. Find a tutor");
            System.out.println("7. Generate Report");
            System.out.println("10. Directly add 6 random records");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                break; // Valid choice, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return choice;
    }

    public void listAllTutors(String outputStr) {
        System.out.println("\nList of Tutor:\n" + outputStr);
    }

    public void printTutorDetails(Tutor tutor) {
        System.out.println("Tutor Details");
        System.out.println("Tutor code:" + tutor.getName());
        System.out.println("Tutor age: " + tutor.getAge());
        System.out.println("Tutor subject: " + tutor.getSubject());
    }

    public String inputTutorName() {
        System.out.print("Enter tutor name: ");
        String name;

        while (true) {
            name = scanner.nextLine();
            if (containsDigit(name)) {
                System.out.println("Invalid input. The name cannot contain digits.");
            } else {
                break; // Valid name, exit the loop
            }
        }

        return name;
    }

    public int inputTutorAge() {
        int age;
        while (true) {
            System.out.print("Enter tutor age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                break; // Valid age, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid integer age.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return age;
    }

    public String inputSubject() {
        scanner.nextLine(); // Consume any remaining newline character

        System.out.print("Enter teaching subject: ");
        String subject;

        while (true) {
            subject = scanner.nextLine();
            if (containsDigit(subject)) {
                System.out.println("Invalid input. The subject cannot contain digits.");
            } else {
                break; // Valid subject, exit the loop
            }
        }

        return subject;
    }

    private boolean containsDigit(String input) {
        // Use a regular expression to check for digits in the input
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public Tutor inputTutorDetails() {
        String tutorName = inputTutorName();
        int tutorAge = inputTutorAge();
        String tutorSubject = inputSubject();
        System.out.println("name:" + tutorName + " age:" + tutorAge + " subject:" + tutorSubject);
        System.out.println();
        return new Tutor(tutorName, tutorAge, tutorSubject);
    }
}
