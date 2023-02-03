import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pinNumber;
    JButton back;
    int balance;

    public BalanceEnquiry(String pinNumber) {
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

        // Exit Btn
        back = new JButton("Back");
        back.setBounds(380, 520, 140, 30);
        back.addActionListener(this);
        imgBackgroungLable.add(back);

        Conn c = new Conn();
        balance = 0;
        try {
            ResultSet resultSet = c.s
                    .executeQuery("Select * from bankdata where pinNumber =  '" + pinNumber + "' ");
            // Balance Kitana hai?
            
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("deposite")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        JLabel text = new JLabel("Your current balance is: Rs " + balance);
        text.setBounds(225, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        imgBackgroungLable.add(text); // to add text on background img
    }

    public void actionPerformed(ActionEvent ae) {
        // because of only one button plus no data save
        setVisible(false);
        new Transcactions(pinNumber).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
