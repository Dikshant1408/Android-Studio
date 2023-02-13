package Tick_Tack_Toe;

import javax.swing.*;

public class MyGame extends JFrame
{
    MyGame()
    {
        super.setTitle("My Tick Tack Toe Game");
        super.setSize(550,550);
        ImageIcon icon = new ImageIcon("D:\\Java\\java2\\Tick_Tack_Toe\\download (2).jpg");
        super.setIconImage(icon.getImage());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
