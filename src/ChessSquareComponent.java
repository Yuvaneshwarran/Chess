import javax.swing.*;
import java.awt.*;
import java.io.IOException;
public class ChessSquareComponent extends JButton {
    private int row;
    private int col;

    public ChessSquareComponent(int row, int col) {
        this.row = row;
        this.col = col;
        initButton();
    }

    private void initButton() {
        setPreferredSize(new Dimension(64, 64));

        if ((row + col) % 2 == 0) {
            setBackground(Color.LIGHT_GRAY);
        } else {
            setBackground(new Color(205, 133, 63));
            // or use army green
            //setBackground(new Color(75, 83, 32));
        }

        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
    }

    // Set the chess piece image for the square
    public void setPieceImage(String imagePath) {
        try {
            ImageIcon icon = new ImageIcon(imagePath);
            // Resize image to fit square
            Image scaledImage = icon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
            this.setIcon(new ImageIcon(scaledImage));
        } catch (Exception e) {
            System.out.println("Error loading image: " + imagePath);
        }
    }

    // Clear the piece image from the square
    public void clearPieceImage() {
        this.setIcon(null);
    }
}

