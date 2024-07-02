//3 - Faça uma classe cadastro que leia e valide as seguintes informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';
import java.util.Scanner;

public class Register {
    private String name;
    private int age;
    private double salary;
    private char gender;
    private char maritalStatus;

    public void readInput() {
        Scanner scanner = new Scanner(System.in);

        // Read and validate Name
        System.out.print("Enter your name (must be longer than 3 characters): ");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.length() > 3) {
                this.name = input;
                break;
            } else {
                System.out.print("Invalid input! Name must be longer than 3 characters. Enter again: ");
            }
        }

        // Read and validate Age
        System.out.print("Enter your age (between 0 and 150): ");
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine().trim());
                if (input >= 0 && input <= 150) {
                    this.age = input;
                    break;
                } else {
                    System.out.print("Invalid input! Age must be between 0 and 150. Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a valid number for age: ");
            }
        }

        // Read and validate Salary
        System.out.print("Enter your salary (must be greater than zero): ");
        while (true) {
            try {
                double input = Double.parseDouble(scanner.nextLine().trim());
                if (input > 0) {
                    this.salary = input;
                    break;
                } else {
                    System.out.print("Invalid input! Salary must be greater than zero. Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a valid number for salary: ");
            }
        }

        // Read and validate Gender
        System.out.print("Enter your gender ('f' for female, 'm' for male): ");
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("f") || input.equals("m")) {
                this.gender = input.charAt(0);
                break;
            } else {
                System.out.print("Invalid input! Gender must be 'f' or 'm'. Enter again: ");
            }
        }

        // Read and validate Marital Status
        System.out.print("Enter your marital status ('s' for single, 'c' for married, 'v' for widowed, 'd' for divorced): ");
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("s") || input.equals("c") || input.equals("v") || input.equals("d")) {
                this.maritalStatus = input.charAt(0);
                break;
            } else {
                System.out.print("Invalid input! Marital status must be 's', 'c', 'v', or 'd'. Enter again: ");
            }
        }

        scanner.close();
    }

    public void displayInfo() {
        System.out.println("\nRegistration Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Marital Status: " + maritalStatus);
    }
}