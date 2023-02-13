import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonClickEvent
{
    public static void main(String[] args)
    {
        ActionEventDemo avd = new ActionEventDemo();
        avd.prepareGui();
        avd.buttonProperties();
    }
}
class ActionEventDemo implements ActionListener
{
    JFrame frame = new JFrame();
    JButton button = new JButton("Click Me");

    public void prepareGui()
    {
        frame.setTitle("My Window");
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setBounds(200,200,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void buttonProperties()
    {
        button.setBounds(130,200,100,40);
        frame.add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        frame.getContentPane().setBackground(Color.BLUE);
    }
}