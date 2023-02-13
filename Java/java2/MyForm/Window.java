package MyForm;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame
{

    Font font = new Font("",Font.BOLD,30);

    public Window()
    {
        super.setTitle("My First Form");
        super.setSize(500,500);
        super.setLocation(400,200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        super.setVisible(true);
        System.out.println("This is constructor");
    }

    public void createGUI()
    {
        this.setLayout(new BorderLayout());

        JLabel heading = new JLabel("My First Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);

        this.add(heading,BorderLayout.NORTH);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));

        JLabel nameLabel = new JLabel("Enter your name");
        nameLabel.setFont(font);

        JLabel passwordLabel = new JLabel("Enter your password");
        passwordLabel.setFont(font);

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(font);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(font);

        JButton button1 = new JButton("Submit");
        button1.setFont(font);

        JButton button2 = new JButton("Reset");
        button2.setFont(font);

        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);
        this.add(mainPanel,BorderLayout.CENTER);
    }
}
