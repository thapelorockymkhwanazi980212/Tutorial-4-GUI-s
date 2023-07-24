
package ac.za.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame 
{
    private JLabel headingLabel, usernameLabel, passwordLabel;
    private JTextField usernameTextField;
    private JButton submitButton, clearButton, exitButton;
    private JPasswordField passwordField;
    private JPanel headingPanel, usernamePanel,passwordPanel, buttonsPanel, usernameAndPasswordCombinedPanel, mainPanel;

    public LoginFrame() 
    {
       
        setTitle("Login page");
        setSize(200, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
         //create labels
        headingLabel = new JLabel("Login");
        headingLabel.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 30));
        headingLabel.setForeground(Color.RED);
        headingLabel.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        usernameLabel =  new JLabel("Username:");       
        passwordLabel = new JLabel("Password:");
        
        //creating textfields
        usernameTextField = new JTextField(20);
        
        //creating password field
        passwordField = new JPasswordField(20);
        
        //creating buttons
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        
        //creating panels
        headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPanel.add(headingLabel); //north main
        
        usernamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameTextField);
        
        passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        
        usernameAndPasswordCombinedPanel = new JPanel(new GridLayout(2,1));
        usernameAndPasswordCombinedPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2),"Login details"));
        usernameAndPasswordCombinedPanel.add(usernamePanel);
        usernameAndPasswordCombinedPanel.add(passwordPanel);//center main
        
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsPanel.add(submitButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(exitButton);//south main
        
        mainPanel =  new JPanel(new BorderLayout());
        mainPanel.add(headingPanel, BorderLayout.NORTH);
        mainPanel.add(usernameAndPasswordCombinedPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        
        pack();
        setVisible(true);
   }
    
}
