package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel l2;
    JButton b1;
    BalanceEnquiry(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel l1 = new JLabel("YOUR CURRENT BALANCE IS Rs.");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(430, 180, 700, 35);
        l1.setForeground(Color.white);
        l3.add(l1);//to show label on image l3

        l2 = new JLabel();
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(430, 220, 400, 35);
        l2.setForeground(Color.white);
        l3.add(l2);//to show label on image l3

        b1 = new JButton("BACK");
        b1.setBounds(700, 406, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        int balance=0;
        try {
            Conn c=new Conn();
            ResultSet rs=c.statement.executeQuery("select * from bank where pin='"+pin+"'");//to retrieve data and store in rs
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance-= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch (Exception E){
            E.printStackTrace();
        }
        l2.setText(""+balance);
        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);//full screen
        setVisible(true);

    }
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new transaction(pin);

    }
}
