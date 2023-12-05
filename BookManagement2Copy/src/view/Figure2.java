package view;

import java.awt.EventQueue;
import controller.Figure2Controller;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Figure2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton enterButton;
	public JButton saveButton;
	public JButton closeButton;
	public TextField textFieldBook;
	public TextField textFieldAuthor;
	public TextField textFieldTitle;
	public TextField textFieldDop;
	public TextField textFieldCatego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Figure2 frame = new Figure2();
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
	public Figure2() {
		setTitle("Enter Book Details");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 559, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldBook = new TextField();
		textFieldBook.setBounds(171, 10, 366, 27);
		contentPane.add(textFieldBook);
		
		textFieldAuthor = new TextField();
		textFieldAuthor.setBounds(171, 41, 366, 27);
		contentPane.add(textFieldAuthor);
		
		textFieldTitle = new TextField();
		textFieldTitle.setBounds(171, 72, 366, 27);
		contentPane.add(textFieldTitle);
		
		textFieldDop = new TextField();
		textFieldDop.setBounds(171, 105, 366, 27);
		contentPane.add(textFieldDop);
		
		textFieldCatego = new TextField();
		textFieldCatego.setBounds(171, 137, 366, 27);
		contentPane.add(textFieldCatego);
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setFont(new Font("Arial", lblBookId.getFont().getStyle() | Font.BOLD, lblBookId.getFont().getSize()));
		lblBookId.setBounds(25, 10, 48, 27);
		contentPane.add(lblBookId);
		
		JLabel lblAuthors = new JLabel("Authors");
		lblAuthors.setFont(new Font("Arial", lblAuthors.getFont().getStyle() | Font.BOLD, lblAuthors.getFont().getSize()));
		lblAuthors.setBounds(25, 41, 48, 27);
		contentPane.add(lblAuthors);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Arial", lblTitle.getFont().getStyle() | Font.BOLD, lblTitle.getFont().getSize()));
		lblTitle.setBounds(25, 72, 48, 27);
		contentPane.add(lblTitle);
		
		JLabel lblDateOf = new JLabel("Date of publication");
		lblDateOf.setFont(new Font("Arial", lblDateOf.getFont().getStyle() | Font.BOLD, lblDateOf.getFont().getSize()));
		lblDateOf.setBounds(25, 105, 108, 27);
		contentPane.add(lblDateOf);
		
		JLabel lblCategories = new JLabel("Categories");
		lblCategories.setFont(new Font("Arial", lblCategories.getFont().getStyle() | Font.BOLD, lblCategories.getFont().getSize()));
		lblCategories.setBounds(25, 137, 108, 27);
		contentPane.add(lblCategories);
		
		Figure2Controller f2c = new Figure2Controller(this);
		enterButton = new JButton("Enter");
		enterButton.addMouseListener(f2c);
		enterButton.setBounds(165, 190, 89, 27);
		contentPane.add(enterButton);
		
		saveButton = new JButton("Save");
		saveButton.addMouseListener(f2c);
		saveButton.setBounds(298, 190, 89, 27);
		contentPane.add(saveButton);
		
		closeButton = new JButton("Close");
		closeButton.addMouseListener(f2c);
		closeButton.setBounds(430, 190, 94, 27);
		contentPane.add(closeButton);
		this.setVisible(true);
	}
}
