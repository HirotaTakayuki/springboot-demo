package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.Book;
import com.example.demo.form.BookForm;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

  @Autowired
  BookService bookService;

  @RequestMapping("/search")
  public String index(BookForm bookForm, String showList, Model model) {

    //タイトル
    model.addAttribute("title", "本屋さん");

    //bookform（formクラス）がnullじゃなかったら1件検索
    if(bookForm.getId() != null) {
      Book book = bookService.findById(bookForm.getId());
      model.addAttribute("book", book);
    }

    //一覧表示ボタンが押されると本一覧をmodelに登録。
    if(showList != null) {
      List<Book> bookList = bookService.getBookList();
      model.addAttribute("bookList", bookList);
    }

    return "book/index";

  }

}

