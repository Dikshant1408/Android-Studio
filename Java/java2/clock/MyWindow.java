package clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyWindow extends JFrame
{
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("",Font.BOLD,35);


    public MyWindow()
    {
        super.setTitle("My Clock");
        super.setSize(600,600);
        super.setLocation(300,50);
        super.setVisible(true);
        this.createGUI();
        this.startClock();
    }

    public void createGUI()
    {
        heading = new JLabel("My Clock");
        clockLabel = new JLabel("clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);

    }

    public void startClock()
    {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String datetime = new Date().toLocaleString();
                clockLabel.setText(datetime);
            }
        });

        timer.start();
    }
}

