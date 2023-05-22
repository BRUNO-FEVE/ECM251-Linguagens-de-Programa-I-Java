import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener{
    
    private JButton zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eigthButton, nineButton, plusButton, subtractionButton, multiplicationButton, divisionButton, resultButton, cButton;
    private JTextField visor;

    private String firstNumber = "";
    private String numberOfOperation = "";

    public App() {
        super("Calculadora");

        visor = new JTextField("", ALLBITS);

        zeroButton = new JButton("0");
        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eigthButton = new JButton("8");
        nineButton = new JButton("9");

        plusButton = new JButton("+");
        subtractionButton = new JButton("-");
        multiplicationButton = new JButton("*");
        divisionButton = new JButton("/");
        resultButton = new JButton("=");
        cButton = new JButton("C");

        //Style 
        EmptyBorder padding = new EmptyBorder(15, 10, 15, 10);
        visor.setBorder(padding);
        visor.setHorizontalAlignment(SwingConstants.RIGHT);

        //Layout
        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout()); 
        JPanel buttonsPanel = new JPanel(new GridLayout(4,4)); 

        topPanel.add(visor);
        buttonsPanel.add(sevenButton);
        buttonsPanel.add(eigthButton);
        buttonsPanel.add(nineButton);
        buttonsPanel.add(plusButton);
        buttonsPanel.add(fourButton);
        buttonsPanel.add(fiveButton);
        buttonsPanel.add(sixButton);
        buttonsPanel.add(subtractionButton);
        buttonsPanel.add(oneButton);
        buttonsPanel.add(twoButton);
        buttonsPanel.add(threeButton);
        buttonsPanel.add(multiplicationButton);
        buttonsPanel.add(zeroButton);
        buttonsPanel.add(cButton);
        buttonsPanel.add(resultButton);
        buttonsPanel.add(divisionButton);

        caixa.add(topPanel, BorderLayout.NORTH);
        caixa.add(buttonsPanel, BorderLayout.CENTER);

        //Events
        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eigthButton.addActionListener(this);
        nineButton.addActionListener(this);
        plusButton.addActionListener(this);
        subtractionButton.addActionListener(this);
        multiplicationButton.addActionListener(this);
        divisionButton.addActionListener(this);
        resultButton.addActionListener(this);
        cButton.addActionListener(this);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == zeroButton) {
            String text = visor.getText();
            text += "0";
            visor.setText(text);
        } else if (e.getSource() == oneButton) {
            String text = visor.getText();
            text += "1";
            visor.setText(text);
        } else if (e.getSource() == twoButton) {
            String text = visor.getText();
            text += "2";
            visor.setText(text);
        } else if (e.getSource() == threeButton) {
            String text = visor.getText();
            text += "3";
            visor.setText(text);
        } else if (e.getSource() == fourButton) {
            String text = visor.getText();
            text += "4";
            visor.setText(text);
        } else if (e.getSource() == fiveButton) {
            String text = visor.getText();
            text += "5";
            visor.setText(text);
        } else if (e.getSource() == sixButton) {
            String text = visor.getText();
            text += "6";
            visor.setText(text);
        } else if (e.getSource() == sevenButton) {
            String text = visor.getText();
            text += "7";
            visor.setText(text);
        } else if (e.getSource() == eigthButton) {
            String text = visor.getText();
            text += "8";
            visor.setText(text);
        } else if (e.getSource() == nineButton) {
            String text = visor.getText();
            text += "9";
            visor.setText(text);
        } else if (e.getSource() == cButton) {
            visor.setText("");
        } else if(e.getSource() == plusButton) {
            firstNumber += visor.getText();
            visor.setText("");
            numberOfOperation += "0";
        } else if(e.getSource() == subtractionButton) {
            firstNumber += visor.getText();
            visor.setText("");
            numberOfOperation = "1";
        } else if(e.getSource() == multiplicationButton) {
            firstNumber += visor.getText();
            visor.setText("");
            numberOfOperation = "2";
        } else if(e.getSource() == divisionButton) {
            firstNumber += visor.getText();
            visor.setText("");
            numberOfOperation = "3";
        } else if(e.getSource() == resultButton) {
            String secondNumber = visor.getText();

            switch (Integer.parseInt(numberOfOperation)) {
                case 0:
                    int resultPlus = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                    visor.setText("" + resultPlus);
                    firstNumber = "";
                    break;

                case 1:
                    int resultSub = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                    visor.setText("" + resultSub);
                    firstNumber = "";
                    break;
            
                case 2:
                    int resultMult = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                    visor.setText("" + resultMult);
                    firstNumber = "";
                    break;

                case 3:
                    int resultDiv = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
                    visor.setText("" + resultDiv);
                    firstNumber = "";
                    break;

                default:
                    break;
            }
        }
    }
}
