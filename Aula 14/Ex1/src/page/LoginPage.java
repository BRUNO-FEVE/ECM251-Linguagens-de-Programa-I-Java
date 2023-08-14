package page;
import java.awt.*;
import javax.swing.*;

public class LoginPage extends JFrame {
    private JLabel loginLabel, passwordLabel;
    private JTextField loginField;
    private JPasswordField passwordField;

    public LoginPage () {
        super("Login Page");

        loginLabel = new JLabel("Login: ");
        passwordLabel = new JLabel("Senha: ");
        loginField = new JTextField("", 20);
        passwordField = new JPasswordField("Tese", 20);

        Container caixa = getContentPane();
        caixa.setLayout(new FlowLayout());

        JPanel loginLine = new JPanel(new FlowLayout());
        JPanel passwordLine = new JPanel(new FlowLayout());

        loginLine.add(loginLabel);
        loginLine.add(loginField);

        passwordLine.add(passwordLabel);
        passwordLine.add(passwordField);

        caixa.add(loginLine);
        caixa.add(passwordLine);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
