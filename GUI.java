import java.awt.*;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.*;







public class GUI implements ActionListener{
	
	Runtime runtime;
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JButton button3;
	JButton button4;
	ImageIcon Karlson;
	ImageIcon rerun;
	ImageIcon ic3;
	ImageIcon ic4;
	
	public GUI() {
		
		Karlson = new ImageIcon("karlson.png");
		rerun = new ImageIcon("rerun.png");
		ic3 = new ImageIcon("Osu!Logo_(2015).svg.png");
		ic4 = new ImageIcon("Jelly.png");
		
		frame = new JFrame();
		
		runtime = Runtime.getRuntime();
		
			button = new JButton(Karlson);
			
				button2 = new JButton(rerun);
				
					button3 = new JButton(ic3);
					
						button4 = new JButton(ic4);
		
		
		
			button.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	try {
						runtime.exec("F:\\giochi\\karlson 3d\\Karlson.exe");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			      }
			    }
			  );
			button.setPreferredSize(new Dimension(100, 100));
		
		
					button2.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					    	try {
								runtime.exec("F:\\giochi\\rerun\\RERUN.exe");
							} catch (IOException e1) {
								e1.printStackTrace();
							}
					      }
					    }
					  );
					button2.setPreferredSize(new Dimension(100, 100));
		
		
							button3.addActionListener(new ActionListener() {
							    public void actionPerformed(ActionEvent e) {
							    	try {
										runtime.exec("F:\\giochi\\osu!\\osu!.exe");
									} catch (IOException e1) {
										e1.printStackTrace();
									}
							      }
							    }
							  );
							button3.setPreferredSize(new Dimension(100, 100));
							
							
										button4.addActionListener(new ActionListener() {
										    public void actionPerformed(ActionEvent e) {
										    	try {
													runtime.exec("F:\\giochi\\JellyDrift64\\Jelly Drift.exe");
												} catch (IOException e1) {
													e1.printStackTrace();
												}
										      }
										    }
										  );
										button4.setPreferredSize(new Dimension(100, 100));
							
		
		panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.setLayout(new FlowLayout());
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Game Chooser");
		frame.setVisible(true);
		frame.setSize(400, 300);
		
		
		
		
	}

	public static void main(String[] args) {
		
		new GUI();				
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	

	
}
