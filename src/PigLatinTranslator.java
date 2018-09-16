import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class PigLatinTranslator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField(10);
	JTextField field1 = new JTextField(10);

	static PigLatinTranslator translator = new PigLatinTranslator();
	public static void main(String[] args) {
		translator.Globglogabgalab();
	}
	public void Globglogabgalab() {
		frame.add(panel);
		panel.add(button);
		panel.add(field);
		panel.add(field1);
		frame.pack();
	}
}