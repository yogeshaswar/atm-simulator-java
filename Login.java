import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    // Globally define buttons:
    JButton login, signUp, clear;
    JTextField cardInput;
    JPasswordField pinInput;

    Login() {
        setLayout(null);
        // setSize defines dimensions
        setSize(800, 500);
        // setVisible makes visible
        setVisible(true);
        // Screen Location
        setLocation(350, 200);
        // setTitle - screen Title
        setTitle("ATM");
        // ImageIcon - image
        ImageIcon bankLogo1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg"));
        Image i1 = bankLogo1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bankLogo2 = new ImageIcon(i1);
        // image+lable = frame
        JLabel logoLable = new JLabel(bankLogo2);

        logoLable.setBounds(70, 10, 100, 100);
        // frame = add()
        add(logoLable);
        // Background color
        getContentPane().setBackground(Color.WHITE);

        // Heading
        JLabel heading = new JLabel("Welcome to ATM");
        heading.setBounds(200, 40, 400, 40);
        heading.setFont(new Font("Osward", Font.BOLD, 38));
        add(heading);
        // Card
        JLabel card = new JLabel("Card No");
        card.setBounds(120, 150, 150, 30);
        card.setFont(new Font("Raleway", Font.BOLD, 28));
        add(card);
        // Input card
        cardInput = new JTextField();
        cardInput.setBounds(300, 150, 230, 30);
        cardInput.setFont(new Font("Arial", Font.BOLD, 18));
        add(cardInput);

        // Pin
        JLabel pin = new JLabel("Pin");
        pin.setBounds(120, 220, 150, 30);
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        add(pin);
        // Input pin
        pinInput = new JPasswordField();
        pinInput.setBounds(300, 220, 230, 30);
        pinInput.setFont(new Font("Arial", Font.BOLD, 18));
        add(pinInput);

        // Button

        login = new JButton("SIGN IN");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBounds(300, 300, 100, 30);
        add(login);

        // Action Listener:
        login.addActionListener(this);

        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBounds(430, 300, 100, 30);
        add(clear);

        // Action Listener:
        clear.addActionListener(this);

        signUp = new JButton("SIGN UP");
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.setBounds(360, 350, 100, 30);
        add(signUp);

        // Action Listener:
        signUp.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        // what action should be performed after button click is defined here
        if (ae.getSource() == clear) {
            cardInput.setText("");
            pinInput.setText("");
        } else if (ae.getSource() == login) {
            // code
        } else if (ae.getSource() == signUp) {
            // code
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
