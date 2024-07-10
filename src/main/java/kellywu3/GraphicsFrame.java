package main.java.kellywu3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * GRAPHICS FRAME
 *
 * creates the frame of the graphical window
 */
public class GraphicsFrame {
    public GraphicsFrame(int rows, int columns, int gridSize) {
        // initialize frame
        JFrame frame = new JFrame("MazeGenerator");

        // initialize GraphicsPanel
        GraphicsPanel graphicsPanel = new GraphicsPanel(rows, columns, gridSize);

        // add GraphicsPanel to Frame
        frame.add(graphicsPanel);

        // set frame attributes
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
