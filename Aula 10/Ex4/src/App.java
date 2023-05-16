import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    
    private JLabel pessoaFisica, empregado, desempregado, mensalista, comissionado, horista, tarefeiro;

    public App() {
        super("Empresa");

        pessoaFisica = new JLabel("Pessoa Fisica", SwingConstants.CENTER);
        desempregado = new JLabel("Desempregado", SwingConstants.CENTER);
        empregado = new JLabel("Empregado", SwingConstants.CENTER);
        mensalista = new JLabel("Mensalista", SwingConstants.CENTER);
        comissionado = new JLabel("Comissionado", SwingConstants.CENTER);
        horista = new JLabel("Horista", SwingConstants.CENTER);
        tarefeiro = new JLabel("Tarefeiro", SwingConstants.CENTER);

        Container caixa = getContentPane();
        caixa.setLayout(new GridLayout(3, 1));

        JPanel topPanel = new JPanel(new FlowLayout()); 
        JPanel middlePanel = new JPanel(new GridLayout(1,2)); 
        JPanel thirdLayerPanel = new JPanel(new GridLayout(1, 4));
        JPanel bottomPanel = new JPanel(new BorderLayout()); 

        topPanel.add(pessoaFisica);
        middlePanel.add(desempregado);
        middlePanel.add(empregado);
        
        thirdLayerPanel.add(mensalista);
        thirdLayerPanel.add(comissionado);
        thirdLayerPanel.add(horista);
        thirdLayerPanel.add(tarefeiro);

        bottomPanel.add(thirdLayerPanel, BorderLayout.EAST);

        caixa.add(topPanel);
        caixa.add(middlePanel);
        caixa.add(bottomPanel);

        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
