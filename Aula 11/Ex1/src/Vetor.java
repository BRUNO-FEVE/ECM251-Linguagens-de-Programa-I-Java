import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Vetor extends JFrame implements ActionListener {

    private JLabel label;
    private JTextField textField;
    private JButton button;

    int valor;

    public Vetor() {
        super("Menu");

        Container caixa = getContentPane();
        caixa.setLayout(new FlowLayout());

        JMenu vetorMenu = new JMenu("Vetor");
        vetorMenu.setMnemonic('F');

        JMenuItem dimensions = new JMenuItem("Dimensiona");
        JMenuItem input = new JMenuItem("Digitar");
        JMenuItem show = new JMenuItem("Apresenta");

        dimensions.setMnemonic('D');
        input.setMnemonic('I');
        show.setMnemonic('S');

        vetorMenu.add(dimensions);
        vetorMenu.add(input);
        vetorMenu.add(show);

        dimensions.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent e) {
                label = new JLabel("Teste");
                caixa.add(label);
            }
        });

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(vetorMenu);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            valor = Integer.parseInt(textField.getText());
            System.out.println("Valor: " + valor);
        }
    }

    public static void main(String[] args) {
        new Vetor();
    }
}
