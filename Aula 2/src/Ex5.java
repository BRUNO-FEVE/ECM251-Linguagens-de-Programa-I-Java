import javax.swing.*;

public class Ex5 {
    /* 5. Crie e teste, em Java, um algoritmo que leia, no formato real, o peso e a altura do usuário, e depois apresente a tela:
        ➢ “Seus dados digitados foram: <peso>kg e <altura>m”. */
    public static void main(String[] args) throws Exception {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o sua altura: "));

        System.out.println("Seus dados digitados foram: " + peso + " kg " + altura + " m");
    }
}
