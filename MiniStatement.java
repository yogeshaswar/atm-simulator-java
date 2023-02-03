import javax.swing.*;

public class MiniStatement extends JFrame {

    String pinNumber;

    public MiniStatement(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
