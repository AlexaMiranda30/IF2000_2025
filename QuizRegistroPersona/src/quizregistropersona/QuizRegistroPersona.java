package quizregistropersona;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QuizRegistroPersona {

    private static final String FILENAME = "personas.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullName = "";
        while (fullName.trim().isEmpty()) {
            System.out.print("Enter you Fullname: ");
            fullName = scanner.nextLine();
            if (fullName.trim().isEmpty()) {
                System.out.println("Error: The name cannot be empty. Please try again.");
            }
        }

        String id = "";
        while (id.trim().isEmpty()) {
            System.out.print("Enter your dentification: ");
            id = scanner.nextLine();
            if (id.trim().isEmpty()) {
                System.out.println("Error: The ID cannot be empty. Please try again.");
            }
        }

        int age = -1;
        while (age <= 0) {
            System.out.print("Enter your Age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println("Error: The age must be a positive number. Please try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
            }
            scanner.nextLine();
        }

        String email = "";
        while (email.trim().isEmpty() || !email.contains("@")) {
            System.out.print("Enter your Email whit @): ");
            email = scanner.nextLine();
            if (!email.contains("@")) {
                System.out.println("Error: The email must contain the '@' symbol. Please try again.");
            }
        }

        String phone = "";
        while (!phone.matches("\\d{8,}")) {
            System.out.print("Enter your phone number: ");
            phone = scanner.nextLine();
            if (!phone.matches("\\d{8,}")) {
                System.out.println("Error: The phone must contain only digits and be at least 8 characters long. Please try again.");
            }
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String registrationDate = now.format(FORMATTER);

        String registrationLine = String.format("Fullname: %s|Id: %s|Age: %d|Email: %s|Phone: %s|RegistrationDate: %s",
                fullName, id, age, email, phone, registrationDate);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {

            writer.write(registrationLine);
            writer.newLine();

            System.out.println("\nRegistration saved in " + FILENAME);

        } catch (IOException e) {
            System.err.println("An error occurred while writing the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
