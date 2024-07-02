//9 - Crie uma classe chamada Ingresso, que possui um valor em reais e um método
//imprimirValor(). Crie um atributo IngressoVIP, que possui um valor adicional. Crie
//um método que retorne o valor do ingresso VIP (com o adicional incluído). Crie um
//programa para criar a instância de Ingresso, mostrando a diferença de preços.
public class Ticket {
    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    public void printPrice() {
        System.out.println("Ticket price: R$" + price);
    }

    public double getPrice() {
        return price;
    }
}
class VIPTicket extends Ticket {
    private double additionalPrice;

    public VIPTicket(double price, double additionalPrice) {
        super(price);
        this.additionalPrice = additionalPrice;
    }

    @Override
    public void printPrice() {
        System.out.println("VIP Ticket price: R$" + (getPrice() + additionalPrice));
    }

    public double getVIPPrice() {
        return getPrice() + additionalPrice;
    }
}
