import java.net.URL;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class SlotMachine {
Random rand = new Random();
JButton button = new JButton();
JLabel left = new JLabel();
JLabel center = new JLabel();
JLabel right = new JLabel();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
public static void main(String[] args) {
SlotMachine slot = new SlotMachine();
slot.drawButtons();
}
public void drawButtons() {
frame.add(panel);

//Globglogabgalab=loadImage("globglogabgalab.png");
///Book=loadImage("book.png");
//Treasure=loadImage("treasure.png");
/*
panel.add(Globglogabgalab);
panel.add(Book);
panel.add(Treasure);
*/
frame.setVisible(true);
panel.setVisible(true);
int bob = rand.nextInt(3);
System.out.println(bob);
if (bob==0) {
left=loadImage("globglogabgalab.png");
}
if (bob==1) {
left=loadImage("book.png");
}
if (bob==2) {
left=loadImage("treasure.png");
}
bob = rand.nextInt(3);
if (bob==0) {
center=loadImage("globglogabgalab.png");
}
if (bob==1) {
center=loadImage("book.png");
}
if (bob==2) {
center=loadImage("treasure.png");
}
bob = rand.nextInt(3);
if (bob==0) {
right=loadImage("globglogabgalab.png");
}
if (bob==1) {
right=loadImage("book.png");
}
if (bob==2) {
right=loadImage("treasure.png");
}
panel.add(left);
panel.add(right);
panel.add(center);
frame.pack();
}
public JLabel loadImage(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
}