public class Teste {
    public static void main(String[] args) throws Exception {
        Cliente clienteDois = new Cliente("Dois", "???", 1);

        BancoDeClientes banco = new BancoDeClientes();

        System.out.println(banco.getAllClientes());

        banco.addClienteTyping("Um", "???", 0);
        banco.addCliente(clienteDois);
        //banco.removeCliente(0);
        banco.alterarCliente("ajcjdf", "xiwf", 1);

        System.out.println(banco.getAllClientes());


    }
}
