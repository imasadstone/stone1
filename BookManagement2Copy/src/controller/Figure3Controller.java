package controller;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import model.BookData;
import view.Figure3;

public class Figure3Controller implements MouseListener{
	private Figure3 f3;
	private BookData bd = new BookData();
	
	public Figure3Controller(Figure3 f3) {
		super();
		this.f3 = f3;
	}
	public static ArrayList<BookData> read() {
		ArrayList<BookData> book = new ArrayList();
        try {
            File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\BookManagement\\src\\model\\Books.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream inStream = new ObjectInputStream(fis);
          
            while (true) {
            	 book.add((BookData) inStream.readObject());
            }
        } catch (ClassNotFoundException e) {
        } catch (IOException e) {
        }
		return book;
    }

	public void mouseClicked(MouseEvent e) {
		Object command = e.getSource();
		if(command == f3.showButton) {
			ArrayList<BookData> book = new ArrayList();
			book = read();
			for (BookData bookData : book) {
				if(bookData.getBookId().equals(f3.list.getSelectedValue().toString())) {
					f3.authorText.setText(bookData.getAuthors());
					f3.titleText.setText(bookData.getTitle());
					f3.dopText.setText(bookData.getDateOfPublication());
					f3.categoriesText.setText(bookData.getCategories());
				}
			}
		}else if(command == f3.closeButton) {
			f3.setVisible(false);
		}
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
