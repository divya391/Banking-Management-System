package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s1,c;
    String formno;
    signup3(String formno){//constructor//received from signup2
        this.formno=formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1=new JLabel("Page 3:");
        l1.setBounds(280,40,400,40);
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        add(l1);

        JLabel l2=new JLabel("Account Details:");
        l2.setBounds(280,70,400,40);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);

        JLabel l3=new JLabel("Account Type:");
        l3.setBounds(100,140,200,30);
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setBounds(100,180,150,30);
        r1.setBackground(new Color(215,252,252));
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350,180,300,30);
        r2.setBackground(new Color(215,252,252));
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setBounds(100,220,250,30);
        r3.setBackground(new Color(215,252,252));
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350,220,250,30);
        r4.setBackground(new Color(215,252,252));
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        add(r4);

        JLabel l4=new JLabel("Card Number:");
        l4.setBounds(100,300,200,30);
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        add(l4);

        JLabel l5=new JLabel("(Your 16 Digit Card Number):");
        l5.setBounds(100,330,200,20);
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-4841:");
        l6.setBounds(350,300,250,30);
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        add(l6);

        JLabel l7=new JLabel("(It would appear and ATM Card/Cheque Book and Statement:)");
        l7.setBounds(330,330,500,20);
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        add(l7);

        JLabel l8=new JLabel("PIN No:");
        l8.setBounds(100,370,200,30);
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setBounds(350,370,200,20);
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        add(l9);

        JLabel l10=new JLabel("(4-digit Password):");
        l10.setBounds(100,400,200,20);
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        add(l10);

        JLabel l11=new JLabel("Service Required:");
        l11.setBounds(100,430,200,20);
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        add(l11);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100,480,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350,480,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100,520,200,30);
        add(c3);

        c4=new JCheckBox("Email Alert");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350,520,200,30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100,560,200,30);
        add(c5);

        c6=new JCheckBox("e-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350,560,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I hereby declare that above details are correct to the best of my knowledge",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100,600,600,20);
        add(c7);

        JLabel l12=new JLabel("Form No:");
        l12.setBounds(700,10,100,30);
        l12.setFont(new Font("Raleway",Font.BOLD,12));
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setBounds(760,10,100,30);
        l13.setFont(new Font("Raleway",Font.BOLD,12));
        add(l13);

        s1=new JButton("Submit");//for buttons
        s1.setFont(new Font("Raleway",Font.BOLD,14));
        s1.setBackground(Color.BLACK);
        s1.setForeground(Color.white);
        s1.setBounds(220,640,100,30);
        s1.addActionListener(this);
        add(s1);

        c=new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.setBounds(420,640,100,30);
        c.addActionListener(this);
        add(c);

        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);//should be at last
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;//to store values of radio button in atype variable
        if(r1.isSelected()){
            atype="Saving Account";
        }else if(r2.isSelected()){
            atype="Fixed Deposit Account";
        }else if(r3.isSelected()){
            atype="Current Account";
        }else if(r4.isSelected()){
            atype="Recurring Deposit Account";
        }
        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String CardNo=""+Math.abs(first7);//for random card number
         long first3=(ran.nextLong()%9000L)+1000L;
         String pin=""+Math.abs(first3);//random pin number

        String fac="";
        if(c1.isSelected()){
            fac+="ATM Card";
        }else if(c2.isSelected()){
            fac+="Internet Banking";
        }else if(c3.isSelected()){
            fac+="Mobile Banking";
        }else if(c4.isSelected()) {
            fac+= "Email Alert";
        }else if(c5.isSelected()){
            fac+="Cheque Book";
        }else if(c6.isSelected()){
            fac+="e-Statement";
        }try {
            if(e.getSource()==s1){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Please fill all the fields");
                }else{
                    Conn c1=new Conn();
                    String q1="Insert into signup3 values('"+formno+"','"+atype+"','"+CardNo+"','"+pin+"','"+fac+"')";
                    String q2="Insert into login values('"+formno+"','"+CardNo+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number:"+CardNo+"\n Pin:"+pin);
                    new Deposit(pin);//sent pin to deposit class
                    setVisible(false);
                }
            } else if (e.getSource()==c) {/// for cancel button
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new signup3("");//object

    }
}
