import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
//import java.sql.Date.*; //date
import java.util.Date; //date
//import java.util.Date.*; //date

import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener {
    JButton w100Button, w500Button, w1000Button, w2000Button, w5000Button, w10000Button, exit;
    String pinNumber;

    // constructor:
    public FastCash(String pinNumber) {
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

        JLabel text = new JLabel("Please select your fast cash amount");
        text.setBounds(225, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        imgBackgroungLable.add(text); // to add text on background img

        // Deposite Btn
        w100Button = new JButton("Rs 100");
        w100Button.setBounds(170, 415, 140, 30);
        w100Button.addActionListener(this);
        imgBackgroungLable.add(w100Button);
        // Widraw Btn
        w500Button = new JButton("Rs 500");
        w500Button.setBounds(380, 415, 140, 30);
        w500Button.addActionListener(this);
        imgBackgroungLable.add(w500Button);
        // Fastcash Btn
        w1000Button = new JButton("Rs 1000");
        w1000Button.setBounds(170, 450, 140, 30);
        w1000Button.addActionListener(this);
        imgBackgroungLable.add(w1000Button);
        // Mini Statement Btn
        w2000Button = new JButton("Rs 2000");
        w2000Button.setBounds(380, 450, 140, 30);
        w2000Button.addActionListener(this);
        imgBackgroungLable.add(w2000Button);
        // Change PIN Btn
        w5000Button = new JButton("Rs 5000");
        w5000Button.setBounds(170, 485, 140, 30);
        w5000Button.addActionListener(this);
        imgBackgroungLable.add(w5000Button);
        // Balance Inquiry Btn
        w10000Button = new JButton("Rs 10000");
        w10000Button.setBounds(380, 485, 140, 30);
        w10000Button.addActionListener(this);
        imgBackgroungLable.add(w10000Button);
        // Exit Btn
        exit = new JButton("Back");
        exit.setBounds(380, 520, 140, 30);
        exit.addActionListener(this);
        imgBackgroungLable.add(exit);

    }

    public void actionPerformed(ActionEvent ae) {
        String amount = "";
        String type = "widraw";
        Date date = new Date();

        if (ae.getSource() == exit) {
            setVisible(false);
            new Transcactions(pinNumber).setVisible(true);
        } else {
            amount = ((JButton) ae.getSource()).getText().substring(3); // Rs 100 => 100
            Conn c = new Conn();
            try {
                ResultSet resultSet = c.s
                        .executeQuery("Select * from bankdata where pinNumber =  '" + pinNumber + "' ");
                // Balance Kitana hai?
                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("deposite")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                // Balace > widraw : windraw ; error:
                if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                String query = "insert into bankdata values('" + pinNumber + "', '" + date + "', '" + type + "', '"
                        + amount + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs" + amount + "widraw successfully.");
                setVisible(false);
                new Transcactions(pinNumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
