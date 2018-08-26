import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TypeOrDie implements KeyListener {
	JLabel jLabel = new JLabel();
	JFrame frame = new JFrame();
	char currentLetter;	
	public void makeButtons() {				
		currentLetter = generateRandomLetter();
		jLabel.setText(""+currentLetter);
		jLabel.setFont(jLabel.getFont().deriveFont(999.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		jLabel.setVisible(true);
		frame.add(jLabel);
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		frame.setSize(500,150);
		frame.addKeyListener(this);
		frame.pack();
			}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	public static void main(String[] args) {
		TypeOrDie typeOrDie = new TypeOrDie();
		typeOrDie.makeButtons();
	}	
	@Override
	public void keyTyped(KeyEvent event) {
		
	}
	@Override
	public void keyPressed(KeyEvent event) {
	
	}
	@Override
	public void keyReleased(KeyEvent event) {
		currentLetter=generateRandomLetter();
		jLabel.setText(""+currentLetter);
	}
	}