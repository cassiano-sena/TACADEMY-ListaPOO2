//6 - Leia do usuário o tempo em segundos e escreva em horas, minutos e segundos.
//Utilize cinco métodos, para a leitura e escrita de dados e para obtenção de horas,
//minutos e segundos a partir do tempo em segundos;
import java.util.Scanner;
public class TimeFinder {
    private int totalSeconds;

    public void readTimeFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        totalSeconds = scanner.nextInt();
    }
    public void displayTime() {
        int hours = getHours();
        int minutes = getMinutes();
        int seconds = getSeconds();

        System.out.printf("Time in HH:MM:SS format: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
    private int getHours() {
        return totalSeconds / 3600;
    }

    private int getMinutes() {
        return (totalSeconds % 3600) / 60;
    }

    private int getSeconds() {
        return totalSeconds % 60;
    }
}