import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transcactions extends JFrame implements ActionListener {
    JButton deposite, widraw, fastCash, miniStatement, pinChange, balanceInquiry, exit;
    String pinNumber;

    // constructor:
    public Transcactions(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);
        // Frame
        setSize(900, 900);
        setVisible(true);
        setLocation(300, 0);
        //setUndecorated(true); // Title bar gayab
        getContentPane().setBackground(Color.WHITE);

        // ImageIcon
        ImageIcon imgBack = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image img = imgBack.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon imgBackground = new ImageIcon(img);
        JLabel imgBackgroungLable = new JLabel(imgBackground);
        imgBackgroungLable.setBounds(0, 0, 900, 900);
        add(imgBackgroungLable);

        JLabel text = new JLabel("Please select your Transcaction");
        text.setBounds(225, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        imgBackgroungLable.add(text); // to add text on background img

        // Deposite Btn
        deposite = new JButton("Deposite");
        deposite.setBounds(170, 415, 140, 30);
        deposite.addActionListener(this);
        imgBackgroungLable.add(deposite);
        // Widraw Btn
        widraw = new JButton("Cash Widrawl");
        widraw.setBounds(380, 415, 140, 30);
        widraw.addActionListener(this);
        imgBackgroungLable.add(widraw);
        // Fastcash Btn
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170, 450, 140, 30);
        fastCash.addActionListener(this);
        imgBackgroungLable.add(fastCash);
        // Mini Statement Btn
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(380, 450, 140, 30);
        miniStatement.addActionListener(this);
        imgBackgroungLable.add(miniStatement);
        // Change PIN Btn
        pinChange = new JButton("Change PIN");
        pinChange.setBounds(170, 485, 140, 30);
        pinChange.addActionListener(this);
        imgBackgroungLable.add(pinChange);
        // Balance Inquiry Btn
        balanceInquiry = new JButton("Balance Inquiry");
        balanceInquiry.setBounds(380, 485, 140, 30);
        balanceInquiry.addActionListener(this);
        imgBackgroungLable.add(balanceInquiry);
        // Exit Btn
        exit = new JButton("Exit");
        exit.setBounds(380, 520, 140, 30);
        exit.addActionListener(this);
        imgBackgroungLable.add(exit);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == deposite) {
            // action
        } else if (ae.getSource() == widraw) {
            // action
        } else if (ae.getSource() == fastCash) {
            // action
        } else if (ae.getSource() == miniStatement) {
            // action
        } else if (ae.getSource() == pinChange) {
            // action
        } else if (ae.getSource() == balanceInquiry) {
            // action
        } else if (ae.getSource() == exit) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Transcactions("");
    }
}
