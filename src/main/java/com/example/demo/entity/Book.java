package com.example.demo.entity;
import java.time.LocalDate;
import lombok.Data;

@Data
public class Book {
  private Integer id;
  private String book_name;
  private Integer volume_num;
  private String author_name;
  private LocalDate published_date;
}
