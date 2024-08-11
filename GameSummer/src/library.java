import java.util.ArrayList;
import java.util.Iterator;
public class library {
ArrayList<Book> books;
public library(ArrayList<Book> books) {
	this.books=books;
}
public ArrayList<String> allbook(String author){
	ArrayList<String> nw= new ArrayList<>();
	for (int i = 0; i < books.size(); i++) {
		Book b = books.get(i);
		if(b.author.equals(author)) {
		nw.add(author);
		}
		
			
	}
	return nw;
}
public Double getTotal() 	{
	Double x=0.0;
	for (int i = 0; i < books.size(); i++) {
		Book b = books.get(i);
		x=x+b.price;
}
return x;

}
public  void addbook(ArrayList<Book>newbook){
	for(Book b : newbook) {
		if (this.books.contains(b))
			this.books.add(b);
	}
	
}

}
