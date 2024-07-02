//8 - Crie uma classe para representar um jogador de futebol, com os atributos nome,
//posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos
//necessários para sets e gets e também um método para imprimir todos os dados do
//jogador. Crie um método para calcular a idade do jogador e outro método para mostrar
//quanto tempo falta para o jogador se aposentar. Para isso, considere que os jogadores
//da posição de defesa se aposentam em média aos 40 anos, os jogadores de
//meio-campo aos 38 e os atacantes aos 35.
import java.time.LocalDate;
import java.time.Period;
public class FootballPlayer {
    private String name;
    private String position;
    private LocalDate dateOfBirth;
    private String nationality;
    private double height;
    private double weight;

    public FootballPlayer(String name, String position, LocalDate dateOfBirth, String nationality, double height, double weight) {
        this.name = name;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int calculateAge() {
        LocalDate now = LocalDate.now();
        return Period.between(this.dateOfBirth, now).getYears();
    }
    public int yearsUntilRetirement() {
        int retirementAge;
        if (this.position.equalsIgnoreCase("defender")) {
            retirementAge = 40;
        } else if (this.position.equalsIgnoreCase("midfielder")) {
            retirementAge = 38;
        } else if (this.position.equalsIgnoreCase("forward") || this.position.equalsIgnoreCase("attacker")) {
            retirementAge = 35;
        } else {
            retirementAge = 40;
        }
        return retirementAge - calculateAge();
    }
    public void printPlayerInfo() {
        System.out.println("Player Information:");
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Nationality: " + nationality);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Age: " + calculateAge() + " years");
        System.out.println("Years until retirement: " + yearsUntilRetirement() + " years");
    }
}