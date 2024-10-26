import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton backButton;
    private JButton newUserButton;

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 500);
        setLocation(200, 200);
        setLayout(null);

        JPanel loginPanel = new JPanel();
        setLayout(new BorderLayout());

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(800, 150, 300, 20);

        usernameField = new JTextField(20);
        usernameField.setBounds(750, 60, 300, 45);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(800, 220, 300, 20);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(750, 130, 300, 45);

        loginButton = new JButton("Login");
        loginButton.setBounds(800, 300, 120, 25);
        loginButton.setBackground(new Color(30, 144, 254));
        loginButton.setForeground(Color.BLACK);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (isValidCredentials(username, password)) {
                    navigateToNextPage();
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Invalid credentials!");
                }
            }
        });

        backButton = new JButton("Back");
        backButton.setBounds(915, 270, 120, 25);
        backButton.setBackground(new Color(30, 144, 254));
        backButton.setForeground(Color.BLACK);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        newUserButton = new JButton("New User");
        newUserButton.setBounds(800, 330, 120, 25);
        newUserButton.setBackground(new Color(30, 144, 254));
        newUserButton.setForeground(Color.BLACK);

        newUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegistrationWindow();
            }
        });

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(backButton);
        loginPanel.add(newUserButton);

        JPanel picturePanel = new JPanel();
        final ImageIcon imageIcon = new ImageIcon("icons/login.jpeg"); 
        JLabel pictureLabel = new JLabel(imageIcon);
        picturePanel.add(pictureLabel);

        add(loginPanel, BorderLayout.CENTER); 
        add(picturePanel, BorderLayout.WEST); 

        setLocationRelativeTo(null);
    }

    private boolean isValidCredentials(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }

    private void navigateToNextPage() {
        
        rules rulesFrame = new rules();
        rulesFrame.setVisible(true);
        dispose(); 
    }

    private void openRegistrationWindow() {
        RegistrationFrame registrationFrame = new RegistrationFrame();
        registrationFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
            }
        });
    }
}
