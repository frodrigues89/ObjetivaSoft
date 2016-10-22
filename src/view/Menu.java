package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu implements ActionListener{
	private JMenu menu = new JMenu("Menu");
	private JMenuItem menuItem = new JMenuItem("item");
	
	
	public JMenuBar setMenu(){
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menu);
			
			menu.add(menuItem);
			menuItem.addActionListener(this);
			
		return menuBar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
