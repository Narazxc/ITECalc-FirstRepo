package my.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelToRightOfMenuPanel extends JPanel implements ActionListener {

    NumberPadPanel numberPadPanel = new NumberPadPanel();
    ResultPanel resultPanel = new ResultPanel();
    TabLocationPanel tabLocationPanel = new TabLocationPanel();

    public PanelToRightOfMenuPanel (){
        //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setLayout(new GridLayout(2,1, 10,10));

        // add listener to button 0-9 of numberPadPanel class
        for(int i = 0; i < 10; i++){
            numberPadPanel.allButtons[i].addActionListener(this);
        }

        resultPanel.resultTextField.setHorizontalAlignment( JTextField.RIGHT );

        add(resultPanel);
        add(numberPadPanel);
//        add(resultPanel, BorderLayout.PAGE_START);
//        add(numberPadPanel, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; i++) {
            if (e.getSource() == numberPadPanel.allButtons[i]) {
                resultPanel.resultTextField.setText(resultPanel.resultTextField.getText().concat(String.valueOf(i)));
            }
        }
    }
}
