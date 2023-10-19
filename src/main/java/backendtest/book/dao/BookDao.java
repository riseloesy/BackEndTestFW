package backendtest.book.dao;

import java.util.List;

import backendtest.book.vo.BookVO;


public interface BookDao {
	public void insert(BookVO book);

	public List<BookVO> readAll();

	public void update(BookVO book);

	public void delete(String id);

	public BookVO read(String id);

}
