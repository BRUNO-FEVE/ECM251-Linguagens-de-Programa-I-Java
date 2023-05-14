import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CadastroApp {
    public static void main(String[] args) throws Exception {
        JFrame f=new JFrame();   
        BancoDeClientes banco = new BancoDeClientes();
        String optionNumber;
        do {
            optionNumber = JOptionPane.showInputDialog(f,"Digite o numero do comando desejado:\n1 - Adicione um cliente\n2 - Remova um cliente \n3 - Ver um cliente\n4 - Ver todos os clientes\n5 - Encerre o Programa"); 

            switch (Integer.parseInt(optionNumber)) {
                case 1:
                    String nomeInput = JOptionPane.showInputDialog(f,"Digite a nome do cliente");
                    String foneInput = JOptionPane.showInputDialog(f,"Digite o fone do cliente");
                    String idInput = JOptionPane.showInputDialog(f,"Digite o id do cliente");
                    banco.addClienteTyping(nomeInput, foneInput, Integer.parseInt(idInput));
                    break;
                
                case 2:
                    String idRemoverInput = JOptionPane.showInputDialog(f,"Digite a nome do cliente que deseja remover");
                    banco.removeCliente(Integer.parseInt(idRemoverInput));
                    break;

                case 3:
                    String idViewInput = JOptionPane.showInputDialog(f,"Digite a nome do cliente que deseja visualizar");
                    JOptionPane.showMessageDialog(f, banco.getCliente(Integer.parseInt(idViewInput)));
                    break;

                case 4:
                    JOptionPane.showMessageDialog(f, banco.getAllClientes());
                    break;
                
                default:
                    break;
            }
        } while (Integer.parseInt(optionNumber) != 5);
    }
}
