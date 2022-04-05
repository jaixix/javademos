//package oop3;
//
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//
//public class HashSetTest {
//	public static void main(String[] args) {
//		Set<Book> books = new HashSet<Book>();
//		Book book1 = new Book("Bio","Jai",2022);
//		Book book2 = new Book("Bio","Jai",2022);
//		books.add(book1);
//		books.add(book2);
//		System.out.println(books);
//		
//	}
//}
//	
//	class Book1{
//		private String title;
//		private String author;
//		private int year;
//		public Book(String title, String author, int year) {
//			this.title = title;
//			this.author = author;
//			this.year = year;
//		}
//		
//		public String getTitle() {
//			return title;
//		}
//
//		@Override
//		public String toString() {
//			return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
//		}
//
//		@Override
//		public int hashCode() {
//			return Objects.hash(author, title, year);
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Book other = (Book) obj;
//			return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
//		}
//		
//		
//		
//	}
