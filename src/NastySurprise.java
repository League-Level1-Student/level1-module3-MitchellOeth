import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NastySurprise {
	public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog("Would you like a trick or a treat?");
	if (answer.equals("trick")) {
	showPictureFromTheInternet("http://www.dev.puppyheaven.com/shop/media/catalog/product/cache/1/small_image/300x/17f82f742ffe127f42dca9de82fb58b1/i/m/img_2130.jpg");
	}
	else {
		showPictureFromTheInternet("https://previews.123rf.com/images/prometeus/prometeus1503/prometeus150301083/38104861-close-up-portrait-of-a-scary-bloody-zombie-girl-horror-halloween-.jpg");
	}
	}
		private static void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

}