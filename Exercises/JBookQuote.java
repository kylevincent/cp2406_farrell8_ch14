/**
 * Created by jc431075 on 29/09/17.
 */
import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel box1 = new JLabel ("oh hi");
    JLabel box2 = new JLabel ("Mark");


    public JBookQuote(int elSizo)
    {
        super("Quote Window");
        setSize(3 * elSizo, elSizo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(box1);
        add(box2);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        JBookQuote woah = new JBookQuote(100);
    }

}
