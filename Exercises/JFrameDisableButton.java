import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Click me, I dare you.");
    JLabel finishMsg = new JLabel("Thats enough!");
    int num = 0;
    final int max = 8;
    Container c1 = getContentPane();
    public JFrameDisableButton(int elSizo)
    {
        super("Frame Disable Button");
        setSize(elSizo, elSizo);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c1.setLayout(flow);
        c1.add(button);
        c1.add(finishMsg);
        finishMsg.setVisible(false);
        button.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++num;
        if(num == max)
        {
            button.setEnabled(false);
            finishMsg.setVisible(true);
        }
    }
    public static void main(String[]args)
    {
        JFrameDisableButton woah = new JFrameDisableButton(200);
    }

}
