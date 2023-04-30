public class Testando {
    public static void main(String[] args) {
        Boleto boleto = new Boleto("João", "123.456.789-00", 100.00, "123456789", 10, 10, 2020);
        Cheque cheque = new Cheque("Maria", "987.654.321-00", 200.00, "987654321");
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("José", "123.456.789-00", 300.00, "123456789");

        System.out.println(boleto.getAll());
        System.out.println(cheque.getAll());
        System.out.println(cartaoDeCredito.getAll());
    }
}
