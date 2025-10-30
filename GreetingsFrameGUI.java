
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author pontshomaila
 */
public class GreetingsFrameGUI extends JFrame {
    
    //panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    private JTextField nameTxtField;
    private JTextField surnameTxtField;
    
    //textArea
    private JTextArea greetingsTextrea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    

    public GreetingsFrameGUI() {
        
        //now i need to configure my GUI
        setTitle("GreetingsGUI");
        setSize(500, 550);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.yellow);
        setVisible(true);
        
        //now i need to create the panels
        namePnl=new JPanel(new FlowLayout());
        surnamePnl=new JPanel(new FlowLayout());
        
        nameAndSurnamePnl=new JPanel(new GridLayout(2,1));
        greetingsAreaPnl=new JPanel(new BorderLayout());
        
        btnsPnl=new JPanel(new FlowLayout());
        mainPnl=new JPanel(new BorderLayout());
        
        headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //creating the labels
        headingLbl=new JLabel("Greetings App");
        nameLbl=new JLabel("Name: ");
        surnameLbl=new JLabel("Surname: ");
        
        //creating text fields
        nameTxtField=new JTextField(20);
        surnameTxtField=new JTextField(20);
        
        //creating the text area
        greetingsTextrea=new JTextArea(25, 40);
        greetingsTextrea.setEditable(false);
        greetingsTextrea.setText("Hello [name] [surname]");
        
        //creating the buttons
        greetBtn=new JButton("Greet");
        clearBtn=new JButton("Clear");
        exitBtn=new JButton("Exit");
        
        //now im adding the name labels to the name panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtField);
        
        //now im adding the surname labels to the surname panel
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtField);
        
        //add the name and surname to the nameandsurname panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        //adding the greetings area to its panel
        greetingsAreaPnl.add(greetingsTextrea);
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings Text"));
        
        //adding the buttons to their panel
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        headingPnl.add(headingLbl);
        
        //now add all the panels to the main panel
        mainPnl.add(nameAndSurnamePnl,BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl,BorderLayout.CENTER);
        mainPnl.add(btnsPnl,BorderLayout.SOUTH);
        
        //now adding the main panel to the frame's panel
        add(headingPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        
        //now make the frame visible
        setVisible(true);
        
        
    }
    
    
}
