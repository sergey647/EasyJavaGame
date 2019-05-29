package com.sergo.easygame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


// Изображение облака имеет размер 84х43 пикселя
public class CloudClass extends AbstractGameObject{
    public int id;
    public CloudClass(int x,int y,int dx,int dy,int id) {
        super(x,y,84,43,dx,dy,false);
        this.id=id;
    }
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("src\\img\\Cloud" + Integer.toString(this.id) + ".png"));
        } catch (IOException e) {
            System.out.println("GameObject image not found");
        }
        g.drawImage(im, 0, 0, null);
    }
}