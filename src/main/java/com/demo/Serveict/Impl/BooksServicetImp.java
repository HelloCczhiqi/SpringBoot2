package com.demo.Serveict.Impl;

import com.demo.Serveict.BooksServicet;
import com.demo.bean.Books;
import com.demo.mapper.Booksmapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BooksServicetImp implements BooksServicet {
    @Resource
    private Booksmapper booksmapper;

    @Override
    public List<Books> finAll() {
        return booksmapper.finAll();
    }

    @Override
    public Books booksById(Integer BookID) {
        return booksmapper.booksById(BookID);
    }

    @Override
    public int addBooks(Books books) {
        return booksmapper.addBooks(books);
    }

    @Override
    public int deleteBooks(Integer BookID) {
        return booksmapper.deleteBooks(BookID);
    }


    @Override
    public int updebooks(Books books) {
        return booksmapper.updebooks(books);
    }
}
