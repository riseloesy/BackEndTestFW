package backendtest.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import backendtest.book.service.BookService;
import backendtest.book.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	public BookController() {
		System.out.println(this.getClass().getName() + "생성자 호출됨");
	}
	@RequestMapping("/bookList.do")
	public ModelAndView bookList() {
		List<BookVO> bookVOList= bookService.getBookList();
		//ModelAndView(viewName, keyName, valueObject)
		return new ModelAndView("bookList", "bookList", bookVOList);
	}
	
	
	@RequestMapping("/getBook.do")
	public String getBook(@RequestParam("title") String title, Model model) {
		BookVO bookVO = bookService.getBook(title);
		model.addAttribute("book", bookVO);
		return "bookInfo";
	}
}
