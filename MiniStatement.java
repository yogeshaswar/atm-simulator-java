import java.awt.Color;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
import java.awt.*;

public class MiniStatement extends JFrame implements ActionListener {

    String pinNumber;
    JButton back;

    public MiniStatement(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);
        // Frame
        setSize(900, 900);
        setVisible(true);
        setLocation(300, 0);
        // setUndecorated(true); // Title bar gayab
        getContentPane().setBackground(Color.WHITE);

        JLabel cardNumber = new JLabel();
        cardNumber.setBounds(300, 100, 700, 35);
        cardNumber.setForeground(Color.BLACK);
        cardNumber.setFont(new Font("Arial", Font.BOLD, 16));
        add(cardNumber); // to add text on background img
        // balance
        JLabel balance = new JLabel();
        balance.setBounds(300, 140, 700, 35);
        balance.setForeground(Color.BLACK);
        balance.setFont(new Font("Arial", Font.BOLD, 16));
        add(balance); // to add text on background img
        // statement label
        JLabel mini = new JLabel();
        mini.setBounds(300, 180, 700, 100);
        mini.setForeground(Color.BLACK);
        mini.setFont(new Font("Arial", Font.BOLD, 10));
        add(mini); // to add text on background img

        // Exit Btn
        back = new JButton("Back");
        back.setBounds(380, 520, 140, 30);
        back.addActionListener(this);
        add(back);

        // data base: Card number
        try {
            Conn c = new Conn();
            ResultSet resultSet = c.s.executeQuery("Select * from login where pinNumber = '" + pinNumber + "' ");
            while (resultSet.next()) {
                cardNumber.setText(
                        "Card Number: " + resultSet.getString("cardNumber").substring(0, 4) + "-XXXX-XXXX-"
                                + resultSet.getString("cardNumber").substring(12));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //
        try {
            int clearBalance = 0;
            Conn c = new Conn();
            ResultSet resultSet = c.s.executeQuery("Select * from bankdata where pinNumber = '" + pinNumber + "' ");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("deposite")) {
                    clearBalance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    clearBalance -= Integer.parseInt(resultSet.getString("amount"));
                }
                balance.setText("Clear Balance: " + clearBalance);
                mini.setText(mini.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount")
                        + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "<br><br><html>");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transcactions(pinNumber).setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
