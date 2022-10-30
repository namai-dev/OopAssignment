package oop;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class NumberGausing implements ActionListener {
	
	private JFrame frame;
	private JLabel label;
	private JButton check;
	private JTextField txt;
	private JLabel check_gause;
	private JButton reset;
	
	private JLabel gause_1;
	private JLabel gause_2;
	private JLabel gause_3;
	private Random random;
	int correct;
	private int limit = 0;
	public NumberGausing() {
		
		
		 
		frame = new JFrame("Number Gausing Game");
		frame.setVisible(true);
		frame.setSize(720,720);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		label = new JLabel("Number Gausing game");
		label.setBounds(200, 0, 160, 30);
		
		check_gause = new JLabel("You gaused so high");
		check_gause.setBounds(200,200, 260,50);
		
		txt = new JTextField();
		txt.setBounds(200, 150, 260, 50);
		check = new JButton("Check me");
		check.setBounds(200,250, 100,50);
		check.addActionListener(this);
		reset = new JButton("Check me");
		reset.setBounds(350, 250, 100,50);
		
		gause_1 = new JLabel("Gause a");
		gause_1.setBounds(200, 300, 260,30);
		gause_2 = new JLabel("Gause a");
		gause_2.setBounds(200, 350, 260,30);
		gause_3 = new JLabel("Gause a");
		gause_3.setBounds(200, 400, 260,30);
		
		 correct = generateRandom();
		
		
		frame.add(label);
		frame.add(txt);
		frame.add(check_gause);
		frame.add(check);
		frame.add(reset);
		frame.add(gause_1);
		frame.add(gause_2);
		frame.add(gause_3);		
	}
	
	public int generateRandom() {
		random = new Random();
		return random.nextInt(101);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		String str = e.getActionCommand();
		if(e.getSource() == check) {
			int user_gause = Integer.parseInt(txt.getText());
			
			System.out.println(correct);
			limit++;
			System.out.println(limit);
			if(limit<=3) {
				if(user_gause == correct) {
					check_gause.setText("Your gause is correct");
					
				}
				if(user_gause < correct) {
					check_gause.setText("Your gause is low");
					
				}
				if(user_gause > correct) {
					check_gause.setText("Your gause is bigger");
					
				}
				if(limit == 1) {
					gause_1.setText("You gaused: "+user_gause);
				}
				if(limit == 2) {
					gause_2.setText("You gaused: "+user_gause);
				}
				if(limit == 3) {
					gause_3.setText("You gaused: "+user_gause);
				}
			}
			else {
				check_gause.setText("you have reached your limit");
			}
		}
	}

}
