package Lab007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gonda_Lab Assignment 7");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        
        while (continueProgram) {
            System.out.println("========== CIMB Banking System ==========");
            System.out.println("1. Create and View Savings Account");
            System.out.println("2. Create and View GSave Account");
            System.out.println("3. Create and View UpSave Account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                    case 1:
                        AccountDisplay.displaySavingsAccount();
                        break;
                    case 2:
                        AccountDisplay.displayGSaveAccount();
                        break;
                    case 3:
                        AccountDisplay.displayUpSaveAccount();
                        break;
                    case 4:
                        System.out.println("Thank you for using CIMB Banking System. Goodbye!");
                        continueProgram = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }
                
                if (continueProgram && choice >= 1 && choice <= 3) {
                    System.out.print("\nDo you want to try again? (yes/no): ");
                    String response = scanner.nextLine().toLowerCase().trim();
                    if (!response.equals("yes") && !response.equals("y")) {
                        System.out.println("Thank you for using CIMB Banking System. Goodbye!");
                        continueProgram = false;
                    }
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}