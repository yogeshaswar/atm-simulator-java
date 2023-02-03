import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// import java.sql.*; //date
// import java.util.*;
import java.util.Date; //date

import com.mysql.cj.Query;

public class PinChange extends JFrame implements ActionListener {
    String pinNumber;
    JPasswordField newPinInput, repinInput;
    JButton changePin, back;

    public PinChange(String pinNumber) {
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
        //heading
        JLabel text = new JLabel("Change Your Pin");
        text.setBounds(280, 300, 340, 20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        imgBackgroungLable.add(text); // to add text on background img
        //new pin text
        JLabel pintext = new JLabel("New Pin");
        pintext.setBounds(170, 340, 150, 20);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Arial", Font.BOLD, 16));
        imgBackgroungLable.add(pintext); // to add text on background img
        //new pin input
        newPinInput = new JPasswordField();
        newPinInput.setBounds(320, 336, 150, 30);
        newPinInput.setFont(new Font("Arial", Font.BOLD, 18));
        newPinInput.add(newPinInput);
        // re-enter pin text
        JLabel rePinText = new JLabel("Re-enter New Pin");
        rePinText.setBounds(170, 380, 300, 20);
        rePinText.setForeground(Color.WHITE);
        rePinText.setFont(new Font("Arial", Font.BOLD, 16));
        imgBackgroungLable.add(rePinText); // to add text on background img
        // re-enter pin input
        repinInput = new JPasswordField();
        repinInput.setBounds(320, 380, 150, 30);
        repinInput.setFont(new Font("Arial", Font.BOLD, 18));
        imgBackgroungLable.add(repinInput);

        changePin = new JButton("Change Pin");
        changePin.setBounds(380, 415, 140, 30);
        changePin.addActionListener(this);
        imgBackgroungLable.add(changePin);

        back = new JButton("Back");
        back.setBounds(380, 450, 140, 30);
        back.addActionListener(this);
        imgBackgroungLable.add(back);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == changePin) {
            try {
            String newPin = newPinInput.getText();
            String rePin = repinInput.getText();

            if (!newPin.equals(rePin)) {
                JOptionPane.showMessageDialog(null, "Entered Pin Doesn't match");
                return;
            } 

            if (newPin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter PIN");
                return;
            }

            if (rePin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                return;
            }

            Conn c = new Conn();
            //bankdata
            String query1 = "update bankdata set pinNumber = '"+rePin+"' where pinNumber = '"+pinNumber+"' ";
            //login
            String query2 = "update login set pinNumber = '"+rePin+"' where pinNumber = '"+pinNumber+"' ";
            //signup3
            String query3 = "update signupform3 set pinNumber = '"+rePin+"' where pinNumber = '"+pinNumber+"' ";

            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);

            JOptionPane.showMessageDialog(null, "Pin changed Successfully");

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transcactions(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PinChange("");
    }

}
