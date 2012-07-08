import java.awt.*;
import javax.swing.*;

public class Player {
	int x, y, tileX, tileY;
	private Image player;

	public Player() {
		ImageIcon img = new ImageIcon(getClass().getResource("/player.png"));
		player = img.getImage();

		x = 9;
		y = 9;
	}

	public void move(int x, int y) {
		this.x += x;
        this.y += y;
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
