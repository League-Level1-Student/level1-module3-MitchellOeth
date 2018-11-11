import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
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
		int miss = 0;

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
		frame = new JFrame();
		panel=new JPanel();
		d = new Date();
		b = rand.nextInt(bob);
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
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		System.out.println(buttonPressed.getText());
		if (buttonPressed.getText().equals("")) {
			miss+=1;
			if (miss==1) {
				speak("I am the Glob-glo-gab-galab");
			}
			if (miss==2) {
				speak("I love books, and this basement, is a true treasure trove");
			}
			if (miss==3) {
				speak("I am the Glob-glo-gab-galab\n" + 
						"The shwabble-dabble-wabble-gabble flibba blabba blab");
			}
			if (miss==4) {
				speak("I'm full of shwibbly glib-a-kind\n" + 
						"I am the yeast of thoughts and minds");
			}
			if (miss==5) {
				speak("Shwabble dabble glibble glabble schribble shwap glab,\n" + 
						"Dibble dabble shribble shrabble glibbi-glap shwap");
			}
			if (miss==6) {
				speak("Shwabble dabble glibble glabble shwibble shwap-dap,\n" +  
					"Dibble dabble shribble shrabble glibbi-shwap glab");
			}
			if (miss==7) {
				speak("Oooh, ha ha ha, mmm, splendid\n" + 
						"Simply delicious\n" + 
						"Ooooohm, ha haa ha ha");
			}
			if (miss==8) {
				speak("I am the Glob-glo-gab-galab\n" + 
						"The shwabble-dabble-wabble-gabble flibba blabba blab");
			}
			if (miss==9) {
				speak("I'm full of shwibbly glib-a-kind\n" + 
						"I am the yeast of thoughts and minds");
			}
			if (miss==10) {
				speak("Shwabble dabble glibble glabble schribble shwap glab\n" + 
						"Dibble dabble shribble shrabble glibbi-glap shwap\n" + 
						"Shwabble dabble glibble glabble shwibble shwap-dap\n" + 
						"Dibble dabble shribble shrabble glibbi-shwap glab");
				speak("You are a looooooooser. please try again.");
			}
		}
		if (buttonPressed.getText().equals("mole!")) {
			score += 1;
			playSound("1.wav");
			
		}
		if (score == 10) {
			endGame(d, 10);
		}
		frame.dispose();
		globglogabgalab();
		drawButtons(joe);
		
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
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

}