package com.sergo.easygame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


// Изображение облака имеет размер 84х43 пикселя
public class CloudClass extends AbstractGameObject{
    public CloudClass(int x,int y,int dx,int dy,int id) {
        super("Cloud",x,y,84,43,dx,dy,id,false);
    }
}