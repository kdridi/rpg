
import javax.swing.*;
public class Window extends JFrame
{
    Game g;
    public Window(Game g)
    {
        this.g=g;
        setTitle("Game");
        setBounds(100,100,352,352);
        setUndecorated(true);
        
        setFocusTraversalKeysEnabled(false);
        setFocusable(true);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
    }

}