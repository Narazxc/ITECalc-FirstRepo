package my.gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MenuPanel extends JPanel {

    //private JLabel nameLabel;

    // set panel layout to GridBagLayout from default layout
    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new GridBagLayout());
    }


    private JPanel menuPanel;
    private JPanel containMenuPanel;

    private JButton bitwiseBtn;
    private JButton arithmeticBtn;
    private JButton moneyExchangeBtn;
    private JButton numberSystemConversionBtn;
    private JButton binaryArithmeticBtn;
    private JButton storageConverterBtn;
    private JButton trigonometryBtn;


    @Override
    public void setBackground(Color bg) {
        super.setBackground(Color.lightGray);
    }

    private void createControl (){


        bitwiseBtn = new JButton("Bitwise");
        arithmeticBtn = new JButton("Arithmetic");
        moneyExchangeBtn = new JButton("Money Exchange");
        numberSystemConversionBtn = new JButton("Number System Conversion");
        binaryArithmeticBtn = new JButton("Binary Arithmetic");
        storageConverterBtn = new JButton("Storage Converter");
        trigonometryBtn = new JButton("Trigonometry");

        bitwiseBtn.setPreferredSize(new Dimension(200,50));
        arithmeticBtn.setPreferredSize(new Dimension(200,50));
        moneyExchangeBtn.setPreferredSize(new Dimension(200,50));
        numberSystemConversionBtn.setPreferredSize(new Dimension(200,50));
        binaryArithmeticBtn.setPreferredSize(new Dimension(200,50));
        storageConverterBtn.setPreferredSize(new Dimension(200,50));
        trigonometryBtn.setPreferredSize(new Dimension(200,50));

        //bitwiseBtn.setFont(new Font("Press Start 2P", Font.PLAIN, 20));

        bitwiseBtn.setBackground(Color.LIGHT_GRAY);
        arithmeticBtn.setBackground(Color.LIGHT_GRAY);
        moneyExchangeBtn.setBackground(Color.LIGHT_GRAY);
        numberSystemConversionBtn.setBackground(Color.LIGHT_GRAY);
        binaryArithmeticBtn.setBackground(Color.LIGHT_GRAY);
        storageConverterBtn.setBackground(Color.LIGHT_GRAY);
        trigonometryBtn.setBackground(Color.LIGHT_GRAY);






        GridBagConstraints gbc = new GridBagConstraints();
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10,0,10,0);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(bitwiseBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(arithmeticBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(moneyExchangeBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(numberSystemConversionBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(binaryArithmeticBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(storageConverterBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(trigonometryBtn, gbc);






/*        nameLabel = new JLabel("Name");
        nameLabel.setForeground(Color.ORANGE);

        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));*/

    }
    public MenuPanel (){

        setLayout(new GridBagLayout());

        setPreferredSize(new Dimension(300, 1000));

        createControl();
    }


}
