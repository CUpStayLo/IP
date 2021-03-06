import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

// Displays an Image.
@SuppressWarnings("serial")
public class ImagePanel extends JPanel {
	private String path;
	private BufferedImage image;

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) throws Exception {
		// Read image from file at path.
		this.image = ImageIO.read(new File(path));
		// Set the preferredSize of this component to the size of the image.
		this.setPreferredSize(new Dimension(this.image.getWidth(), this.image.getHeight()));
		// The image changed, so we need to repaint.
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Draw the image at relative coordinates (0, 0).
		// We set image observer to null, since the image will not be updated
		// while drawing.
		g.drawImage(image, 0, 0, null);
	}
}
