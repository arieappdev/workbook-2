package com.pluralsight;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Mail Center! To begin shipping your package please provide your full name.");
        String fullName = input.nextLine();

        System.out.println("What is your billing street?");
        String billingStreet = input.nextLine();

        System.out.println("What is your billing city?");
        String billingCity = input.nextLine();

        System.out.println("What is your billing state?");
        String billingState = input.nextLine();

        System.out.println("What is your billing zip code?");
        int billingZipcode = input.nextInt();

        System.out.println("Perfect! To confirm the address we have on file for you is:");
        System.out.println(" ");
        StringBuilder billingAddress = new StringBuilder();

        billingAddress.append("Billing Address:").append("\n").append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ").append(billingState).append(" ").append(billingZipcode);

        System.out.println(fullName);
        System.out.println(billingAddress);

        billingAddress.append("\n\n");

        System.out.println(" ");

        System.out.println("Let's confirm your shipping address! What is your shipping street? ");
        String shippingStreet = input.nextLine();

        System.out.println("What is the your shipping city?");
        String shippingCity = input.nextLine();

        System.out.println("What is the your shipping state?");
        String shippingState = input.nextLine();

        System.out.println("Finally, what is the your shipping zip code?");
        int shippingZipcode = input.nextInt();

        System.out.println("Awesome! To confirm, the your shipping address is: ");
        StringBuilder shippingAddress = new StringBuilder();

        shippingAddress.append("Shipping Address:").append("\n").append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZipcode);

        System.out.println(fullName);
        System.out.println(shippingAddress);

        shippingAddress.append("\n\n");

    }
}
