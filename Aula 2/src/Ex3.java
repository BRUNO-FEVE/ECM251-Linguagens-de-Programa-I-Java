import javax.swing.*;

public class Ex3 {
    /* 3. Crie e teste, em Java, um algoritmo que leia 1 (um) número inteiro, armazene-o em uma variável do tipo inteiro, e depois apresente em tela:
            ➢ “O valor do número digitado é: <número digitado>”. */
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));

        System.out.println("O valor do número digitado é: " + numero);
    }
}
