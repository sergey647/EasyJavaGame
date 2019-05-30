package com.sergo.easygame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public abstract class AbstractGameObject extends JComponent {
    public int dx,dy,id;
    public String Type;
    private boolean isTouchable;
    public AbstractGameObject(String Type, int x,int y,int width,int height,int dx,int dy,int id,boolean isTouchable){
        setBounds(x,y,width,height);
        this.dx=dx;
        this.dy=dy;
        this.id=id;
        this.Type=Type;
        this.isTouchable=isTouchable;
    }
    public void updateObjCondition() {
        setBounds(this.getX()-dx,this.getY()-dy,this.getWidth(),this.getHeight());
        if((this.getX()*(-1)>this.getWidth()))
            setBounds(640,this.getY(),this.getWidth(),this.getHeight());
    }

    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("src\\img\\"+this.Type + Integer.toString(this.id) + ".png"));
        } catch (IOException e) {
            System.out.println(this.Type+"Object image not found");
        }
        g.drawImage(im, 0, 0, null);
    }
}
