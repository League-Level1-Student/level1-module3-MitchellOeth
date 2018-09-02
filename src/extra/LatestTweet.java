package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField field = new JTextField(15);
JButton button = new JButton();
public void globglogabgalab() {
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(50,10);
	frame.setTitle("LatestTweet");
	frame.add(field);
	frame.add(button);
	
	button.setText("Search the Twitterverse");
}
public static void main(String[] args) {
	LatestTweet tweet = new LatestTweet();
	tweet.globglogabgalab();
}
}