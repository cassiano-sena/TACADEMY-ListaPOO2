//2 - Escreva uma classe que peça para o usuário um número de 0-7 (indeterminadas
//vezes), onde informe o dia da semana correspondente:
//(1-Domingo, 2-Segunda,3-Terça . . . 0 - Sai do loop)
import java.util.Scanner;
public class WeekdayFinder {
    public static String findDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 0:
                return "Invalid input";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid input";
        }
    }
    public static void weekdayFinderExample() {
        Scanner scanner = new Scanner(System.in);
        int dayNumber;
        do {
            System.out.print("Enter a number (0-7) to find the corresponding day of the week (0 to exit): ");
            dayNumber = scanner.nextInt();
            if (dayNumber >= 0 && dayNumber <= 7) {
                String dayOfWeek = findDayOfWeek(dayNumber);
                System.out.println("Day of the week: " + dayOfWeek);
            } else if (dayNumber != 0) {
                System.out.println("Invalid input. Please enter a number between 0 and 7.");
            }
        } while (dayNumber != 0);
        System.out.println("Exiting the program.");
        scanner.close();
    }
}