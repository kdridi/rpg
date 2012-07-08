import java.awt.Image;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Map {
	int[][] mapDesign;
	private Image grass, wall;

	public Map() {
		mapDesign = load("level01.txt");
		ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("grass.png"));
		grass = img.getImage();
		img = new ImageIcon(getClass().getClassLoader().getResource("wall.png"));
		wall = img.getImage();
	}

	private int[][] load(String pathname) {
		List<int[]> rows = new ArrayList<int[]>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(pathname)));
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				int[] row = new int[line.length()];
				for (int index = 0; index < row.length; index++) {
					row[index] = line.charAt(index) - '0';
				}
				rows.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int[][] result = new int[rows.size()][];
		for (int index = 0; index < result.length; index++) {
			result[index] = rows.get(index);
		}
		return result;
	}

	public int getMap(int x, int y) {
		int result = 1;
		try {
			result = mapDesign[x][y];
		} catch (Exception e) {
		}
		return result;
	}

	// Tiles
	public Image getGrass() {
		return grass;
	}

	public Image getWall() {
		return wall;
	}
}
