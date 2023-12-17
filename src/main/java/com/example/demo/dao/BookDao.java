package com.example.demo.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.Book;

@Mapper
public interface BookDao {
  //1件検索
  Book findById(Book book);

  //全件取得
  List<Book> findAll();
}
