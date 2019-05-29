package com.sergo.easygame;

import javax.swing.JFrame;

public class GameWrapper extends JFrame {
    public GameWrapper(){
        super("Sergo's first Java Game" );
        setBounds(100,100,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        System.out.println("Hey!");
        GameWrapper GW = new GameWrapper();
    }
}
