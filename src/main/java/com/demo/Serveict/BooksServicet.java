package com.demo.Serveict;

import com.demo.bean.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BooksServicet {
    List<Books> finAll();

    Books booksById(Integer BookID);

    int addBooks(Books books);

    int deleteBooks(Integer BookID);

    int updebooks(Books books);

}
