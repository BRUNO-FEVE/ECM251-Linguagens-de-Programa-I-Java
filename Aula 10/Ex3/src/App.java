import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    
    private JLabel empregado, mensalista, comissionado, horista, tarefeiro;

    public App() {
        super("Empresa");

        empregado = new JLabel("Empregado", SwingConstants.CENTER);
        mensalista = new JLabel("Mensalista", SwingConstants.CENTER);
        comissionado = new JLabel("      Comissionado", SwingConstants.CENTER);
        horista = new JLabel("Horista", SwingConstants.CENTER);
        tarefeiro = new JLabel("Tarefeiro", SwingConstants.CENTER);

        Container caixa = getContentPane();
        caixa.setLayout(new GridLayout(3, 1));

        JPanel topPanel = new JPanel(new FlowLayout()); 
        JPanel middlePanel = new JPanel(new GridLayout(1,3)); 
        JPanel bottomPanel = new JPanel(new BorderLayout()); 

        topPanel.add(empregado);
        middlePanel.add(mensalista);
        middlePanel.add(horista);
        middlePanel.add(tarefeiro);
        bottomPanel.add(comissionado, BorderLayout.WEST);

        caixa.add(topPanel);
        caixa.add(middlePanel);
        caixa.add(bottomPanel);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
