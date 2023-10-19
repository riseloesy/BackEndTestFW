package backendtest.book.vo;

public class BookVO {

	private Long id;
	private String title;
	private String author;
	private String isbn;
	private String genre;

	public BookVO() {}
	

	public BookVO(String title, String author, String isbn, String genre) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
	}
	
	public BookVO(Long id, String title, String author, String isbn, String genre) {
		this(title,author,isbn,genre);
		this.id = id;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "BookVO [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", genre=" + genre
				+ "]";
	}
	

}
