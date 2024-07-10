package main.java.kellywu3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * GRAPHICS PANEL
 *
 * creates the graphics on the graphical window
 */
public class GraphicsPanel extends JPanel {
    private BufferedImage mazeBufferedImage;
    public GraphicsPanel(int rows, int columns, int gridSize) {
        // calculate graphics dimensions
        int width = rows * gridSize;
        int height = columns * gridSize;

        // initialize BufferedImage
        mazeBufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // use BufferedImage graphics
        Graphics graphics = mazeBufferedImage.getGraphics();

        // set 2D graphics attributes
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
        graphics.setColor(getBackground());
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(0, 0, width, height);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawImage(mazeBufferedImage, 0, 0, this);
    }

    @Override public Dimension getPreferredSize() {
        return new Dimension(mazeBufferedImage.getWidth(), mazeBufferedImage.getHeight());
    }
}
