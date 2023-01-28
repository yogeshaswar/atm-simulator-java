import javax.swing.*;

public class Login extends JFrame {
    Login() {
        // setSize defines dimensions
        setSize(800, 400);
        // setVisible makes visible
        setVisible(true);
        //Screen Location
        setLocation(350, 200);
        //setTitle - screen Title
        setTitle("ATM");
    }

    public static void main(String[] args) {
        new Login();
    }
}
