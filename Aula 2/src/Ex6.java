import javax.swing.*;

public class Ex6 {
    /* 6. Crie e teste, em Java, um algoritmo que leia 10 (dez) caracteres, um a um, e imprima, de uma só vez, a palavra formada pela união deles. */
    public static void main(String[] args) throws Exception {
        String palavra = "";
        for (int i=0; i<10; i++) {  
            palavra += new String(JOptionPane.showInputDialog("Digite o seu peso: "));
        }
        System.out.println(palavra);
    }
}
