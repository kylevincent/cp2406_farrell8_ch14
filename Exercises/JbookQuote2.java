import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JbookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel box1 = new JLabel ("oh hi");
    JLabel box2 = new JLabel ("Mark");
    JButton titleButton = new JButton ("Where was this quote said?");
    JLabel box3 = new JLabel ("The Room (2003");


    public JbookQuote2(int elSizo)
    {
        super("Quote Window");
        setSize(3 * elSizo, elSizo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(box1);
        add(box2);
        add(titleButton);
        titleButton.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(box3);
        validate();
        repaint();
    }
    public static void main(String[]args)
    {
        JbookQuote2 woah = new JbookQuote2(100);
    }

}

