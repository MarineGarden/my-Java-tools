import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class PlainWindow extends JFrame {
	
	private final Container background = getContentPane();
	
	public PlainWindow(Dimension size) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(size);
		background.setBackground(Color.WHITE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PlainWindow(new Dimension(300, 300));
	}

}
