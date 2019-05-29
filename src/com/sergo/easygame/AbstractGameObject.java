package com.sergo.easygame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AbstractGameObject extends JComponent {
    public int dx,dy;
    private boolean isTouchable;
    public AbstractGameObject(int x,int y,int width,int height,int dx,int dy,boolean isTouchable){
        setBounds(x,y,width,height);
        this.dx=dx;
        this.dy=dy;
        this.isTouchable=isTouchable;
    }
    public void updateObjCondition() {
        setBounds(this.getX()-dx,this.getY()-dy,this.getWidth(),this.getHeight());
        if((this.getX()*(-1)>this.getWidth()))
            setBounds(640,this.getY(),this.getWidth(),this.getHeight());
    }
}
