package main;
import javax.swing.UIManager;

import view.Figure1;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new Figure1();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
