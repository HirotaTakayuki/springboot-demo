package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.BookMapper;
import com.example.demo.entity.Book;

@Service
public class BookService {

  @Autowired
  BookMapper bookMapper;

  //1件検索
  public Book findById(Integer id) {
    Book book = new Book();
    book.setId(id);
    return this.bookMapper.findById(book);
  }

  //全件取得
  public List<Book> getBookList(){
    return this.bookMapper.findAll();
  }
}
