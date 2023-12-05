package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Figure1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Figure1 frame = new Figure1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Figure1() {
		setTitle("Book Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton enterButton = new JButton("Enter book details");
		enterButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Figure2();
				
			}
		});
		enterButton.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(enterButton);
		
		JButton listButton = new JButton("List book details");
		listButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Figure3();
			}
		});
		listButton.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(listButton);
		
		JButton exitButton = new JButton("Exit program");
		exitButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exitButton.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(exitButton);
		this.setVisible(true);
	}

}
