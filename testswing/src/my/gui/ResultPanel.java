package my.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultPanel extends JPanel {


    public JTextField resultTextField;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);



    private void createControl (){

        resultTextField = new JTextField();
        resultTextField.setSelectedTextColor(Color.black);
        resultTextField.setFont(myFont);
        resultTextField.setBackground(Color.darkGray);
        resultTextField.setForeground(Color.white);
        resultTextField.setBorder(null);
        resultTextField.setPreferredSize(new Dimension(0,50));
        resultTextField.setColumns(20);
        resultTextField.setEditable(false);
        add(resultTextField);

    }



    public ResultPanel (){

        createControl();

        setPreferredSize(new Dimension(700, 250));
        setBackground(Color.darkGray);
    }


}
