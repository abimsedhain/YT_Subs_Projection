import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		

		
		//CURRENT SUBSCRIBERS TEXTFIELD
		subText = new JTextField();
		subText.setBounds(180,80,200,25);
		panel.add(subText);
		
		//GROWTH RATE TEXTFIELD
		growthText = new JTextField();
		growthText.setBounds(180,130,200,25);
		panel.add(growthText);
		
		//DAYS INTERVAL TEXTFIELD
		daysText = new JTextField();
		daysText.setBounds(180,180,200,25);
		panel.add(daysText);
		
		//BUTTON		
		btn = new JButton("CALCULATE");
		btn.setBounds(180, 240, 180, 35);
		panel.add(btn);
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String cSub = subText.getText();
				String cGrowth = growthText.getText();
				String cDays = daysText.getText();
				
				if(cSub.equals("") || cGrowth.equals("") ||  cDays.equals("") ){
					JOptionPane.showMessageDialog(frame,"Fields can't be empty");
				}
				else{
					try 
					{
						int subb = Integer.parseInt(subText.getText());;
						double growth = Double.parseDouble(growthText.getText());;
						int days = Integer.parseInt(daysText.getText());;
						
						System.out.println(subb);
						System.out.println(growth);
						System.out.println(days);
						
												
						int newSub = (int) (subb * Math.pow((1+growth),days));
						
						DecimalFormat df = new DecimalFormat("#,###");
						
						JOptionPane.showMessageDialog(frame,"At this growth rate, you will " +
														df.format(newSub) + " subscribers in "+ days +" months",
														"RESULT",JOptionPane.INFORMATION_MESSAGE);
					}
					catch (NumberFormatException e1) 
					{
						JOptionPane.showMessageDialog(frame,"Not a number");
						}
				}				
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		youtubeSub();

	}

}
