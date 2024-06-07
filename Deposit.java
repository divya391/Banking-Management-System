package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    JTextField t1;
    JButton d1,b1;
    String pin;
    Deposit(String pin){
        this.pin=pin;//received from signup3 class

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1=new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(460,180,400,35);
        l1.setForeground(Color.white);
        l3.add(l1);//to show label on image l3

        t1=new JTextField();
        t1.setBounds(460,230,320,25);
        t1.setBackground(new Color(65,125,128));
        t1.setForeground(Color.white);
        t1.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(t1);

        d1=new JButton("DEPOSIT");
        d1.setBounds(700,362,150,35);
        d1.setBackground(new Color(65,125,128));
        d1.setForeground(Color.white);
        d1.addActionListener(this);
        l3.add(d1);

        b1=new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);//full screen
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount=t1.getText();
            Date date=new Date();//to show date in database
            if(e.getSource()==d1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount");
                }else{
                    Conn c=new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");//if this is not stored then next code wont execute
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" Deposited Successfully!");
                    setVisible(false);
                    new transaction(pin);
                }
            }else if(e.getSource()==b1){
                setVisible(false);
                new transaction(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("");

    }
}
