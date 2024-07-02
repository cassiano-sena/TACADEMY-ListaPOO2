//1 - Escreva uma classe que permite o usuário saber sua idade através do ano de
//nascimento
import java.time.LocalDate;
public class AgeCalculator {
    public static int calculateAge(int yearOfBirth) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - yearOfBirth;
    }
}
