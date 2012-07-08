import java.awt.Image;

import javax.swing.ImageIcon;


public class Item {
	int x, y;
	private Image item;
	Game game;
	
	public Item(Game game, int x, int y){
		this.game = game;
		
		ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("sword.png"));
		item = img.getImage();

		this.x = x;
		this.y = y;
		
	}
	public Image getItem() {
		return item;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
