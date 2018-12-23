import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton submit = new JButton();
	JButton hint = new JButton();
	JTextField field = new JTextField(20);

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Why does a cattle rancher never get along with others?");
		PracticeTest test = new PracticeTest();
		test.globglogabgalab();
	}

	public void globglogabgalab() {
		submit.addActionListener(this);
		hint.addActionListener(this);
		submit.setSize(100, 50);
		submit.setLocation(450, 300);
		hint.setLocation(50,300);
		submit.setText("Submit");
		hint.setText("Hint");
		hint.setSize(100, 50);
		frame.add(label);
		frame.add(submit);
		frame.add(hint);
		frame.add(field);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(hint)) {
			JOptionPane.showMessageDialog(null, "The answer has to do with cows.");
		}
		if (event.getSource().equals(submit)) {
			if (field.getText().equals("He has too much beef.")) {
				JOptionPane.showMessageDialog(null, "You got the right answer");
			} else {
				JOptionPane.showMessageDialog(null, "You got the wrong answer");
			}
		}
	}
}
