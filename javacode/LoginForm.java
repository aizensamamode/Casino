package javacode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {

    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin;

    public LoginForm() {
        setTitle("Login");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3,2,10,10));

        panel.add(new JLabel("Username:"));
        txtUser = new JTextField();
        panel.add(txtUser);

        panel.add(new JLabel("Password:"));
        txtPass = new JPasswordField();
        panel.add(txtPass);

        btnLogin = new JButton("Login");
        panel.add(btnLogin);

        btnLogin.addActionListener(e -> login());

        add(panel);
        setVisible(true);
    }

    private void login() {
        String username = txtUser.getText().trim();
        String password = new String(txtPass.getPassword()).trim();

        if(UserDAO.login(username, password)) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
            dispose();
            new Dashboard();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Credentials");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm());
    }
}