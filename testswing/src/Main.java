/*
    GUI for ITE Calculator progress.
    GUI_ITECalculator created by Sitha Sovannara on 06/29/2022
 */
import my.gui.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setSize(1500,1000);

        mainWindow.setTitle("ITE Calculator");
        // center screen
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
