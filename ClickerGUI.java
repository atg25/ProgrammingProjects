import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerGUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JButton button;
    private JPanel panel;

    public ClickerGUI(){
        frame = new JFrame();

        button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ClickerGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: " + count);
    }
}
