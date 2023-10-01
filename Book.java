import java.util.*;

public class Book {
	String book_title;
	String book_author;
	int publication_year;
	
	void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, author and year of publication of a book:");
		book_title = sc.nextLine();
		book_author = sc.nextLine();
		publication_year = sc.nextInt();	
	}
	void display() {
		System.out.println("Book name: "+book_title+ "\nAuthor name: "+book_author+ "\nYear of publication: "+publication_year);
	}
	public static void main(String argd[]) {
		Book b = new Book();
		b.info();
		b.display();
	}

}
