import java.awt.Image;

import javax.swing.ImageIcon;


public class Item {
	int x, y;
	private Image item;
	Game g;
	
	public Item(Game g, int x, int y){
		this.g = g;
		
		ImageIcon img = new ImageIcon("sword.png");
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
