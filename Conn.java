package bank.management.system;

import java.sql.*;
public class Conn {
    Connection connection;
    public Statement statement;
    public Conn(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Divyasingh98@");
            statement=connection.createStatement();//connect database with project
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
