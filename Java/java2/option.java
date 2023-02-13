import javax.swing.*;

public class option {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age: "));
        JOptionPane.showMessageDialog(null,"Your age is "+age);
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null,"Your are "+height+" cm tall");
    }
}
