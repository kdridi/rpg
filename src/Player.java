import java.awt.*;
import javax.swing.*;

public class Player {
	int x, y, tileX, tileY;
	private Image player;

	Game g;

	public Player(Game g) {
		this.g = g;

//		ImageIcon img = new ImageIcon("player.png"); // Pfad ändern!
		ImageIcon img = new ImageIcon(getClass().getResource("/player.png"));
		player = img.getImage();

		x = 9;
		y = 9;
		tileX = 1;
		tileY = 1;

	}

	public void move(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public Image getPlayer() {
		return player;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}

	public void spellQ() {
	}

	public void spellW() {
	}

	public void spellE() {
	}

	public void spellR() {
	}

	public void spellD() {
	}

	public void spellF() {
	}
}
