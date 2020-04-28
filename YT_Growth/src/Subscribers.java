import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Subscribers {
	
	private static JLabel currentSub, growthRate,timeInterval,ytTitle;
	private static JTextField subText, growthText, daysText;
	private static JButton btn ;


	public static void youtubeSub()
	{
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setTitle("YOUTUBE SUBSCRIBERS GROWTH PROJECTION");
		frame.setSize(450,350);
		frame.setResizable(false);
		panel.setBackground(Color.decode("#3DA5D9"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.setLayout(null);
		
		
		//TITLE
		ytTitle = new JLabel("YOUTUBE SUBSCRIBERS GROWTH PROJECTION");
		ytTitle.setBounds(120,20,290,45);
		panel.add(ytTitle);
				
		//CURRENT SUBSCRIBERS LABEL
		currentSub = new JLabel("Current Subscribers Count");
		currentSub.setBounds(10,80,180,25);
		panel.add(currentSub);
		
		//GROWTH RATE LABEL
		growthRate = new JLabel("Growth Rate (per day)");
		growthRate.setBounds(10,130,180,25);
		panel.add(growthRate);
		
		//DAYS INTERVAL LABEL
		timeInterval = new JLabel("Time Interval (in days)");
		timeInterval.setBounds(10,180,180,25);
		panel.add(timeInterval);
	}
	
	public static void main(String[] args) {
		youtubeSub();

	}

}
