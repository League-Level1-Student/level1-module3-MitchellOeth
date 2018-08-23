import java.util.Random;

import javax.swing.JFrame;

public class TypeOrDie {
	JFrame frame = new JFrame();

	public void makeButtons() {
		frame.setTitle("Type or Die");
		frame.setVisible(true);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
		TypeOrDie TypeOrDie = new TypeOrDie();
		TypeOrDie.makeButtons();
		char currentLetter;
		currentLetter = generateRandomLetter();
	}

}