import java.awt.event.*;

public class Control implements KeyListener {
	Game game;
	Player player;
	Map map;

	Control(Game game) {
		this.game = game;
		this.player = game.player;
		this.map = game.map;
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
			if (this.map.getMap(this.player.getY() - 1, this.player.getX()) != 1) {
				this.player.move(0, -1);
			}

		} else if (keyCode == KeyEvent.VK_DOWN) {
			// System.out.println("pressed: DOWN");
			if (this.map.getMap(this.player.getY() + 1, this.player.getX()) != 1) {
				this.player.move(0, 1);
			}
		} else if (keyCode == KeyEvent.VK_LEFT) {
			// System.out.println("pressed: LEFT");
			if (this.map.getMap(this.player.getY(), this.player.getX() - 1) != 1) {
				this.player.move(-1, 0);
			}
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// System.out.println("pressed: RIGHT");
			if (this.map.getMap(this.player.getY(), this.player.getX() + 1) != 1) {
				this.player.move(1, 0);
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