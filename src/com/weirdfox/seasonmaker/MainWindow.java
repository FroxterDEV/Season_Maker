package com.weirdfox.seasonmaker;
import javax.swing.*;

public class MainWindow extends JFrame {

    //Define window size
    private final int WIDTH = 400;
    private final int HEIGHT = 230;

    //Adding window properties and layout
    public MainWindow() {
        setTitle("Season Maker v1.0");
        setResizable(false);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().add(new Layout());
    }

    //Make the window visible
    public void display() {
        this.setVisible(true);
    }
}