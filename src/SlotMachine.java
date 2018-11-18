import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class SlotMachine {
JButton button = new JButton();
JLabel Globglogabgalab = new JLabel();
JLabel Book = new JLabel();
JLabel Treasure = new JLabel();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
public static void main(String[] args) {
SlotMachine slot = new SlotMachine();
slot.drawButtons();
}
public void drawButtons() {
frame.add(panel);
panel.add(Globglogabgalab);
panel.add(Book);
panel.add(Treasure);
Globglogabgalab=loadImage("globglogabgalab.png");
Book=loadImage("book.png");
Treasure=loadImage("treasure.png");
frame.setVisible(true);
panel.setVisible(true);
frame.pack();
}
public JLabel loadImage(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
}