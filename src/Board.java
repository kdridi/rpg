import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
	Map map;
	Player player;
	Graphics graphics;

	public Board(Game game) {
		this.player = game.player;
		this.map = game.map;
		repaint();
	}

	public void paint(Graphics graphics) {
		this.graphics = graphics;
		super.paint(graphics);
		int xp = this.player.getX() - 5;
		int yp = this.player.getY() - 5;
		for (int y = 0; y < 11; y++) {
			for (int x = 0; x < 11; x++) {
				if (this.map.getMap(yp, xp) == 1) {
					graphics.drawImage(this.map.getWall(), x * 32, y * 32, null);
				}
				if (this.map.getMap(yp, xp) == 2) {
					graphics.drawImage(this.map.getGrass(), x * 32, y * 32,
							null);
				}
				xp++;
			}
			xp = this.player.getX() - 5;
			yp++;
		}
		// graphics.drawImage(g.item.getItem(), g.item.getX() * 32,
		// g.item.getY() * 32, null);
		graphics.drawImage(this.player.getPlayer(), 5 * 32, 5 * 32, null);
	}
}
