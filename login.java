package bank.management.system;
import javax.swing.*; //for JFrame
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;
    login(){ //constructor
        super("Bank Management System"); //for title

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); //for image url
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); //for scaling image
        ImageIcon i3=new ImageIcon(i2);// to convert image to image icon
        JLabel image=new JLabel(i3);// to add image icon with the help of label
        image.setBounds(350,10,100,100); //to locate jlabel with the help of setbound
        add(image);// add image to frame

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1=new JLabel("WELCOME TO ATM!!");//to show text in a frame
        label1.setForeground(Color.white);//text color
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.blue);
        label2.setBounds(150,190,375,38);
        add(label2);

        textField=new JTextField(15);//for entering card no
        textField.setBounds(325,190,230,30);
        textField.setFont(new Font("Arial",Font.BOLD,14));
        add(textField);

        label3=new JLabel("PIN:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.blue);
        label3.setBounds(150,250,375,38);
        add(label3);

        passwordField=new JPasswordField(15);//for entering pin
        passwordField.setBounds(325,250,230,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.white);//text color
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this); //to make system know that a button is being clicked and it gets stored in action event
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);// x,y is zero because we need full background
        add(iiimage);

        setLayout(null);
        setSize(850,480); //frame sie
        setLocation(450,200);// frame location
        //setUndecorated(true);//to remove minimize, max, close at top of the page
        setVisible(true); //frame visibility, should always be at bottom
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1) {//to check which button is clicked, for sign in button
                Conn c=new Conn();
                String cardno =textField.getText();
                String pin=passwordField.getText();
                String q= "Select * from login where card_number='"+cardno+"' and pin='"+pin+"'";
                ResultSet rs=c.statement.executeQuery(q);//to retrieve data and store in rs
                if(rs.next()){
                    setVisible(false);
                    new transaction(pin);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }else if(e.getSource()==button2){// for clear button command
                textField.setText("");//empty the field
                passwordField.setText("");
            } else if(e.getSource()==button3){
                setVisible(false);// for signup button
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new login(); // object
    }
}