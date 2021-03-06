package com.sergo.easygame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameWrapper extends JFrame {
    public GameWrapper(){
        super("Sergo's first Java Game" );
        setBounds(100,100,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        //System.out.println(System.getProperty("user.dir"));
        setContentPane(new BgPanel());
    }
    public static void main(String[] args)
    {
        System.out.println("Hey!");
        GameWrapper GW = new GameWrapper();
        Container GWcont=GW.getContentPane();
        GWcont.setLayout(null);
        CloudClass[] Clouds = new CloudClass[8];
        for(int i=0; i<Clouds.length;i++) {
            Clouds[i]= new CloudClass(80+i*100,20+(((int)(Math.random()*3))*50),1,0,i%5);
            GWcont.add(Clouds[i]);
        }
        Player MainPlayer = new Player(20,270);
        GW.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){
                System.out.println("Pressed");// write your code here
                MainPlayer.dy = MainPlayer.dy==0 ? 15 : MainPlayer.dy;
            }
            public void keyReleased(KeyEvent e){}
            public void keyTyped(KeyEvent e){}
        });
        GWcont.add(MainPlayer);
        GW.setVisible(true);
        while (true){
            for(int i=0; i<Clouds.length;i++)
                Clouds[i].updateObjCondition();
            MainPlayer.updateObjCondition();
            try {
                Thread.sleep(100);
            }catch (java.lang.InterruptedException e){System.out.println("Not a pause?");}
        }
    }
}

class BgPanel extends JPanel{
    public void paintComponent(Graphics g){
        Image im = null;
        try {
            im=ImageIO.read(new File("src\\img\\BackGround.png"));
        } catch (IOException e){System.out.println("BG image not found");}
        g.drawImage(im,0,0,null);
    }
}