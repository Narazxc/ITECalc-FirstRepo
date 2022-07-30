package my.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NumberPadPanel extends JPanel{

    ResultPanel resultPanel = new ResultPanel();

    // set panel layout to GridBagLayout from default layout
    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new GridBagLayout());
    }



    // declare
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    JButton btnPlus, btnMinus, btnDivision, btnMultiplication, btnEqual;
    JButton btnFraction, btnSquare, btnSquareRoot;
    JButton btnSin, btnCos, btnTan, btnCot;
    JButton btnClear, btnDecPoint;

    JButton[] allButtons;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    public void createButton (){
        allButtons = new JButton[24];

        // instantiate
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDecPoint = new JButton(".");
        btnClear = new JButton("C");

        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnDivision = new JButton("/");
        btnMultiplication = new JButton("*");
        btnFraction = new JButton("1/x");
        btnSquare = new JButton("x^2");
        btnSquareRoot = new JButton("SquareRoot()");

        btnSin = new JButton("sin");
        btnCos = new JButton("cos");
        btnTan = new JButton("tan");
        btnCot = new JButton("cot");
        btnEqual = new JButton("=");

        allButtons[0] = btn0;
        allButtons[1] = btn1;
        allButtons[2] = btn2;
        allButtons[3] = btn3;
        allButtons[4] = btn4;
        allButtons[5] = btn5;
        allButtons[6] = btn6;
        allButtons[7] = btn7;
        allButtons[8] = btn8;
        allButtons[9] = btn9;
        allButtons[10] = btnPlus;
        allButtons[11] = btnMinus;
        allButtons[12] = btnMultiplication;
        allButtons[13] = btnDivision;
        allButtons[14] = btnEqual;
        allButtons[15] = btnSin;
        allButtons[16] = btnCos;
        allButtons[17] = btnTan;
        allButtons[18] = btnCot;
        allButtons[19] = btnFraction;
        allButtons[20] = btnSquare;
        allButtons[21] = btnSquareRoot;
        allButtons[22] = btnDecPoint;
        allButtons[23] = btnClear;



        for (int i = 0; i < allButtons.length; i++){
            if (i == 14){
                continue;
            } else {
                allButtons[i].setFont(myFont);
                allButtons[i].setPreferredSize(new Dimension(120,60));
            }
        }

        // set prefer size
//        btn1.setPreferredSize(new Dimension(120,60));
//        btn2.setPreferredSize(new Dimension(120,60));
//        btn3.setPreferredSize(new Dimension(120,60));
//        btn4.setPreferredSize(new Dimension(120,60));
//        btn5.setPreferredSize(new Dimension(120,60));
//        btn6.setPreferredSize(new Dimension(120,60));
//        btn7.setPreferredSize(new Dimension(120,60));
//        btn8.setPreferredSize(new Dimension(120,60));
//        btn9.setPreferredSize(new Dimension(120,60));
//        btn0.setPreferredSize(new Dimension(120,60));
//        btnDecPoint.setPreferredSize(new Dimension(120,60));
//        btnClear.setPreferredSize(new Dimension(120,60));
//        btnSin.setPreferredSize(new Dimension(120,60));
//        btnCos.setPreferredSize(new Dimension(120,60));
//        btnTan.setPreferredSize(new Dimension(120,60));
//        btnCot.setPreferredSize(new Dimension(120,60));
//        btnFraction.setPreferredSize(new Dimension(120,60));
//        btnSquare.setPreferredSize(new Dimension(120,60));
//        btnSquareRoot.setPreferredSize(new Dimension(120,60));
//        btnPlus.setPreferredSize(new Dimension(120,60));
//        btnMinus.setPreferredSize(new Dimension(120,60));
//        btnMultiplication.setPreferredSize(new Dimension(120,60));
//        btnDivision.setPreferredSize(new Dimension(120,60));
        btnEqual.setPreferredSize(new Dimension(240,60));

        // set constraint to make button appear in grid
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(btnFraction, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(btnSquare, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        add(btnSquareRoot, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(btn1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(btn2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        add(btn3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(btn4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(btn5, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(btn6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(btn7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(btn8, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        add(btn9, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(btnClear, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(btn0, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        add(btnDecPoint, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        add(btnSin, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(btnCos, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        add(btnTan, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        add(btnCot, gbc);

        gbc.gridwidth = 2;
        gbc.gridx = 3;
        gbc.gridy = 4;
        add(btnEqual, gbc);

        gbc.gridx = 4;
        gbc.gridy = 0;
        add(btnPlus, gbc);

        gbc.gridx = 4;
        gbc.gridy = 1;
        add(btnMinus, gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        add(btnMultiplication, gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        add(btnDivision, gbc);



    }


    // constructor
    public NumberPadPanel(){
        createButton();



    }

}

