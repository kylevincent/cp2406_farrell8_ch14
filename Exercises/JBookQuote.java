/**
 * Created by jc431075 on 29/09/17.
 */
import javax.swing.*;

public class JBookQuote extends JFrame
{


    public JBookQuote(int elSizo)
    {
        super("Quote Window");
        setSize(elSizo, elSizo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        JBookQuote woah = new JBookQuote(300);
        woah.setVisible(true);
    }

}
