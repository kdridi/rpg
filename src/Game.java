import java.awt.event.*;
import javax.swing.*;

public class Game implements ActionListener {
	Player p = new Player(this);
	Item item = new Item(this,10,10);
	Map m = new Map();
	Board b;
	Timer timer;

	public Game() {
		Window window = new Window(this);
		Control c = new Control(this);
		window.addKeyListener(c);
		b = new Board(this);
		window.add(b);
		timer = new Timer(25, this);
		timer.start();
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new Game();
	}

	public void actionPerformed(ActionEvent e) {
		// ausgabe();
		b.repaint();
	}

	public void ausgabe() {
		int x = p.getX();
		int y = p.getY();
		System.out.println("Player -- Position: " + x + ":" + y);
	}
}
