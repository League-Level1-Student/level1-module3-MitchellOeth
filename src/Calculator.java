import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField text1 = new JTextField(18);
	JTextField text2 = new JTextField(18);

	public void simpleCalculator() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 300);
		frame.setTitle("Simple Calculator");

		panel.add(text1);
		panel.add(text2);

		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);

		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);

	}

	public void Add() {

	}

	public void Sub() {

	}

	public void Mul() {

	}

	public void Div() {

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.simpleCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// String val = jtf.getText(); This gets what you enter into the text1 box.
	}
}