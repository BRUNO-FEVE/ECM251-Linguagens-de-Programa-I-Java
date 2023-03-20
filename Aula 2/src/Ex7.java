import javax.swing.*;

public class Ex7 { 
    /* 7. Crie e teste, em Java, um algoritmo que leia 4 (quatro) números inteiros, um a um, de um único dígito cada, representando, na ordem, milhar, centena, dezena e unidade. Use o tipo caractere, para garantir que não seja digitado mais de um número por vez. Após a concatenação desses números, armazene-os em uma variável do tipo String. Apresente em tela o valor final dessa String. */
    public static void main(String[] args) throws Exception {
        char milhar = JOptionPane.showInputDialog("Digite o milhar: ").charAt(0);
        char centena = JOptionPane.showInputDialog("Digite a centena: ").charAt(0);
        char dezena = JOptionPane.showInputDialog("Digite a dezena: ").charAt(0);
        char unidade = JOptionPane.showInputDialog("Digite a unidade: ").charAt(0);

        System.out.println(milhar + " mil " + centena + dezena + unidade);
    }
}
