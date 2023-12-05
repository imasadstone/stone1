package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

import model.BookData;
import view.Figure2;


public class Figure2Controller implements MouseListener{
	private Figure2 f2;
	private BookData bd = new BookData();

	public Figure2Controller(Figure2 f2) {
		super();
		this.f2 = f2;
	}
	public static boolean hasObject(File f) {
        FileInputStream fi;
        boolean check = true;
        try {
            fi = new FileInputStream(f);
            ObjectInputStream inStream = new ObjectInputStream(fi);
            if (inStream.readObject() == null) {
                check = false;
            }
            inStream.close();
 
        } catch (FileNotFoundException e) {
            check = false;
        } catch (IOException e) {
            check = false;
        } catch (ClassNotFoundException e) {
            check = false;
            e.printStackTrace();
        }
        return check;
    }
	 public static void write(BookData book) {
	        try {
	            File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\BookManagement\\src\\model\\Books.dat");
	            FileOutputStream fo;
	            ObjectOutputStream oStream = null;
	            if (!f.exists()) {
	                fo = new FileOutputStream(f);
	                oStream = new ObjectOutputStream(fo);
	            }else { 
	                if (!hasObject(f)) {
	                    fo = new FileOutputStream(f);
	                    oStream = new ObjectOutputStream(fo);
	                } else {
	                    fo = new FileOutputStream(f, true);
	                    oStream = new ObjectOutputStream(fo) {
	                        protected void writeStreamHeader() throws IOException {
	                            reset();
	                        }
	                    };
	                }
	            }
	 
	            oStream.writeObject(book);
	            oStream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
//	public void writeFile(String bookId, String authors, String title, String dateOfPublication,String categories) throws IOException {
//        try {
//        	File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\BookManagement\\src\\model\\Books.dat");
//			FileOutputStream out = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(out); 
//            BookData book = new BookData(bookId, authors, title, dateOfPublication, categories);
//            oos.writeObject(book);
//            oos.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
	public void mouseClicked(MouseEvent e) {
		Object command = e.getSource();
		if(command == f2.enterButton) {
			f2.textFieldBook.setText("");
			f2.textFieldAuthor.setText("");
			f2.textFieldTitle.setText("");
			f2.textFieldDop.setText("");
			f2.textFieldCatego.setText("");
		}else if(command == f2.saveButton) {
			bd.setBookId(f2.textFieldBook.getText());
			bd.setAuthors(f2.textFieldAuthor.getText());
			bd.setTitle(f2.textFieldTitle.getText());
			bd.setDateOfPublication(f2.textFieldDop.getText());
			bd.setCategories(f2.textFieldCatego.getText());
			BookData book = new BookData(bd.getBookId(), bd.getAuthors(), bd.getTitle(), bd.getDateOfPublication(), bd.getCategories());
			write(book);
		}else if(command == f2.closeButton) {
			f2.setVisible(false);
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
