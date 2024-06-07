package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PinChange extends JFrame implements ActionListener{
    String pin;
    JButton b1,b2;
    JPasswordField p1,p2;
    PinChange(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(430, 180, 400, 35);
        l1.setForeground(Color.white);
        l3.add(l1);//to show label on image l3

        JLabel l2 = new JLabel("NEW PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(430, 220, 150, 35);
        l2.setForeground(Color.white);
        l3.add(l2);//to show label on image l3

        p1 = new JPasswordField();
        p1.setBounds(600, 220, 200, 35);
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.white);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-ENTER NEW PIN:");
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setBounds(430, 250, 200, 35);
        label3.setForeground(Color.white);
        label3.add(label3);

        p2 = new JPasswordField();
        p2.setBounds(430, 220, 200, 35);
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.white);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p2);

        b1 = new JButton("CHANGE");
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



        setSize(1550, 1080);
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1=p1.getText();//to get values
            String pin2=p2.getText();

            if(p1.equals(p2)){
                JOptionPane.showMessageDialog(null,"Entered pin does not match");
                return;
            }
            if(e.getSource()==b1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter new pin");

                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter new pin");

                }
                Conn c=new Conn();
                String q1="update bank set pin ='"+pin1+"' where pin ='"+pin+"'";
                String q2="update login set pin ='"+pin1+"' where pin ='"+pin+"'";
                String q3="update signup3 set pin ='"+pin1+"' where pin ='"+pin+"'";

                c.statement.executeUpdate(q1);//to run queries
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"Pin changes successfully!");
                setVisible(false);
                new transaction(pin);//to return new pin

            }


        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new PinChange();

    }
}


