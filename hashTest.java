import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


public class hashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<contact> l1=new LinkedList<contact>();
		l1.add(new contact("raj","7093563608","raj@sbi"));
		l1.add(new contact("don","9396363198","don@sbi"));
		Iterator<contact> itr=l1.iterator();
		  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  } 
		  
	
//	
//	chemicalElemennt cE1= new chemicalElemennt(25,"nitrogen",100);
//	chemicalElemennt cE2= new chemicalElemennt(55,"oxygen",50);
//	chemicalElemennt cE3= new chemicalElemennt(5,"carbon",70);
//	chemicalElemennt cE4= new chemicalElemennt(97,"copper",20);
	
	TreeSet<chemicalElemennt> cl1 = new TreeSet<chemicalElemennt>();
	System.out.println("Tree set is created....");
	cl1.add(new chemicalElemennt(25,"oxygen",50));
	cl1.add(new chemicalElemennt(55,"carbon",30));

	}
}
class contact{
	String contactName;
	String mobilenumber;
	String email;
	public contact(String contactName, String mobilenumber, String email) {
		super();
		this.contactName = contactName;
		this.mobilenumber = mobilenumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "contact [contactName=" + contactName + ", mobilenumber=" + mobilenumber + ", email=" + email + "]";
	}
	
	
	
}
class chemicalElemennt{
	int atomicNumber;
	String atomicName;
	int atomicWeight;

	public chemicalElemennt(int atomicNumber, String atomicName, int atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "chemicalElemennt [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicWeight="
				+ atomicWeight + "]";
	}
	
}
class book{
	int bookNumber;
	String bookName;
	String author;
	int numberOfPages;
	String edition;
	public book(int bookNumber, String bookName, String author, int numberOfPages, String edition) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", numberOfPages="
				+ numberOfPages + ", edition=" + edition + "]";
	}
	
	
}