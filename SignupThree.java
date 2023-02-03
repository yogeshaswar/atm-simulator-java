import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton savingAcc, fdAcc, currentAcc, rdAcc;
    JCheckBox cATM, cInternetBanking, cMobileBanking, cAlerts, cCheckBook, cEStatement, cDeclare;
    JButton submit, cancel;
    String cardNumber, pinNumber;
    String formno;

    // constructor:
    public SignupThree(String formno) {
        this.formno = formno;
        setLayout(null);
        // Frame
        setSize(1000, 900);
        setVisible(true);
        setLocation(300, 0);
        setTitle("Create new account Page:3");
        getContentPane().setBackground(Color.WHITE);

        // accountDetails
        JLabel personalDetails = new JLabel("Page 3: Account Details");
        personalDetails.setFont(new Font("Arial", Font.BOLD, 26));
        personalDetails.setBounds(100, 80, 600, 30);
        add(personalDetails);

        // Input
        // savingAcc
        savingAcc = new JRadioButton("Svaing Account");
        savingAcc.setBounds(100, 120, 200, 30);
        savingAcc.setBackground(Color.WHITE);
        add(savingAcc);
        // currentAcc
        currentAcc = new JRadioButton("Current Account");
        currentAcc.setBounds(400, 120, 200, 30);
        currentAcc.setBackground(Color.WHITE);
        add(currentAcc);
        // fdAcc
        fdAcc = new JRadioButton("Fixed Deposit Account");
        fdAcc.setBounds(100, 160, 200, 30);
        fdAcc.setBackground(Color.WHITE);
        add(fdAcc);
        // rdAcc
        rdAcc = new JRadioButton("Recurring Deposit Account");
        rdAcc.setBounds(400, 160, 200, 30);
        rdAcc.setBackground(Color.WHITE);
        add(rdAcc);
        // Only one RButton should be selected
        ButtonGroup accBtnGroup = new ButtonGroup();
        accBtnGroup.add(savingAcc);
        accBtnGroup.add(currentAcc);
        accBtnGroup.add(fdAcc);
        accBtnGroup.add(rdAcc);

        // cardNumber
        JLabel cardNumber = new JLabel("Card Number:");
        cardNumber.setFont(new Font("Arial", Font.BOLD, 26));
        cardNumber.setBounds(100, 200, 600, 30);
        add(cardNumber);
        // card-detail
        JLabel cdetails = new JLabel("This is your 16-digit card number");
        cdetails.setFont(new Font("Arial", Font.BOLD, 12));
        cdetails.setBounds(100, 230, 600, 16);
        add(cdetails);
        // dummyNumber
        JLabel cnumber = new JLabel("XXXX-XXXX-XXXX-8594");
        cnumber.setFont(new Font("Arial", Font.BOLD, 26));
        cnumber.setBounds(400, 200, 600, 30);
        add(cnumber);
        // pinNumber
        JLabel pinNumber = new JLabel("Pin:");
        pinNumber.setFont(new Font("Arial", Font.BOLD, 26));
        pinNumber.setBounds(100, 260, 600, 30);
        add(pinNumber);
        // card-detail
        JLabel pdetails = new JLabel("This is your 4-digit card pin");
        pdetails.setFont(new Font("Arial", Font.BOLD, 12));
        pdetails.setBounds(100, 290, 600, 16);
        add(pdetails);
        // dummyPinNumber
        JLabel pnumber = new JLabel("XXX8");
        pnumber.setFont(new Font("Arial", Font.BOLD, 26));
        pnumber.setBounds(400, 260, 600, 30);
        add(pnumber);
        // services-required
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Arial", Font.BOLD, 26));
        services.setBounds(100, 320, 600, 30);
        add(services);

        // CheckBox - ATM
        cATM = new JCheckBox("ATM Card");
        cATM.setBackground(Color.WHITE);
        cATM.setFont(new Font("Arial", Font.BOLD, 20));
        cATM.setBounds(100, 360, 600, 30);
        add(cATM);
        // CheckBox - ATM
        cInternetBanking = new JCheckBox("Internet Banking");
        cInternetBanking.setBackground(Color.WHITE);
        cInternetBanking.setFont(new Font("Arial", Font.BOLD, 20));
        cInternetBanking.setBounds(420, 360, 600, 30);
        add(cInternetBanking);
        // CheckBox - ATM
        cMobileBanking = new JCheckBox("Mobile Banking");
        cMobileBanking.setBackground(Color.WHITE);
        cMobileBanking.setFont(new Font("Arial", Font.BOLD, 20));
        cMobileBanking.setBounds(100, 400, 600, 30);
        add(cMobileBanking);
        // CheckBox - ATM
        cAlerts = new JCheckBox("Email/SMS Alerts");
        cAlerts.setBackground(Color.WHITE);
        cAlerts.setFont(new Font("Arial", Font.BOLD, 20));
        cAlerts.setBounds(420, 400, 600, 30);
        add(cAlerts);
        // CheckBox - ATM
        cCheckBook = new JCheckBox("Check Book");
        cCheckBook.setBackground(Color.WHITE);
        cCheckBook.setFont(new Font("Arial", Font.BOLD, 20));
        cCheckBook.setBounds(100, 440, 600, 30);
        add(cCheckBook);
        // CheckBox - ATM
        cEStatement = new JCheckBox("E-Statement");
        cEStatement.setBackground(Color.WHITE);
        cEStatement.setFont(new Font("Arial", Font.BOLD, 20));
        cEStatement.setBounds(420, 440, 600, 30);
        add(cEStatement);
        // CheckBox - ATM
        cDeclare = new JCheckBox(
                "I hereby declares that the above entered details are correct to the best of my knowledge");
        cDeclare.setBackground(Color.WHITE);
        cDeclare.setFont(new Font("Arial", Font.BOLD, 12));
        cDeclare.setBounds(100, 490, 600, 20);
        add(cDeclare);

        // Button
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.BOLD, 20));
        submit.setBounds(100, 540, 100, 34);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        // Button
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.BOLD, 20));
        cancel.setBounds(240, 540, 100, 34);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        // Random card no - 16 digits:
        // Random random = new Random();
        // cardNumber = "" + Math.abs(random.nextLong() % 90000000L) +
        // 5040936000000000L;
        // String pinnNumber = "" + Math.abs((random.nextInt() % 9000) + 1000);
        // System.out.println(pinnNumber);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (savingAcc.isSelected()) {
                accountType = "Saving";
            } else if (currentAcc.isSelected()) {
                accountType = "Current";
            } else if (fdAcc.isSelected()) {
                accountType = "Fixed Deposite";
            } else if (rdAcc.isSelected()) {
                accountType = "Recurring Deposit";
            }

            // Random card no - 16 digits:
            Random random = new Random();
            cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            pinNumber = "" + Math.abs((random.nextInt() % 9000) + 1000);
            System.out.println(pinNumber);

            // checkbox input
            String services = "";
            if (cATM.isSelected()) {
                services = services + "ATM Card";
            } else if (cInternetBanking.isSelected()) {
                services = services + "Internet Banking";
            } else if (cMobileBanking.isSelected()) {
                services = services + "Mobile Banking";
            } else if (cAlerts.isSelected()) {
                services = services + "Email/Mobile Alerts";
            } else if (cCheckBook.isSelected()) {
                services = services + "Checkbook";
            } else if (cEStatement.isSelected()) {
                services = services + "E-Statement";
            }

            try {
                // validation:
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else if (services.equals("")) {
                    JOptionPane.showMessageDialog(null, "Select Services that you want");
                } else {
                    Conn c = new Conn();
                    String query1 = "insert into signupthree values('" + formno + "','" + accountType + "','" + services
                            + "','" + cardNumber
                            + "','" + pinNumber
                            + "')";
                    c.s.executeUpdate(query1);
                    // Login table
                    String query2 = "insert into login values('" + formno + "','" + cardNumber + "','" + pinNumber
                            + "')";
                    c.s.executeUpdate(query2);

                    // Show user card No and pin:
                    JOptionPane.showMessageDialog(null,
                            "Your Card Number is: " + cardNumber + "\nPIN is: " + pinNumber);

                    new Deposite(pinNumber).setVisible(true);
                    

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
}
