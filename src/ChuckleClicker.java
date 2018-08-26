
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JPanel panel = new JPanel();

	public void makeButtons() {

		panel.add(button);
		panel.add(button1);
		frame.add(panel);
		frame.setVisible(true);
		button.setText("joke");
		button1.setText("punchline");
		button.addActionListener(this);
		frame.pack();
	}

	public static void main(String[] args) {
		ChuckleClicker click = new ChuckleClicker();
		click.makeButtons();
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == button) {
			JOptionPane.showMessageDialog(null, "What do you call a guy with a rubber toe?");
		}
		if (event.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Roberto");
		}
	}

}
