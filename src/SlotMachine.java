import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class SlotMachine implements ActionListener {
	Random rand = new Random();
	JButton button = new JButton();
	JLabel left = new JLabel();
	JLabel center = new JLabel();
	JLabel right = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int score = 0;
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
		slot.globglogabgalab1();
		slot.globglogabgalab();	
	}
	public void globglogabgalab1() {
		button.addActionListener(this);		
	}
	public void globglogabgalab() {
		panel = new JPanel();
		frame.add(panel);

		frame.setVisible(true);
		panel.setVisible(true);
		int bob = rand.nextInt(3);
		System.out.println(bob);
		if (bob == 0) {
			left = loadImage("globglogabgalab.png");
		}
		if (bob == 1) {
			left = loadImage("book.png");
		}
		if (bob == 2) {
			left = loadImage("treasure.png");
		}
		bob = rand.nextInt(3);
		if (bob == 0) {
			center = loadImage("globglogabgalab.png");
		}
		if (bob == 1) {
			center = loadImage("book.png");
		}
		if (bob == 2) {
			center = loadImage("treasure.png");
		}
		bob = rand.nextInt(3);
		if (bob == 0) {
			right = loadImage("globglogabgalab.png");
		}
		if (bob == 1) {
			right = loadImage("book.png");
		}
		if (bob == 2) {
			right = loadImage("treasure.png");
		}
		panel.add(left);
		panel.add(right);
		panel.add(center);
		panel.add(button);
		button.setText("Click Me To " + "Play Again!");
		button.setVisible(true);
		if (left == loadImage("globglogabgalab.png")) {
			if (center == loadImage("globglogabgalab.png")) {
				if (right == loadImage("globglogabgalab.png")) {
					score += 1;
					JOptionPane.showMessageDialog(null, "You have won " + score + " times");
				}
			}
		}
		if (left == loadImage("book.png")) {
			if (center == loadImage("book.png")) {
				if (right == loadImage("book.png")) {
					score += 1;
					JOptionPane.showMessageDialog(null, "You have won " + score + " times");
				}
			}
		}
		if (left == loadImage("treasure.png")) {
			if (center == loadImage("treasure.png")) {
				if (right == loadImage("treasure.png")) {
					score += 1;
					JOptionPane.showMessageDialog(null, "You have won " + score + " times");
				}
			}
		}
		left.setPreferredSize(new Dimension(500,500));
		right.setPreferredSize(new Dimension(500,500));
		center.setPreferredSize(new Dimension(500,500));
		frame.pack();
	}
	public JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(button)) {
			frame.dispose();
			frame = new JFrame();
			left = new JLabel();
			right = new JLabel();
			center = new JLabel();
			panel = new JPanel();
			
			globglogabgalab();
		}
	}
}