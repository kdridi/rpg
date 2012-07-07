import java.awt.event.*;

public class Control implements KeyListener {
	Game g;
	Player p;
	Map m;

	Control(Game g) {
		this.g = g;
		this.p = g.p;
		this.m = g.m;
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// Game
		if (keyCode == KeyEvent.VK_ESCAPE) {
			System.out.print("pressed: ESC - System.Exit");
			System.exit(0);
		}
		// Movement
		else if (keyCode == KeyEvent.VK_UP) {
			// System.out.println("pressed: UP");
			if (m.getMap(p.getY() - 1, p.getX()) != 1) {
				p.move(0, -1);
			}

		} else if (keyCode == KeyEvent.VK_DOWN) {
			// System.out.println("pressed: DOWN");
			if (m.getMap(p.getY() + 1, p.getX()) != 1) {
				p.move(0, 1);
			}
		} else if (keyCode == KeyEvent.VK_LEFT) {
			// System.out.println("pressed: LEFT");
			if (m.getMap(p.getY(), p.getX() - 1) != 1) {
				p.move(-1, 0);
			}
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// System.out.println("pressed: RIGHT");
			if (m.getMap(p.getY(), p.getX() + 1) != 1) {
				p.move(1, 0);
			}
		}
		// Spells
		else if (keyCode == KeyEvent.VK_Q) {
			System.out.println("pressed: Q - Spell 1");
		} else if (keyCode == KeyEvent.VK_W) {
			System.out.println("pressed: W - Spell 2");
		} else if (keyCode == KeyEvent.VK_E) {
			System.out.println("pressed: E - Spell 3");
		} else if (keyCode == KeyEvent.VK_R) {
			System.out.println("pressed: R - Spell 4");
		} else if (keyCode == KeyEvent.VK_D) {
			System.out.println("pressed: D - Spell 5");
		} else if (keyCode == KeyEvent.VK_F) {
			System.out.println("pressed: F - Spell 6");
		}

		else {
			System.out.println("pressed");
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

}