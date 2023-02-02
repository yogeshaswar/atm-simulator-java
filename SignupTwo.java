import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JComboBox;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField panInput, adharInput;
    JComboBox religionInput, categoryInput, incomeInput, educationalInput, qualificationInput, occupationInput;
    JButton next;
    JRadioButton seniorYesInput, seniorNoInput, exiAccYesInput, exiAccNoInput;
    String formno;

    // constructor:
    public SignupTwo(String formno) {
        this.formno = formno;
        //formno = "378435";
        setLayout(null);
        setSize(1000, 1000);
        setVisible(true);
        setLocation(200, 200);
        setTitle("New Account Application Form Page 2");
        getContentPane().setBackground(Color.WHITE);

        // additionalDetails
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 26));
        additionalDetails.setBounds(230, 80, 600, 30);
        add(additionalDetails);
        // religion
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Arial", Font.BOLD, 26));
        religion.setBounds(100, 140, 150, 30);
        add(religion);
        // Input

        String[] religionList = { "---Select Religion---", "Hindu", "Muslim", "Sikh", "Other" };
        religionInput = new JComboBox(religionList);
        religionInput.setBackground(Color.WHITE);
        religionInput.setFont(new Font("Arial", Font.BOLD, 14));
        religionInput.setBounds(330, 140, 600, 30);
        add(religionInput);
        // category
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Arial", Font.BOLD, 26));
        category.setBounds(100, 190, 200, 30);
        add(category);
        // Input
        String[] categoryList = { "---Select Category---", "OBC", "ST", "NT", "OPEN", "GENERAL", "OTHER" };
        categoryInput = new JComboBox(categoryList);
        categoryInput.setBackground(Color.WHITE);
        categoryInput.setFont(new Font("Arial", Font.BOLD, 14));
        categoryInput.setBounds(330, 190, 600, 30);
        add(categoryInput);
        // income
        JLabel income = new JLabel("Income");
        income.setFont(new Font("Arial", Font.BOLD, 26));
        income.setBounds(100, 240, 200, 30);
        add(income);
        // Input
        String[] incomeList = { "---Select Income---", "Null", "< 1,50,000", "< 2,50,000", "< 500,000",
                "up to 10,00,000", "OTHER" };
        incomeInput = new JComboBox(incomeList);
        incomeInput.setBackground(Color.WHITE);
        incomeInput.setFont(new Font("Arial", Font.BOLD, 14));
        incomeInput.setBounds(330, 240, 600, 30);
        add(incomeInput);

        // educational
        JLabel educational = new JLabel("Education");
        educational.setFont(new Font("Arial", Font.BOLD, 26));
        educational.setBounds(100, 290, 400, 30);
        add(educational);

        // Input
        String[] educationList = { "---Select Educational Qualification---", "Non-Graduate", "Graduate",
                "Post Graduate", "Doctrate", "OTHER" };
        educationalInput = new JComboBox(educationList);
        categoryInput.setBackground(Color.WHITE);
        educationalInput.setFont(new Font("Arial", Font.BOLD, 14));
        educationalInput.setBounds(330, 290, 600, 30);
        add(educationalInput);

        // occupational
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Arial", Font.BOLD, 26));
        occupation.setBounds(100, 340, 200, 30);
        // occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        // Input
        String[] occupationList = { "---Select Occupation---", "Salaried", "Self Employeed", "Business", "Student",
                "Retired", "Other" };
        occupationInput = new JComboBox(occupationList);
        occupationInput.setBackground(Color.WHITE);
        occupationInput.setFont(new Font("Arial", Font.BOLD, 14));
        occupationInput.setBounds(330, 340, 600, 30);
        // occupationInput.setBounds(330, 390, 600, 30);
        add(occupationInput);

        // pan
        JLabel pan = new JLabel("PAN No:");
        pan.setFont(new Font("Arial", Font.BOLD, 26));
        pan.setBounds(100, 390, 200, 30);
        // pan.setBounds(100, 440, 200, 30);
        add(pan);
        // Input
        panInput = new JTextField();
        panInput.setFont(new Font("Arial", Font.BOLD, 14));
        panInput.setBounds(330, 390, 600, 30);
        // panInput.setBounds(330, 440, 600, 30);
        add(panInput);
        // adhar
        JLabel adhar = new JLabel("Adhan No:");
        adhar.setFont(new Font("Arial", Font.BOLD, 26));
        adhar.setBounds(100, 440, 200, 30);
        // adhar.setBounds(100, 490, 200, 30);
        add(adhar);
        // Input
        adharInput = new JTextField();
        adharInput.setFont(new Font("Arial", Font.BOLD, 14));
        adharInput.setBounds(330, 440, 600, 30);
        // adharInput.setBounds(330, 490, 600, 30);
        add(adharInput);
        // senior citizen
        JLabel senior = new JLabel("Senior Citizon: ");
        senior.setFont(new Font("Arial", Font.BOLD, 26));
        senior.setBounds(100, 490, 200, 30);
        // senior.setBounds(100, 540, 200, 30);
        add(senior);

        // radio button
        seniorYesInput = new JRadioButton("Yes");
        seniorYesInput.setBounds(330, 490, 80, 30);
        // seniorYesInput.setBounds(330, 540, 80, 30);
        seniorYesInput.setBackground(Color.WHITE);
        add(seniorYesInput);
        // radio button
        seniorNoInput = new JRadioButton("No");
        seniorNoInput.setBounds(450, 490, 80, 30);
        seniorNoInput.setBackground(Color.WHITE);
        add(seniorNoInput);
        // Only one Radio-Button should be selected
        ButtonGroup seniorBtnGroup = new ButtonGroup();
        seniorBtnGroup.add(seniorYesInput);
        seniorBtnGroup.add(seniorNoInput);

        // exixtingAccount
        JLabel exixtingAccount = new JLabel("Existing Account: ");
        exixtingAccount.setFont(new Font("Arial", Font.BOLD, 26));
        exixtingAccount.setBounds(100, 540, 300, 30);
        add(exixtingAccount);
        // Input
        // radio button
        exiAccYesInput = new JRadioButton("Yes");
        exiAccYesInput.setBounds(330, 540, 80, 30);
        exiAccYesInput.setBackground(Color.WHITE);
        add(exiAccYesInput);
        // radio button
        exiAccNoInput = new JRadioButton("No");
        exiAccNoInput.setBounds(450, 540, 80, 30);
        exiAccNoInput.setBackground(Color.WHITE);
        add(exiAccNoInput);
        // Only one Radio-Button should be selected
        ButtonGroup exiAccBtnGroup = new ButtonGroup();
        exiAccBtnGroup.add(exiAccYesInput);
        exiAccBtnGroup.add(exiAccNoInput);
        // Button
        next = new JButton("Next");
        next.setFont(new Font("Arial", Font.BOLD, 20));
        next.setBounds(824, 600, 100, 34);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

    }

    public void actionPerformed(ActionEvent ae) {
        // Data store => variables => String
        String religion = (String) religionInput.getSelectedItem();
        String category = (String) categoryInput.getSelectedItem();
        String income = (String) incomeInput.getSelectedItem();
        String education = (String) educationalInput.getSelectedItem();
        String occupation = (String) occupationInput.getSelectedItem();

        String pan = panInput.getText(); // getText() vs setText()
        String adhar = adharInput.getText();
        String senior = null;
        if (seniorYesInput.isSelected()) {
            senior = "Yes";
        } else {
            senior = "No";
        }

        String existingAcc = null;
        if (exiAccYesInput.isSelected()) {
            existingAcc = "Yes";
        } else {
            existingAcc = "No";
        }

        try {
            // Step 4: Execute query
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "','" + religion + "','"
                    + category + "','" + income
                    + "','" + education + "','" + occupation + "','" + pan + "','" + adhar + "','" + senior + "','"
                    +
                    existingAcc + "')";
            c.s.executeUpdate(query);
            //close signupTwo
            setVisible(false);
            new SignupThree(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
