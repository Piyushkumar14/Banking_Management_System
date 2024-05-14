package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    RoundedButton login, cancel;
    JTextField tfusername, tfpassword;
   Login() {
//       JFrame f = new JFrame();
       setTitle("Login");
       setSize(600,400);
       setLocation(450,225);
       setVisible(true);


       getContentPane().setBackground(Color.black);
       setLayout(null);

       JLabel lbusername = new JLabel("UserName");
       lbusername.setForeground(Color.white);
       lbusername.setBounds(60, 60, 100, 20);
       add(lbusername);

       tfusername = new JTextField();
       tfusername.setBounds(170, 60, 150, 20);
       add(tfusername);

       JLabel lbpassword = new JLabel("Password");
       lbpassword.setForeground(Color.white);
       lbpassword.setBounds(60, 110, 100, 20);
       add(lbpassword);

       tfpassword = new JPasswordField();
       tfpassword.setBounds(170, 110, 150, 20);
       add(tfpassword);

       login = new RoundedButton("Login");
       login.setBounds(60, 180, 120, 30);
       login.setBackground(Color.white);
       login.setForeground(Color.black);
       login.addActionListener(this);
       login.setFont(new Font("Lato", Font.ITALIC, 16));
       add(login);

       cancel = new RoundedButton("cancel");
       cancel.setBounds(200, 180, 120, 30);
       cancel.setBackground(Color.white);
       cancel.setForeground(Color.black);
       cancel.addActionListener(this);
       cancel.setFont(new Font("Lato", Font.ITALIC, 16));
       add(cancel);

   }

       @Override
       public void actionPerformed(ActionEvent ac) {
           if(ac.getSource() == login){
               String username = tfusername.getText();
               String password = tfpassword.getText();

               String query = "select * from login where username = '" + username + "' and password = '" + password + "'";

               try {
                   connection c = new connection();
                   ResultSet rs = c.s.executeQuery(query);
                   if(rs.next()){
                       setVisible(false);
                       new MainMenu();
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Invalid username or password");
                       setVisible(false);
                   }

               } catch (Exception e) {
                   e.printStackTrace();
               }

           } else if(ac.getSource() == cancel){
               setVisible(false);
           }
   }
}
