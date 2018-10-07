import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class WhackAMole {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
static WhackAMole whack = new WhackAMole();
public static void main(String[] args) {
	whack.globglogabgalab();
}
private void globglogabgalab() {
frame.add(panel);
frame.setVisible(true);
frame.setSize(100,100);
}
public void drawButtons(int bob) {
	for (int i = 0; i < bob; i++) {
		frame.add(new JButton());
	}
}
}