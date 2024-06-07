import bank.management.system.Conn;
import bank.management.system.signup2;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    JTextField textName, Fname, TextEmail, textAdd, textCity, textPin, textState;
    JDateChooser dt;
    Random ran = new Random();//for application form random no.
    long first4;//for application form random no.
    String first;
    Signup() {
        super("APPLICATION FORM");//title
        this.first4 = this.ran.nextLong() % 9000L + 1000L;
        this.first = " " + Math.abs(this.first4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form No:" + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 36));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 60, 600, 45);
        label2.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 120, 600, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel textFname = new JLabel("Father's Name");
        textFname.setFont(new Font("Raleway", Font.BOLD, 20));
        textFname.setBounds(100, 240, 200, 30);
        add(textFname);

        Fname = new JTextField();
        Fname.setFont(new Font("Raleway", Font.BOLD, 14));
        Fname.setBounds(300, 240, 400, 30);
        add(Fname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dt=new JDateChooser();
        dt.setForeground(new Color(105,105,105));
        dt.setBounds(300,340,400,30);
        add(dt);

        JLabel label4 = new JLabel("Gender");
        label4.setBounds(100, 290, 200, 30);
        label4.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label4);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel email = new JLabel("Email Address");
        email.setBounds(100, 390, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        add(email);

        TextEmail = new JTextField();
        TextEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        TextEmail.setBounds(300, 390, 400, 30);
        add(TextEmail);

        JLabel ms = new JLabel("Marital Status");
        ms.setBounds(100, 440, 200, 30);
        ms.setFont(new Font("Raleway", Font.BOLD, 20));
        add(ms);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBackground(new Color(222, 255, 228));
        m1.setBounds(300, 440, 100, 30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBackground(new Color(222, 255, 228));
        m2.setBounds(450, 440, 100, 30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        m3.setBackground(new Color(222, 255, 228));
        m3.setBounds(635, 440, 100, 30);
        add(m3);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(m1);
        bg1.add(m2);
        bg1.add(m3);

        JLabel adr = new JLabel("Address");
        adr.setBounds(100, 490, 200, 30);
        adr.setFont(new Font("Raleway", Font.BOLD, 20));
        add(adr);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel city = new JLabel("City");
        city.setBounds(100, 540, 200, 30);
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel Pin = new JLabel("Pin Code");
        Pin.setBounds(100, 590, 200, 30);
        Pin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(Pin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 640, 400, 30);
        add(textPin);

        JLabel State = new JLabel("State");
        State.setBounds(100, 640, 200, 30);
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        add(State);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 590, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 680, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 225, 228));//color of frame
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = this.first;
        String name = this.textName.getText();
        String fname = this.Fname.getText();
        String dob=((JTextField) dt.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = TextEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String State = textState.getText();
        String Pin = textPin.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kindly fill all fields");
            } else {
                Conn c = new Conn();
                String q = "insert into signup values('" + formNo + "', '" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "', '" + address + "', '" + city + "','" + Pin + "','" + State + "' )";
                c.statement.executeUpdate(q);
                new signup2(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}
