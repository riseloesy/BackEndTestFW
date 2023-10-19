package backendtest.book.service;

import java.util.List;
import java.util.Map;

import backendtest.book.vo.BookVO;


public interface BookService {
	
	public void insertBook(BookVO book);

	public List<BookVO> getBookList();

	public void deleteBook(String id);

	public BookVO getBook(String id);

	public void updateBook(BookVO book);
	
}
