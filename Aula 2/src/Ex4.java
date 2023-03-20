import javax.swing.*;

public class Ex4 {
    /* 4. Crie e teste, em Java, um algoritmo que leia 3 (três) números, separadamente, que representem uma data, respectivamente, dia, mês e ano, e depois apresente a tela:
        ➢ “A data digitada foi <DD>/<MM>/<AAAA>” */
    public static void main(String[] args) throws Exception { 
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
