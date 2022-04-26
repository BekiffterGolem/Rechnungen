package com.company;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        

        //Text auf Bild bringen!
        BufferedImage image = ImageIO.read(new File("Carlo.jpg"));
        Graphics g = image.getGraphics();
        g.setFont(g.getFont().deriveFont(25f));
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.PLAIN, 96));
        g.drawString("Guck mal, das habe ich mit meinem", 50, 150);
        g.drawString("Java-Programm gemacht!", 50, 246);
        g.dispose();

        ImageIO.write(image, "png", new File("Image1.png"));
    }
}
