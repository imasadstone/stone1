package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Figure3Controller;
import model.BookData;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class Figure3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField authorText;
	public JTextField titleText;
	public JTextField dopText;
	public JTextField categoriesText;
	public JButton showButton;
	public JButton closeButton;
	public JList list;
	public DefaultListModel<String> model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Figure3 frame = new Figure3();
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
	public Figure3() {
		setTitle("List Book Details");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel authorsLabel = new JLabel("Authors");
		authorsLabel.setFont(new Font("Arial", authorsLabel.getFont().getStyle() | Font.BOLD, authorsLabel.getFont().getSize()));
		authorsLabel.setBounds(179, 11, 48, 14);
		contentPane.add(authorsLabel);
		
		authorText = new JTextField();
		authorText.setBackground(Color.LIGHT_GRAY);
		authorText.setBounds(179, 25, 333, 20);
		contentPane.add(authorText);
		authorText.setColumns(10);
		
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setFont(new Font("Arial", titleLabel.getFont().getStyle() | Font.BOLD, titleLabel.getFont().getSize()));
		titleLabel.setBounds(179, 56, 48, 14);
		contentPane.add(titleLabel);
		
		JLabel dopLabel = new JLabel("Date of publication");
		dopLabel.setFont(new Font("Arial", dopLabel.getFont().getStyle() | Font.BOLD, dopLabel.getFont().getSize()));
		dopLabel.setBounds(179, 100, 128, 14);
		contentPane.add(dopLabel);
		
		JLabel categoriesLabel = new JLabel("Categories");
		categoriesLabel.setFont(new Font("Arial", categoriesLabel.getFont().getStyle() | Font.BOLD, categoriesLabel.getFont().getSize()));
		categoriesLabel.setBounds(179, 149, 92, 14);
		contentPane.add(categoriesLabel);
		
		titleText = new JTextField();
		titleText.setColumns(10);
		titleText.setBackground(Color.LIGHT_GRAY);
		titleText.setBounds(179, 69, 333, 20);
		contentPane.add(titleText);
		
		dopText = new JTextField();
		dopText.setColumns(10);
		dopText.setBackground(Color.LIGHT_GRAY);
		dopText.setBounds(179, 118, 333, 20);
		contentPane.add(dopText);
		
		categoriesText = new JTextField();
		categoriesText.setColumns(10);
		categoriesText.setBackground(Color.LIGHT_GRAY);
		categoriesText.setBounds(179, 164, 333, 20);
		contentPane.add(categoriesText);
		
		Figure3Controller f3 = new Figure3Controller(this);
		showButton = new JButton("Show");
		showButton.addMouseListener(f3);
		showButton.setFont(new Font("Arial", showButton.getFont().getStyle() | Font.BOLD, showButton.getFont().getSize() + 3));
		showButton.setBounds(139, 206, 104, 30);
		contentPane.add(showButton);
		
		closeButton = new JButton("Close");
		closeButton.addMouseListener(f3);
		closeButton.setFont(new Font("Arial", closeButton.getFont().getStyle() | Font.BOLD, closeButton.getFont().getSize() + 3));
		closeButton.setBounds(354, 207, 92, 30);
		contentPane.add(closeButton);
		

		model = new DefaultListModel<String>();
		ArrayList<BookData> book = new ArrayList();
		book = f3.read();
		for (BookData bookData : book) {
			model.addElement(bookData.getBookId());
		}
		list = new JList(model);
		list.setBounds(33, 11, 120, 173);
		contentPane.add(list);
		this.setVisible(true);
	}
}
