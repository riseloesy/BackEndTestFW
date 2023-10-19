package backendtest.book.dao.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import backendtest.book.vo.BookVO;

public interface BookMapper {
	BookVO selectBookById(String id);
	List<BookVO> selectBookList();
	void insertBook(BookVO bookVO);
	void updateBook(BookVO bookVO);
	void deleteBook(String id);
	
}