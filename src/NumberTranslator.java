//13 - Escreva um número por extenso aceitando números de até 9 dígitos, usando
//métodos para as traduções e vetores de Strings que guardam cada tradução (ex.:
//unidades = { “zero”, “um”, “dois”, ..., “nove” }).
public class NumberTranslator {
    private static final String[] units = {
            "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"
    };

    private static final String[] teens = {
            "", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    private static final String[] tens = {
            "", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };

    private static final String[] hundreds = {
            "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
    };

    private static final String[] thousands = {
            "", "mil", "milhão", "bilhão", "trilhão", "quatrilhão", "quintilhão", "sextilhão", "septilhão", "octilhão"
    };

    public static String translate(int number) {
        if (number == 0) {
            return units[0];
        }

        String result = "";
        int numDigits = String.valueOf(number).length();
        int[] digits = new int[numDigits];
        int index = 0;

        while (number > 0) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        for (int i = numDigits - 1; i >= 0; i--) {
            int digit = digits[i];

            if (i == 1 && digit == 1 && digits[i - 1] > 0) {
                result += teens[digits[i - 1]] + " ";
                i--;
            } else {
                switch (i) {
                    case 0:
                        result += units[digit];
                        break;
                    case 1:
                        result += tens[digit] + " ";
                        break;
                    case 2:
                        result += hundreds[digit] + " ";
                        break;
                    default:
                        result += units[digit] + " " + thousands[i] + " ";
                        break;
                }
            }
        }
        return result.trim();
    }
}
