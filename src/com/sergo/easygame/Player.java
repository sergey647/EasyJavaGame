package com.sergo.easygame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


// Изображение облака имеет размер 84х43 пикселя
public class Player extends AbstractGameObject{
    int ZeroLevel;
    public Player(int x,int y) {
        super("Player",x,y,80,70,0, 0,0,true);
        this.ZeroLevel=y;
    }
    public void updateObjCondition() {
        setBounds(this.getX()-dx,this.getY()-dy,this.getWidth(),this.getHeight());
        this.id= (this.id==0) ? 1 : 0;
        if(this.getY()>=ZeroLevel) dy=0;
        else if(this.dy>-10) dy-=2;
        else this.dy=-10;
        if((this.getX()*(-1)>this.getWidth()))
            setBounds(640,this.getY(),this.getWidth(),this.getHeight());
        repaint();
    }
}