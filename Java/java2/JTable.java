import javax.swing.*;

public class JTable {
    private JPanel tableView;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label0;
    private JTextField textField1;
    private JTextField textField2;

    private JButton button3;
    private JButton button2;


    private JButton button1;

    public JTable() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable");
        frame.setContentPane(new JTable().tableView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        tableView = new JPanel();
        tableView.setLayout(new com.jgoodies.forms.layout.FormLayout("fill:d:noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow", "center:d:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow"));
        Label1 = new JLabel();
        Label1.setEnabled(false);
        Label1.setText("Name");
        com.jgoodies.forms.layout.CellConstraints cc = new com.jgoodies.forms.layout.CellConstraints();
        tableView.add(Label1, cc.xy(1, 3));
        textField1 = new JTextField();
        tableView.add(textField1, cc.xyw(3, 3, 5, com.jgoodies.forms.layout.CellConstraints.FILL, com.jgoodies.forms.layout.CellConstraints.DEFAULT));
        Label2 = new JLabel();
        Label2.setText("Course");
        tableView.add(Label2, cc.xy(1, 5));
        textField2 = new JTextField();
        tableView.add(textField2, cc.xyw(3, 5, 5, com.jgoodies.forms.layout.CellConstraints.FILL, com.jgoodies.forms.layout.CellConstraints.DEFAULT));
        Label0 = new JLabel();
        Label0.setHorizontalAlignment(0);
        Label0.setText("Display Data In JTable");
        tableView.add(Label0, cc.xy(5, 1, com.jgoodies.forms.layout.CellConstraints.CENTER, com.jgoodies.forms.layout.CellConstraints.DEFAULT));
        button3 = new JButton();
        button3.setText("Delete");
        tableView.add(button3, cc.xy(9, 7));
        button2 = new JButton();
        button2.setEnabled(true);
        button2.setText("Insert");
        tableView.add(button2, cc.xy(5, 7));
        button1 = new JButton();
        button1.setText("Display");
        tableView.add(button1, cc.xy(1, 7));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return tableView;
    }
}