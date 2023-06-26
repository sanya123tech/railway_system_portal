package com.example.railway_system_portal;
import java.util.Scanner;


public class ticketcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available options for starting and destination addresses
        String[] addresses = {
                "Panjagutta",
                "Ameerpet",
                "Madhura Nagar",
                "Yousufguda",
                "Jubilee hills",
                "Pedamma Temple",
                "Madhapur",
                "Durgam Cheruvu",
                "Hitec City",
                "Raidurg"
        };

        System.out.println("Available addresses:");

        for (int i = 0; i < addresses.length; i++) {
            System.out.println((i + 1) + ". " + addresses[i]);
        }

        // Get user input for starting and destination addresses
        System.out.print("Enter the number corresponding to the starting address: ");
        int startingIndex = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the number corresponding to the destination address: ");
        int destinationIndex = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Validate the user input
        if (startingIndex < 1 || startingIndex > addresses.length ||
                destinationIndex < 1 || destinationIndex > addresses.length) {
            System.out.println("Invalid address selection!");
            return;
        }

        // Calculate the ticket price based on the distance (address indices difference)
        int distance = Math.abs(destinationIndex - startingIndex);
        int ticketPrice = distance * 10; // Assuming 10 units per distance unit

        // Display the ticket price
        System.out.println("Ticket Price: RS." + ticketPrice);

        // Close the scanner
        scanner.close();
}
    }
