import java.awt.event.*;
import javax.swing.*;

public class Game implements ActionListener {
	Player player = new Player();
	Item item = new Item(this, 10, 10);
	Map map = new Map();
	Board board;
	Timer timer;

	public Game() {
		this.board = new Board(this);

		Control control = new Control(this);

		Window window = new Window();
		window.addKeyListener(control);
		window.add(this.board);
		window.setVisible(true);

		this.timer = new Timer(25, this);
		this.timer.start();
	}

	public static void main(String[] args) {
		new Game();
	}

	public void actionPerformed(ActionEvent e) {
		// ausgabe();
		this.board.repaint();
	}
	
	/**
     * Returns the current map of the game.
     * 
     * @return the current map of the game.
     */
    public Map getMap() {
            if (this.map != null) {
                    return this.map;
            }
            return null;
    }

    /**
     * Returns the current player of the game.
     * 
     * @return the current player of the game.
     */
    public Player getPlayer() {
            if (this.player != null) {
                    return this.player;
            }
            return null;
    }

	public void ausgabe() {
		int x = this.player.getX();
		int y = this.player.getY();
		System.out.println("Player -- Position: " + x + ":" + y);
	}
}
