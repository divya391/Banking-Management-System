package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new signup2("");
    }
    String formno;
    JComboBox combobox, combobox2, combobox3, combobox4, combobox5;
    JTextField textAdhaar, textPan;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    public signup2(String formno) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(300, 30, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(300, 60, 600, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setBounds(100, 120, 100, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        combobox = new JComboBox(religion);//for drop down box
        combobox.setBackground(new Color(252, 208, 76));
        combobox.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox.setBounds(350, 120, 320, 30);
        add(combobox);

        JLabel l4 = new JLabel("Category:");
        l4.setBounds(100, 170, 100, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l4);

        String Category[] = {"General", "OBC", "SC", "ST", "Other"};
        combobox2 = new JComboBox(Category);
        combobox2.setBackground(new Color(252, 208, 76));
        combobox2.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox2.setBounds(350, 170, 320, 30);
        add(combobox2);

        JLabel l5 = new JLabel("Income:");
        l5.setBounds(100, 220, 100, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l5);

        String Income[] = {"Null", "<1,25,000", "<2,50,000", "<5,00,000", "upto 10,00,000", "Above 10,00,000"};
        combobox3 = new JComboBox(Income);
        combobox3.setBackground(new Color(252, 208, 76));
        combobox3.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox3.setBounds(350, 220, 320, 30);
        add(combobox3);

        JLabel l6 = new JLabel("Education:");
        l6.setBounds(100, 270, 150, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l6);

        String Education[] = {"Non Graduate", "Graduate", "Masters", "Doctorate", "Other"};
        combobox4 = new JComboBox(Education);
        combobox4.setBackground(new Color(252, 208, 76));
        combobox4.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox4.setBounds(350, 270, 320, 30);
        add(combobox4);

        JLabel l7 = new JLabel("Occupation:");
        l7.setBounds(100, 320, 150, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l7);

        String Occupation[] = {"Salaried", "Self employed", "Business", "Student", "Retired", "Other"};
        combobox5 = new JComboBox(Occupation);
        combobox5.setBackground(new Color(252, 208, 76));
        combobox5.setFont(new Font("Raleway", Font.BOLD, 14));
        combobox5.setBounds(350, 320, 320, 30);
        add(combobox5);

        JLabel l8 = new JLabel("Adhaar No:");
        l8.setBounds(100, 370, 320, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l8);

        textAdhaar = new JTextField();
        textAdhaar.setBounds(350, 370, 320, 30);
        textAdhaar.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textAdhaar);

        JLabel l9 = new JLabel("PAN No:");
        l9.setBounds(100, 420, 150, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l9);

        textPan = new JTextField();
        textPan.setBounds(350, 420, 320, 30);
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textPan);

        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setBounds(100, 470, 150, 30);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 470, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 470, 100, 30);
        add(r2);

        ButtonGroup bg = new ButtonGroup();// for selecting one button at a time
        bg.add(r1);
        bg.add(r2);

        JLabel l11 = new JLabel("Existing Account");
        l11.setBounds(100, 520, 150, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 76));
        e1.setBounds(350, 520, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 76));
        e2.setBounds(460, 520, 100, 30);
        add(e2);

        ButtonGroup bg1 = new ButtonGroup();// for selecting one button at a time
        bg.add(e1);
        bg.add(e2);

        JLabel l12 = new JLabel("Form No:");
        l12.setBounds(700, 10, 100, 30);
        l12.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(760, 10, 60, 30);
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.white);
        next.setForeground(Color.black); //for letters color
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);//to perform some action
        add(next);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));//for frame bg color
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combobox.getSelectedItem();//to take values from above data
        String cat = (String) combobox2.getSelectedItem();
        String inc = (String) combobox3.getSelectedItem();
        String edu = (String) combobox4.getSelectedItem();
        String occ = (String) combobox5.getSelectedItem();

        String pan = textPan.getText();//retrieve data of pan card field
        String adhaar = textAdhaar.getText();

        String scitizen = null;
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String account = null;
        if (e1.isSelected()) {
            account = "Yes";
        } else if (e2.isSelected()) {
            account = "No";
        }
        try {
            if (textPan.getText().equals("") || textAdhaar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            } else {
                Conn c1 = new Conn();
                String q = "Insert into Signup2 values('" + formno + "','" + rel + "','" + cat + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + adhaar + "','" + scitizen + "','" + account + "')";//stored query in q
                c1.statement.executeUpdate(q);//to insert values to table
                new signup3(formno);//sent to signup3
                setVisible(false);
            }
        }
        catch (Exception E) {
            E.printStackTrace();
        }
    }
}
