package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawal extends JFrame implements ActionListener {
    JTextField textField;
    JButton b1, b2;
    String pin;

    withdrawal(String pin) {
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel l1 = new JLabel("MAXIMUM WITHDRAWAL IS Rs.10000");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(460, 180, 700, 35);
        l1.setForeground(Color.white);
        l3.add(l1);//to show label on image l3

        JLabel l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(460, 220, 400, 35);
        l2.setForeground(Color.white);
        l3.add(l2);//to show label on image l3

        textField = new JTextField();
        textField.setBounds(460, 260, 320, 25);
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.white);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);//full screen
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter the amount you want to withdraw");
                } else {
                    Conn c = new Conn();
                    ResultSet rs = c.statement.executeQuery("Select * from bank where pin='" + pin + "'");
                    int balance = 0;
                    while (rs.next()) {//to check if data is present in the table or not
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient balance!");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdrawal','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " debited successfully!");
                    setVisible(false);//to close the frame
                    new transaction(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new transaction(pin);

        }
    }
    public static void main (String[]args){
            new withdrawal("");
        }
    }

