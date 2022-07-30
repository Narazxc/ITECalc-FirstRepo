package my.gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    MainPanel mainPanel = new MainPanel();

    public MainWindow(){
        add(mainPanel);

    }
}
