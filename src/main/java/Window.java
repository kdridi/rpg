
import javax.swing.*;
public class Window extends JFrame
{
    public Window()
    {
        setTitle("Game");
        setBounds(100,100,352,352);
        setUndecorated(true);
        
        setFocusTraversalKeysEnabled(false);
        setFocusable(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}