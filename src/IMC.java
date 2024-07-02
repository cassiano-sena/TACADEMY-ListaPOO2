//4 - O IMC – Índice de Massa Corporal é um critério da Organização Mundial de
//Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A
//fórmula é IMC = peso / (altura):
//Elabore uma classe que leia o peso e a altura de um adulto e mostre sua
//condição de acordo com a tabela abaixo.
//IMC em adultos Condição
//-Abaixo de 18,5 Abaixo do peso
//-Entre 18,5 e 25 Peso normal
//-Entre 25 e 30 Acima do peso
//-Acima de 30 obeso
public class IMC {
    private double weight; // in kilograms
    private double height; // in meters

    public IMC(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String determineCondition() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}