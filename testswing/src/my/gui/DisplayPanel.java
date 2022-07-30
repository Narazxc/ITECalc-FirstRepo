package my.gui;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JFrame {

    @Override
    public void setBackground(Color bgColor) {
        super.setBackground(Color.GREEN);
    }

    public DisplayPanel (){
        setPreferredSize(new Dimension(100,100));
    }
}
