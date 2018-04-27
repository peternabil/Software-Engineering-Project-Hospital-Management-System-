
package project;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;
/**
 *
 * @author mostafa
 */
public class mainPage extends JFrame {
    private JLabel codelbl =new JLabel("Enter The Program Code :");
    private JLabel usernamelbl =new JLabel("User Name :");
    private JLabel passwordlbl =new JLabel("Password :");
    
    private JTextField codetxt =new JTextField(64);
    private JTextField usernametxt =new JTextField(64);
    private JPasswordField passwordtxt =new JPasswordField(64);
        
    private JButton entercode = new JButton("Enter Program Code");
    private JButton login = new JButton("Login");
        
    mainPage(){
        init();
    }

    private void init() {
        this.setSize(400,400);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("HMS");
//////////////////////////////////////////////////////Labels        
        codelbl.setBounds(10,10 ,160, 20);
        this.add(codelbl);
 
        usernamelbl.setBounds(10,150 ,150, 20);
        this.add(usernamelbl);
        
        passwordlbl.setBounds(10,200 ,150, 20);
        this.add(passwordlbl);
///////////////////////////////////////////////////// TextFields
        codetxt.setBounds(110,60,150,20);
        this.add(codetxt);
        
        usernametxt.setBounds(170,150,150,20);
        this.add(usernametxt);
        
        passwordtxt.setBounds(170,200,150,20);
        this.add(passwordtxt);
//////////////////////////////////////////////////// Buttons
        entercode.setBounds(85,110,200,20);
        entercode.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int n =Integer.parseInt(codetxt.getText());
                if(n==0){
                    AdminPage P =new AdminPage();
                    close();
                    P.setVisible(true);
                }
                
            }
        });
        this.add(entercode);
        
        login.setBounds(170,250,150,20);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int n = Integer.parseInt(passwordtxt.getText());
                String name=usernametxt.getText();
                if(name.equals("admin")&&n==0){
                    HMS P =new HMS();
                    close();
                    P.setVisible(true);
                }
            }
        });
        this.add(login);
    }
    public void close(){
        this.dispose();
    }
    
}
