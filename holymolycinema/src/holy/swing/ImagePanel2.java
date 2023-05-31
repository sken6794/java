package holy.swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel2 extends JPanel{
	private Image image;

	public ImagePanel2(String imagePath) {
		try {
			image = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(image.getWidth(this), image.getHeight(this));
	}
}
