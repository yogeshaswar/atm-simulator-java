import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// import java.sql.Date; //date
// import java.util.*;
import java.util.Date; //date
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.mysql.cj.Query;

public class Widrawal extends JFrame implements ActionListener {
    String pinNumber;
    JTextField widrawAmtInput;
    JButton widraw, back;

    public Widrawal(String pinNumber) {

        this.pinNumber = pinNumber;
        setLayout(null);
        // Frame
        setSize(900, 900);
        setVisible(true);
        setLocation(300, 0);
        // setUndecorated(true); // Title bar gayab
        getContentPane().setBackground(Color.WHITE);

        // ImageIcon
        ImageIcon imgBack = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image img = imgBack.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon imgBackground = new ImageIcon(img);
        JLabel imgBackgroungLable = new JLabel(imgBackground);
        imgBackgroungLable.setBounds(0, 0, 900, 900);
        add(imgBackgroungLable);

        JLabel text = new JLabel("Enter the amount you want to windraw");
        text.setBounds(190, 300, 340, 20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        imgBackgroungLable.add(text); // to add text on background img

        // Input
        widrawAmtInput = new JTextField();
        widrawAmtInput.setBounds(170, 350, 340, 25);
        widrawAmtInput.setFont(new Font("Arial", Font.BOLD, 18));
        imgBackgroungLable.add(widrawAmtInput);

        // Deposite Btn
        widraw = new JButton("Widraw");
        widraw.setBounds(260, 380, 150, 30);
        widraw.addActionListener(this);
        imgBackgroungLable.add(widraw);
        // Deposite Btn
        back = new JButton("Back");
        back.setBounds(260, 425, 150, 30);
        back.addActionListener(this);
        imgBackgroungLable.add(back);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == widraw) {
            String amount = widrawAmtInput.getText();
            String type = "widraw";
            Date date = new Date();
            if (amount.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to widraw");
            }
            try {
                Conn c = new Conn();
                String query = "insert into bankdata values('" + pinNumber + "', '" + date + "', '" + type + "', '"
                        + amount
                        + "')";

                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Amount of '" + amount + "'' widraw Successfully.");
                setVisible(false);
                new Transcactions(pinNumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transcactions(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Widrawal("");
    }
}
