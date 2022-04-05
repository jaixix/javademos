package oop3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter","JK Rowling", 1997);
		Book book2 = new Book("Mein Kampf","Hitler", 1965);
		Book book3 = new Book("Another Time","Alice Chu", 2000);
		Book book4 = new Book("Prince of Persia","Anonymous", 1999);
		Book book5 = new Book("Harry Potter","JK Rowling", 1997);
		
		Set<Book> books = new TreeSet<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		printBooks(books);
	}
	
	public static void printBooks(Set<Book> books) {
		for(Book book : books) {
			System.out.println(book);
		}
	}
}


class Book implements Comparable<Book>{
	private String title;
	private String author;
	private int year;
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
	}

	@Override
	public int compareTo(Book otherBook) {
		return this.getTitle().compareTo(otherBook.getTitle());
	}
}
