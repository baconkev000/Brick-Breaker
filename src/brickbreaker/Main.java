package brickbreaker;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args){
        JFrame  obj = new JFrame(); /*creates window*/
        Gameplay gamePlay = new Gameplay();
        obj.add(gamePlay);

        obj.setBounds(10, 10, 700, 600); /*sets the window size*/
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
