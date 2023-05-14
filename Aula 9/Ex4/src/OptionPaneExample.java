import javax.swing.*;  

public class OptionPaneExample {  
    JFrame f;  
    JFrame d;
    OptionPaneExample(){  
        f=new JFrame();   
        Deposito deposito = new Deposito();
        String optionNumber;

        do {
            optionNumber = JOptionPane.showInputDialog(f,"Digite o numero do comando desejado:\n1 - Adicione uma caixa\n2 - Remova um caixa\n3 - Procure a caixa\n4 - Altere a caixa\n5 - Lista de mais pesadas que 10\n6 - Encerre o Programa"); 
           
            switch (Integer.parseInt(optionNumber)) {
                case 1:
                    String corredorInput = JOptionPane.showInputDialog(f,"Qual o corredor da caixa");
                    String posicaoInput = JOptionPane.showInputDialog(f,"Qual a posição da caixa");
                    String pesoInput = JOptionPane.showInputDialog(f,"Qual a peso da caixa");
                    String donoAdicionarInput = JOptionPane.showInputDialog(f,"Qual o dono da caixa");
                    deposito.addCaixas(new Caixa(corredorInput, Integer.parseInt(posicaoInput), Double.parseDouble(pesoInput), donoAdicionarInput));
                    System.out.println(deposito.getCaixas()+"\n");
                    break;

                case 2:
                    String donoRemoverInput = JOptionPane.showInputDialog(f,"Qual o dono da caixa que deseja remover:");
                    deposito.removeCaixa(deposito.getCaixa(donoRemoverInput));
                    break;
                
                case 3:
                    String getConfirm;
                    do {
                        String donoGetInput = JOptionPane.showInputDialog(f,"Qual o dono da caixa que deseja procurar:");
                        getConfirm = JOptionPane.showInputDialog(f,"DADOS:\n\n" + deposito.getCaixa(donoGetInput).getAll() + "\n\nEssa é a caixa que voçê procura? S/N");
                    } while (!getConfirm.equalsIgnoreCase("S"));

                case 4: 
                    String donoNovoAdicionarInput = JOptionPane.showInputDialog(f,"Qual o dono da caixa que será alterada?");
                    String corredorNovoInput = JOptionPane.showInputDialog(f,"Qual o novo corredor da caixa");
                    String posicaoNovoInput = JOptionPane.showInputDialog(f,"Qual a nova posição da caixa");
                    String pesoNovoInput = JOptionPane.showInputDialog(f,"Qual o novo peso da caixa");
                    deposito.changeInfo(corredorNovoInput, Integer.parseInt(posicaoNovoInput), Double.parseDouble(pesoNovoInput), donoNovoAdicionarInput);
                    break;

                case 5:
                    JOptionPane.showMessageDialog(f,deposito.weigthAbove(10.0));
                    break;
            }  
        } while (Integer.parseInt(optionNumber) != 6);
    }  
public static void main(String[] args) {  
    new OptionPaneExample();
}  
}  