import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

import javax.swing.*;

public class SignupOne extends JFrame implements ActionListener {
    JTextField nameInput, fNameInput, emailInput, adressInput, cityInput, stateInput, pinInput;
    JButton next;
    Random random;
    long randomNo;
    JRadioButton male, female, married, single, other;
    JDateChooser dateChooser;

    SignupOne() {
        setLayout(null);
        // Frame
        setSize(850, 1000);
        setVisible(true);
        setLocation(340, 80);
        setTitle("Create new account");
        getContentPane().setBackground(Color.WHITE);

        // Random Form No:
        random = new Random();
        // System.out.println((Math.abs(random.nextLong())%9000) + 1000);
        randomNo = Math.abs((random.nextLong() % 9000L) + 1000L);
        // System.out.println(randomNo);
        // Form No:
        JLabel formNo = new JLabel("Application Form No: " + randomNo);
        formNo.setFont(new Font("Arial", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        // personalDetails
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Arial", Font.BOLD, 26));
        personalDetails.setBounds(230, 80, 600, 30);
        add(personalDetails);
        // name
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 26));
        name.setBounds(100, 140, 100, 30);
        add(name);
        // Input
        nameInput = new JTextField();
        nameInput.setFont(new Font("Arial", Font.BOLD, 14));
        nameInput.setBounds(330, 140, 600, 30);
        add(nameInput);
        // FathersName
        JLabel fathersName = new JLabel("Father's Name:");
        fathersName.setFont(new Font("Arial", Font.BOLD, 26));
        fathersName.setBounds(100, 190, 200, 30);
        add(fathersName);
        // Input
        fNameInput = new JTextField();
        fNameInput.setFont(new Font("Arial", Font.BOLD, 14));
        fNameInput.setBounds(330, 190, 600, 30);
        add(fNameInput);
        // DOB
        JLabel dOB = new JLabel("Date Of Birth: ");
        dOB.setFont(new Font("Arial", Font.BOLD, 26));
        dOB.setBounds(100, 240, 200, 30);
        add(dOB);
        // dateInput - Calender
        // prequizit - Jar file add, com. - package import
        dateChooser = new JDateChooser();
        dateChooser.setBounds(330, 240, 600, 30);
        add(dateChooser);

        // gender
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial", Font.BOLD, 26));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        // radio button
        male = new JRadioButton("Male");
        male.setBounds(330, 290, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);
        // radio button female
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);
        // Only one RButton should be selected
        ButtonGroup genderBtnGroup = new ButtonGroup();
        genderBtnGroup.add(male);
        genderBtnGroup.add(female);

        // email
        JLabel email = new JLabel("Email Address");
        email.setFont(new Font("Arial", Font.BOLD, 26));
        email.setBounds(100, 340, 200, 30);
        add(email);
        // Input
        emailInput = new JTextField();
        emailInput.setFont(new Font("Arial", Font.BOLD, 14));
        emailInput.setBounds(330, 340, 600, 30);
        add(emailInput);
        // marital status
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Arial", Font.BOLD, 26));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        // radio button
        single = new JRadioButton("Single");
        single.setBounds(330, 390, 80, 30);
        single.setBackground(Color.WHITE);
        add(single);
        // radio button
        married = new JRadioButton("Married");
        married.setBounds(450, 390, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);
        // radio button
        other = new JRadioButton("Other");
        other.setBounds(580, 390, 80, 30);
        other.setBackground(Color.WHITE);
        add(other);
        // Only one RButton should be selected
        ButtonGroup maritalBtnGroup = new ButtonGroup();
        maritalBtnGroup.add(single);
        maritalBtnGroup.add(married);
        maritalBtnGroup.add(other);
        // address
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Arial", Font.BOLD, 26));
        address.setBounds(100, 440, 200, 30);
        add(address);
        // Input
        adressInput = new JTextField();
        adressInput.setFont(new Font("Arial", Font.BOLD, 14));
        adressInput.setBounds(330, 440, 600, 30);
        add(adressInput);
        // City
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Arial", Font.BOLD, 26));
        city.setBounds(100, 490, 200, 30);
        add(city);
        // Input
        cityInput = new JTextField();
        cityInput.setFont(new Font("Arial", Font.BOLD, 14));
        cityInput.setBounds(330, 490, 600, 30);
        add(cityInput);
        // State
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Arial", Font.BOLD, 26));
        state.setBounds(100, 540, 200, 30);
        add(state);
        // Input
        stateInput = new JTextField();
        stateInput.setFont(new Font("Arial", Font.BOLD, 14));
        stateInput.setBounds(330, 540, 600, 30);
        add(stateInput);
        // pin
        JLabel pin = new JLabel("Pin Code: ");
        pin.setFont(new Font("Arial", Font.BOLD, 26));
        pin.setBounds(100, 590, 200, 30);
        add(pin);
        // Input
        pinInput = new JTextField();
        pinInput.setFont(new Font("Arial", Font.BOLD, 14));
        pinInput.setBounds(330, 590, 600, 30);
        add(pinInput);
        // Button
        next = new JButton("Next");
        next.setFont(new Font("Arial", Font.BOLD, 20));
        next.setBounds(824, 660, 100, 34);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + randomNo; // Long convert String "" +
        String name = nameInput.getText(); // getText() vs setText()
        String fName = fNameInput.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (single.isSelected()) {
            marital = "Single";
        } else {
            marital = "Other";
        }
        String email = emailInput.getText();
        String adress = adressInput.getText();
        String city = cityInput.getText();
        String state = stateInput.getText();
        String pin = pinInput.getText();

        try {
            // Validation
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name required");
            } else if (fName.equals("")) {
                JOptionPane.showMessageDialog(null, "Father Name required");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null, "DOB required");
            } else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null, "Gender required");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email required");
            } else if (adress.equals("")) {
                JOptionPane.showMessageDialog(null, "Address required");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "City required");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "State required");
            } else if (marital.equals("")) {
                JOptionPane.showMessageDialog(null, "Marital Status required");
            } else if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "Pin required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formno + "','" + name + "','" + fName + "','" + dob
                        + "','" + gender + "','" + email + "','" + marital + "','" + adress + "','" + city + "','"
                        + state + "','" + pin + "')";
                c.s.executeUpdate(query);
            }

        } catch (

        Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
