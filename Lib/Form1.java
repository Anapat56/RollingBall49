package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form1 extends JFrame {
    public Form1(){
        this.getContentPane().add(new RollingBall());
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}




