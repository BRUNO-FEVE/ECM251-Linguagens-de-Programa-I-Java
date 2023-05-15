import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mostrador extends JFrame implements ActionListener{
    
    private JLabel hour, minutes;
    private JButton tictacButton, hourButton, minutesButton;

    public Mostrador(String hr, String min) {
        super("Relógio");

        hour = new JLabel(hr + " : ");
        minutes = new JLabel(min);
        tictacButton = new JButton("Tic Tac");
        hourButton = new JButton("Hora");
        minutesButton = new JButton("Minuto");

        hour.setFont(new Font("", Font.PLAIN, 120));
        minutes.setFont(new Font("", Font.PLAIN, 120));

        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new FlowLayout());
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3));

        centerPanel.add(hour);
        centerPanel.add(minutes);
        bottomPanel.add(hourButton);
        bottomPanel.add(tictacButton);
        bottomPanel.add(minutesButton);

        caixa.add(centerPanel, BorderLayout.CENTER);
        caixa.add(bottomPanel, BorderLayout.SOUTH);

        tictacButton.addActionListener(this);
        minutesButton.addActionListener(this);
        hourButton.addActionListener(this);

        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tictacButton) {
            int valor = Integer.parseInt(minutes.getText());
            valor += 1;
            if (valor < 10) {
                minutes.setText("0"+ valor);
            } else {
                minutes.setText(""+ valor);
            }
        } else if (e.getSource() == minutesButton) {
            if(Integer.parseInt(minutes.getText()) > 59) {

                int minForbiden = Integer.parseInt(minutes.getText()) - 60;
                if(minForbiden < 10) {
                    minutes.setText("0" + minForbiden);
                } else {
                    minutes.setText("" + minForbiden);
                }

                int valorHour = Integer.parseInt(hour.getText().substring(0,2));
                valorHour += 1;
                if (valorHour < 10) {
                    hour.setText("0" + valorHour + " : ");
                } else {
                    hour.setText(valorHour + " : ");
                }
            }
        } else if (e.getSource() == hourButton) {
            int valorHour = Integer.parseInt(hour.getText().substring(0,2)); 
            if(valorHour > 60) {
                hour.setText("00 : ");
            }
        }
    }
}
