package com.sergo.easygame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


// Изображение облака имеет размер 84х43 пикселя
public class NatureClass extends AbstractGameObject{
    public NatureClass(String type, int x,int y,int w, int h,int dx,int dy,int id) {
        super(type,x,y,w,h,dx,dy,id,false);
    }
}