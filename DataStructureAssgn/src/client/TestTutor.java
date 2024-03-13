/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.*;
import control.*;
import java.util.Scanner;
import java.util.Arrays;
import entity.*;
import dao.*;
import utility.*;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestTutor {

    private ListInterface<Tutor> tutorList = new ArrayList<>();

    private TutorDAO tutorDAO = new TutorDAO();
    private TutorMaintenanceUI tutorUI = new TutorMaintenanceUI();
    Tutor tutor = new Tutor();
    Scanner scanner = new Scanner(System.in);
    Scanner myObj = new Scanner(System.in);
    Scanner myObj2 = new Scanner(System.in);
    Scanner myObj3 = new Scanner(System.in);
    Scanner myObj4 = new Scanner(System.in);

    public TestTutor() {
        tutorList = tutorDAO.retrieveFromFile();
    }

    public void runTestTutor() {
        int choice = 0;
        do {
            choice = tutorUI.getMenuChoice();
            switch (choice) {
                case 0:
                    MessageUI.displayExitMessage();
                    break;
                case 1:
                    if (tutorList.getNumberOfEntries() != tutor.nextTutor) {
                        tutor.nextTutor = tutorList.getNumberOfEntries() + 1;
                    }
                    addNewTutor();
                    tutorUI.listAllTutors(getAllTutors());
                    break;
                case 2:
                    listAllTutors();                    
                    break;
                case 3:
                    RemoveTutor();
                    break;
                case 4:
                    FilterTutorAge();
                    break;
                case 5:
                    AmendTutorDetails();
                    break;
                case 6:
                    findTutor();
                    break;
                case 7:
                    GenerateReport();
                    break;
                case 10:
                    Insert6Records();
                    break;
                default:
                    MessageUI.displayInvalidChoiceMessage();
            }
        } while (choice != 0);
    }

    public void listAllTutors() {
        if (tutorList.getNumberOfEntries() != tutor.nextTutor) {
            tutor.nextTutor = tutorList.getNumberOfEntries() + 1;
        }
        tutorUI.listAllTutors(getAllTutors());
    }

    public void GenerateReport() {
        int num = 1;
        String[] report2 = new String[(tutorList.getNumberOfEntries() + 1)];
        int[] ageReport = new int[(tutorList.getNumberOfEntries() + 1)];
        for (int i = 1; i <= tutorList.getNumberOfEntries(); i++) {
            tutor = tutorList.getEntry(i);
            report2[i] = tutor.getSubject();

        }
        for (int i = 0; i < report2.length; i++) {
        }
        for (int i = 0; i < report2.length - 1; i++) {
            report2[i] = report2[i + 1];
        }

        //defining an array of type String
        int size = report2.length;
//logic for sorting
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < report2.length; j++) {
//compares each elements of the array to all the remaining elements
                if (report2[i].compareTo(report2[j]) > 0) {
//swapping array elements
                    String temp = report2[i];
                    report2[i] = report2[j];
                    report2[j] = temp;
                }
            }
        }
        for (int i = 0; i < report2.length - 1; i++) {
            if (report2[i].equals(report2[i + 1])) {
                num = num;
            } else {
                num = num + 1;
            }
        }
        System.out.println("The number of type of subjects currently teaching is :" + num);

        for (int i = 1; i <= tutorList.getNumberOfEntries(); i++) {
            tutor = tutorList.getEntry(i);
            ageReport[i] = tutor.getAge();
        }

        for (int i = 0; i < ageReport.length - 1; i++) {
            ageReport[i] = ageReport[i + 1];
        }

        for (int i = 0; i < ageReport.length - 1; i++) {
            int temp = ageReport[i];
            int oldest = 0;
            int youngest = 0;
            if (ageReport[i] > ageReport[i + 1]) {
                temp = ageReport[i];
                ageReport[i] = ageReport[i + 1];
                ageReport[i + 1] = temp;
            }
        }
        System.out.println("The youngest tutor is " + ageReport[0] + " years old");
        System.out.println("The oldest tutor is " + ageReport[ageReport.length - 1] + " years old");
    }

    public void findTutor() {
        while (true) {
            System.out.println("Enter the index of the tutor you want to find:");
            if (myObj.hasNextInt()) {
                int index = myObj.nextInt();
                if (index >= 0 && index < tutorList.getNumberOfEntries()) {
                    tutor = tutorList.getEntry(index);
                    System.out.println("Tutor found:");
                    System.out.println(tutor);
                    break; // Exit the loop if a valid index is provided
                } else {
                    System.out.println("Invalid index. Please enter a valid index.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer index.");
                myObj.next(); // Consume the invalid input
            }
        }

    }

    public void AmendTutorDetails() {
        Scanner myObj = new Scanner(System.in);

        // Validate and get a valid index
        int index;
        do {
            System.out.println("Enter the index of the tutor you want to amend:");
            while (!myObj.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer index:");
                myObj.next(); // Consume the invalid input
            }
            index = myObj.nextInt();
        } while (index < 0 || index >= tutorList.getNumberOfEntries());

        myObj.nextLine(); // Consume the newline character

        Tutor tutor = tutorList.getEntry(index);


        String name;
        do {
            System.out.println("Enter the new name:");
            name = myObj.nextLine().trim();
        } while (name.isEmpty());

        int age;
        do {
            System.out.println("Enter the new age:");
            while (!myObj.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer age:");
                myObj.next(); 
            }
            age = myObj.nextInt();
        } while (age < 0);

        myObj.nextLine(); 

        System.out.println("Enter the new teaching subject:");
        String subject = myObj.nextLine();

        tutor.setName(name);
        tutor.setAge(age);
        tutor.setSubject(subject);

        tutorDAO.saveToFile(tutorList);

        System.out.println("Tutor information updated and saved successfully.");
    }

    public void FilterTutorAge() {
        Scanner myObj = new Scanner(System.in);

        int numberOfTutors = tutorList.getNumberOfEntries();
        int[] array = new int[numberOfTutors + 1];
        Tutor[] number = new Tutor[numberOfTutors + 1];

        System.out.println("Enter the age to see tutors older or equal than the age:");

        int age;
        while (true) {
            if (myObj.hasNextInt()) {
                age = myObj.nextInt();
                break; 
            } else {
                System.out.println("Invalid input. Please enter a valid integer age:");
                myObj.next();
            }
        }

        myObj.nextLine(); 

        for (int i = 1; i <= numberOfTutors; i++) {
            tutor = tutorList.getEntry(i);
            array[i] = tutor.getAge();
            if (tutor.getAge() >= age) {
                number[i] = tutor;
            } else {//false case

            }
        }

        for (int i = 1; i <= numberOfTutors; i++) {
            if (number[i] != null) {
                System.out.println(number[i] + "\n");
            }
        }
    }

    public void RemoveTutor() {
        Scanner myObj = new Scanner(System.in);

        tutorUI.listAllTutors(getAllTutors());
        System.out.println("Enter the index to remove tutor, starting from 1:");
        int index = -1;

        while (index < 1 || index > tutorList.getNumberOfEntries()) {
            if (myObj.hasNextInt()) {
                index = myObj.nextInt();
                if (index < 1 || index > tutorList.getNumberOfEntries()) {
                    System.out.println("Invalid index. Please enter a valid index.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer index.");
                myObj.next(); 
            }
        }

        myObj.nextLine(); 
        System.out.println(tutorList.getEntry(index));
        Tutor tutor = tutorList.getEntry(index);
        System.out.println("Tutor's Age: " + tutor.getAge());
        tutorList.remove(index);
        tutorUI.listAllTutors(getAllTutors());
        boolean tutorRemoved = !tutorList.contains(tutor);
        System.out.println("Tutor removed: " + tutorRemoved);

        tutorDAO.saveToFile(tutorList);
    }

    public void Insert6Records() {
        if (tutorList.getNumberOfEntries() != tutor.nextTutor) {
            tutor.nextTutor = tutorList.getNumberOfEntries() + 1;
        }
        tutorList.add(new Tutor("Jack", 35, "geography"));
        tutorList.add(new Tutor("James", 20, "biology"));
        tutorList.add(new Tutor("Ben", 61, "physics"));
        tutorList.add(new Tutor("Cho Kang", 36, "bahasa malay"));
        tutorList.add(new Tutor("Chun Cang", 41, "math"));
        tutorList.add(new Tutor("Gin", 42, "chemistry"));
        tutorDAO.saveToFile(tutorList);
    }

    public void addNewTutor() {
        Tutor newTutor = tutorUI.inputTutorDetails();
        tutorList.add(newTutor);
        tutorDAO.saveToFile(tutorList);
    }

    public String getAllTutors() {
        String outputStr = "";
        for (int i = 1; i <= tutorList.getNumberOfEntries(); i++) {
            outputStr += tutorList.getEntry(i) + "\n";
        }
        return outputStr;
    }

    public void displayTutors() {
        tutorUI.listAllTutors(getAllTutors());
    }

    public static void main(String[] args) {
        TestTutor testTutor = new TestTutor();
        testTutor.runTestTutor();

    }

}
