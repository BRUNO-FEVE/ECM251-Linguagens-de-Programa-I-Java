import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener{

    private JButton buttonShow, buttonDelete, buttonExit;
    private JTextField textField;
    private JLabel etiqueta; 

    public App() {
        super("App");

        buttonShow = new JButton("Mostrar");
        buttonDelete = new JButton("Limpar");
        buttonExit = new JButton("Sair");
        etiqueta = new JLabel("Texto: ");
        textField = new JTextField("", 10);

        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3));

        topPanel.add(etiqueta);
        topPanel.add(textField);
        bottomPanel.add(buttonShow);
        bottomPanel.add(buttonDelete);
        bottomPanel.add(buttonExit);

        caixa.add(topPanel, BorderLayout.CENTER);
        caixa.add(bottomPanel, BorderLayout.SOUTH);

        buttonShow.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonExit.addActionListener(this);

        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonShow) {
            JOptionPane.showMessageDialog(new Frame(), textField.getText());
        } else if (e.getSource() == buttonDelete) {
            textField.setText("");
        } else if(e.getSource() == buttonExit) {
            dispose();
        }
    }
    
}
