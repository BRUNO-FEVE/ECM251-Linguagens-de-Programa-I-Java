import javax.swing.*;

public class Ex2 { 
    /* 2. Crie e teste, em Java, um algoritmo que leia 3 (três) palavras, uma a uma, separadamente, e as apresente e tela, na ordem contrária em que foram digitadas, numa única linha, separadas por espaços. */
    public static void main(String[] args) throws Exception {
        String primeira = JOptionPane.showInputDialog("Digite a primeira palavra:");
        String segunda = JOptionPane.showInputDialog("Digite a segunda palavra:");
        String terceira = JOptionPane.showInputDialog("Digite a terceira palavra:");

        System.out.println(terceira + " " + segunda + " " + primeira);
    }
}
