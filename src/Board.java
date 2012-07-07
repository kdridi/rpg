import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
	Game g;
	Map m;
	Player p;
	Graphics graphics;

	public Board(Game g) {
		this.g = g;
		this.p = g.p;
		this.m = g.m;
		repaint();
	}

	public void paint(Graphics graphics) {
		this.graphics = graphics;
		super.paint(graphics);
		int xp = p.getX() - 5;
		int yp = p.getY() - 5;
		for (int y = 0; y < 11; y++) {
			for (int x = 0; x < 11; x++) {
				if (m.getMap(yp, xp) == 1) {
					graphics.drawImage(m.getWall(), x * 32, y * 32, null);
				}
				if (m.getMap(yp, xp) == 2) {
					graphics.drawImage(m.getGrass(), x * 32, y * 32, null);
				}
				xp++;
			}
			xp = p.getX() - 5;
			yp++;
		}
//		graphics.drawImage(g.item.getItem(), g.item.getX() * 32, g.item.getY() * 32, null);
		graphics.drawImage(p.getPlayer(), 5 * 32, 5 * 32, null);
	}
}
