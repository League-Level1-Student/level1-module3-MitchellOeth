import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class WhackAMole {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
public static void main(String[] args) {
	 WhackAMole whack = new WhackAMole();
whack.globglogabgalab();
	String jeff = JOptionPane.showInputDialog("How many buttons do you want to create?");
	int joe = Integer.parseInt(jeff); 
	whack.drawButtons(joe);
}
private void globglogabgalab() {

frame.setVisible(true);
frame.setSize(2040,1900);
}
public void drawButtons(int bob) {
	Random rand = new Random();
	for (int i = 0; i < bob; i++) {
		panel.add(new JButton());
		if (i==rand.nextInt()) {
			JButton NoThisIsPatrick = new JButton("me!");
		}
	}
	frame.add(panel);
}
}