package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Menu extends JFrame implements ActionListener{

    RoundedButton CreateAccount, Login, Exit;
    Menu(){
        JFrame f = new JFrame();
        setTitle("Menu");
        setSize(600,400);
        setLocation(450,225);
        setVisible(true);

        getContentPane().setBackground(Color.black);
        setLayout(null);

//        ImageIcon i1 = new ImageIcon(getClass().getResource("src/Icons/first.png"));
//        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350, 0, 200, 200);
//        add(image);

        //Login button
        Login = new  RoundedButton("Login");
        Login.setBounds(60, 180, 120, 30);
        Login.setBackground(Color.white);
        Login.setForeground(Color.black);
        Login.addActionListener(this);
        Login.setFont(new Font("Arial", Font.ITALIC, 16));
        add(Login);

        //CreateAccount button
        CreateAccount = new  RoundedButton("Create Account");
        CreateAccount.setBounds(210, 180, 160, 30);
        CreateAccount.setBackground(Color.white);
        CreateAccount.setForeground(Color.black);
        CreateAccount.addActionListener(this);
        CreateAccount.setFont(new Font("Arial", Font.ITALIC, 16));
        add(CreateAccount);

        Exit = new  RoundedButton("Exit");
        Exit.setBounds(400, 180, 120, 30);
        Exit.setBackground(Color.white);
        Exit.setForeground(Color.black);
        Exit.addActionListener(this);
        Exit.setFont(new Font("Arial", Font.ITALIC, 16));
        add(Exit);

    }

    @Override
    public void actionPerformed(ActionEvent ac) {

        if(ac.getSource() == Login){
            new Login();

        } else if(ac.getSource() == CreateAccount){
            new CreateAccount();

        } else if (ac.getSource() == Exit){
            setVisible(false);
        }
    }
}