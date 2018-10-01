/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;




/**
 *
 * @author Cliff W'mosi
 */
public class LoginsR extends JFrame{
    public static void main(String[] args){
        JFrame loginpage = new JFrame("Login");
        JLabel name = new JLabel("Username");
        JLabel password = new JLabel("Password");
        JCheckBox x = new JCheckBox("Remeber Password");
        JPanel a = new JPanel();
        JTextField b = new JTextField();
        JPasswordField c = new JPasswordField();
        a.setBackground(Color.WHITE);
        b.setColumns(30);
        c.setColumns(30);
        
        JButton clear = new JButton("Clear");
        JButton login = new JButton("Login");
        name.setFont(new Font("sanserif", Font.PLAIN, 30));
        password.setFont(new Font("sanserif", Font.PLAIN, 30));
        clear.setFont(new Font("Serif", Font.BOLD, 26));
        login.setFont(new Font("Serif", Font.BOLD, 26));
        a.setLayout(null);
        a.setVisible(true);
        a.add(clear);
        a.add(login);
        a.add(name);
        a.add(b);
        a.add(password);
        a.add(c);
        a.add(x);
        loginpage.add(a);
        
        name.setBounds(700,250,150,26);
        password.setBounds(700,400,150,26);
        b.setBounds(850,250,400,40);
        c.setBounds(850,400,400,40);
        clear.setBounds(720,850,140,60);
        login.setBounds(1200,850,140,60);
        
        loginpage.setSize(1800,1100);
        loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginpage.setVisible(true);
        
        }
    public void actionPerformed(ActionEvent ae){
        String user = b.getText();
        String pwd = new String(c.getText();
        if
    }
    
}
    

