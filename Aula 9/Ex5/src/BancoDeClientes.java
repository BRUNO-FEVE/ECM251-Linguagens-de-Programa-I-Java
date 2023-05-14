import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addClienteTyping(String nome, String fone, int id) {
        clientes.add(new Cliente(nome, fone, id));
    }

    public void removeCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente);
            }
        }
    }

    public void alterarCliente(String nome, String fone, int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(nome);
                cliente.setFone(fone);
            }
        }
    }

    public String getCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente.getDados();
            }
        }
        return "";
    }

    public String getAllClientes() {
        String mensagem = "";
        for (Cliente cliente : clientes) {
            mensagem += "\n\n" + cliente.getDados();
        }
        return mensagem;
    }
}
