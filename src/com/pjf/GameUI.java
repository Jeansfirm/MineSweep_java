package com.pjf;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.color.ColorSpace;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;



class GameUI extends JFrame{
	private JPanel detailPanel;
	private JPanel gamePanel;
	
	public GameUI(){
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1024, 768);
		this.setLocationRelativeTo(null);
		this.setTitle("Game:MineSweep");		
	
		
		detailPanel=new JPanel();
		detailPanel.setVisible(true);
		detailPanel.setBorder(BorderFactory.createLineBorder(Color.white, 2));	
		detailPanel.setSize(660,60);		
		this.add(detailPanel,BorderLayout.CENTER);
		
		gamePanel=new JPanel();
		this.add(gamePanel);
		
	}
}
