package backendtest.book.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import backendtest.book.dao.mapper.BookMapper;
import backendtest.book.vo.BookVO;


@Repository("bookDao")
public class BookDaoImplMapper implements BookDao {
	@Autowired
	private BookMapper bookMapper;	
	
	@Override
	public BookVO read(String id) {
		BookVO book  = bookMapper.selectBookById(id);
		return book;
	}
	
	public List<BookVO> readAll() {
		List<BookVO> bookList = bookMapper.selectBookList();
		return bookList;
	}

	public void insert(BookVO book) {
		bookMapper.insertBook(book);
		System.out.println("Book Title=" + book.getTitle() + 
				" Author=" + book.getAuthor());
	}

	@Override
	public void update(BookVO book) {
		bookMapper.updateBook(book);
	}
	
	@Override
	public void delete(String id) {
		bookMapper.deleteBook(id);
		System.out.println("삭제된 Record with ID = " + id ); 
	}
}










