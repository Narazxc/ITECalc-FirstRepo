package my.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    MenuPanel menuPanel = new MenuPanel();
    PanelToRightOfMenuPanel panelToRightOfMenuPanel = new PanelToRightOfMenuPanel();
    TabLocationPanel tabLocationPanel = new TabLocationPanel();

    DisplayPanel displayPanel = new DisplayPanel();

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new BorderLayout());
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(Color.pink);
    }





    public MainPanel(){

//        GridBagConstraints d = new GridBagConstraints();
//        d.gridx = 0;
//        d.gridy = 0;
//        add(menuPanel, d);
//
//
//        d.gridx = 0;
//        d.gridy = 1;
//        add(numberPadPanel, d);

        add(menuPanel, BorderLayout.LINE_START);
        add(panelToRightOfMenuPanel, BorderLayout.CENTER);
        add(tabLocationPanel, BorderLayout.LINE_END);
    }

}
