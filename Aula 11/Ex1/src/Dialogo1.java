import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dialogo1 extends JDialog implements ActionListener{

    JLabel label;
    JTextField field;
    JButton button;

    int valor;

    public Dialogo1(JFrame f) {
        super(f, true);

        Container caixa = getContentPane();
        caixa.setLayout(new FlowLayout());

        label = new JLabel("Valor: ");
        field = new JTextField("", 20);
        button = new JButton("Ok");

        caixa.add(label);
        caixa.add(field);
        caixa.add(button);

        button.addActionListener(this);

        setSize(400, 400);
        setLocation(300, 300);
        setTitle("Valores");
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            valor = Integer.parseInt(field.getText());
            dispose();
        }
    }
    
    public int getValor() {
        return valor;
    }
    
}
