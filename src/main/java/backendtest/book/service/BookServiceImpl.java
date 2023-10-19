package backendtest.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backendtest.book.dao.BookDao;
import backendtest.book.vo.BookVO;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
	
	@Override
	public void insertBook(BookVO book) {
		bookDao.insert(book);
	}

	public List<BookVO> getBookList() {
		return bookDao.readAll();
	}

	@Override
	public void deleteBook(String id) {
		bookDao.delete(id);
		
	}

	@Override
	public BookVO getBook(String id) {
		return bookDao.read(id);
	}

	@Override
	public void updateBook(BookVO book) {
		bookDao.update(book);
	}
}
