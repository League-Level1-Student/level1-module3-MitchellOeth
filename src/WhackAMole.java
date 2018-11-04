import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date d;
	int score = 0;
		static int joe;

int b;
	Random rand = new Random();
	JButton NoThisIsPatrick = new JButton("mole!");

	public static void main(String[] args) {
		WhackAMole whack = new WhackAMole();
		whack.globglogabgalab();
		String jeff = JOptionPane.showInputDialog("How many buttons do you want to create?");
		joe = Integer.parseInt(jeff);
		whack.drawButtons(joe);
	}

	public void globglogabgalab() {
		frame.setSize(2040, 1900);
	}

	public void drawButtons(int bob) {
		d = new Date();
		b = rand.nextInt(bob);
		NoThisIsPatrick.addActionListener(this);
		for (int i = 0; i < bob; i++) {
			System.out.println(i);
			NoThisIsPatrick = new JButton();
			NoThisIsPatrick.addActionListener(this);
			panel.add(NoThisIsPatrick);
			if (i == b) {
				System.out.println("f" + b);
				NoThisIsPatrick.setText("mole!");
			}
		}
		frame.add(panel);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		System.out.println(buttonPressed.getText());
		if (buttonPressed.getText().equals("")) {
			speak("missed");
		}
		if (buttonPressed.getText().equals("mole!")) {
			score += 1;
		}
		if (score == 10) {
			WhackAMole whack2 = new WhackAMole();
			whack2.endGame(d, 10);
		}
		frame.dispose();
		WhackAMole whack1 = new WhackAMole();
		globglogabgalab();
		whack1.drawButtons(joe);
		frame.add(panel);
		frame.setVisible(true);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}