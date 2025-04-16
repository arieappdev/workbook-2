package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String lastName = null;

       // String fullName = ("" + lastName);

        System.out.println("Hello friend! Please provide your first name below.");
        String firstName = scanner.nextLine();
        //put a scanner or some function so the user can answer

        System.out.println("What is your middle name?");
        String middleName = scanner.nextLine();
        //put a scanner or some function so the user can answer

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("Enter a suffix");
        String suffixName = scanner.nextLine();

        System.out.println("Full Name:" + firstName + " " + middleName + " " + lastName + " " + suffixName );

  }
}




