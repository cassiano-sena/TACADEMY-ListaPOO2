//14 - Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe
//deverá dispor dos seguintes métodos:
//
//comparar: Recebe como parâmetro um outro objeto da Classe data, compare com a
//data corrente e retorne:
//- se as datas forem iguais;
//- 1 se a data corrente for maior que a do parâmetro;
//- 1 se a data do parâmetro for maior que a corrente.
//getDia: retorna o dia da data
//getMes: retorna o mês da data
//getMesExtenso: retorna o mês da data corrente por extenso
//getAno: retorna o ano da data
//isBissexto: verifica e informa se o ano é bissexto
public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public int compare(Data otherDate) {
        if (this.year == otherDate.year && this.month == otherDate.month && this.day == otherDate.day) {
            return 0;
        } else if (this.year > otherDate.year ||
                (this.year == otherDate.year && this.month > otherDate.month) ||
                (this.year == otherDate.year && this.month == otherDate.month && this.day > otherDate.day)) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return day;
    }

    public int getMes() {
        return month;
    }

    public int getAno() {
        return year;
    }

    public String getMesExtenso() {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return meses[month - 1];
    }

    public boolean isBissexto() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth(month, year)) return false;
        return true;
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isBissexto() ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
