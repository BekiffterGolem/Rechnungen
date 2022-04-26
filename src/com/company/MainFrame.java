package com.company;

import javax.swing.*;

public class MainFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JPanel Rechnungen;


    public static void main(String[] args) {
        JFrame frame = new JFrame("MainFrame");
        frame.setContentPane(new MainFrame().Rechnungen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

