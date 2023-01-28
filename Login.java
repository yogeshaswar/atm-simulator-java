import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
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
        card.setBounds(120, 150, 150, 40);
        card.setFont(new Font("Raleway", Font.BOLD, 28));
        add(card);
        // Pin
        JLabel pin = new JLabel("Pin");
        pin.setBounds(120, 220, 150, 40);
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        add(pin);

        // Input card
        JTextField cardInput = new JTextField();
        cardInput.setBounds(300, 150, 250, 40);
        // Input pin
        JTextField pinInput = new JTextField();
        pinInput.setBounds(300, 220, 250, 40);
    }

    public static void main(String[] args) {
        new Login();
    }
}
